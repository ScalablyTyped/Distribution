package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends stdLib.Error
     with JoiObject {
  var _object: js.Any
  var details: js.Array[ValidationErrorItem]
  def annotate(): java.lang.String
}

object ValidationError {
  @scala.inline
  def apply(
    _object: js.Any,
    annotate: js.Function0[java.lang.String],
    details: js.Array[ValidationErrorItem],
    isJoi: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_object")(_object)
    __obj.updateDynamic("annotate")(annotate)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("isJoi")(isJoi)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

