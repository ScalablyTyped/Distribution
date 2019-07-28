package typings.pDashReflect.pDashReflectMod

import typings.pDashReflect.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-reflect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pReflect<ValueType>(
  // 	promise: PromiseLike<ValueType>
  // ): Promise<pReflect.PromiseResult<ValueType>>;
  // export = pReflect;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Make a promise always fulfill with its actual fulfillment value or rejection reason.
  	@param promise - A promise to reflect upon.
  	@returns Promise reflection.
  	@example
  	```
  	import pReflect = require('p-reflect');
  	// Here, `Promise.all` would normally fail early because one of the promises rejects, but by using `p-reflect`, we can ignore the rejection and handle it later on.
  	(async () => {
  		const promises = [
  			getPromise(),
  			getPromiseThatRejects(),
  			getPromise()
  		];
  		const results = await Promise.all(promises.map(pReflect));
  		console.log(results);
  		/ *
  		[
  			{
  				isFulfilled: true,
  				isRejected: false,
  				value: '🦄'
  			},
  			{
  				isFulfilled: false,
  				isRejected: true,
  				reason: [Error: 👹]
  			},
  			{
  				isFulfilled: true,
  				isRejected: false,
  				value: '🐴'
  			}
  		]
  		*\/
  		const resolvedString = results
  			.filter(result => result.isFulfilled)
  			.map(result => result.value)
  			.join('');
  		console.log(resolvedString);
  		//=> '🦄🐴'
  	})();
  	```
  	*/
  def apply[ValueType](promise: js.Thenable[ValueType]): js.Promise[PromiseResult[ValueType]] = js.native
  /**
  	Make a promise always fulfill with its actual fulfillment value or rejection reason.
  	@param promise - A promise to reflect upon.
  	@returns Promise reflection.
  	@example
  	```
  	import pReflect = require('p-reflect');
  	// Here, `Promise.all` would normally fail early because one of the promises rejects, but by using `p-reflect`, we can ignore the rejection and handle it later on.
  	(async () => {
  		const promises = [
  			getPromise(),
  			getPromiseThatRejects(),
  			getPromise()
  		];
  		const results = await Promise.all(promises.map(pReflect));
  		console.log(results);
  		/ *
  		[
  			{
  				isFulfilled: true,
  				isRejected: false,
  				value: '🦄'
  			},
  			{
  				isFulfilled: false,
  				isRejected: true,
  				reason: [Error: 👹]
  			},
  			{
  				isFulfilled: true,
  				isRejected: false,
  				value: '🐴'
  			}
  		]
  		*\/
  		const resolvedString = results
  			.filter(result => result.isFulfilled)
  			.map(result => result.value)
  			.join('');
  		console.log(resolvedString);
  		//=> '🦄🐴'
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pReflect<ValueType>(
  // 	promise: PromiseLike<ValueType>
  // ): Promise<pReflect.PromiseResult<ValueType>>;
  // export = pReflect;
  def default[ValueType](promise: js.Thenable[ValueType]): js.Promise[PromiseResult[ValueType]] = js.native
}

