package typings.mongoose

import typings.mongoose.mongooseMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Onrejected extends js.Object {
  def apply[TResult](): js.Promise[Connection | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Connection | TResult] = js.native
}

