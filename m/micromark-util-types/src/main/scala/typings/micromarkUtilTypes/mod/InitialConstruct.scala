package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.micromarkUtilTypesStrings.after
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<micromark-util-types.micromark-util-types.Construct, 'tokenize'> & {  tokenize :micromark-util-types.micromark-util-types.Initializer} */
trait InitialConstruct extends StObject {
  
  var add: js.UndefOr[after | before] = js.undefined
  
  var concrete: js.UndefOr[Boolean] = js.undefined
  
  var continuation: js.UndefOr[Construct] = js.undefined
  
  var exit: js.UndefOr[Exiter] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var partial: js.UndefOr[Boolean] = js.undefined
  
  var previous: js.UndefOr[Previous] = js.undefined
  
  var resolve: js.UndefOr[Resolver] = js.undefined
  
  var resolveAll: js.UndefOr[Resolver] = js.undefined
  
  var resolveTo: js.UndefOr[Resolver] = js.undefined
  
  def tokenize(effects: Effects): State
  @JSName("tokenize")
  var tokenize_Original: Initializer
}
object InitialConstruct {
  
  inline def apply(tokenize: Initializer): InitialConstruct = {
    val __obj = js.Dynamic.literal(tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialConstruct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialConstruct] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: after | before): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setConcrete(value: Boolean): Self = StObject.set(x, "concrete", value.asInstanceOf[js.Any])
    
    inline def setConcreteUndefined: Self = StObject.set(x, "concrete", js.undefined)
    
    inline def setContinuation(value: Construct): Self = StObject.set(x, "continuation", value.asInstanceOf[js.Any])
    
    inline def setContinuationUndefined: Self = StObject.set(x, "continuation", js.undefined)
    
    inline def setExit(value: Exiter): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    inline def setPrevious(value: Previous): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setResolve(value: (/* events */ js.Array[Event], /* context */ TokenizeContext) => js.Array[Event]): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    
    inline def setResolveAll(value: (/* events */ js.Array[Event], /* context */ TokenizeContext) => js.Array[Event]): Self = StObject.set(x, "resolveAll", js.Any.fromFunction2(value))
    
    inline def setResolveAllUndefined: Self = StObject.set(x, "resolveAll", js.undefined)
    
    inline def setResolveTo(value: (/* events */ js.Array[Event], /* context */ TokenizeContext) => js.Array[Event]): Self = StObject.set(x, "resolveTo", js.Any.fromFunction2(value))
    
    inline def setResolveToUndefined: Self = StObject.set(x, "resolveTo", js.undefined)
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setTokenize(value: Initializer): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
  }
}
