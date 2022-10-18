package typings.next.anon

import typings.next.distServerRouterMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fallback extends StObject {
  
  var afterFiles: js.Array[Route]
  
  var beforeFiles: js.Array[Route]
  
  var fallback: js.Array[Route]
}
object Fallback {
  
  inline def apply(afterFiles: js.Array[Route], beforeFiles: js.Array[Route], fallback: js.Array[Route]): Fallback = {
    val __obj = js.Dynamic.literal(afterFiles = afterFiles.asInstanceOf[js.Any], beforeFiles = beforeFiles.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
  
  extension [Self <: Fallback](x: Self) {
    
    inline def setAfterFiles(value: js.Array[Route]): Self = StObject.set(x, "afterFiles", value.asInstanceOf[js.Any])
    
    inline def setAfterFilesVarargs(value: Route*): Self = StObject.set(x, "afterFiles", js.Array(value*))
    
    inline def setBeforeFiles(value: js.Array[Route]): Self = StObject.set(x, "beforeFiles", value.asInstanceOf[js.Any])
    
    inline def setBeforeFilesVarargs(value: Route*): Self = StObject.set(x, "beforeFiles", js.Array(value*))
    
    inline def setFallback(value: js.Array[Route]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackVarargs(value: Route*): Self = StObject.set(x, "fallback", js.Array(value*))
  }
}
