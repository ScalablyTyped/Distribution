package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudHealthcareV1ConsentPolicy extends StObject {
  
  /**
    * Required. The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical
    * operators that are limited to `AND` (`&&`), `OR` (`||`).
    */
  var authorizationRule: js.UndefOr[Expr] = js.undefined
  
  /**
    * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given
    * user.
    */
  var resourceAttributes: js.UndefOr[js.Array[Attribute]] = js.undefined
}
object GoogleCloudHealthcareV1ConsentPolicy {
  
  inline def apply(): GoogleCloudHealthcareV1ConsentPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudHealthcareV1ConsentPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudHealthcareV1ConsentPolicy] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationRule(value: Expr): Self = StObject.set(x, "authorizationRule", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationRuleUndefined: Self = StObject.set(x, "authorizationRule", js.undefined)
    
    inline def setResourceAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
    
    inline def setResourceAttributesVarargs(value: Attribute*): Self = StObject.set(x, "resourceAttributes", js.Array(value*))
  }
}
