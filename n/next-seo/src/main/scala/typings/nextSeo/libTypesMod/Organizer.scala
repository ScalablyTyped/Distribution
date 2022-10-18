package typings.nextSeo.libTypesMod

import typings.nextSeo.nextSeoStrings.Organization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organizer extends StObject {
  
  var name: String
  
  var `type`: typings.nextSeo.nextSeoStrings.Person | Organization
  
  var url: String
}
object Organizer {
  
  inline def apply(name: String, `type`: typings.nextSeo.nextSeoStrings.Person | Organization, url: String): Organizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizer]
  }
  
  extension [Self <: Organizer](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.nextSeo.nextSeoStrings.Person | Organization): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
