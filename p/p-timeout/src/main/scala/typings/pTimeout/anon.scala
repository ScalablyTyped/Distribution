package typings.pTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearTimeout extends StObject {
    
    var clearTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.clearTimeout */ Any
    
    var setTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.setTimeout */ Any
  }
  object ClearTimeout {
    
    inline def apply(
      clearTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.clearTimeout */ Any,
      setTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.setTimeout */ Any
    ): ClearTimeout = {
      val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearTimeout]
    }
    
    extension [Self <: ClearTimeout](x: Self) {
      
      inline def setClearTimeout(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.clearTimeout */ Any
      ): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
      
      inline def setSetTimeout(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.setTimeout */ Any
      ): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    }
  }
}
