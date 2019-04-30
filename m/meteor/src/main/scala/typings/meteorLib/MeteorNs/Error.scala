package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends stdLib.Error {
  var details: js.UndefOr[java.lang.String] = js.undefined
  var error: java.lang.String | scala.Double
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

@JSGlobal("Meteor.Error")
@js.native
class ErrorCls protected () extends Error {
  def this(error: java.lang.String) = this()
  def this(error: scala.Double) = this()
  def this(error: java.lang.String, reason: java.lang.String) = this()
  def this(error: scala.Double, reason: java.lang.String) = this()
  def this(error: java.lang.String, reason: java.lang.String, details: java.lang.String) = this()
  def this(error: scala.Double, reason: java.lang.String, details: java.lang.String) = this()
  /* CompleteClass */
  override var error: java.lang.String | scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

object Error {
  @scala.inline
  def apply(
    error: java.lang.String | scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    details: java.lang.String = null,
    reason: java.lang.String = null,
    stack: java.lang.String = null
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message, name = name)
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Error]
  }
}

