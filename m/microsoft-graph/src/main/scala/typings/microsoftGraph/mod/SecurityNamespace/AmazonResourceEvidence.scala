package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonResourceEvidence
  extends StObject
     with AlertEvidence {
  
  // The unique identifier for the Amazon account.
  var amazonAccountId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Amazon resource identifier (ARN) for the cloud resource.
  var amazonResourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the resource.
  var resourceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the resource.
  var resourceType: js.UndefOr[NullableOption[String]] = js.undefined
}
object AmazonResourceEvidence {
  
  inline def apply(): AmazonResourceEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonResourceEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonResourceEvidence] (val x: Self) extends AnyVal {
    
    inline def setAmazonAccountId(value: NullableOption[String]): Self = StObject.set(x, "amazonAccountId", value.asInstanceOf[js.Any])
    
    inline def setAmazonAccountIdNull: Self = StObject.set(x, "amazonAccountId", null)
    
    inline def setAmazonAccountIdUndefined: Self = StObject.set(x, "amazonAccountId", js.undefined)
    
    inline def setAmazonResourceId(value: NullableOption[String]): Self = StObject.set(x, "amazonResourceId", value.asInstanceOf[js.Any])
    
    inline def setAmazonResourceIdNull: Self = StObject.set(x, "amazonResourceId", null)
    
    inline def setAmazonResourceIdUndefined: Self = StObject.set(x, "amazonResourceId", js.undefined)
    
    inline def setResourceName(value: NullableOption[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: NullableOption[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
