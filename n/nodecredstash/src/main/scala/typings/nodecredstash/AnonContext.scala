package typings.nodecredstash

import typings.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var name: String
}

object AnonContext {
  @scala.inline
  def apply(name: String, context: CredstashContext = null, limit: Int | Double = null): AnonContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

