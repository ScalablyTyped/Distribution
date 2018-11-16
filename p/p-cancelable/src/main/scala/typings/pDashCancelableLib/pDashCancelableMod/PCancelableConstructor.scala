package typings
package pDashCancelableLib.pDashCancelableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PCancelableConstructor
  extends stdLib.PromiseConstructor {
  val CancelError: pDashCancelableLib.pDashCancelableMod.PCancelableNs.CancelErrorConstructor = js.native
  def fn[T, R](
    wrapper: js.Function2[
      /* onCancel */ js.Function1[/* fn */ js.UndefOr[js.Function0[scala.Unit]], scala.Unit], 
      /* input */ T, 
      stdLib.PromiseLike[R]
    ]
  ): js.Function1[/* input */ T, pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[R]] = js.native
}

