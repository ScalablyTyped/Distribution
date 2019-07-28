package typings.meteor.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends typings.std.Error {
  var details: js.UndefOr[String] = js.undefined
  var error: String | Double
  var reason: js.UndefOr[String] = js.undefined
}

@JSGlobal("Meteor.Error")
@js.native
class ErrorCls protected () extends Error {
  def this(error: String) = this()
  def this(error: Double) = this()
  def this(error: String, reason: String) = this()
  def this(error: Double, reason: String) = this()
  def this(error: String, reason: String, details: String) = this()
  def this(error: Double, reason: String, details: String) = this()
  /* CompleteClass */
  override var error: String | Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

object Error {
  @scala.inline
  def apply(
    error: String | Double,
    message: String,
    name: String,
    details: String = null,
    reason: String = null,
    stack: String = null
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message, name = name)
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Error]
  }
}

