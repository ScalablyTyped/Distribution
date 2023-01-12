package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessClientApplications extends StObject {
  
  // Service principal IDs excluded from the policy scope.
  var excludeServicePrincipals: js.UndefOr[js.Array[String]] = js.undefined
  
  // Service principal IDs included in the policy scope, or ServicePrincipalsInMyTenant.
  var includeServicePrincipals: js.UndefOr[js.Array[String]] = js.undefined
}
object ConditionalAccessClientApplications {
  
  inline def apply(): ConditionalAccessClientApplications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessClientApplications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessClientApplications] (val x: Self) extends AnyVal {
    
    inline def setExcludeServicePrincipals(value: js.Array[String]): Self = StObject.set(x, "excludeServicePrincipals", value.asInstanceOf[js.Any])
    
    inline def setExcludeServicePrincipalsUndefined: Self = StObject.set(x, "excludeServicePrincipals", js.undefined)
    
    inline def setExcludeServicePrincipalsVarargs(value: String*): Self = StObject.set(x, "excludeServicePrincipals", js.Array(value*))
    
    inline def setIncludeServicePrincipals(value: js.Array[String]): Self = StObject.set(x, "includeServicePrincipals", value.asInstanceOf[js.Any])
    
    inline def setIncludeServicePrincipalsUndefined: Self = StObject.set(x, "includeServicePrincipals", js.undefined)
    
    inline def setIncludeServicePrincipalsVarargs(value: String*): Self = StObject.set(x, "includeServicePrincipals", js.Array(value*))
  }
}
