package typings.nodecredstash

import typings.nodecredstash.nodecredstashMod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var name: String
}

object Anon_Context {
  @scala.inline
  def apply(name: String, context: CredstashContext = null, limit: Int | Double = null): Anon_Context = {
    val __obj = js.Dynamic.literal(name = name)
    if (context != null) __obj.updateDynamic("context")(context)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

