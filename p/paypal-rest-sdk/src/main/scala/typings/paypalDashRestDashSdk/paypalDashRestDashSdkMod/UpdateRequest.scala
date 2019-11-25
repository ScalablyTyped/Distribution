package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRequest extends js.Object {
  var op: String
  var path: String
  var value: js.Any
}

object UpdateRequest {
  @scala.inline
  def apply(op: String, path: String, value: js.Any): UpdateRequest = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRequest]
  }
}

