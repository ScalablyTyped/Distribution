package typings
package personaLib.PersonaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var privacyPolicy: js.UndefOr[java.lang.String] = js.undefined
  var siteLogo: js.UndefOr[java.lang.String] = js.undefined
  var siteName: js.UndefOr[java.lang.String] = js.undefined
  var termsOfService: js.UndefOr[java.lang.String] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    privacyPolicy: java.lang.String = null,
    siteLogo: java.lang.String = null,
    siteName: java.lang.String = null,
    termsOfService: java.lang.String = null
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

