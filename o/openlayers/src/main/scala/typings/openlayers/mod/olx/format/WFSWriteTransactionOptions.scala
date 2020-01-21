package typings.openlayers.mod.olx.format

import typings.openlayers.mod.GlobalObject
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
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
    if (gmlOptions != null) __obj.updateDynamic("gmlOptions")(gmlOptions.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (srsName != null) __obj.updateDynamic("srsName")(srsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteTransactionOptions]
  }
}

