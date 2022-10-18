package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualLocation
  extends StObject
     with Location {
  
  var name: js.UndefOr[String] = js.undefined
  
  var sameAs: js.UndefOr[String] = js.undefined
  
  var url: String
}
object VirtualLocation {
  
  inline def apply(url: String): VirtualLocation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualLocation]
  }
  
  extension [Self <: VirtualLocation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
