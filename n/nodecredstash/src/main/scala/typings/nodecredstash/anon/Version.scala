package typings.nodecredstash.anon

import typings.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var name: String
  var version: js.UndefOr[Double] = js.undefined
}

object Version {
  @scala.inline
  def apply(name: String, context: CredstashContext = null, version: js.UndefOr[Double] = js.undefined): Version = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

