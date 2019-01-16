package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashPipeLib {
  type PromiseTask[T, R] = js.Function1[/* input */ T, js.Promise[R]]
  type Task[T, R] = js.Function1[/* input */ T, js.Thenable[R] | R]
  type Tasks1[T1, R] = js.Array[PromiseTask[T1, R]]
  type Tasks2[T1, T2, R] = js.Tuple2[Task[T1, T2], Task[T2, R]]
  type Tasks3[T1, T2, T3, R] = js.Tuple3[Task[T1, T2], Task[T2, T3], Task[T3, R]]
  type Tasks4[T1, T2, T3, T4, R] = js.Tuple4[Task[T1, T2], Task[T2, T3], Task[T3, T4], Task[T4, R]]
  type Tasks5[T1, T2, T3, T4, T5, R] = js.Tuple5[Task[T1, T2], Task[T2, T3], Task[T3, T4], Task[T4, T5], Task[T5, R]]
  type Tasks6[T1, T2, T3, T4, T5, T6, R] = js.Tuple6[Task[T1, T2], Task[T2, T3], Task[T3, T4], Task[T4, T5], Task[T5, T6], Task[T6, R]]
  type Tasks7[T1, T2, T3, T4, T5, T6, T7, R] = js.Tuple7[
    Task[T1, T2], 
    Task[T2, T3], 
    Task[T3, T4], 
    Task[T4, T5], 
    Task[T5, T6], 
    Task[T6, T7], 
    Task[T7, R]
  ]
  type Tasks8[T1, T2, T3, T4, T5, T6, T7, T8, R] = js.Tuple8[
    Task[T1, T2], 
    Task[T2, T3], 
    Task[T3, T4], 
    Task[T4, T5], 
    Task[T5, T6], 
    Task[T6, T7], 
    Task[T7, T8], 
    Task[T8, R]
  ]
}
