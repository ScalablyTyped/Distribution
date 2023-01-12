package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleServicePrincipal
  extends StObject
     with SubjectSet {
  
  // Description of this service principal.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of the servicePrincipal.
  var servicePrincipalId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SingleServicePrincipal {
  
  inline def apply(): SingleServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleServicePrincipal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleServicePrincipal] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setServicePrincipalId(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalId", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalIdNull: Self = StObject.set(x, "servicePrincipalId", null)
    
    inline def setServicePrincipalIdUndefined: Self = StObject.set(x, "servicePrincipalId", js.undefined)
  }
}
