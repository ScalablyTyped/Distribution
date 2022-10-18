package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedPaths extends StObject {
  
  var encodedPaths: Unit
  
  var fallback: Unit
  
  var paths: Unit
}
object EncodedPaths {
  
  inline def apply(encodedPaths: Unit, fallback: Unit, paths: Unit): EncodedPaths = {
    val __obj = js.Dynamic.literal(encodedPaths = encodedPaths.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedPaths]
  }
  
  extension [Self <: EncodedPaths](x: Self) {
    
    inline def setEncodedPaths(value: Unit): Self = StObject.set(x, "encodedPaths", value.asInstanceOf[js.Any])
    
    inline def setFallback(value: Unit): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: Unit): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
