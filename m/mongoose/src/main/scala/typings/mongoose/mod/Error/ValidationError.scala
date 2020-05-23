package typings.mongoose.mod.Error

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends typings.mongoose.mod.Error {
  var errors: StringDictionary[ValidatorError | CastError]
  @JSName("name")
  var name_ValidationError: typings.mongoose.mongooseStrings.ValidationError
  def addError(path: String, error: js.Any): Unit
  def inspect(): js.Object
  def toJSON(): js.Object
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
}

