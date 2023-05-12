package typings.metro

import typings.metro.srcModuleGraphWorkerCollectDependenciesMod.ContextMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibContextModuleMod {
  
  trait RequireContext extends StObject {
    
    /* Filename filter pattern for use in `require.context`. Optional, default `.*` (any file) when `require.context` is used */
    val filter: js.RegExp
    
    /** Absolute path of the directory to search in */
    val from: String
    
    /** Mode for resolving dynamic dependencies. Defaults to `sync` */
    val mode: ContextMode
    
    /* Should search for files recursively. Optional, default `true` when `require.context` is used */
    val recursive: Boolean
  }
  object RequireContext {
    
    inline def apply(filter: js.RegExp, from: String, mode: ContextMode, recursive: Boolean): RequireContext = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequireContext] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMode(value: ContextMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    }
  }
}
