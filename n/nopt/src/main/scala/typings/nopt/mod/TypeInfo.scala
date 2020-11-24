package typings.nopt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeInfo extends js.Object {
  
  var `type`: js.Object = js.native
  
  def validate(data: CommandData, k: String, `val`: String): Boolean = js.native
}
object TypeInfo {
  
  @scala.inline
  def apply(`type`: js.Object, validate: (CommandData, String, String) => Boolean): TypeInfo = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeInfo]
  }
  
  @scala.inline
  implicit class TypeInfoOps[Self <: TypeInfo] (val x: Self) extends AnyVal {
    
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
    def setType(value: js.Object): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: (CommandData, String, String) => Boolean): Self = this.set("validate", js.Any.fromFunction3(value))
  }
}
