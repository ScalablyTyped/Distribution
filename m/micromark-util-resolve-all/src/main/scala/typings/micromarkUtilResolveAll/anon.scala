package typings.micromarkUtilResolveAll

import typings.micromarkUtilResolveAll.mod.Resolver
import typings.micromarkUtilTypes.mod.Event
import typings.micromarkUtilTypes.mod.TokenizeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ResolveAll extends StObject {
    
    var resolveAll: js.UndefOr[Resolver] = js.undefined
  }
  object ResolveAll {
    
    inline def apply(): ResolveAll = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveAll]
    }
    
    extension [Self <: ResolveAll](x: Self) {
      
      inline def setResolveAll(value: (/* events */ js.Array[Event], /* context */ TokenizeContext) => js.Array[Event]): Self = StObject.set(x, "resolveAll", js.Any.fromFunction2(value))
      
      inline def setResolveAllUndefined: Self = StObject.set(x, "resolveAll", js.undefined)
    }
  }
}
