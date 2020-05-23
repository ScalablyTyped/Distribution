package typings.obsoleteWeb.mod

import typings.obsoleteWeb.obsoleteWebStrings.afterbeing
import typings.obsoleteWeb.obsoleteWebStrings.beforened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If set 'afterbegin', the template will be injected into the start of body.
    * If set 'beforeend', the template will be injected into the end of body
    * @default 'afterbegin'
    */
  var position: js.UndefOr[afterbeing | beforened] = js.undefined
  /**
    * If the current browser useragent doesn't match one of the target browsers, it's considered as unsupported.
    * Thus, the prompt will be shown.
    * @default false
    */
  var promptOnNonTargetBrowser: js.UndefOr[Boolean] = js.undefined
  /**
    * If the current browser useragent is unknown, the prompt will be shown
    * @default true
    */
  var promptOnUnknownBrowser: js.UndefOr[Boolean] = js.undefined
  /**
    * The prompt html template injected to the bottom of body. The default value is:
    * ```html
    * <div>Your browser is not supported. <button id="obsoleteClose">&times;</button></div>
    * ```
    */
  var template: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    position: afterbeing | beforened = null,
    promptOnNonTargetBrowser: js.UndefOr[Boolean] = js.undefined,
    promptOnUnknownBrowser: js.UndefOr[Boolean] = js.undefined,
    template: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(promptOnNonTargetBrowser)) __obj.updateDynamic("promptOnNonTargetBrowser")(promptOnNonTargetBrowser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promptOnUnknownBrowser)) __obj.updateDynamic("promptOnUnknownBrowser")(promptOnUnknownBrowser.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

