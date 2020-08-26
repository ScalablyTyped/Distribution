package typings.persona.Persona

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var oncancel: js.UndefOr[js.Function0[Unit]] = js.native
  var privacyPolicy: js.UndefOr[String] = js.native
  var returnTo: js.UndefOr[String] = js.native
  var siteLogo: js.UndefOr[String] = js.native
  var siteName: js.UndefOr[String] = js.native
  var termsOfService: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setOncancel(value: () => Unit): Self = this.set("oncancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOncancel: Self = this.set("oncancel", js.undefined)
    @scala.inline
    def setPrivacyPolicy(value: String): Self = this.set("privacyPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacyPolicy: Self = this.set("privacyPolicy", js.undefined)
    @scala.inline
    def setReturnTo(value: String): Self = this.set("returnTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnTo: Self = this.set("returnTo", js.undefined)
    @scala.inline
    def setSiteLogo(value: String): Self = this.set("siteLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteLogo: Self = this.set("siteLogo", js.undefined)
    @scala.inline
    def setSiteName(value: String): Self = this.set("siteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteName: Self = this.set("siteName", js.undefined)
    @scala.inline
    def setTermsOfService(value: String): Self = this.set("termsOfService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermsOfService: Self = this.set("termsOfService", js.undefined)
  }
  
}

