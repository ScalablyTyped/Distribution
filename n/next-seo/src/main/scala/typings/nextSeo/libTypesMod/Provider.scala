package typings.nextSeo.libTypesMod

import typings.nextSeo.nextSeoStrings.Organization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  var name: String
  
  var `type`: js.UndefOr[Organization | typings.nextSeo.nextSeoStrings.Person] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Provider {
  
  inline def apply(name: String): Provider = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Organization | typings.nextSeo.nextSeoStrings.Person): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
