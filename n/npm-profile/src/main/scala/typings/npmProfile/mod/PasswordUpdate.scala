package typings.npmProfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordUpdate extends js.Object {
  
  var `new`: String = js.native
  
  var old: String = js.native
}
object PasswordUpdate {
  
  @scala.inline
  def apply(`new`: String, old: String): PasswordUpdate = {
    val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordUpdate]
  }
  
  @scala.inline
  implicit class PasswordUpdateOps[Self <: PasswordUpdate] (val x: Self) extends AnyVal {
    
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
    def setNew(value: String): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld(value: String): Self = this.set("old", value.asInstanceOf[js.Any])
  }
}
