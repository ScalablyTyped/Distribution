package typings
package olLib.formatWFSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTransactionOptions extends js.Object {
  var featureNS: java.lang.String
  var featurePrefix: java.lang.String
  var featureType: java.lang.String
  var gmlOptions: js.UndefOr[olLib.formatGMLBaseMod.Options] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var hasZ: js.UndefOr[scala.Boolean] = js.undefined
  var nativeElements: js.Array[org.scalablytyped.runtime.StringDictionary[_]]
  var srsName: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WriteTransactionOptions {
  @scala.inline
  def apply(
    featureNS: java.lang.String,
    featurePrefix: java.lang.String,
    featureType: java.lang.String,
    nativeElements: js.Array[org.scalablytyped.runtime.StringDictionary[_]],
    gmlOptions: olLib.formatGMLBaseMod.Options = null,
    handle: java.lang.String = null,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    srsName: java.lang.String = null,
    version: java.lang.String = null
  ): WriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS, featurePrefix = featurePrefix, featureType = featureType, nativeElements = nativeElements)
    if (gmlOptions != null) __obj.updateDynamic("gmlOptions")(gmlOptions)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (srsName != null) __obj.updateDynamic("srsName")(srsName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WriteTransactionOptions]
  }
}

