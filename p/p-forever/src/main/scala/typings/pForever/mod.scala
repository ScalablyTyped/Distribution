package typings.pForever

import typings.pForever.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Run promise-returning & async functions until you end it.
  	@param fn - Receives the previously returned value. If a `Promise` is returned, it's awaited before calling `fn` again.
  	@param initialValue - Initial value to pass to `fn`.
  	@returns Fulfills when `fn` returns `pForever.end`, or rejects if any of the promises returned from `fn` rejects.
  	@example
  	```
  	import pForever = require('p-forever');
  	pForever(async i => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  		return i;
  	}, 0);
  	// or
  	let i = 0;
  	pForever(async () => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  	});
  	```
  	*/
  inline def apply[ValueType](
    fn: js.Function1[
      /* previousValue */ js.UndefOr[ValueType], 
      ValueType | js.Thenable[ValueType] | js.Symbol
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply[ValueType](
    fn: js.Function1[/* previousValue */ ValueType, ValueType | js.Thenable[ValueType] | js.Symbol],
    initialValue: ValueType
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply[ValueType](
    fn: js.Function1[/* previousValue */ ValueType, ValueType | js.Thenable[ValueType] | js.Symbol],
    initialValue: js.Thenable[ValueType]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("p-forever", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-forever", "default")
  @js.native
  def default: Call = js.native
  /**
  	Run promise-returning & async functions until you end it.
  	@param fn - Receives the previously returned value. If a `Promise` is returned, it's awaited before calling `fn` again.
  	@param initialValue - Initial value to pass to `fn`.
  	@returns Fulfills when `fn` returns `pForever.end`, or rejects if any of the promises returned from `fn` rejects.
  	@example
  	```
  	import pForever = require('p-forever');
  	pForever(async i => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  		return i;
  	}, 0);
  	// or
  	let i = 0;
  	pForever(async () => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  	});
  	```
  	*/
  // TODO: Remove this for the next major release
  inline def default[ValueType](
    fn: js.Function1[
      /* previousValue */ js.UndefOr[ValueType], 
      ValueType | js.Thenable[ValueType] | (/* import warning: importer.ImportType#apply Failed type conversion: typeof pForever.end */ js.Any)
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  // TODO: Remove this for the next major release
  inline def default[ValueType](
    fn: js.Function1[
      /* previousValue */ ValueType, 
      ValueType | js.Thenable[ValueType] | (/* import warning: importer.ImportType#apply Failed type conversion: typeof pForever.end */ js.Any)
    ],
    initialValue: ValueType
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default[ValueType](
    fn: js.Function1[
      /* previousValue */ ValueType, 
      ValueType | js.Thenable[ValueType] | (/* import warning: importer.ImportType#apply Failed type conversion: typeof pForever.end */ js.Any)
    ],
    initialValue: js.Thenable[ValueType]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Symbol used to end the loop.
  	*/
  @JSImport("p-forever", "end")
  @js.native
  val end: js.Symbol = js.native
}
