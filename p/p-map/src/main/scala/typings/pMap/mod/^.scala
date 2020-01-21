package typings.pMap.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  @param input - Iterated over concurrently in the `mapper` function.
  @param mapper - Function which is called for every item in `input`. Expected to return a `Promise` or value.
  @returns A `Promise` that is fulfilled when all promises in `input` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values returned from `mapper` in `input` order.
  @example
  ```
  import pMap = require('p-map');
  import got = require('got');
  const sites = [
  	getWebsiteFromUsername('https://sindresorhus'), //=> Promise
  	'https://ava.li',
  	'https://github.com'
  ];
  (async () => {
  	const mapper = async site => {
  		const {requestUrl} = await got.head(site);
  		return requestUrl;
  	};
  	const result = await pMap(sites, mapper, {concurrency: 2});
  	console.log(result);
  	//=> ['https://sindresorhus.com/', 'https://ava.li/', 'https://github.com/']
  })();
  ```
  */
  def apply[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement]): js.Promise[js.Array[NewElement]] = js.native
  def apply[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement], options: Options): js.Promise[js.Array[NewElement]] = js.native
}

