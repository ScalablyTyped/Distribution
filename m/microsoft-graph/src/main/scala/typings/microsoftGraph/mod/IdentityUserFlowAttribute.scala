package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityUserFlowAttribute
  extends StObject
     with Entity {
  
  /**
    * The data type of the user flow attribute. This cannot be modified after the custom user flow attribute is created. The
    * supported values for dataType are: string , boolean , int64 , stringCollection , dateTime.
    */
  var dataType: js.UndefOr[IdentityUserFlowAttributeDataType] = js.undefined
  
  // The description of the user flow attribute that's shown to the user at the time of sign-up.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the user flow attribute.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of the user flow attribute. This is a read-only attribute that is automatically set. Depending on the type of
    * attribute, the values for this property will be builtIn, custom, or required.
    */
  var userFlowAttributeType: js.UndefOr[IdentityUserFlowAttributeType] = js.undefined
}
object IdentityUserFlowAttribute {
  
  inline def apply(): IdentityUserFlowAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUserFlowAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityUserFlowAttribute] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: IdentityUserFlowAttributeDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setUserFlowAttributeType(value: IdentityUserFlowAttributeType): Self = StObject.set(x, "userFlowAttributeType", value.asInstanceOf[js.Any])
    
    inline def setUserFlowAttributeTypeUndefined: Self = StObject.set(x, "userFlowAttributeType", js.undefined)
  }
}
