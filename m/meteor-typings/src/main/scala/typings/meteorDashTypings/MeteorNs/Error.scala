package typings.meteorDashTypings.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
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
}

object Error {
  @scala.inline
  def apply(error: String | Double, details: String = null, reason: String = null): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Error]
  }
}

