package typings.pReflect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-reflect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pReflect<ValueType>(
  // 	promise: PromiseLike<ValueType>
  // ): Promise<pReflect.PromiseResult<ValueType>>;
  // export = pReflect;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pReflect */ js.Any = js.native
}
