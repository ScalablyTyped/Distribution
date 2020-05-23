package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    coin: js.UndefOr[Null | IStyle] = js.undefined,
    image: js.UndefOr[Null | IStyle] = js.undefined,
    imageArea: js.UndefOr[Null | IStyle] = js.undefined,
    initials: js.UndefOr[Null | IStyle] = js.undefined,
    size10WithoutPresenceIcon: js.UndefOr[Null | IStyle] = js.undefined
  ): IPersonaCoinStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(coin)) __obj.updateDynamic("coin")(coin.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(imageArea)) __obj.updateDynamic("imageArea")(imageArea.asInstanceOf[js.Any])
    if (!js.isUndefined(initials)) __obj.updateDynamic("initials")(initials.asInstanceOf[js.Any])
    if (!js.isUndefined(size10WithoutPresenceIcon)) __obj.updateDynamic("size10WithoutPresenceIcon")(size10WithoutPresenceIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaCoinStyles]
  }
}

