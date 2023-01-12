package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkforceIntegration
  extends StObject
     with ChangeTrackedEntity {
  
  // API version for the call back URL. Start with 1.
  var apiVersion: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Name of the workforce integration.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The workforce integration encryption resource.
  var encryption: js.UndefOr[NullableOption[WorkforceIntegrationEncryption]] = js.undefined
  
  // Indicates whether this workforce integration is currently active and available.
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on
    * client changes on those entities added here. By default, no entities are supported for change notifications. Possible
    * values are: none, shift, swapRequest, userShiftPreferences, openshift, openShiftRequest, offerShiftRequest,
    * unknownFutureValue.
    */
  var supportedEntities: js.UndefOr[NullableOption[WorkforceIntegrationSupportedEntities]] = js.undefined
  
  // Workforce Integration URL for callbacks from the Shifts service.
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkforceIntegration {
  
  inline def apply(): WorkforceIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkforceIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkforceIntegration] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: NullableOption[Double]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEncryption(value: NullableOption[WorkforceIntegrationEncryption]): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionNull: Self = StObject.set(x, "encryption", null)
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setSupportedEntities(value: NullableOption[WorkforceIntegrationSupportedEntities]): Self = StObject.set(x, "supportedEntities", value.asInstanceOf[js.Any])
    
    inline def setSupportedEntitiesNull: Self = StObject.set(x, "supportedEntities", null)
    
    inline def setSupportedEntitiesUndefined: Self = StObject.set(x, "supportedEntities", js.undefined)
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
