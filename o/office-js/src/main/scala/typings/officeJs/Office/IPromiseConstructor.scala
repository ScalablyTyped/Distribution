package typings.officeJs.Office

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// **Note**: this is a copy of the PromiseConstructor object from
//     https://github.com/Microsoft/TypeScript/blob/master/lib/lib.es2015.promise.d.ts
// It is necessary so that even with targeting "ES5" and not specifying any libs,
//     developers will still get IntelliSense for "Office.Promise" just as they would with a regular Promise.
// (because even though Promise is part of standard lib.d.ts, PromiseConstructor is not)
@js.native
trait IPromiseConstructor
  extends StObject
     with /**
  * Creates a new Promise.
  * @param executor A callback used to initialize the promise. This callback is passed two arguments:
  * a resolve callback used resolve the promise with a value or the result of another promise,
  * and a reject callback used to reject the promise with a provided reason or error.
  */
Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | PromiseLike[js.Object]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ], 
      js.Promise[js.Object]
    ] {
  
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T](values: js.Array[T | PromiseLike[T]]): js.Promise[js.Array[T]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): js.Promise[js.Tuple2[T1, T2]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): js.Promise[js.Tuple3[T1, T2, T3]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
  ): js.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
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
  ): js.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
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
  ): js.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
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
  ): js.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
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
  ): js.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
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
  ): js.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
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
  ): js.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T](values: js.Array[T | PromiseLike[T]]): js.Promise[T] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): js.Promise[T1 | T2] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): js.Promise[T1 | T2 | T3] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T1, T2, T3, T4](
    values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
  ): js.Promise[T1 | T2 | T3 | T4] = js.native
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
  ): js.Promise[T1 | T2 | T3 | T4 | T5] = js.native
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
  ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
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
  ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
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
  ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
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
  ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
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
  ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  def reject(reason: Any): js.Promise[scala.Nothing] = js.native
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  @JSName("reject")
  def reject_T[T](reason: Any): js.Promise[T] = js.native
  
  /**
    * Creates a new resolved promise.
    * @returns A resolved promise.
    */
  def resolve(): js.Promise[Unit] = js.native
  /**
    * Creates a new resolved promise for the provided value.
    * @param value A promise.
    * @returns A promise whose internal state matches the provided promise.
    */
  def resolve[T](value: T): js.Promise[T] = js.native
  def resolve[T](value: PromiseLike[T]): js.Promise[T] = js.native
}
