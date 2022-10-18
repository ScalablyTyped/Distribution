package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameSameAs extends StObject {
  
  var `@type`: String
  
  var name: String
  
  var sameAs: js.UndefOr[String] = js.undefined
}
object NameSameAs {
  
  inline def apply(`@type`: String, name: String): NameSameAs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameSameAs]
  }
  
  extension [Self <: NameSameAs](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
  }
}
