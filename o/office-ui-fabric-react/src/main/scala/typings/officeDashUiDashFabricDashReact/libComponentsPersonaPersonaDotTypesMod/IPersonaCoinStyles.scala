package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaCoinStyles extends js.Object {
  var coin: IStyle
  var image: IStyle
  var imageArea: IStyle
  var initials: IStyle
  var size10WithoutPresenceIcon: IStyle
}

object IPersonaCoinStyles {
  @scala.inline
  def apply(
    coin: IStyle = null,
    image: IStyle = null,
    imageArea: IStyle = null,
    initials: IStyle = null,
    size10WithoutPresenceIcon: IStyle = null
  ): IPersonaCoinStyles = {
    val __obj = js.Dynamic.literal()
    if (coin != null) __obj.updateDynamic("coin")(coin.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageArea != null) __obj.updateDynamic("imageArea")(imageArea.asInstanceOf[js.Any])
    if (initials != null) __obj.updateDynamic("initials")(initials.asInstanceOf[js.Any])
    if (size10WithoutPresenceIcon != null) __obj.updateDynamic("size10WithoutPresenceIcon")(size10WithoutPresenceIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaCoinStyles]
  }
}

