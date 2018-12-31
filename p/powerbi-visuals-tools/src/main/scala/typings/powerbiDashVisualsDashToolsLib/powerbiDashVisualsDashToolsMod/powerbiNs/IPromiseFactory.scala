package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to promise/deferred,
  * which abstracts away the underlying mechanism (e.g., Angular, jQuery, etc.).
  */
@js.native
trait IPromiseFactory extends js.Object {
  /**
    * Combines multiple promises into a single promise that is resolved when all of the input promises are resolved.
    * Rejects immediately if any of the promises fail
    */
  def all(promises: js.Array[IPromise2[_, _]]): IPromise[js.Array[_]] = js.native
  /**
    * Combines multiple promises into a single promise that is resolved when all of the input promises are resolved.
    * Does not resolve until all promises finish (success or failure).
    */
  // tslint:disable-next-line
  def allSettled[T](promises: js.Array[IPromise2[_, _]]): IPromise[js.Array[IPromiseResult[T]]] = js.native
  /**
    * Creates a Deferred object which represents a task which will finish in the future.
    */
  // tslint:disable-next-line
  def defer[T](): IDeferred[T] = js.native
  /**
    * Creates a Deferred object which represents a task which will finish in the future.
    */
  // tslint:disable-next-line
  @JSName("defer")
  def defer_TSuccessTErrorIDeferred2[TSuccess, TError](): IDeferred2[TSuccess, TError] = js.native
  /**
    * Creates a promise that is resolved as rejected with the specified reason.
    * This api should be used to forward rejection in a chain of promises.
    * If you are dealing with the last promise in a promise chain, you don't need to worry about it.
    * When comparing deferreds/promises to the familiar behavior of try/catch/throw,
    * think of reject as the throw keyword in JavaScript.
    * This also means that if you "catch" an error via a promise error callback and you want
    * to forward the error to the promise derived from the current promise,
    * you have to "rethrow" the error by returning a rejection constructed via reject.
    *
    * @param reason Constant, message, exception or an object representing the rejection reason.
    */
  def reject[TError](): IPromise2[_, TError] = js.native
  def reject[TError](reason: TError): IPromise2[_, TError] = js.native
  /**
    * Creates a promise that is resolved with the specified value.
    * This api should be used to forward rejection in a chain of promises.
    * If you are dealing with the last promise in a promise chain, you don't need to worry about it.
    *
    * @param value Object representing the promise result.
    */
  def resolve[TSuccess](): IPromise2[TSuccess, _] = js.native
  def resolve[TSuccess](value: TSuccess): IPromise2[TSuccess, _] = js.native
  /**
    * Wraps an object that might be a value or a then-able promise into a promise.
    * This is useful when you are dealing with an object that might or might not be a promise
    */
  def when[T](value: T): IPromise[T] = js.native
  def when[T](value: IPromise[T]): IPromise[T] = js.native
}

