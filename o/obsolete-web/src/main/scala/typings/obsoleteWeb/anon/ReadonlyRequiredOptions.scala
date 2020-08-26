package typings.obsoleteWeb.anon

import typings.obsoleteWeb.obsoleteWebStrings.afterbeing
import typings.obsoleteWeb.obsoleteWebStrings.beforened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<obsolete-web.obsolete-web.Options>> */
@js.native
trait ReadonlyRequiredOptions extends js.Object {
  val position: afterbeing | beforened = js.native
  val promptOnNonTargetBrowser: Boolean = js.native
  val promptOnUnknownBrowser: Boolean = js.native
  val template: String = js.native
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
  @scala.inline
  implicit class ReadonlyRequiredOptionsOps[Self <: ReadonlyRequiredOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPosition(value: afterbeing | beforened): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromptOnNonTargetBrowser(value: Boolean): Self = this.set("promptOnNonTargetBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromptOnUnknownBrowser(value: Boolean): Self = this.set("promptOnUnknownBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}

