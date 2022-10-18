package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableLanguage extends StObject {
  
  var `@type`: String
  
  var areaServed: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var availableLanguage: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contactOption: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contactType: String
  
  var telephone: String
}
object AvailableLanguage {
  
  inline def apply(`@type`: String, contactType: String, telephone: String): AvailableLanguage = {
    val __obj = js.Dynamic.literal(contactType = contactType.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableLanguage]
  }
  
  extension [Self <: AvailableLanguage](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setAreaServed(value: String | js.Array[String]): Self = StObject.set(x, "areaServed", value.asInstanceOf[js.Any])
    
    inline def setAreaServedUndefined: Self = StObject.set(x, "areaServed", js.undefined)
    
    inline def setAreaServedVarargs(value: String*): Self = StObject.set(x, "areaServed", js.Array(value*))
    
    inline def setAvailableLanguage(value: String | js.Array[String]): Self = StObject.set(x, "availableLanguage", value.asInstanceOf[js.Any])
    
    inline def setAvailableLanguageUndefined: Self = StObject.set(x, "availableLanguage", js.undefined)
    
    inline def setAvailableLanguageVarargs(value: String*): Self = StObject.set(x, "availableLanguage", js.Array(value*))
    
    inline def setContactOption(value: String | js.Array[String]): Self = StObject.set(x, "contactOption", value.asInstanceOf[js.Any])
    
    inline def setContactOptionUndefined: Self = StObject.set(x, "contactOption", js.undefined)
    
    inline def setContactOptionVarargs(value: String*): Self = StObject.set(x, "contactOption", js.Array(value*))
    
    inline def setContactType(value: String): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    inline def setTelephone(value: String): Self = StObject.set(x, "telephone", value.asInstanceOf[js.Any])
  }
}
