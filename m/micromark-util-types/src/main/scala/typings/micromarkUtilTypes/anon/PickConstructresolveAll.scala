package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.Event
import typings.micromarkUtilTypes.mod.Resolver
import typings.micromarkUtilTypes.mod.TokenizeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<micromark-util-types.micromark-util-types.Construct, 'resolveAll'> */
trait PickConstructresolveAll extends StObject {
  
  var resolveAll: js.UndefOr[Resolver] = js.undefined
}
object PickConstructresolveAll {
  
  inline def apply(): PickConstructresolveAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConstructresolveAll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickConstructresolveAll] (val x: Self) extends AnyVal {
    
    inline def setResolveAll(value: (/* events */ js.Array[Event], /* context */ TokenizeContext) => js.Array[Event]): Self = StObject.set(x, "resolveAll", js.Any.fromFunction2(value))
    
    inline def setResolveAllUndefined: Self = StObject.set(x, "resolveAll", js.undefined)
  }
}
