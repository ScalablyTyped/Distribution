package typings
package olLib.formatMVTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var featureClass: js.UndefOr[olLib.featureMod.FeatureClass] = js.undefined
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
  var layerName: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    featureClass: olLib.featureMod.FeatureClass = null,
    geometryName: java.lang.String = null,
    layerName: java.lang.String = null,
    layers: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (featureClass != null) __obj.updateDynamic("featureClass")(featureClass)
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    if (layerName != null) __obj.updateDynamic("layerName")(layerName)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[Options]
  }
}

