package typings.pLocate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-locate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[Boolean] | Boolean]
  ): js.Promise[js.UndefOr[ValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], tester.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[ValueType]]]
  inline def default[ValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[Boolean] | Boolean],
    options: Options
  ): js.Promise[js.UndefOr[ValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], tester.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[ValueType]]]
  
  trait Options extends StObject {
    
    /**
    	The number of concurrently pending promises returned by `tester`.
    	Minimum: `1`
    	@default Infinity
    	*/
    val concurrency: js.UndefOr[Double] = js.undefined
    
    /**
    	Preserve `input` order when searching.
    	Disable this to improve performance if you don't care about the order.
    	@default true
    	*/
    val preserveOrder: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      inline def setPreserveOrderUndefined: Self = StObject.set(x, "preserveOrder", js.undefined)
    }
  }
}
