package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Original extends StObject {
  
  var load: String
  
  var original: String
}
object Original {
  
  inline def apply(load: String, original: String): Original = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[Original]
  }
  
  extension [Self <: Original](x: Self) {
    
    inline def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
  }
}
