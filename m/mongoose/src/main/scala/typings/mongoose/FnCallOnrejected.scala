package typings.mongoose

import typings.mongoose.mod.Connection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOnrejected extends js.Object {
  def apply[TResult](): js.Promise[Connection_ | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Connection_ | TResult] = js.native
}

