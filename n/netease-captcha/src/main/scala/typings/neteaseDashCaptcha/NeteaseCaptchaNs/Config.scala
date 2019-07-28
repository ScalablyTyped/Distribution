package typings.neteaseDashCaptcha.NeteaseCaptchaNs

import typings.neteaseDashCaptcha.neteaseDashCaptchaStrings.`zh-CN`
import typings.neteaseDashCaptcha.neteaseDashCaptchaStrings.embed
import typings.neteaseDashCaptcha.neteaseDashCaptchaStrings.en
import typings.neteaseDashCaptcha.neteaseDashCaptchaStrings.float
import typings.neteaseDashCaptcha.neteaseDashCaptchaStrings.http
import typings.neteaseDashCaptcha.neteaseDashCaptchaStrings.https
import typings.neteaseDashCaptcha.neteaseDashCaptchaStrings.popup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Verification code id
    */
  var captchaId: String
  /**
    * Selector string or HTMLElement to render widget into
    */
  var element: String | HTMLElement
  /**
    * Defaults to 'zh-CN'
    */
  var lang: js.UndefOr[`zh-CN` | en] = js.undefined
  /**
    * Defaults to 'float' on desktop, and 'popup' on mobile
    */
  var mode: js.UndefOr[float | embed | popup] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* instance */ Instance, Unit]] = js.undefined
  var onVerify: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ Data, Unit]] = js.undefined
  /**
    * Defaults to page protocol
    */
  var protocol: js.UndefOr[http | https] = js.undefined
  /**
    * Defaults to 'auto'
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    captchaId: String,
    element: String | HTMLElement,
    lang: `zh-CN` | en = null,
    mode: float | embed | popup = null,
    onReady: /* instance */ Instance => Unit = null,
    onVerify: (/* error */ js.Any, /* data */ Data) => Unit = null,
    protocol: http | https = null,
    width: Double | String = null
  ): Config = {
    val __obj = js.Dynamic.literal(captchaId = captchaId, element = element.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onVerify != null) __obj.updateDynamic("onVerify")(js.Any.fromFunction2(onVerify))
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

