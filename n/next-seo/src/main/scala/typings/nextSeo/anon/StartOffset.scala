package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOffset extends StObject {
  
  var `@type`: String
  
  var name: String
  
  var startOffset: Double
  
  var url: String
}
object StartOffset {
  
  inline def apply(`@type`: String, name: String, startOffset: Double, url: String): StartOffset = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOffset]
  }
  
  extension [Self <: StartOffset](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
