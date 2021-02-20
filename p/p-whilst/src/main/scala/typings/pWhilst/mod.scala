package typings.pWhilst

import typings.pWhilst.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	While `condition` returns `true`, executes `action` repeatedly, and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
  	@param condition - Expected to return a boolean of whether to execute `action`.
  	@param action - Action to run for each iteration. You can return a promise and it will be handled.
  	@example
  	```
  	import pWhilst = require('p-whilst');
  	(async () => {
  		let count = 0;
  		await pWhilst(
  			() => count < 5,
  			() => count++
  		);
  		console.log(count);
  		//=> 5
  	})();
  	```
  	*/
  @JSImport("p-whilst", JSImport.Namespace)
  @js.native
  def apply[ValueType](
    condition: js.Function1[/* value */ js.UndefOr[ValueType], Boolean],
    action: js.Function0[ValueType | js.Thenable[ValueType]]
  ): js.Promise[Unit] = js.native
  
  @JSImport("p-whilst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWhilst<ValueType>(
  // 	condition: (value: ValueType | undefined) => boolean,
  // 	action: () => ValueType | PromiseLike<ValueType>
  // ): Promise<void>;
  // export = pWhilst;
  @JSImport("p-whilst", "default")
  @js.native
  def default: Call = js.native
  /**
  	While `condition` returns `true`, executes `action` repeatedly, and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
  	@param condition - Expected to return a boolean of whether to execute `action`.
  	@param action - Action to run for each iteration. You can return a promise and it will be handled.
  	@example
  	```
  	import pWhilst = require('p-whilst');
  	(async () => {
  		let count = 0;
  		await pWhilst(
  			() => count < 5,
  			() => count++
  		);
  		console.log(count);
  		//=> 5
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWhilst<ValueType>(
  // 	condition: (value: ValueType | undefined) => boolean,
  // 	action: () => ValueType | PromiseLike<ValueType>
  // ): Promise<void>;
  // export = pWhilst;
  @JSImport("p-whilst", "default")
  @js.native
  def default[ValueType](
    condition: js.Function1[/* value */ js.UndefOr[ValueType], Boolean],
    action: js.Function0[ValueType | js.Thenable[ValueType]]
  ): js.Promise[Unit] = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
