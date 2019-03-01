package typings
package nodecredstashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[nodecredstashLib.nodecredstashMod.CredstashContext] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
}

object Anon_Context {
  @scala.inline
  def apply(
    name: java.lang.String,
    context: nodecredstashLib.nodecredstashMod.CredstashContext = null,
    limit: scala.Int | scala.Double = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (context != null) __obj.updateDynamic("context")(context)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

