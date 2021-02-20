package typings.pTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Measure the time a promise takes to resolve.
  	@param asyncFunction - Promise-returning/async function.
  	@returns A decorated version of `asyncFunction`.
  	@example
  	```
  	import pTime = require('p-time');
  	import execa = require('execa');
  	(async () => {
  		const promise = pTime(execa)('sleep', ['1']);
  		await promise;
  		console.log(promise.time);
  		//=> 1016
  	})();
  	```
  	*/
  @JSImport("p-time", JSImport.Namespace)
  @js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = js.native
  
  @JSImport("p-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-time", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pTime */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pTime */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Measure the time a promise takes to resolve. Logs the elapsed time.
  	@param asyncFunction - Promise-returning/async function.
  	@returns A decorated version of `asyncFunction`.
  	*/
  @JSImport("p-time", "log")
  @js.native
  def log[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = js.native
  
  @js.native
  trait PromiseWithTime[ValueType]
    extends js.Promise[ValueType] {
    
    /**
    		The elapsed time in milliseconds.
    		*/
    val time: js.UndefOr[Double] = js.native
  }
}
