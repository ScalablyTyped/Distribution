package typings.ol.esriJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsriJSONMultiPolygon extends js.Object {
  var hasM: js.UndefOr[Boolean] = js.native
  var hasZ: js.UndefOr[Boolean] = js.native
  var rings: js.Array[js.Array[js.Array[js.Array[Double]]]] = js.native
  var spatialReference: js.UndefOr[EsriJSONSpatialReferenceWkid] = js.native
}

object EsriJSONMultiPolygon {
  @scala.inline
  def apply(rings: js.Array[js.Array[js.Array[js.Array[Double]]]]): EsriJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsriJSONMultiPolygon]
  }
  @scala.inline
  implicit class EsriJSONMultiPolygonOps[Self <: EsriJSONMultiPolygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRingsVarargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = this.set("rings", js.Array(value :_*))
    @scala.inline
    def setRings(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = this.set("rings", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasM(value: Boolean): Self = this.set("hasM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasM: Self = this.set("hasM", js.undefined)
    @scala.inline
    def setHasZ(value: Boolean): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
    @scala.inline
    def setSpatialReference(value: EsriJSONSpatialReferenceWkid): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
  }
  
}

