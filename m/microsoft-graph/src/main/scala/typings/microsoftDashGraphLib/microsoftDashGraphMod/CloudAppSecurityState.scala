package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudAppSecurityState extends js.Object {
  // Destination IP Address of the connection to the cloud application/service.
  var destinationServiceIp: js.UndefOr[java.lang.String] = js.undefined
  // Cloud application/service name (for example 'Salesforce', 'DropBox', etc.).
  var destinationServiceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provider-generated/calculated risk score of the Cloud Application/Service. Recommended value range of 0-1, which
    * equates to a percentage.
    */
  var riskScore: js.UndefOr[java.lang.String] = js.undefined
}

object CloudAppSecurityState {
  @scala.inline
  def apply(
    destinationServiceIp: java.lang.String = null,
    destinationServiceName: java.lang.String = null,
    riskScore: java.lang.String = null
  ): CloudAppSecurityState = {
    val __obj = js.Dynamic.literal()
    if (destinationServiceIp != null) __obj.updateDynamic("destinationServiceIp")(destinationServiceIp)
    if (destinationServiceName != null) __obj.updateDynamic("destinationServiceName")(destinationServiceName)
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore)
    __obj.asInstanceOf[CloudAppSecurityState]
  }
}

