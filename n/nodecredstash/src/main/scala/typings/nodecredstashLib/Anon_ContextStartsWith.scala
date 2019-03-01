package typings
package nodecredstashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextStartsWith extends js.Object {
  var context: js.UndefOr[nodecredstashLib.nodecredstashMod.CredstashContext] = js.undefined
  var startsWith: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ContextStartsWith {
  @scala.inline
  def apply(
    context: nodecredstashLib.nodecredstashMod.CredstashContext = null,
    startsWith: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): Anon_ContextStartsWith = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextStartsWith]
  }
}

