package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SameAs extends StObject {
  
  var `@type`: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var sameAs: js.UndefOr[String] = js.undefined
  
  var url: String
}
object SameAs {
  
  inline def apply(`@type`: String, url: String): SameAs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameAs]
  }
  
  extension [Self <: SameAs](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
