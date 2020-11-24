package typings.openfin.shapesPlatformMod

import typings.openfin.anon.MonitorInfo
import typings.openfin.windowOptionsMod.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends js.Object {
  
  var snapshotDetails: js.UndefOr[MonitorInfo] = js.native
  
  var windows: js.Array[WindowOptions] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(windows: js.Array[WindowOptions]): Snapshot = {
    val __obj = js.Dynamic.literal(windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWindowsVarargs(value: WindowOptions*): Self = this.set("windows", js.Array(value :_*))
    
    @scala.inline
    def setWindows(value: js.Array[WindowOptions]): Self = this.set("windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotDetails(value: MonitorInfo): Self = this.set("snapshotDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotDetails: Self = this.set("snapshotDetails", js.undefined)
  }
}
