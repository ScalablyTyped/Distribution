package typings.ol.formatWFSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTransactionOptions extends js.Object {
  var featureNS: String
  var featurePrefix: String
  var featureType: String
  var gmlOptions: js.UndefOr[typings.ol.formatGMLBaseMod.Options] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var hasZ: js.UndefOr[Boolean] = js.undefined
  var nativeElements: js.Array[js.Object]
  var srsName: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object WriteTransactionOptions {
  @scala.inline
  def apply(
    featureNS: String,
    featurePrefix: String,
    featureType: String,
    nativeElements: js.Array[js.Object],
    gmlOptions: typings.ol.formatGMLBaseMod.Options = null,
    handle: String = null,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    srsName: String = null,
    version: String = null
  ): WriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
    if (gmlOptions != null) __obj.updateDynamic("gmlOptions")(gmlOptions.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    if (srsName != null) __obj.updateDynamic("srsName")(srsName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTransactionOptions]
  }
}

