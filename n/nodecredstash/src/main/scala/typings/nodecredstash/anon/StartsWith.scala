package typings.nodecredstash.anon

import typings.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartsWith extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var startsWith: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object StartsWith {
  @scala.inline
  def apply(
    context: CredstashContext = null,
    startsWith: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): StartsWith = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartsWith]
  }
}

