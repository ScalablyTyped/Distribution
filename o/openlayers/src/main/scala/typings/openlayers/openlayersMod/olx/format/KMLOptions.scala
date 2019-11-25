package typings.openlayers.openlayersMod.olx.format

import typings.openlayers.openlayersMod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMLOptions extends js.Object {
  var defaultStyle: js.UndefOr[js.Array[Style]] = js.undefined
  var extractStyles: js.UndefOr[Boolean] = js.undefined
  var showPointNames: js.UndefOr[Boolean] = js.undefined
  var writeStyles: js.UndefOr[Boolean] = js.undefined
}

object KMLOptions {
  @scala.inline
  def apply(
    defaultStyle: js.Array[Style] = null,
    extractStyles: js.UndefOr[Boolean] = js.undefined,
    showPointNames: js.UndefOr[Boolean] = js.undefined,
    writeStyles: js.UndefOr[Boolean] = js.undefined
  ): KMLOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(extractStyles)) __obj.updateDynamic("extractStyles")(extractStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(showPointNames)) __obj.updateDynamic("showPointNames")(showPointNames.asInstanceOf[js.Any])
    if (!js.isUndefined(writeStyles)) __obj.updateDynamic("writeStyles")(writeStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMLOptions]
  }
}

