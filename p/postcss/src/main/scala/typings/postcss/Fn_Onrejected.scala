package typings.postcss

import typings.postcss.postcssMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Onrejected extends js.Object {
  def apply[TResult](): js.Promise[Result | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Result | TResult] = js.native
}

