package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedError
  extends stdLib.Error {
  var errorType: java.lang.String
}

@JSGlobal("Meteor.TypedError")
@js.native
class TypedErrorCls protected () extends TypedError {
  def this(message: java.lang.String, errorType: java.lang.String) = this()
  /* CompleteClass */
  override var errorType: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

object TypedError {
  @scala.inline
  def apply(
    errorType: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): TypedError = {
    val __obj = js.Dynamic.literal(errorType = errorType, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TypedError]
  }
}

