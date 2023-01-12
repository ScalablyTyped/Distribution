package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityUserFlowAttributeAssignment
  extends StObject
     with Entity {
  
  // The display name of the identityUserFlowAttribute within a user flow.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Determines whether the identityUserFlowAttribute is optional. true means the user doesn't have to provide a value.
    * false means the user cannot complete sign-up without providing a value.
    */
  var isOptional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the identityUserFlowAttribute requires verification. This is only used for verifying the user's
    * phone number or email address.
    */
  var requiresVerification: js.UndefOr[Boolean] = js.undefined
  
  // The user attribute that you want to add to your user flow.
  var userAttribute: js.UndefOr[NullableOption[IdentityUserFlowAttribute]] = js.undefined
  
  /**
    * The input options for the user flow attribute. Only applicable when the userInputType is radioSingleSelect,
    * dropdownSingleSelect, or checkboxMultiSelect.
    */
  var userAttributeValues: js.UndefOr[NullableOption[js.Array[UserAttributeValuesItem]]] = js.undefined
  
  /**
    * The input type of the user flow attribute. Possible values are: textBox, dateTimeDropdown, radioSingleSelect,
    * dropdownSingleSelect, emailBox, checkboxMultiSelect.
    */
  var userInputType: js.UndefOr[IdentityUserFlowAttributeInputType] = js.undefined
}
object IdentityUserFlowAttributeAssignment {
  
  inline def apply(): IdentityUserFlowAttributeAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUserFlowAttributeAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityUserFlowAttributeAssignment] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setRequiresVerification(value: Boolean): Self = StObject.set(x, "requiresVerification", value.asInstanceOf[js.Any])
    
    inline def setRequiresVerificationUndefined: Self = StObject.set(x, "requiresVerification", js.undefined)
    
    inline def setUserAttribute(value: NullableOption[IdentityUserFlowAttribute]): Self = StObject.set(x, "userAttribute", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeNull: Self = StObject.set(x, "userAttribute", null)
    
    inline def setUserAttributeUndefined: Self = StObject.set(x, "userAttribute", js.undefined)
    
    inline def setUserAttributeValues(value: NullableOption[js.Array[UserAttributeValuesItem]]): Self = StObject.set(x, "userAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeValuesNull: Self = StObject.set(x, "userAttributeValues", null)
    
    inline def setUserAttributeValuesUndefined: Self = StObject.set(x, "userAttributeValues", js.undefined)
    
    inline def setUserAttributeValuesVarargs(value: UserAttributeValuesItem*): Self = StObject.set(x, "userAttributeValues", js.Array(value*))
    
    inline def setUserInputType(value: IdentityUserFlowAttributeInputType): Self = StObject.set(x, "userInputType", value.asInstanceOf[js.Any])
    
    inline def setUserInputTypeUndefined: Self = StObject.set(x, "userInputType", js.undefined)
  }
}
