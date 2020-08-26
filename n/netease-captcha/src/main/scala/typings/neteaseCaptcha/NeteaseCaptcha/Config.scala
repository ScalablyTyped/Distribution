package typings.neteaseCaptcha.NeteaseCaptcha

import typings.neteaseCaptcha.neteaseCaptchaStrings.`zh-CN`
import typings.neteaseCaptcha.neteaseCaptchaStrings.embed
import typings.neteaseCaptcha.neteaseCaptchaStrings.en
import typings.neteaseCaptcha.neteaseCaptchaStrings.float
import typings.neteaseCaptcha.neteaseCaptchaStrings.http
import typings.neteaseCaptcha.neteaseCaptchaStrings.https
import typings.neteaseCaptcha.neteaseCaptchaStrings.popup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * Verification code id
    */
  var captchaId: String = js.native
  /**
    * Selector string or HTMLElement to render widget into
    */
  var element: String | HTMLElement = js.native
  /**
    * Defaults to 'zh-CN'
    */
  var lang: js.UndefOr[`zh-CN` | en] = js.native
  /**
    * Defaults to 'float' on desktop, and 'popup' on mobile
    */
  var mode: js.UndefOr[float | embed | popup] = js.native
  var onReady: js.UndefOr[js.Function1[/* instance */ Instance, Unit]] = js.native
  var onVerify: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ Data, Unit]] = js.native
  /**
    * Defaults to page protocol
    */
  var protocol: js.UndefOr[http | https] = js.native
  /**
    * Defaults to 'auto'
    */
  var width: js.UndefOr[Double | String] = js.native
}

object Config {
  @scala.inline
  def apply(captchaId: String, element: String | HTMLElement): Config = {
    val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setCaptchaId(value: String): Self = this.set("captchaId", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: String | HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: `zh-CN` | en): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMode(value: float | embed | popup): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnReady(value: /* instance */ Instance => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnVerify(value: (/* error */ js.Any, /* data */ Data) => Unit): Self = this.set("onVerify", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnVerify: Self = this.set("onVerify", js.undefined)
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

