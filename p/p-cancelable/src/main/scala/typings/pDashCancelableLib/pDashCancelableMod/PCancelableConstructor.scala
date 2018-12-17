package typings
package pDashCancelableLib.pDashCancelableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PCancelableConstructor
  extends stdLib.PromiseConstructor {
  val CancelError: pDashCancelableLib.pDashCancelableMod.PCancelableNs.CancelErrorConstructor = js.native
  def fn[R](
    userFn: js.Function1[
      /* onCancel */ pDashCancelableLib.pDashCancelableMod.PCancelableNs.OnCancelFn, 
      js.Thenable[R]
    ]
  ): js.Function0[pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[R]] = js.native
  def fn[T1, R](
    userFn: js.Function2[
      /* param1 */ T1, 
      /* onCancel */ pDashCancelableLib.pDashCancelableMod.PCancelableNs.OnCancelFn, 
      js.Thenable[R]
    ]
  ): js.Function1[
    /* param1 */ T1, 
    pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[R]
  ] = js.native
  def fn[T1, T2, R](
    userFn: js.Function3[
      /* param1 */ T1, 
      /* param2 */ T2, 
      /* onCancel */ pDashCancelableLib.pDashCancelableMod.PCancelableNs.OnCancelFn, 
      js.Thenable[R]
    ]
  ): js.Function2[
    /* param1 */ T1, 
    /* param2 */ T2, 
    pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[R]
  ] = js.native
  def fn[T1, T2, T3, R](
    userFn: js.Function4[
      /* param1 */ T1, 
      /* param2 */ T2, 
      /* param3 */ T3, 
      /* onCancel */ pDashCancelableLib.pDashCancelableMod.PCancelableNs.OnCancelFn, 
      js.Thenable[R]
    ]
  ): js.Function3[
    /* param1 */ T1, 
    /* param2 */ T2, 
    /* param3 */ T3, 
    pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[R]
  ] = js.native
  def fn[T1, T2, T3, T4, R](
    userFn: js.Function5[
      /* param1 */ T1, 
      /* param2 */ T2, 
      /* param3 */ T3, 
      /* param4 */ T4, 
      /* onCancel */ pDashCancelableLib.pDashCancelableMod.PCancelableNs.OnCancelFn, 
      js.Thenable[R]
    ]
  ): js.Function4[
    /* param1 */ T1, 
    /* param2 */ T2, 
    /* param3 */ T3, 
    /* param4 */ T4, 
    pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[R]
  ] = js.native
  @JSName("fn")
  def fn_RFunction1[R](userFn: js.Function1[/* repeated */js.Any, js.Thenable[R]]): js.Function1[
    /* args */ js.Array[_], 
    pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[R]
  ] = js.native
}

