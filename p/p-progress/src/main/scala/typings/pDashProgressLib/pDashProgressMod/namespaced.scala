package typings
package pDashProgressLib.pDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-progress", JSImport.Namespace)
@js.native
class namespaced[T] protected () extends PProgress[T] {
  /**
       * Same as the Promise constructor, but with an appended `progress`
       * parameter in `executor`.
       *
       * @param progress
       *  Call this with progress updates. It expects a number between 0 and 1.
       *
       *  Multiple calls with the same number will result in only one
       *  `onProgress()` event.
       *
       *  Progress percentage `1` is reported for you when the promise resolves.
       *  If you set it yourself, it will simply be ignored.
       */
  def this(executor: js.Function3[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      /* progress */ js.Function1[/* progress */ scala.Double, scala.Unit], 
      scala.Unit
    ]) = this()
}

@JSImport("p-progress", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def all[T1](promises: js.Array[pDashProgressLib.PromiseFactory[T1]]): pDashProgressLib.pDashProgressMod.PProgress[js.Array[T1]] = js.native
  def all[T1](
    promises: js.Array[pDashProgressLib.PromiseFactory[T1]],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Array[T1]] = js.native
  def all[T1, T2](promises: js.Tuple2[pDashProgressLib.PromiseFactory[T1], pDashProgressLib.PromiseFactory[T2]]): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2](
    promises: js.Tuple2[pDashProgressLib.PromiseFactory[T1], pDashProgressLib.PromiseFactory[T2]],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](
    promises: js.Tuple3[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3](
    promises: js.Tuple3[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    promises: js.Tuple4[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4](
    promises: js.Tuple4[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    promises: js.Tuple5[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5](
    promises: js.Tuple5[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    promises: js.Tuple6[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    promises: js.Tuple6[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    promises: js.Tuple7[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    promises: js.Tuple7[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    promises: js.Tuple8[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7], 
      pDashProgressLib.PromiseFactory[T8]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    promises: js.Tuple8[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7], 
      pDashProgressLib.PromiseFactory[T8]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    promises: js.Tuple9[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7], 
      pDashProgressLib.PromiseFactory[T8], 
      pDashProgressLib.PromiseFactory[T9]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    promises: js.Tuple9[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7], 
      pDashProgressLib.PromiseFactory[T8], 
      pDashProgressLib.PromiseFactory[T9]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
       * Convenience method to run multiple promises and get a total progress of
       * all of them. It counts normal promises with progress `0` when pending and
       * progress `1` when resolved. For PProgress type promises, it listens to
       * their onProgress() method for more fine grained progress reporting. You
       * can mix and match normal promises and PProgress promises.
       *
       * @param promises Array of promises or promise-returning functions.
       * @throws {TypeError}
       */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    promises: js.Tuple10[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7], 
      pDashProgressLib.PromiseFactory[T8], 
      pDashProgressLib.PromiseFactory[T9], 
      pDashProgressLib.PromiseFactory[T10]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
       * Convenience method to run multiple promises and get a total progress of
       * all of them. It counts normal promises with progress `0` when pending and
       * progress `1` when resolved. For PProgress type promises, it listens to
       * their onProgress() method for more fine grained progress reporting. You
       * can mix and match normal promises and PProgress promises.
       *
       * @param promises Array of promises or promise-returning functions.
       * @throws {TypeError}
       */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    promises: js.Tuple10[
      pDashProgressLib.PromiseFactory[T1], 
      pDashProgressLib.PromiseFactory[T2], 
      pDashProgressLib.PromiseFactory[T3], 
      pDashProgressLib.PromiseFactory[T4], 
      pDashProgressLib.PromiseFactory[T5], 
      pDashProgressLib.PromiseFactory[T6], 
      pDashProgressLib.PromiseFactory[T7], 
      pDashProgressLib.PromiseFactory[T8], 
      pDashProgressLib.PromiseFactory[T9], 
      pDashProgressLib.PromiseFactory[T10]
    ],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  @JSName("all")
  def all_TAll[TAll](promises: js.Array[pDashProgressLib.PromiseFactory[TAll]]): pDashProgressLib.pDashProgressMod.PProgress[TAll] = js.native
  @JSName("all")
  def all_TAll[TAll](
    promises: js.Array[pDashProgressLib.PromiseFactory[TAll]],
    options: pDashProgressLib.pDashProgressMod.pProgressNs.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[TAll] = js.native
}

