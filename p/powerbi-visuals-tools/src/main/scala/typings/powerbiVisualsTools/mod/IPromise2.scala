package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an operation, to be completed (resolve/rejected) in the future.
  * Success and failure types can be set independently.
  */
@js.native
trait IPromise2[TSuccess, TError] extends StObject {
  
  /**
    * Shorthand for promise.then(null, errorCallback).
    */
  def `catch`[TErrorResult](onRejected: js.Function1[/* reason */ Any, (IPromise2[TSuccess, TErrorResult]) | TErrorResult]): IPromise2[TSuccess, TErrorResult] = js.native
  
  /**
    * Allows you to observe either the fulfillment or rejection of a promise,
    * but to do so without modifying the final value.
    * This is useful to release resources or do some clean-up that needs to be done
    * whether the promise was rejected or resolved.
    * See the full specification for more information.
    * Because finally is a reserved word in JavaScript and reserved keywords
    * are not supported as property names by ES3, you'll need to invoke
    * the method like promise['finally'](callback) to make your code IE8 and Android 2.x compatible.
    */
  // eslint-disable-next-line no-unnecessary-generics
  def `finally`[T, U](finallyCallback: js.Function0[Any]): IPromise2[T, U] = js.native
  
  /**
    * Regardless of when the promise was or will be resolved or rejected,
    * then calls one of the success or error callbacks asynchronously as soon as the result is available.
    * The callbacks are called with a single argument: the result or rejection reason.
    * Additionally, the notify callback may be called zero or more times to provide a progress indication,
    * before the promise is resolved or rejected.
    * This method returns a new promise which is resolved or rejected via
    * the return value of the successCallback, errorCallback.
    */
  def `then`[TSuccessResult, TErrorResult](
    successCallback: js.Function1[
      /* promiseValue */ TSuccess, 
      TSuccessResult | (IPromise2[TSuccessResult, TErrorResult])
    ]
  ): IPromise2[TSuccessResult, TErrorResult] = js.native
  def `then`[TSuccessResult, TErrorResult](
    successCallback: js.Function1[
      /* promiseValue */ TSuccess, 
      TSuccessResult | (IPromise2[TSuccessResult, TErrorResult])
    ],
    errorCallback: js.Function1[/* reason */ TError, TErrorResult]
  ): IPromise2[TSuccessResult, TErrorResult] = js.native
}
