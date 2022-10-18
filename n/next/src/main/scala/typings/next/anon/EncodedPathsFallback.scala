package typings.next.anon

import typings.next.nextStrings.blocking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedPathsFallback extends StObject {
  
  var encodedPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var fallback: js.UndefOr[Boolean | blocking] = js.undefined
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object EncodedPathsFallback {
  
  inline def apply(): EncodedPathsFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodedPathsFallback]
  }
  
  extension [Self <: EncodedPathsFallback](x: Self) {
    
    inline def setEncodedPaths(value: js.Array[String]): Self = StObject.set(x, "encodedPaths", value.asInstanceOf[js.Any])
    
    inline def setEncodedPathsUndefined: Self = StObject.set(x, "encodedPaths", js.undefined)
    
    inline def setEncodedPathsVarargs(value: String*): Self = StObject.set(x, "encodedPaths", js.Array(value*))
    
    inline def setFallback(value: Boolean | blocking): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
