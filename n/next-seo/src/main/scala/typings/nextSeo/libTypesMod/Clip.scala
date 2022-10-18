package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clip extends StObject {
  
  var name: String
  
  var startOffset: Double
  
  var url: String
}
object Clip {
  
  inline def apply(name: String, startOffset: Double, url: String): Clip = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clip]
  }
  
  extension [Self <: Clip](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
