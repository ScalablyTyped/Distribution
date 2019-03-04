package typings
package memjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Success extends js.Object {
  var success: scala.Boolean
  var value: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Anon_Success {
  @scala.inline
  def apply(success: scala.Boolean, value: scala.Int | scala.Double = null): Anon_Success = {
    val __obj = js.Dynamic.literal(success = success)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Success]
  }
}

