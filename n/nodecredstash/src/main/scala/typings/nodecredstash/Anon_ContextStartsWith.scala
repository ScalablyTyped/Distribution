package typings.nodecredstash

import typings.nodecredstash.nodecredstashMod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextStartsWith extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var startsWith: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Anon_ContextStartsWith {
  @scala.inline
  def apply(context: CredstashContext = null, startsWith: String = null, version: Int | Double = null): Anon_ContextStartsWith = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextStartsWith]
  }
}

