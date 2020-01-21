package typings.nodecredstash

import typings.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextStartsWith extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var startsWith: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object AnonContextStartsWith {
  @scala.inline
  def apply(context: CredstashContext = null, startsWith: String = null, version: Int | Double = null): AnonContextStartsWith = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextStartsWith]
  }
}

