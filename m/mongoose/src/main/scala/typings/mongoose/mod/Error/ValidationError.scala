package typings.mongoose.mod.Error

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError
  extends typings.mongoose.mod.Error {
  
  def addError(path: String, error: js.Any): Unit = js.native
  
  var errors: StringDictionary[ValidatorError | CastError] = js.native
  
  def inspect(): js.Object = js.native
  
  @JSName("name")
  var name_ValidationError: typings.mongoose.mongooseStrings.ValidationError = js.native
  
  def toJSON(): js.Object = js.native
}
object ValidationError {
  
  @scala.inline
  def apply(
    addError: (String, js.Any) => Unit,
    errors: StringDictionary[ValidatorError | CastError],
    inspect: () => js.Object,
    name: typings.mongoose.mongooseStrings.ValidationError,
    toJSON: () => js.Object
  ): ValidationError = {
    val __obj = js.Dynamic.literal(addError = js.Any.fromFunction2(addError), errors = errors.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    
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
    def setAddError(value: (String, js.Any) => Unit): Self = this.set("addError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrors(value: StringDictionary[ValidatorError | CastError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspect(value: () => js.Object): Self = this.set("inspect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: typings.mongoose.mongooseStrings.ValidationError): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
