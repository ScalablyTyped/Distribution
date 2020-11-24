package typings.npmProfile.mod

import typings.npmProfile.npmProfileStrings.`auth-and-writes`
import typings.npmProfile.npmProfileStrings.`auth-only`
import typings.npmProfile.npmProfileStrings.disable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TFAStatusUpdate extends js.Object {
  
  var mode: disable | `auth-only` | `auth-and-writes` = js.native
  
  var password: String = js.native
}
object TFAStatusUpdate {
  
  @scala.inline
  def apply(mode: disable | `auth-only` | `auth-and-writes`, password: String): TFAStatusUpdate = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[TFAStatusUpdate]
  }
  
  @scala.inline
  implicit class TFAStatusUpdateOps[Self <: TFAStatusUpdate] (val x: Self) extends AnyVal {
    
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
    def setMode(value: disable | `auth-only` | `auth-and-writes`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
  }
}
