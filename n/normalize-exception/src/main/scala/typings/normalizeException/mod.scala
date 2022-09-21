package typings.normalizeException

import typings.normalizeException.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("normalize-exception", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ErrorArg](error: ErrorArg): NormalizedError[ErrorArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any]).asInstanceOf[NormalizedError[ErrorArg]]
  inline def default[ErrorArg](error: ErrorArg, options: Options): NormalizedError[ErrorArg] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NormalizedError[ErrorArg]]
  
  type DefinedString[Value, DefaultValue] = DefaultValue | Value
  
  type NormalizedError[ErrorArg] = js.Error & (Any | Message[ErrorArg])
  
  trait Options extends StObject {
    
    /**
      * Unless `true`,
      * [`error.cause`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/cause)
      * and
      * [`error.errors`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/AggregateError)
      * are normalized recursively, when present.
      */
    val shallow: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
}
