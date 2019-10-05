package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.payment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteRequest extends js.Object {
  var payer_id: String
}

object ExecuteRequest {
  @scala.inline
  def apply(payer_id: String): ExecuteRequest = {
    val __obj = js.Dynamic.literal(payer_id = payer_id)
  
    __obj.asInstanceOf[ExecuteRequest]
  }
}

