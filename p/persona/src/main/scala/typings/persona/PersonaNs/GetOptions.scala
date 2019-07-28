package typings.persona.PersonaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var privacyPolicy: js.UndefOr[String] = js.undefined
  var siteLogo: js.UndefOr[String] = js.undefined
  var siteName: js.UndefOr[String] = js.undefined
  var termsOfService: js.UndefOr[String] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    privacyPolicy: String = null,
    siteLogo: String = null,
    siteName: String = null,
    termsOfService: String = null
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (privacyPolicy != null) __obj.updateDynamic("privacyPolicy")(privacyPolicy)
    if (siteLogo != null) __obj.updateDynamic("siteLogo")(siteLogo)
    if (siteName != null) __obj.updateDynamic("siteName")(siteName)
    if (termsOfService != null) __obj.updateDynamic("termsOfService")(termsOfService)
    __obj.asInstanceOf[GetOptions]
  }
}

