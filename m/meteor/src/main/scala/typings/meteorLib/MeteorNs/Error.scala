package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
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
}

object Error {
  @scala.inline
  def apply(
    error: java.lang.String | scala.Double,
    details: java.lang.String = null,
    reason: java.lang.String = null
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Error]
  }
}

