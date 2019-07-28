package typings.openlayers.openlayersMod.olxNs.formatNs

import typings.openlayers.openlayersMod.GlobalObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WFSWriteTransactionOptions extends js.Object {
  var featureNS: String
  var featurePrefix: String
  var featureType: String
  var gmlOptions: js.UndefOr[GMLOptions] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var nativeElements: js.Array[GlobalObject]
  var srsName: js.UndefOr[String] = js.undefined
}

object WFSWriteTransactionOptions {
  @scala.inline
  def apply(
    featureNS: String,
    featurePrefix: String,
    featureType: String,
    nativeElements: js.Array[GlobalObject],
    gmlOptions: GMLOptions = null,
    handle: String = null,
    srsName: String = null
  ): WFSWriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS, featurePrefix = featurePrefix, featureType = featureType, nativeElements = nativeElements)
    if (gmlOptions != null) __obj.updateDynamic("gmlOptions")(gmlOptions)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (srsName != null) __obj.updateDynamic("srsName")(srsName)
    __obj.asInstanceOf[WFSWriteTransactionOptions]
  }
}

