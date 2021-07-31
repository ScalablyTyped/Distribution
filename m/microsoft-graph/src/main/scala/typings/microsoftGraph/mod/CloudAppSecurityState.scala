package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudAppSecurityState extends StObject {
  
  // Destination IP Address of the connection to the cloud application/service.
  var destinationServiceIp: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Cloud application/service name (for example 'Salesforce', 'DropBox', etc.).
  var destinationServiceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Provider-generated/calculated risk score of the Cloud Application/Service. Recommended value range of 0-1, which
    * equates to a percentage.
    */
  var riskScore: js.UndefOr[NullableOption[String]] = js.undefined
}
object CloudAppSecurityState {
  
  @scala.inline
  def apply(): CloudAppSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudAppSecurityState]
  }
  
  @scala.inline
  implicit class CloudAppSecurityStateMutableBuilder[Self <: CloudAppSecurityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationServiceIp(value: NullableOption[String]): Self = StObject.set(x, "destinationServiceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationServiceIpNull: Self = StObject.set(x, "destinationServiceIp", null)
    
    @scala.inline
    def setDestinationServiceIpUndefined: Self = StObject.set(x, "destinationServiceIp", js.undefined)
    
    @scala.inline
    def setDestinationServiceName(value: NullableOption[String]): Self = StObject.set(x, "destinationServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationServiceNameNull: Self = StObject.set(x, "destinationServiceName", null)
    
    @scala.inline
    def setDestinationServiceNameUndefined: Self = StObject.set(x, "destinationServiceName", js.undefined)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    @scala.inline
    def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
  }
}
