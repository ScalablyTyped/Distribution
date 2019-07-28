package typings.openlayers.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSGetFeatureInfoOptions extends js.Object {
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}

object WMSGetFeatureInfoOptions {
  @scala.inline
  def apply(layers: js.Array[String] = null): WMSGetFeatureInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[WMSGetFeatureInfoOptions]
  }
}

