package typings
package pDashTimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arguments extends js.Object {
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
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[
    /* arguments */ ArgumentsType, 
    pDashTimeLib.pDashTimeMod.pTimeNs.PromiseWithTime[ReturnType]
  ] = js.native
  /**
  	Measure the time a promise takes to resolve. Logs the elapsed time.
  	@param asyncFunction - Promise-returning/async function.
  	@returns A decorated version of `asyncFunction`.
  	*/
  def log[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[
    /* arguments */ ArgumentsType, 
    pDashTimeLib.pDashTimeMod.pTimeNs.PromiseWithTime[ReturnType]
  ] = js.native
}

