package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WFSOptions extends js.Object {
  var featureNS: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String] = js.undefined
  var featureType: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var gmlFormat: js.UndefOr[openlayersLib.openlayersMod.formatNs.GMLBase] = js.undefined
  var schemaLocation: js.UndefOr[java.lang.String] = js.undefined
}

object WFSOptions {
  @scala.inline
  def apply(
    featureNS: org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String = null,
    featureType: js.Array[java.lang.String] | java.lang.String = null,
    gmlFormat: openlayersLib.openlayersMod.formatNs.GMLBase = null,
    schemaLocation: java.lang.String = null
  ): WFSOptions = {
    val __obj = js.Dynamic.literal()
    if (featureNS != null) __obj.updateDynamic("featureNS")(featureNS.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    if (gmlFormat != null) __obj.updateDynamic("gmlFormat")(gmlFormat)
    if (schemaLocation != null) __obj.updateDynamic("schemaLocation")(schemaLocation)
    __obj.asInstanceOf[WFSOptions]
  }
}

