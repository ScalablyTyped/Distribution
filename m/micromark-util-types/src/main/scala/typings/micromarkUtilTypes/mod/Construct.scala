package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.micromarkUtilTypesStrings.after
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Construct extends StObject {
  
  /**
    * Whether the construct, when in a `ConstructRecord`, precedes over existing
    * constructs for the same character code when merged
    * The default is that new constructs precede over existing ones.
    */
  var add: js.UndefOr[before | after] = js.undefined
  
  /**
    * Concrete constructs cannot be interrupted by more containers.
    *
    * For example, when parsing the document (containers, such as block quotes
    * and lists) and this construct is parsing fenced code:
    *
    * ````markdown
    * > ```js
    * > - list?
    * ````
    *
    * …then `- list?` cannot form if this fenced code construct is concrete.
    *
    * An example of a construct that is not concrete is a GFM table:
    *
    * ````markdown
    * | a |
    * | - |
    * > | b |
    * ````
    *
    * …`b` is not part of the table.
    */
  var concrete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For containers, a continuation construct.
    */
  var continuation: js.UndefOr[Construct] = js.undefined
  
  /**
    * For containers, a final hook.
    */
  var exit: js.UndefOr[Exiter] = js.undefined
  
  /**
    * Name of the construct, used to toggle constructs off.
    * Named constructs must not be `partial`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this construct represents a partial construct.
    * Partial constructs must not have a `name`.
    */
  var partial: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Guard whether the previous character can come before the construct
    */
  var previous: js.UndefOr[Previous] = js.undefined
  
  /**
    * Resolve the events parsed by `tokenize`.
    *
    * For example, if we’re currently parsing a link title and this construct
    * parses character references, then `resolve` is called with the events
    * ranging from the start to the end of a character reference each time one is
    * found.
    */
  var resolve: js.UndefOr[Resolver] = js.undefined
  
  /**
    * Resolve all events when the content is complete, from the start to the end.
    * Only used if `tokenize` is successful once in the content.
    *
    * For example, if we’re currently parsing a link title and this construct
    * parses character references, then `resolveAll` is called *if* at least one
    * character reference is found, ranging from the start to the end of the link
    * title to the end.
    */
  var resolveAll: js.UndefOr[Resolver] = js.undefined
  
  /**
    * Resolve the events from the start of the content (which includes other
    * constructs) to the last one parsed by `tokenize`.
    *
    * For example, if we’re currently parsing a link title and this construct
    * parses character references, then `resolveTo` is called with the events
    * ranging from the start of the link title to the end of a character
    * reference each time one is found.
    */
  var resolveTo: js.UndefOr[Resolver] = js.undefined
  
  def tokenize(effects: Effects, ok: State, nok: State): State
  @JSName("tokenize")
  var tokenize_Original: Tokenizer
}
object Construct {
  
  inline def apply(tokenize: Tokenizer): Construct = {
    val __obj = js.Dynamic.literal(tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Construct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Construct] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: before | after): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
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
    
    inline def setTokenize(value: Tokenizer): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
  }
}
