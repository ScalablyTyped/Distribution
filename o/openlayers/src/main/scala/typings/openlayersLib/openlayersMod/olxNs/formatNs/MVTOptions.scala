package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MVTOptions extends js.Object {
  var featureClass: js.UndefOr[
    (js.Function1[
      /* geom */ openlayersLib.openlayersMod.geomNs.Geometry | org.scalablytyped.runtime.StringDictionary[js.Any], 
      _
    ]) | (js.Function4[
      /* geom */ openlayersLib.openlayersMod.geomNs.GeometryType, 
      /* arg2 */ js.Array[scala.Double], 
      /* arg3 */ js.Array[js.Array[scala.Double] | scala.Double], 
      /* arg4 */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      _
    ])
  ] = js.undefined
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
  var layerName: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MVTOptions {
  @scala.inline
  def apply(
    featureClass: (js.Function1[
      /* geom */ openlayersLib.openlayersMod.geomNs.Geometry | org.scalablytyped.runtime.StringDictionary[js.Any], 
      _
    ]) | (js.Function4[
      /* geom */ openlayersLib.openlayersMod.geomNs.GeometryType, 
      /* arg2 */ js.Array[scala.Double], 
      /* arg3 */ js.Array[js.Array[scala.Double] | scala.Double], 
      /* arg4 */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      _
    ]) = null,
    geometryName: java.lang.String = null,
    layerName: java.lang.String = null,
    layers: js.Array[java.lang.String] = null
  ): MVTOptions = {
    val __obj = js.Dynamic.literal()
    if (featureClass != null) __obj.updateDynamic("featureClass")(featureClass.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    if (layerName != null) __obj.updateDynamic("layerName")(layerName)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[MVTOptions]
  }
}

