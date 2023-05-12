package typings.node.vmMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileFunctionOptions
  extends StObject
     with BaseOptions {
  
  /**
    * Provides an optional data with V8's code cache data for the supplied source.
    */
  var cachedData: js.UndefOr[Buffer] = js.undefined
  
  /**
    * An array containing a collection of context extensions (objects wrapping the current scope) to be applied while compiling
    */
  var contextExtensions: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * The sandbox/context in which the said function should be compiled in.
    */
  var parsingContext: js.UndefOr[Context] = js.undefined
  
  /**
    * Specifies whether to produce new cache data.
    * Default: `false`,
    */
  var produceCachedData: js.UndefOr[Boolean] = js.undefined
}
object CompileFunctionOptions {
  
  inline def apply(): CompileFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileFunctionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileFunctionOptions] (val x: Self) extends AnyVal {
    
    inline def setCachedData(value: Buffer): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
    
    inline def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
    
    inline def setContextExtensions(value: js.Array[js.Object]): Self = StObject.set(x, "contextExtensions", value.asInstanceOf[js.Any])
    
    inline def setContextExtensionsUndefined: Self = StObject.set(x, "contextExtensions", js.undefined)
    
    inline def setContextExtensionsVarargs(value: js.Object*): Self = StObject.set(x, "contextExtensions", js.Array(value*))
    
    inline def setParsingContext(value: Context): Self = StObject.set(x, "parsingContext", value.asInstanceOf[js.Any])
    
    inline def setParsingContextUndefined: Self = StObject.set(x, "parsingContext", js.undefined)
    
    inline def setProduceCachedData(value: Boolean): Self = StObject.set(x, "produceCachedData", value.asInstanceOf[js.Any])
    
    inline def setProduceCachedDataUndefined: Self = StObject.set(x, "produceCachedData", js.undefined)
  }
}
