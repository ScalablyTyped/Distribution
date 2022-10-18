package typings.nextSeo.anon

import typings.nextSeo.nextSeoStrings.Organization
import typings.nextSeo.nextSeoStrings.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTypeUrl extends StObject {
  
  var `@type`: Person | Organization
  
  var name: String
  
  var url: String
}
object NameTypeUrl {
  
  inline def apply(`@type`: Person | Organization, name: String, url: String): NameTypeUrl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTypeUrl]
  }
  
  extension [Self <: NameTypeUrl](x: Self) {
    
    inline def `set@type`(value: Person | Organization): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
