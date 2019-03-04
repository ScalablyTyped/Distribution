package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WFSWriteTransactionOptions extends js.Object {
  var featureNS: java.lang.String
  var featurePrefix: java.lang.String
  var featureType: java.lang.String
  var gmlOptions: js.UndefOr[GMLOptions] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var nativeElements: js.Array[openlayersLib.openlayersMod.GlobalObject]
  var srsName: js.UndefOr[java.lang.String] = js.undefined
}

object WFSWriteTransactionOptions {
  @scala.inline
  def apply(
    featureNS: java.lang.String,
    featurePrefix: java.lang.String,
    featureType: java.lang.String,
    nativeElements: js.Array[openlayersLib.openlayersMod.GlobalObject],
    gmlOptions: GMLOptions = null,
    handle: java.lang.String = null,
    srsName: java.lang.String = null
  ): WFSWriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS, featurePrefix = featurePrefix, featureType = featureType, nativeElements = nativeElements)
    if (gmlOptions != null) __obj.updateDynamic("gmlOptions")(gmlOptions)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (srsName != null) __obj.updateDynamic("srsName")(srsName)
    __obj.asInstanceOf[WFSWriteTransactionOptions]
  }
}

