package typings.obsoleteWeb

import typings.obsoleteWeb.obsoleteWebStrings.afterbeing
import typings.obsoleteWeb.obsoleteWebStrings.beforened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<obsolete-web.obsolete-web.Options>> */
trait ReadonlyRequiredOptions extends js.Object {
  val position: afterbeing | beforened
  val promptOnNonTargetBrowser: Boolean
  val promptOnUnknownBrowser: Boolean
  val template: String
}

object ReadonlyRequiredOptions {
  @scala.inline
  def apply(
    position: afterbeing | beforened,
    promptOnNonTargetBrowser: Boolean,
    promptOnUnknownBrowser: Boolean,
    template: String
  ): ReadonlyRequiredOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], promptOnNonTargetBrowser = promptOnNonTargetBrowser.asInstanceOf[js.Any], promptOnUnknownBrowser = promptOnUnknownBrowser.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredOptions]
  }
}

