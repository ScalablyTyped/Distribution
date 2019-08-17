package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FraudManagementFiltersDetails extends js.Object {
  var description: String
  var filter_id: String
  var filter_type: String
  var name: String
}

object FraudManagementFiltersDetails {
  @scala.inline
  def apply(description: String, filter_id: String, filter_type: String, name: String): FraudManagementFiltersDetails = {
    val __obj = js.Dynamic.literal(description = description, filter_id = filter_id, filter_type = filter_type, name = name)
  
    __obj.asInstanceOf[FraudManagementFiltersDetails]
  }
}

