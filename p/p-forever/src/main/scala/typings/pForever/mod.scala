package typings.pForever

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Run promise-returning & async functions until you end it.
    	@param function_ - Receives the previously returned value. If a `Promise` is returned, it's awaited before calling `fn` again.
    	@param initialValue - Initial value to pass to `fn`.
    	@returns Fulfills when `fn` returns `pForever.end`, or rejects if any of the promises returned from `fn` rejects.
    	@example
    	```
    	import pForever from 'p-forever';
    	pForever(async index => {
    		index++;
    		if (index > 100) {
    			return pForever.end;
    		}
    		await createFixture(index);
    		return index;
    	}, 0);
    	// or
    	let index = 0;
    	pForever(async () => {
    		index++;
    		if (index > 100) {
    			return pForever.end;
    		}
    		await createFixture(index);
    	});
    	```
    	*/
    inline def apply[ValueType](
      function_ : js.Function1[
          /* previousValue */ js.UndefOr[ValueType], 
          ValueType | (PromiseLike[js.Symbol | ValueType]) | js.Symbol
        ]
    ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(function_.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def apply[ValueType](
      function_ : js.Function1[
          /* previousValue */ ValueType, 
          ValueType | (PromiseLike[js.Symbol | ValueType]) | js.Symbol
        ],
      initialValue: ValueType
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(function_.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply[ValueType](
      function_ : js.Function1[
          /* previousValue */ ValueType, 
          ValueType | (PromiseLike[js.Symbol | ValueType]) | js.Symbol
        ],
      initialValue: PromiseLike[ValueType]
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(function_.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("p-forever", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Symbol used to end the loop.
    	*/
    @JSImport("p-forever", "default.end")
    @js.native
    val end: js.Symbol = js.native
  }
}
