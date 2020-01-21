package typings.ol.mvtMod

import typings.ol.olFeatureMod.FeatureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var featureClass: js.UndefOr[FeatureClass] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var idProperty: js.UndefOr[String] = js.undefined
  var layerName: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    featureClass: FeatureClass = null,
    geometryName: String = null,
    idProperty: String = null,
    layerName: String = null,
    layers: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (featureClass != null) __obj.updateDynamic("featureClass")(featureClass.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

