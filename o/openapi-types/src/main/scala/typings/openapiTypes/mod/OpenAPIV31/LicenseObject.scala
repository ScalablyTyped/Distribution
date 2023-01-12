package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openapi-types.openapi-types.OpenAPIV3_1.Modify<openapi-types.openapi-types.OpenAPIV3.LicenseObject, {  identifier :string | undefined}> */
trait LicenseObject extends StObject {
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var url: js.UndefOr[String] = js.undefined
}
object LicenseObject {
  
  inline def apply(name: String): LicenseObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseObject] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
