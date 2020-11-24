package typings.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncValidator[V] extends js.Object {
  
  var hint: js.Promise[String | Null] = js.native
  
  def validate(value: V): js.Promise[Boolean] = js.native
}
object AsyncValidator {
  
  @scala.inline
  def apply[V](hint: js.Promise[String | Null], validate: V => js.Promise[Boolean]): AsyncValidator[V] = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncValidator[V]]
  }
  
  @scala.inline
  implicit class AsyncValidatorOps[Self <: AsyncValidator[_], V] (val x: Self with AsyncValidator[V]) extends AnyVal {
    
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
    def setHint(value: js.Promise[String | Null]): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: V => js.Promise[Boolean]): Self = this.set("validate", js.Any.fromFunction1(value))
  }
}
