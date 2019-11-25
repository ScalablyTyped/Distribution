package typings.ol.formatWFSMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.undefined
  var featureType: js.UndefOr[js.Array[String] | String] = js.undefined
  var gmlFormat: js.UndefOr[typings.ol.formatGMLBaseMod.default] = js.undefined
  var schemaLocation: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    featureNS: StringDictionary[String] | String = null,
    featureType: js.Array[String] | String = null,
    gmlFormat: typings.ol.formatGMLBaseMod.default = null,
    schemaLocation: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (featureNS != null) __obj.updateDynamic("featureNS")(featureNS.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    if (gmlFormat != null) __obj.updateDynamic("gmlFormat")(gmlFormat.asInstanceOf[js.Any])
    if (schemaLocation != null) __obj.updateDynamic("schemaLocation")(schemaLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

