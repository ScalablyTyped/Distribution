package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiscellaneousTypeDescriptor extends js.Object {
  val barcode: js.UndefOr[scala.Boolean] = js.undefined
  val image: js.UndefOr[scala.Boolean] = js.undefined
  val imageUrl: js.UndefOr[scala.Boolean] = js.undefined
  val webUrl: js.UndefOr[scala.Boolean] = js.undefined
}

object MiscellaneousTypeDescriptor {
  @scala.inline
  def apply(
    barcode: js.UndefOr[scala.Boolean] = js.undefined,
    image: js.UndefOr[scala.Boolean] = js.undefined,
    imageUrl: js.UndefOr[scala.Boolean] = js.undefined,
    webUrl: js.UndefOr[scala.Boolean] = js.undefined
  ): MiscellaneousTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(barcode)) __obj.updateDynamic("barcode")(barcode)
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(imageUrl)) __obj.updateDynamic("imageUrl")(imageUrl)
    if (!js.isUndefined(webUrl)) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[MiscellaneousTypeDescriptor]
  }
}

