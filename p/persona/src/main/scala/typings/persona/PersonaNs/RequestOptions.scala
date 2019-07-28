package typings.persona.PersonaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var oncancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var privacyPolicy: js.UndefOr[String] = js.undefined
  var returnTo: js.UndefOr[String] = js.undefined
  var siteLogo: js.UndefOr[String] = js.undefined
  var siteName: js.UndefOr[String] = js.undefined
  var termsOfService: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    oncancel: () => Unit = null,
    privacyPolicy: String = null,
    returnTo: String = null,
    siteLogo: String = null,
    siteName: String = null,
    termsOfService: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (oncancel != null) __obj.updateDynamic("oncancel")(js.Any.fromFunction0(oncancel))
    if (privacyPolicy != null) __obj.updateDynamic("privacyPolicy")(privacyPolicy)
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo)
    if (siteLogo != null) __obj.updateDynamic("siteLogo")(siteLogo)
    if (siteName != null) __obj.updateDynamic("siteName")(siteName)
    if (termsOfService != null) __obj.updateDynamic("termsOfService")(termsOfService)
    __obj.asInstanceOf[RequestOptions]
  }
}

