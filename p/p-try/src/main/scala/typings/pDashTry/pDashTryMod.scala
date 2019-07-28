package typings.pDashTry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-try", JSImport.Namespace)
@js.native
object pDashTryMod extends js.Object {
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function pTry<ValueType, ArgumentsType extends unknown[]>(
  //	fn: (...arguments: ArgumentsType) => PromiseLike<ValueType> | ValueType,
  //	...arguments: ArgumentsType
  // ): Promise<ValueType>;
  // export = pTry;
  @JSName("default")
  var default_Original: Anon_Arguments = js.native
  /**
  	Start a promise chain.
  	@param fn - The function to run to start the promise chain.
  	@param arguments - Arguments to pass to `fn`.
  	@returns The value of calling `fn(...arguments)`. If the function throws an error, the returned `Promise` will be rejected with that error.
  	@example
  	```
  	import pTry = require('p-try');
  	(async () => {
  		try {
  			const value = await pTry(() => {
  				return synchronousFunctionThatMightThrow();
  			});
  			console.log(value);
  		} catch (error) {
  			console.error(error);
  		}
  	})();
  	```
  	*/
  def apply[ValueType, ArgumentsType /* <: js.Array[_] */](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ValueType] | ValueType],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
  ): js.Promise[ValueType] = js.native
  /**
  	Start a promise chain.
  	@param fn - The function to run to start the promise chain.
  	@param arguments - Arguments to pass to `fn`.
  	@returns The value of calling `fn(...arguments)`. If the function throws an error, the returned `Promise` will be rejected with that error.
  	@example
  	```
  	import pTry = require('p-try');
  	(async () => {
  		try {
  			const value = await pTry(() => {
  				return synchronousFunctionThatMightThrow();
  			});
  			console.log(value);
  		} catch (error) {
  			console.error(error);
  		}
  	})();
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function pTry<ValueType, ArgumentsType extends unknown[]>(
  //	fn: (...arguments: ArgumentsType) => PromiseLike<ValueType> | ValueType,
  //	...arguments: ArgumentsType
  // ): Promise<ValueType>;
  // export = pTry;
  def default[ValueType, ArgumentsType /* <: js.Array[_] */](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ValueType] | ValueType],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
  ): js.Promise[ValueType] = js.native
}

