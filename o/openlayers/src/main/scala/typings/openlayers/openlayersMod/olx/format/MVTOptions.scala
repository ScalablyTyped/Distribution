package typings.openlayers.openlayersMod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.openlayersMod.geom.Geometry
import typings.openlayers.openlayersMod.geom.GeometryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MVTOptions extends js.Object {
  var featureClass: js.UndefOr[
    (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
      /* geom */ GeometryType, 
      /* arg2 */ js.Array[Double], 
      /* arg3 */ js.Array[js.Array[Double] | Double], 
      /* arg4 */ StringDictionary[js.Any], 
      _
    ])
  ] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var layerName: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}

object MVTOptions {
  @scala.inline
  def apply(
    featureClass: (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
      /* geom */ GeometryType, 
      /* arg2 */ js.Array[Double], 
      /* arg3 */ js.Array[js.Array[Double] | Double], 
      /* arg4 */ StringDictionary[js.Any], 
      _
    ]) = null,
    geometryName: String = null,
    layerName: String = null,
    layers: js.Array[String] = null
  ): MVTOptions = {
    val __obj = js.Dynamic.literal()
    if (featureClass != null) __obj.updateDynamic("featureClass")(featureClass.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVTOptions]
  }
}

