package typings.ol.formatMVTMod

import typings.ol.featureMod.FeatureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var featureClass: js.UndefOr[FeatureClass] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var layerName: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    featureClass: FeatureClass = null,
    geometryName: String = null,
    layerName: String = null,
    layers: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (featureClass != null) __obj.updateDynamic("featureClass")(featureClass)
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    if (layerName != null) __obj.updateDynamic("layerName")(layerName)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[Options]
  }
}

