package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudAppSecurityState extends js.Object {
  
  // Destination IP Address of the connection to the cloud application/service.
  var destinationServiceIp: js.UndefOr[NullableOption[String]] = js.native
  
  // Cloud application/service name (for example 'Salesforce', 'DropBox', etc.).
  var destinationServiceName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Provider-generated/calculated risk score of the Cloud Application/Service. Recommended value range of 0-1, which
    * equates to a percentage.
    */
  var riskScore: js.UndefOr[NullableOption[String]] = js.native
}
object CloudAppSecurityState {
  
  @scala.inline
  def apply(): CloudAppSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudAppSecurityState]
  }
  
  @scala.inline
  implicit class CloudAppSecurityStateOps[Self <: CloudAppSecurityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationServiceIp(value: NullableOption[String]): Self = this.set("destinationServiceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationServiceIp: Self = this.set("destinationServiceIp", js.undefined)
    
    @scala.inline
    def setDestinationServiceIpNull: Self = this.set("destinationServiceIp", null)
    
    @scala.inline
    def setDestinationServiceName(value: NullableOption[String]): Self = this.set("destinationServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationServiceName: Self = this.set("destinationServiceName", js.undefined)
    
    @scala.inline
    def setDestinationServiceNameNull: Self = this.set("destinationServiceName", null)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = this.set("riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskScore: Self = this.set("riskScore", js.undefined)
    
    @scala.inline
    def setRiskScoreNull: Self = this.set("riskScore", null)
  }
}
