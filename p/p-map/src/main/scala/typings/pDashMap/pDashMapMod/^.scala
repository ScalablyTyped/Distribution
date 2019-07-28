package typings.pDashMap.pDashMapMod

import typings.pDashMap.Anon_Default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pMap<Element, NewElement>(
  // 	input: Iterable<Element>,
  // 	mapper: pMap.Mapper<Element, NewElement>,
  // 	options?: pMap.Options
  // ): Promise<NewElement[]>;
  // export = pMap;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Returns a `Promise` that is fulfilled when all promises in `input` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values returned from `mapper` in `input` order.
  	@param input - Iterated over concurrently in the `mapper` function.
  	@param mapper - Function which is called for every item in `input`. Expected to return a `Promise` or value.
  	@example
  	```
  	import pMap = require('p-map');
  	import got = require('got');
  	const sites = [
  		getWebsiteFromUsername('sindresorhus'), //=> Promise
  		'ava.li',
  		'todomvc.com',
  		'github.com'
  	];
  	(async () => {
  		const mapper = async site => {
  			const {requestUrl} = await got.head(site);
  			return requestUrl;
  		};
  		const result = await pMap(sites, mapper, {concurrency: 2});
  		console.log(result);
  		//=> ['http://sindresorhus.com/', 'http://ava.li/', 'http://todomvc.com/', 'http://github.com/']
  	})();
  	```
  	*/
  def apply[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement]): js.Promise[js.Array[NewElement]] = js.native
  def apply[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement], options: Options): js.Promise[js.Array[NewElement]] = js.native
  /**
  	Returns a `Promise` that is fulfilled when all promises in `input` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values returned from `mapper` in `input` order.
  	@param input - Iterated over concurrently in the `mapper` function.
  	@param mapper - Function which is called for every item in `input`. Expected to return a `Promise` or value.
  	@example
  	```
  	import pMap = require('p-map');
  	import got = require('got');
  	const sites = [
  		getWebsiteFromUsername('sindresorhus'), //=> Promise
  		'ava.li',
  		'todomvc.com',
  		'github.com'
  	];
  	(async () => {
  		const mapper = async site => {
  			const {requestUrl} = await got.head(site);
  			return requestUrl;
  		};
  		const result = await pMap(sites, mapper, {concurrency: 2});
  		console.log(result);
  		//=> ['http://sindresorhus.com/', 'http://ava.li/', 'http://todomvc.com/', 'http://github.com/']
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pMap<Element, NewElement>(
  // 	input: Iterable<Element>,
  // 	mapper: pMap.Mapper<Element, NewElement>,
  // 	options?: pMap.Options
  // ): Promise<NewElement[]>;
  // export = pMap;
  def default[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement]): js.Promise[js.Array[NewElement]] = js.native
  def default[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement], options: Options): js.Promise[js.Array[NewElement]] = js.native
}

