package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: this is a copy of the PromiseConstructor object from
//     https://github.com/Microsoft/TypeScript/blob/master/lib/lib.es2015.promise.d.ts
// It is necessary so that even with targeting "ES5" and not specifying any libs,
//     developers will still get IntelliSense for "Office.Promise" just as they would with a regular Promise.
// (because even though Promise is part of standard lib.d.ts, PromiseConstructor is not)
@js.native
trait IPromiseConstructor
  extends /**
         * Creates a new Promise.
         * @param executor A callback used to initialize the promise. This callback is passed two arguments:
         * a resolve callback used resolve the promise with a value or the result of another promise,
         * and a reject callback used to reject the promise with a provided reason or error.
         */
ScalablyTyped.runtime.Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | stdLib.PromiseLike[js.Object]], scala.Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      stdLib.Promise[js.Object]
    ] {
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T](values: js.Array[T | stdLib.PromiseLike[T]]): stdLib.Promise[js.Array[T]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2](values: js.Tuple2[T1 | stdLib.PromiseLike[T1], T2 | stdLib.PromiseLike[T2]]): stdLib.Promise[js.Tuple2[T1, T2]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3](
    values: js.Tuple3[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3]
    ]
  ): stdLib.Promise[js.Tuple3[T1, T2, T3]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3, T4](
    values: js.Tuple4[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4]
    ]
  ): stdLib.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5]
    ]
  ): stdLib.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6]
    ]
  ): stdLib.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7]
    ]
  ): stdLib.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7], 
      T8 | stdLib.PromiseLike[T8]
    ]
  ): stdLib.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7], 
      T8 | stdLib.PromiseLike[T8], 
      T9 | stdLib.PromiseLike[T9]
    ]
  ): stdLib.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
           * Creates a Promise that is resolved with an array of results when all of the provided Promises
           * resolve, or rejected when any Promise is rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7], 
      T8 | stdLib.PromiseLike[T8], 
      T9 | stdLib.PromiseLike[T9], 
      T10 | stdLib.PromiseLike[T10]
    ]
  ): stdLib.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T](values: js.Array[T | stdLib.PromiseLike[T]]): stdLib.Promise[T] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2](values: js.Tuple2[T1 | stdLib.PromiseLike[T1], T2 | stdLib.PromiseLike[T2]]): stdLib.Promise[T1 | T2] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3](
    values: js.Tuple3[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3]
    ]
  ): stdLib.Promise[T1 | T2 | T3] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3, T4](
    values: js.Tuple4[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4]
    ]
  ): stdLib.Promise[T1 | T2 | T3 | T4] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5]
    ]
  ): stdLib.Promise[T1 | T2 | T3 | T4 | T5] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6]
    ]
  ): stdLib.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7]
    ]
  ): stdLib.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7], 
      T8 | stdLib.PromiseLike[T8]
    ]
  ): stdLib.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7], 
      T8 | stdLib.PromiseLike[T8], 
      T9 | stdLib.PromiseLike[T9]
    ]
  ): stdLib.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  /**
           * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
           * or rejected.
           * @param values An array of Promises.
           * @returns A new Promise.
           */
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | stdLib.PromiseLike[T1], 
      T2 | stdLib.PromiseLike[T2], 
      T3 | stdLib.PromiseLike[T3], 
      T4 | stdLib.PromiseLike[T4], 
      T5 | stdLib.PromiseLike[T5], 
      T6 | stdLib.PromiseLike[T6], 
      T7 | stdLib.PromiseLike[T7], 
      T8 | stdLib.PromiseLike[T8], 
      T9 | stdLib.PromiseLike[T9], 
      T10 | stdLib.PromiseLike[T10]
    ]
  ): stdLib.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  /**
           * Creates a new rejected promise for the provided reason.
           * @param reason The reason the promise was rejected.
           * @returns A new rejected Promise.
           */
  def reject(reason: js.Any): stdLib.Promise[scala.Nothing] = js.native
  /**
           * Creates a new rejected promise for the provided reason.
           * @param reason The reason the promise was rejected.
           * @returns A new rejected Promise.
           */
  @JSName("reject")
  def reject_T[T](reason: js.Any): stdLib.Promise[T] = js.native
  /**
           * Creates a new resolved promise.
           * @returns A resolved promise.
           */
  def resolve(): stdLib.Promise[scala.Unit] = js.native
  /**
           * Creates a new resolved promise for the provided value.
           * @param value A promise.
           * @returns A promise whose internal state matches the provided promise.
           */
  def resolve[T](value: T): stdLib.Promise[T] = js.native
  /**
           * Creates a new resolved promise for the provided value.
           * @param value A promise.
           * @returns A promise whose internal state matches the provided promise.
           */
  def resolve[T](value: stdLib.PromiseLike[T]): stdLib.Promise[T] = js.native
}

