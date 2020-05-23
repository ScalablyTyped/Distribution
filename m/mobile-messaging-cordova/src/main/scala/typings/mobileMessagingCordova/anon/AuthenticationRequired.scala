package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationRequired extends js.Object {
  var authenticationRequired: js.UndefOr[Boolean] = js.undefined
  var destructive: js.UndefOr[Boolean] = js.undefined
  var foreground: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var identifier: js.UndefOr[String] = js.undefined
  var moRequired: js.UndefOr[Boolean] = js.undefined
  var textInputActionButtonTitle: js.UndefOr[String] = js.undefined
  var textInputPlaceholder: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AuthenticationRequired {
  @scala.inline
  def apply(
    authenticationRequired: js.UndefOr[Boolean] = js.undefined,
    destructive: js.UndefOr[Boolean] = js.undefined,
    foreground: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    identifier: String = null,
    moRequired: js.UndefOr[Boolean] = js.undefined,
    textInputActionButtonTitle: String = null,
    textInputPlaceholder: String = null,
    title: String = null
  ): AuthenticationRequired = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(authenticationRequired)) __obj.updateDynamic("authenticationRequired")(authenticationRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destructive)) __obj.updateDynamic("destructive")(destructive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(foreground)) __obj.updateDynamic("foreground")(foreground.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (!js.isUndefined(moRequired)) __obj.updateDynamic("moRequired")(moRequired.get.asInstanceOf[js.Any])
    if (textInputActionButtonTitle != null) __obj.updateDynamic("textInputActionButtonTitle")(textInputActionButtonTitle.asInstanceOf[js.Any])
    if (textInputPlaceholder != null) __obj.updateDynamic("textInputPlaceholder")(textInputPlaceholder.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationRequired]
  }
}

