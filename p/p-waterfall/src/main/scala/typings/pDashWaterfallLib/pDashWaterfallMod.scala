package typings
package pDashWaterfallLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-waterfall", JSImport.Namespace)
@js.native
object pDashWaterfallMod extends js.Object {
  def apply(tasks: stdLib.Iterable[pDashWaterfallLib.Task[_, _]]): js.Promise[_] = js.native
  def apply(tasks: stdLib.Iterable[pDashWaterfallLib.Task[_, _]], initialValue: js.Any): js.Promise[_] = js.native
  def apply[R](tasks: js.Array[pDashWaterfallLib.InitialTask[R]]): js.Promise[R] = js.native
  def apply[T1, R](tasks: js.Array[pDashWaterfallLib.Task[T1, R]], initialValue: T1): js.Promise[R] = js.native
  def apply[T1, R](tasks: js.Tuple2[pDashWaterfallLib.InitialTask[T1], pDashWaterfallLib.Task[T1, R]]): js.Promise[R] = js.native
  def apply[T1, T2, R](tasks: js.Tuple2[pDashWaterfallLib.Task[T1, T2], pDashWaterfallLib.Task[T2, R]], initialValue: T1): js.Promise[R] = js.native
  def apply[T1, T2, R](
    tasks: js.Tuple3[
      pDashWaterfallLib.InitialTask[T1], 
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, R]
    ]
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, R](
    tasks: js.Tuple3[
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, R]
    ],
    initialValue: T1
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, R](
    tasks: js.Tuple4[
      pDashWaterfallLib.InitialTask[T1], 
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, R]
    ]
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, R](
    tasks: js.Tuple4[
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, R]
    ],
    initialValue: T1
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, R](
    tasks: js.Tuple5[
      pDashWaterfallLib.InitialTask[T1], 
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, R]
    ]
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, R](
    tasks: js.Tuple5[
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, T5], 
      pDashWaterfallLib.Task[T5, R]
    ],
    initialValue: T1
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, R](
    tasks: js.Tuple6[
      pDashWaterfallLib.InitialTask[T1], 
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, T5], 
      pDashWaterfallLib.Task[T5, R]
    ]
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, T6, R](
    tasks: js.Tuple6[
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, T5], 
      pDashWaterfallLib.Task[T5, T6], 
      pDashWaterfallLib.Task[T6, R]
    ],
    initialValue: T1
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, T6, R](
    tasks: js.Tuple7[
      pDashWaterfallLib.InitialTask[T1], 
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, T5], 
      pDashWaterfallLib.Task[T5, T6], 
      pDashWaterfallLib.Task[T6, R]
    ]
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, R](
    tasks: js.Tuple7[
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, T5], 
      pDashWaterfallLib.Task[T5, T6], 
      pDashWaterfallLib.Task[T6, T7], 
      pDashWaterfallLib.Task[T7, R]
    ],
    initialValue: T1
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, R](
    tasks: js.Tuple8[
      pDashWaterfallLib.InitialTask[T1], 
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, T5], 
      pDashWaterfallLib.Task[T5, T6], 
      pDashWaterfallLib.Task[T6, T7], 
      pDashWaterfallLib.Task[T7, R]
    ]
  ): js.Promise[R] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, R](
    tasks: js.Tuple8[
      pDashWaterfallLib.Task[T1, T2], 
      pDashWaterfallLib.Task[T2, T3], 
      pDashWaterfallLib.Task[T3, T4], 
      pDashWaterfallLib.Task[T4, T5], 
      pDashWaterfallLib.Task[T5, T6], 
      pDashWaterfallLib.Task[T6, T7], 
      pDashWaterfallLib.Task[T7, T8], 
      pDashWaterfallLib.Task[T8, R]
    ],
    initialValue: T1
  ): js.Promise[R] = js.native
}

