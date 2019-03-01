package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRequest extends js.Object {
  var op: java.lang.String
  var path: java.lang.String
  var value: js.Any
}

object UpdateRequest {
  @scala.inline
  def apply(op: java.lang.String, path: java.lang.String, value: js.Any): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UpdateRequest]
  }
}

