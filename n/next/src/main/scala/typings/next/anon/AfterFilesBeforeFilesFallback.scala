package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterFilesBeforeFilesFallback extends StObject {
  
  var afterFiles: js.Array[scala.Nothing]
  
  var beforeFiles: js.Array[scala.Nothing]
  
  var fallback: js.Array[scala.Nothing]
}
object AfterFilesBeforeFilesFallback {
  
  inline def apply(
    afterFiles: js.Array[scala.Nothing],
    beforeFiles: js.Array[scala.Nothing],
    fallback: js.Array[scala.Nothing]
  ): AfterFilesBeforeFilesFallback = {
    val __obj = js.Dynamic.literal(afterFiles = afterFiles.asInstanceOf[js.Any], beforeFiles = beforeFiles.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterFilesBeforeFilesFallback]
  }
  
  extension [Self <: AfterFilesBeforeFilesFallback](x: Self) {
    
    inline def setAfterFiles(value: js.Array[scala.Nothing]): Self = StObject.set(x, "afterFiles", value.asInstanceOf[js.Any])
    
    inline def setAfterFilesVarargs(value: scala.Nothing*): Self = StObject.set(x, "afterFiles", js.Array(value*))
    
    inline def setBeforeFiles(value: js.Array[scala.Nothing]): Self = StObject.set(x, "beforeFiles", value.asInstanceOf[js.Any])
    
    inline def setBeforeFilesVarargs(value: scala.Nothing*): Self = StObject.set(x, "beforeFiles", js.Array(value*))
    
    inline def setFallback(value: js.Array[scala.Nothing]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackVarargs(value: scala.Nothing*): Self = StObject.set(x, "fallback", js.Array(value*))
  }
}
