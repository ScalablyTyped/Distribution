package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoObject extends StObject {
  
  var contact: js.UndefOr[ContactObject] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var license: js.UndefOr[LicenseObject] = js.undefined
  
  var termsOfService: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var version: String
}
object InfoObject {
  
  inline def apply(title: String, version: String): InfoObject = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoObject]
  }
  
  extension [Self <: InfoObject](x: Self) {
    
    inline def setContact(value: ContactObject): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLicense(value: LicenseObject): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
