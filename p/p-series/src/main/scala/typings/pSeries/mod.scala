package typings.pSeries

import typings.pSeries.anon.Call
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Run promise-returning & async functions in series.
  	@param tasks - Functions are expected to return a value. If a Promise is returned, it's awaited before continuing with the next task.
  	@returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values.
  	@example
  	```
  	import pSeries = require('p-series');
  	import got = require('got');
  	(async () => {
  		const tasks = [
  			() => got('sindresorhus.com'),
  			() => checkSomething(),
  			() => doSomethingElse()
  		];
  		console.log(await pSeries(tasks));
  	})();
  	```
  	*/
  inline def apply[ValueType](tasks: Iterable[js.Function0[js.Promise[ValueType] | ValueType]]): js.Promise[js.Array[ValueType]] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ValueType]]]
  
  @JSImport("p-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pSeries<ValueType>(
  // 	tasks: Iterable<() => Promise<ValueType> | ValueType>
  // ): Promise<ValueType[]>;
  // export = pSeries;
  @JSImport("p-series", "default")
  @js.native
  def default: Call = js.native
  /**
  	Run promise-returning & async functions in series.
  	@param tasks - Functions are expected to return a value. If a Promise is returned, it's awaited before continuing with the next task.
  	@returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values.
  	@example
  	```
  	import pSeries = require('p-series');
  	import got = require('got');
  	(async () => {
  		const tasks = [
  			() => got('sindresorhus.com'),
  			() => checkSomething(),
  			() => doSomethingElse()
  		];
  		console.log(await pSeries(tasks));
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pSeries<ValueType>(
  // 	tasks: Iterable<() => Promise<ValueType> | ValueType>
  // ): Promise<ValueType[]>;
  // export = pSeries;
  inline def default[ValueType](tasks: Iterable[js.Function0[js.Promise[ValueType] | ValueType]]): js.Promise[js.Array[ValueType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ValueType]]]
  inline def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
