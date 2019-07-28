package typings.pDashFilter

import typings.pDashFilter.pDashFilterMod.Options
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
}

