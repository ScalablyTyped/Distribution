package typings.atPollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextKey extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object Anon_ContextKey {
  @scala.inline
  def apply(context: js.Any = null, key: String = null): Anon_ContextKey = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_ContextKey]
  }
}

