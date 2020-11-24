package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistentBrowserSessionControl extends ConditionalAccessSessionControl {
  
  // Possible values are: always, never.
  var mode: js.UndefOr[NullableOption[PersistentBrowserSessionMode]] = js.native
}
object PersistentBrowserSessionControl {
  
  @scala.inline
  def apply(): PersistentBrowserSessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentBrowserSessionControl]
  }
  
  @scala.inline
  implicit class PersistentBrowserSessionControlOps[Self <: PersistentBrowserSessionControl] (val x: Self) extends AnyVal {
    
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
    def setMode(value: NullableOption[PersistentBrowserSessionMode]): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setModeNull: Self = this.set("mode", null)
  }
}
