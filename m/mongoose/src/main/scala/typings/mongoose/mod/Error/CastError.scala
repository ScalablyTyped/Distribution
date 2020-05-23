package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastError
  extends typings.mongoose.mod.Error {
  var kind: String
  var model: js.UndefOr[js.Any] = js.undefined
  @JSName("name")
  var name_CastError: typings.mongoose.mongooseStrings.CastError
  var path: String
  var reason: js.UndefOr[js.Any] = js.undefined
  var stringValue: String
  var value: js.Any
  def setModel(model: js.Any): Unit
}

object CastError {
  @scala.inline
  def apply(
    kind: String,
    name: typings.mongoose.mongooseStrings.CastError,
    path: String,
    setModel: js.Any => Unit,
    stringValue: String,
    value: js.Any,
    model: js.Any = null,
    reason: js.Any = null
  ): CastError = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setModel = js.Any.fromFunction1(setModel), stringValue = stringValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastError]
  }
}

