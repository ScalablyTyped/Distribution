package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientUserAgent
  extends StObject
     with UserAgent {
  
  // The unique identifier of the Azure AD application used by this endpoint.
  var azureADAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication
    * Services APIs.
    */
  var communicationServiceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Identifies the platform used by this endpoint. Possible values are: unknown, windows, macOS, iOS, android, web,
    * ipPhone, roomSystem, surfaceHub, holoLens, unknownFutureValue.
    */
  var platform: js.UndefOr[ClientPlatform] = js.undefined
  
  /**
    * Identifies the family of application software used by this endpoint. Possible values are: unknown, teams,
    * skypeForBusiness, lync, unknownFutureValue, azureCommunicationServices. Note that you must use the Prefer:
    * include-unknown-enum-members request header to get the following value(s) in this evolvable enum:
    * azureCommunicationServices.
    */
  var productFamily: js.UndefOr[ProductFamily] = js.undefined
}
object ClientUserAgent {
  
  inline def apply(): ClientUserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientUserAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientUserAgent] (val x: Self) extends AnyVal {
    
    inline def setAzureADAppId(value: NullableOption[String]): Self = StObject.set(x, "azureADAppId", value.asInstanceOf[js.Any])
    
    inline def setAzureADAppIdNull: Self = StObject.set(x, "azureADAppId", null)
    
    inline def setAzureADAppIdUndefined: Self = StObject.set(x, "azureADAppId", js.undefined)
    
    inline def setCommunicationServiceId(value: NullableOption[String]): Self = StObject.set(x, "communicationServiceId", value.asInstanceOf[js.Any])
    
    inline def setCommunicationServiceIdNull: Self = StObject.set(x, "communicationServiceId", null)
    
    inline def setCommunicationServiceIdUndefined: Self = StObject.set(x, "communicationServiceId", js.undefined)
    
    inline def setPlatform(value: ClientPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProductFamily(value: ProductFamily): Self = StObject.set(x, "productFamily", value.asInstanceOf[js.Any])
    
    inline def setProductFamilyUndefined: Self = StObject.set(x, "productFamily", js.undefined)
  }
}
