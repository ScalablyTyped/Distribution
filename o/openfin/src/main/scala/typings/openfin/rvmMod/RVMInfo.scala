package typings.openfin.rvmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RVMInfo extends js.Object {
  
  var action: String = js.native
  
  var appLogDirectory: String = js.native
  
  var path: String = js.native
  
  var `start-time`: String = js.native
  
  var version: String = js.native
  
  var `working-dir`: String = js.native
}
object RVMInfo {
  
  @scala.inline
  def apply(
    action: String,
    appLogDirectory: String,
    path: String,
    `start-time`: String,
    version: String,
    `working-dir`: String
  ): RVMInfo = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], appLogDirectory = appLogDirectory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("start-time")(`start-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("working-dir")(`working-dir`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVMInfo]
  }
  
  @scala.inline
  implicit class RVMInfoOps[Self <: RVMInfo] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppLogDirectory(value: String): Self = this.set("appLogDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-time`(value: String): Self = this.set("start-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWorking-dir`(value: String): Self = this.set("working-dir", value.asInstanceOf[js.Any])
  }
}
