package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preconnect extends StObject {
  
  var preconnect: String
  
  var url: String
}
object Preconnect {
  
  inline def apply(preconnect: String, url: String): Preconnect = {
    val __obj = js.Dynamic.literal(preconnect = preconnect.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preconnect]
  }
  
  extension [Self <: Preconnect](x: Self) {
    
    inline def setPreconnect(value: String): Self = StObject.set(x, "preconnect", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
