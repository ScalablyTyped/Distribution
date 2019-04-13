package typings
package pDashTimeLib.pDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: pDashTimeLib.Anon_Arguments = js.native
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
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = js.native
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
  // TODO: Remove this for the next major release
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = js.native
  /**
  	Measure the time a promise takes to resolve. Logs the elapsed time.
  	@param asyncFunction - Promise-returning/async function.
  	@returns A decorated version of `asyncFunction`.
  	*/
  def log[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = js.native
}

