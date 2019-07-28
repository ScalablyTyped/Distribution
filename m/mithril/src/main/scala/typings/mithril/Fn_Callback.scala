package typings.mithril

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply(name: String, callback: js.Function1[/* value */ js.Any, _]): js.Function1[/* e */ Anon_CurrentTarget, Unit] = js.native
  def apply[T](name: String, callback: js.ThisFunction1[/* this */ T, /* value */ js.Any, _], thisArg: T): js.Function1[/* e */ Anon_CurrentTarget, Unit] = js.native
}

