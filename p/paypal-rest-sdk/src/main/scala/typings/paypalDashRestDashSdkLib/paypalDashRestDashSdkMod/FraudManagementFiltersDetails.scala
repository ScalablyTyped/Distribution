package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FraudManagementFiltersDetails extends js.Object {
  var description: java.lang.String
  var filter_id: java.lang.String
  var filter_type: java.lang.String
  var name: java.lang.String
}

object FraudManagementFiltersDetails {
  @scala.inline
  def apply(
    description: java.lang.String,
    filter_id: java.lang.String,
    filter_type: java.lang.String,
    name: java.lang.String
  ): FraudManagementFiltersDetails = {
    val __obj = js.Dynamic.literal(description = description, filter_id = filter_id, filter_type = filter_type, name = name)
  
    __obj.asInstanceOf[FraudManagementFiltersDetails]
  }
}

