package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Results
trait GenericResult extends js.Object {
  var ErrorCode: js.UndefOr[scala.Double] = js.undefined
  var Message: java.lang.String
}

object GenericResult {
  @scala.inline
  def apply(Message: java.lang.String, ErrorCode: scala.Int | scala.Double = null): GenericResult = {
    val __obj = js.Dynamic.literal(Message = Message)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericResult]
  }
}

