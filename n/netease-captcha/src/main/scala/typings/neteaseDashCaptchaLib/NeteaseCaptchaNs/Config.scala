package typings
package neteaseDashCaptchaLib.NeteaseCaptchaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Verification code id
    */
  var captchaId: java.lang.String
  /**
    * Selector string or HTMLElement to render widget into
    */
  var element: java.lang.String | stdLib.HTMLElement
  /**
    * Defaults to 'zh-CN'
    */
  var lang: js.UndefOr[
    neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.`zh-CN` | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.en
  ] = js.undefined
  /**
    * Defaults to 'float' on desktop, and 'popup' on mobile
    */
  var mode: js.UndefOr[
    neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.float | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.embed | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.popup
  ] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* instance */ Instance, scala.Unit]] = js.undefined
  var onVerify: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ Data, scala.Unit]] = js.undefined
  /**
    * Defaults to page protocol
    */
  var protocol: js.UndefOr[
    neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.http | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.https
  ] = js.undefined
  /**
    * Defaults to 'auto'
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    captchaId: java.lang.String,
    element: java.lang.String | stdLib.HTMLElement,
    lang: neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.`zh-CN` | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.en = null,
    mode: neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.float | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.embed | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.popup = null,
    onReady: js.Function1[/* instance */ Instance, scala.Unit] = null,
    onVerify: js.Function2[/* error */ js.Any, /* data */ Data, scala.Unit] = null,
    protocol: neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.http | neteaseDashCaptchaLib.neteaseDashCaptchaLibStrings.https = null,
    width: scala.Double | java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("captchaId")(captchaId)
    __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    if (onVerify != null) __obj.updateDynamic("onVerify")(onVerify)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

