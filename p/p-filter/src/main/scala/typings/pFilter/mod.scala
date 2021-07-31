package typings.pFilter

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply[ValueType](
    input: Iterable[ValueType | js.Thenable[ValueType]],
    filterer: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]]
  ): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
  @scala.inline
  def apply[ValueType](
    input: Iterable[ValueType | js.Thenable[ValueType]],
    filterer: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]],
    options: Options
  ): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
  
  @JSImport("p-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("p-filter", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pFilter */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pFilter */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type Options = typings.pMap.mod.Options
}
