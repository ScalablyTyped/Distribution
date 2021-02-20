package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkforceIntegration extends ChangeTrackedEntity {
  
  // API version for the call back URL. Start with 1.
  var apiVersion: js.UndefOr[NullableOption[Double]] = js.native
  
  // Name of the workforce integration.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The workforce integration encryption resource.
  var encryption: js.UndefOr[NullableOption[WorkforceIntegrationEncryption]] = js.native
  
  // Indicates whether this workforce integration is currently active and available.
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on
    * client changes on those entities added here. By default, no entities are supported for change notifications. Possible
    * values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences
    */
  var supportedEntities: js.UndefOr[NullableOption[WorkforceIntegrationSupportedEntities]] = js.native
  
  // Workforce Integration URL for callbacks from the Shifts service.
  var url: js.UndefOr[NullableOption[String]] = js.native
}
object WorkforceIntegration {
  
  @scala.inline
  def apply(): WorkforceIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkforceIntegration]
  }
  
  @scala.inline
  implicit class WorkforceIntegrationMutableBuilder[Self <: WorkforceIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: NullableOption[Double]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEncryption(value: NullableOption[WorkforceIntegrationEncryption]): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionNull: Self = StObject.set(x, "encryption", null)
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setSupportedEntities(value: NullableOption[WorkforceIntegrationSupportedEntities]): Self = StObject.set(x, "supportedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedEntitiesNull: Self = StObject.set(x, "supportedEntities", null)
    
    @scala.inline
    def setSupportedEntitiesUndefined: Self = StObject.set(x, "supportedEntities", js.undefined)
    
    @scala.inline
    def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
