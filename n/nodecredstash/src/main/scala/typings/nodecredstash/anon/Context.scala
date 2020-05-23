package typings.nodecredstash.anon

import typings.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var name: String
}

object Context {
  @scala.inline
  def apply(name: String, context: CredstashContext = null, limit: js.UndefOr[Double] = js.undefined): Context = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

