package typings.pTry

import typings.pTry.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("p-try", JSImport.Namespace)
  @js.native
  def apply[ValueType, ArgumentsType /* <: js.Array[_] */](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ValueType] | ValueType],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
  ): js.Promise[ValueType] = js.native
  
  @JSImport("p-try", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function pTry<ValueType, ArgumentsType extends unknown[]>(
  //	fn: (...arguments: ArgumentsType) => PromiseLike<ValueType> | ValueType,
  //	...arguments: ArgumentsType
  // ): Promise<ValueType>;
  // export = pTry;
  @JSImport("p-try", "default")
  @js.native
  def default: Call = js.native
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
  @JSImport("p-try", "default")
  @js.native
  def default[ValueType, ArgumentsType /* <: js.Array[_] */](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ValueType] | ValueType],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
  ): js.Promise[ValueType] = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
