package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseConstructor
  extends /**
  * Creates a new Promise.
  * @param executor A callback used to initialize the promise. This callback is passed two arguments:
  * a resolve callback used to resolve the promise with a value or the result of another promise,
  * and a reject callback used to reject the promise with a provided reason or error.
  */
org.scalablytyped.runtime.Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | PromiseLike[js.Object]], scala.Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      Promise[js.Object]
    ] {
  @JSName(org.scalablytyped.runtime.Symbol.species)
  val species: PromiseConstructor = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T](values: Array[T | PromiseLike[T]]): Promise[Array[T]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[TAll](values: Iterable[TAll | PromiseLike[TAll]]): Promise[Array[TAll]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
  ): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5]
    ]
  ): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6]
    ]
  ): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7]
    ]
  ): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8]
    ]
  ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9]
    ]
  ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9], 
      T10 | PromiseLike[T10]
    ]
  ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T](values: Array[T | PromiseLike[T]]): Promise[T] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T](values: Iterable[T | PromiseLike[T]]): Promise[T] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): Promise[T1 | T2] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): Promise[T1 | T2 | T3] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4](
    values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
  ): Promise[T1 | T2 | T3 | T4] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9], 
      T10 | PromiseLike[T10]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  def reject[T](): Promise[T] = js.native
  def reject[T](reason: js.Any): Promise[T] = js.native
  /**
    * Creates a new resolved promise .
    * @returns A resolved promise.
    */
  def resolve(): Promise[scala.Unit] = js.native
  /**
    * Creates a new resolved promise for the provided value.
    * @param value A promise.
    * @returns A promise whose internal state matches the provided promise.
    */
  def resolve[T](value: T): Promise[T] = js.native
  def resolve[T](value: PromiseLike[T]): Promise[T] = js.native
}

