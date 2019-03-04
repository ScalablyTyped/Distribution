package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GMLOptions extends js.Object {
  var curve: js.UndefOr[scala.Boolean] = js.undefined
  var featureNS: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String] = js.undefined
  var featureType: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var multiCurve: js.UndefOr[scala.Boolean] = js.undefined
  var multiSurface: js.UndefOr[scala.Boolean] = js.undefined
  var schemaLocation: js.UndefOr[java.lang.String] = js.undefined
  var srsName: java.lang.String
  var surface: js.UndefOr[scala.Boolean] = js.undefined
}

object GMLOptions {
  @scala.inline
  def apply(
    srsName: java.lang.String,
    curve: js.UndefOr[scala.Boolean] = js.undefined,
    featureNS: org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String = null,
    featureType: js.Array[java.lang.String] | java.lang.String = null,
    multiCurve: js.UndefOr[scala.Boolean] = js.undefined,
    multiSurface: js.UndefOr[scala.Boolean] = js.undefined,
    schemaLocation: java.lang.String = null,
    surface: js.UndefOr[scala.Boolean] = js.undefined
  ): GMLOptions = {
    val __obj = js.Dynamic.literal(srsName = srsName)
    if (!js.isUndefined(curve)) __obj.updateDynamic("curve")(curve)
    if (featureNS != null) __obj.updateDynamic("featureNS")(featureNS.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    if (!js.isUndefined(multiCurve)) __obj.updateDynamic("multiCurve")(multiCurve)
    if (!js.isUndefined(multiSurface)) __obj.updateDynamic("multiSurface")(multiSurface)
    if (schemaLocation != null) __obj.updateDynamic("schemaLocation")(schemaLocation)
    if (!js.isUndefined(surface)) __obj.updateDynamic("surface")(surface)
    __obj.asInstanceOf[GMLOptions]
  }
}

