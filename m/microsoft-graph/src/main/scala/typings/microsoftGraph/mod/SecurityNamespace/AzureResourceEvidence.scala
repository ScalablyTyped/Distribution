package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureResourceEvidence
  extends StObject
     with AlertEvidence {
  
  // The unique identifier for the Azure resource.
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the resource.
  var resourceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the resource.
  var resourceType: js.UndefOr[NullableOption[String]] = js.undefined
}
object AzureResourceEvidence {
  
  inline def apply(): AzureResourceEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureResourceEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureResourceEvidence] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceName(value: NullableOption[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: NullableOption[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
