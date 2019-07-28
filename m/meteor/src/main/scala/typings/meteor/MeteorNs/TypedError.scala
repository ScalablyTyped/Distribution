package typings.meteor.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedError
  extends typings.std.Error {
  var errorType: String
}

@JSGlobal("Meteor.TypedError")
@js.native
class TypedErrorCls protected () extends TypedError {
  def this(message: String, errorType: String) = this()
  /* CompleteClass */
  override var errorType: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

object TypedError {
  @scala.inline
  def apply(errorType: String, message: String, name: String, stack: String = null): TypedError = {
    val __obj = js.Dynamic.literal(errorType = errorType, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TypedError]
  }
}

