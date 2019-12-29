package typings.pDashFilter

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-filter", JSImport.Namespace)
@js.native
object pDashFilterMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pFilter<ValueType>(
  // 	input: Iterable<ValueType | PromiseLike<ValueType>>,
  // 	filterer: (
  // 		element: ValueType,
  // 		index: number
  // 	) => boolean | PromiseLike<boolean>,
  // 	options?: pFilter.Options
  // ): Promise<ValueType[]>;
  // export = pFilter;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pFilter */ js.Any = js.native
  /**
  	Filter promises concurrently.
  	@param input - Iterated over concurrently in the `filterer` function.
  	@param filterer - The filterer function that decides whether an element should be included into result.
  	@example
  	```
  	import pFilter = require('p-filter');
  	import getWeather from 'get-weather'; // not a real module
  	const places = [
  		getCapital('Norway').then(info => info.name),
  		'Bangkok, Thailand',
  		'Berlin, Germany',
  		'Tokyo, Japan'
  	];
  	const filterer = async place => {
  		const weather = await getWeather(place);
  		return weather.temperature > 30;
  	};
  	(async () => {
  		const result = await pFilter(places, filterer);
  		console.log(result);
  		//=> ['Bangkok, Thailand']
  	})();
  	```
  	*/
  def apply[ValueType](
    input: Iterable[ValueType | js.Thenable[ValueType]],
    filterer: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]]
  ): js.Promise[js.Array[ValueType]] = js.native
  def apply[ValueType](
    input: Iterable[ValueType | js.Thenable[ValueType]],
    filterer: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]],
    options: Options
  ): js.Promise[js.Array[ValueType]] = js.native
  type Options = typings.pDashMap.pDashMapMod.Options
}

