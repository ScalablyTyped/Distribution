package typings
package natsDashHemeraLib.natsDashHemeraMod

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
    annotate: () => java.lang.String,
    details: js.Array[ValidationErrorItem],
    isJoi: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(_object = _object, annotate = js.Any.fromFunction0(annotate), details = details, isJoi = isJoi, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

