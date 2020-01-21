package typings.pMapSeries

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefault extends js.Object {
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
  def apply[ValueType, MappedValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    mapper: js.Function2[
      /* element */ ValueType, 
      /* index */ Double, 
      js.Thenable[MappedValueType] | MappedValueType
    ]
  ): js.Promise[js.Array[MappedValueType]] = js.native
}

