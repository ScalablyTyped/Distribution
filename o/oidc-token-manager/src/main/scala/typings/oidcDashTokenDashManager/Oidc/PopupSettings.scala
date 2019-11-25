package typings.oidcDashTokenDashManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupSettings extends js.Object {
  var features: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object PopupSettings {
  @scala.inline
  def apply(features: String = null, target: String = null): PopupSettings = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupSettings]
  }
}

