package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WFSWriteGetFeatureOptions extends js.Object {
  var bbox: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var featureNS: java.lang.String
  var featurePrefix: java.lang.String
  var featureTypes: js.Array[java.lang.String]
  var filter: js.UndefOr[openlayersLib.openlayersMod.formatNs.filterNs.Filter] = js.undefined
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var maxFeatures: js.UndefOr[scala.Double] = js.undefined
  var outputFormat: js.UndefOr[java.lang.String] = js.undefined
  var propertyNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var resultType: js.UndefOr[java.lang.String] = js.undefined
  var srsName: js.UndefOr[java.lang.String] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

object WFSWriteGetFeatureOptions {
  @scala.inline
  def apply(
    featureNS: java.lang.String,
    featurePrefix: java.lang.String,
    featureTypes: js.Array[java.lang.String],
    bbox: openlayersLib.openlayersMod.Extent = null,
    count: scala.Int | scala.Double = null,
    filter: openlayersLib.openlayersMod.formatNs.filterNs.Filter = null,
    geometryName: java.lang.String = null,
    handle: java.lang.String = null,
    maxFeatures: scala.Int | scala.Double = null,
    outputFormat: java.lang.String = null,
    propertyNames: js.Array[java.lang.String] = null,
    resultType: java.lang.String = null,
    srsName: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null
  ): WFSWriteGetFeatureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("featureNS")(featureNS)
    __obj.updateDynamic("featurePrefix")(featurePrefix)
    __obj.updateDynamic("featureTypes")(featureTypes)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (maxFeatures != null) __obj.updateDynamic("maxFeatures")(maxFeatures.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames)
    if (resultType != null) __obj.updateDynamic("resultType")(resultType)
    if (srsName != null) __obj.updateDynamic("srsName")(srsName)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteGetFeatureOptions]
  }
}

