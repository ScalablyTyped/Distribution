package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageAlternate extends StObject {
  
  var href: String
  
  var hrefLang: String
}
object LanguageAlternate {
  
  inline def apply(href: String, hrefLang: String): LanguageAlternate = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], hrefLang = hrefLang.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageAlternate]
  }
  
  extension [Self <: LanguageAlternate](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
  }
}
