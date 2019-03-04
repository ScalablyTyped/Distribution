package typings
package nodecredstashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextName extends js.Object {
  var context: js.UndefOr[nodecredstashLib.nodecredstashMod.CredstashContext] = js.undefined
  var name: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ContextName {
  @scala.inline
  def apply(
    name: java.lang.String,
    context: nodecredstashLib.nodecredstashMod.CredstashContext = null,
    version: scala.Int | scala.Double = null
  ): Anon_ContextName = {
    val __obj = js.Dynamic.literal(name = name)
    if (context != null) __obj.updateDynamic("context")(context)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextName]
  }
}

