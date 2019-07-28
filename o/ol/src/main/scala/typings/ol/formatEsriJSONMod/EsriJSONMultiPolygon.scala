package typings.ol.formatEsriJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EsriJSONMultiPolygon extends js.Object {
  var hasM: js.UndefOr[Boolean] = js.undefined
  var hasZ: js.UndefOr[Boolean] = js.undefined
  var rings: js.Array[js.Array[js.Array[js.Array[Double]]]]
  var spatialReference: js.UndefOr[EsriJSONSpatialReferenceWkid] = js.undefined
}

object EsriJSONMultiPolygon {
  @scala.inline
  def apply(
    rings: js.Array[js.Array[js.Array[js.Array[Double]]]],
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    spatialReference: EsriJSONSpatialReferenceWkid = null
  ): EsriJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(rings = rings)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[EsriJSONMultiPolygon]
  }
}

