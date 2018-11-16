package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MVTOptions extends js.Object {
  var featureClass: js.UndefOr[
    (js.Function1[
      /* geom */ openlayersLib.openlayersMod.geomNs.Geometry | ScalablyTyped.runtime.StringDictionary[js.Any], 
      _
    ]) | (js.Function4[
      /* geom */ openlayersLib.openlayersMod.geomNs.GeometryType, 
      /* arg2 */ js.Array[scala.Double], 
      /* arg3 */ js.Array[scala.Double] | js.Array[js.Array[scala.Double]], 
      /* arg4 */ ScalablyTyped.runtime.StringDictionary[js.Any], 
      _
    ])
  ] = js.undefined
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
  var layerName: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

