package typings
package pDashTapLib.pDashTapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pTap extends js.Object {
  def apply[T](fn: js.Function1[/* value */ T, _]): js.Function1[/* value */ T, stdLib.Promise[T]] = js.native
  def `catch`(fn: js.Function1[/* value */ js.Any, _]): js.Function1[/* value */ js.Any, stdLib.Promise[scala.Nothing]] = js.native
}

