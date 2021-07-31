package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesProvisioningError extends StObject {
  
  /**
    * Category of the provisioning error. Note: Currently, there is only one possible value. Possible value: PropertyConflict
    * - indicates a property value is not unique. Other objects contain the same value for the property.
    */
  var category: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time at which the error occurred.
  var occurredDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the directory property causing the error. Current possible values: UserPrincipalName or ProxyAddress
  var propertyCausingError: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value of the property causing the error.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnPremisesProvisioningError {
  
  @scala.inline
  def apply(): OnPremisesProvisioningError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesProvisioningError]
  }
  
  @scala.inline
  implicit class OnPremisesProvisioningErrorMutableBuilder[Self <: OnPremisesProvisioningError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: NullableOption[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryNull: Self = StObject.set(x, "category", null)
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setOccurredDateTime(value: NullableOption[String]): Self = StObject.set(x, "occurredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurredDateTimeNull: Self = StObject.set(x, "occurredDateTime", null)
    
    @scala.inline
    def setOccurredDateTimeUndefined: Self = StObject.set(x, "occurredDateTime", js.undefined)
    
    @scala.inline
    def setPropertyCausingError(value: NullableOption[String]): Self = StObject.set(x, "propertyCausingError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyCausingErrorNull: Self = StObject.set(x, "propertyCausingError", null)
    
    @scala.inline
    def setPropertyCausingErrorUndefined: Self = StObject.set(x, "propertyCausingError", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
