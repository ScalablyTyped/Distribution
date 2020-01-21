package typings.ol.gmlbaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var curve: js.UndefOr[Boolean] = js.undefined
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.undefined
  var featureType: js.UndefOr[js.Array[String] | String] = js.undefined
  var hasZ: js.UndefOr[Boolean] = js.undefined
  var multiCurve: js.UndefOr[Boolean] = js.undefined
  var multiSurface: js.UndefOr[Boolean] = js.undefined
  var schemaLocation: js.UndefOr[String] = js.undefined
  var srsName: String
  var surface: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    srsName: String,
    curve: js.UndefOr[Boolean] = js.undefined,
    featureNS: StringDictionary[String] | String = null,
    featureType: js.Array[String] | String = null,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    multiCurve: js.UndefOr[Boolean] = js.undefined,
    multiSurface: js.UndefOr[Boolean] = js.undefined,
    schemaLocation: String = null,
    surface: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(srsName = srsName.asInstanceOf[js.Any])
    if (!js.isUndefined(curve)) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (featureNS != null) __obj.updateDynamic("featureNS")(featureNS.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    if (!js.isUndefined(multiCurve)) __obj.updateDynamic("multiCurve")(multiCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSurface)) __obj.updateDynamic("multiSurface")(multiSurface.asInstanceOf[js.Any])
    if (schemaLocation != null) __obj.updateDynamic("schemaLocation")(schemaLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(surface)) __obj.updateDynamic("surface")(surface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

