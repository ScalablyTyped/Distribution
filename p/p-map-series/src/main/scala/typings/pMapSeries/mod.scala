package typings.pMapSeries

import typings.pMapSeries.anon.Call
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Map over promises serially.
  	@param input - Mapped over serially in the `mapper` function.
  	@param mapper - Expected to return a value. If it's a `Promise`, it's awaited before continuing with the next iteration.
  	@returns Fulfills when all promises in `input` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject.
  	@example
  	```
  	import pMapSeries = require('p-map-series');
  	const keywords = [
  		getTopKeyword() //=> Promise
  		'rainbow',
  		'pony'
  	];
  	let scores = [];
  	const mapper = async keyword => {
  		const score = await fetchScore(keyword);
  		scores.push(score);
  		return {keyword, score};
  	});
  	(async () => {
  		console.log(await pMapSeries(keywords, mapper));
  		// [
  		// 	{
  		// 		keyword: 'unicorn',
  		// 		score: 99
  		// 	},
  		// 	{
  		// 		keyword: 'rainbow',
  		// 		score: 70
  		// 	},
  		// 	{
  		// 		keyword: 'pony',
  		// 		score: 79
  		// 	}
  		// ]
  	})();
  	```
  	*/
  inline def apply[ValueType, MappedValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    mapper: js.Function2[
      /* element */ ValueType, 
      /* index */ Double, 
      js.Thenable[MappedValueType] | MappedValueType
    ]
  ): js.Promise[js.Array[MappedValueType]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MappedValueType]]]
  
  @JSImport("p-map-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pMapSeries<ValueType, MappedValueType>(
  // 	input: Iterable<PromiseLike<ValueType> | ValueType>,
  // 	mapper: (
  // 		element: ValueType,
  // 		index: number
  // 	) => PromiseLike<MappedValueType> | MappedValueType
  // ): Promise<MappedValueType[]>;
  // export = pMapSeries;
  @JSImport("p-map-series", "default")
  @js.native
  def default: Call = js.native
  /**
  	Map over promises serially.
  	@param input - Mapped over serially in the `mapper` function.
  	@param mapper - Expected to return a value. If it's a `Promise`, it's awaited before continuing with the next iteration.
  	@returns Fulfills when all promises in `input` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject.
  	@example
  	```
  	import pMapSeries = require('p-map-series');
  	const keywords = [
  		getTopKeyword() //=> Promise
  		'rainbow',
  		'pony'
  	];
  	let scores = [];
  	const mapper = async keyword => {
  		const score = await fetchScore(keyword);
  		scores.push(score);
  		return {keyword, score};
  	});
  	(async () => {
  		console.log(await pMapSeries(keywords, mapper));
  		// [
  		// 	{
  		// 		keyword: 'unicorn',
  		// 		score: 99
  		// 	},
  		// 	{
  		// 		keyword: 'rainbow',
  		// 		score: 70
  		// 	},
  		// 	{
  		// 		keyword: 'pony',
  		// 		score: 79
  		// 	}
  		// ]
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pMapSeries<ValueType, MappedValueType>(
  // 	input: Iterable<PromiseLike<ValueType> | ValueType>,
  // 	mapper: (
  // 		element: ValueType,
  // 		index: number
  // 	) => PromiseLike<MappedValueType> | MappedValueType
  // ): Promise<MappedValueType[]>;
  // export = pMapSeries;
  inline def default[ValueType, MappedValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    mapper: js.Function2[
      /* element */ ValueType, 
      /* index */ Double, 
      js.Thenable[MappedValueType] | MappedValueType
    ]
  ): js.Promise[js.Array[MappedValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MappedValueType]]]
  inline def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
