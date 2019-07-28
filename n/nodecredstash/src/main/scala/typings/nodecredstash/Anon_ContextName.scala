package typings.nodecredstash

import typings.nodecredstash.nodecredstashMod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextName extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var name: String
  var version: js.UndefOr[Double] = js.undefined
}

object Anon_ContextName {
  @scala.inline
  def apply(name: String, context: CredstashContext = null, version: Int | Double = null): Anon_ContextName = {
    val __obj = js.Dynamic.literal(name = name)
    if (context != null) __obj.updateDynamic("context")(context)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextName]
  }
}

