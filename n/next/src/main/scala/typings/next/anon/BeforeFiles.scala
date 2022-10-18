package typings.next.anon

import typings.next.distLibLoadCustomRoutesMod.Rewrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeFiles extends StObject {
  
  var afterFiles: js.UndefOr[js.Array[Rewrite]] = js.undefined
  
  var beforeFiles: js.UndefOr[js.Array[Rewrite]] = js.undefined
  
  var fallback: js.UndefOr[js.Array[Rewrite]] = js.undefined
}
object BeforeFiles {
  
  inline def apply(): BeforeFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeFiles]
  }
  
  extension [Self <: BeforeFiles](x: Self) {
    
    inline def setAfterFiles(value: js.Array[Rewrite]): Self = StObject.set(x, "afterFiles", value.asInstanceOf[js.Any])
    
    inline def setAfterFilesUndefined: Self = StObject.set(x, "afterFiles", js.undefined)
    
    inline def setAfterFilesVarargs(value: Rewrite*): Self = StObject.set(x, "afterFiles", js.Array(value*))
    
    inline def setBeforeFiles(value: js.Array[Rewrite]): Self = StObject.set(x, "beforeFiles", value.asInstanceOf[js.Any])
    
    inline def setBeforeFilesUndefined: Self = StObject.set(x, "beforeFiles", js.undefined)
    
    inline def setBeforeFilesVarargs(value: Rewrite*): Self = StObject.set(x, "beforeFiles", js.Array(value*))
    
    inline def setFallback(value: js.Array[Rewrite]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFallbackVarargs(value: Rewrite*): Self = StObject.set(x, "fallback", js.Array(value*))
  }
}
