package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.geom.GeometryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MVTOptions extends js.Object {
  var featureClass: js.UndefOr[
    (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
      /* geom */ GeometryType, 
      /* arg2 */ js.Array[Double], 
      /* arg3 */ js.Array[js.Array[Double] | Double], 
      /* arg4 */ StringDictionary[js.Any], 
      _
    ])
  ] = js.native
  var geometryName: js.UndefOr[String] = js.native
  var layerName: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[String]] = js.native
}

object MVTOptions {
  @scala.inline
  def apply(): MVTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MVTOptions]
  }
  @scala.inline
  implicit class MVTOptionsOps[Self <: MVTOptions] (val x: Self) extends AnyVal {
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
    def setFeatureClassFunction1(value: /* geom */ Geometry | StringDictionary[js.Any] => _): Self = this.set("featureClass", js.Any.fromFunction1(value))
    @scala.inline
    def setFeatureClassFunction4(
      value: (/* geom */ GeometryType, /* arg2 */ js.Array[Double], /* arg3 */ js.Array[js.Array[Double] | Double], /* arg4 */ StringDictionary[js.Any]) => _
    ): Self = this.set("featureClass", js.Any.fromFunction4(value))
    @scala.inline
    def setFeatureClass(
      value: (js.Function1[/* geom */ Geometry | StringDictionary[js.Any], _]) | (js.Function4[
          /* geom */ GeometryType, 
          /* arg2 */ js.Array[Double], 
          /* arg3 */ js.Array[js.Array[Double] | Double], 
          /* arg4 */ StringDictionary[js.Any], 
          _
        ])
    ): Self = this.set("featureClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureClass: Self = this.set("featureClass", js.undefined)
    @scala.inline
    def setGeometryName(value: String): Self = this.set("geometryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryName: Self = this.set("geometryName", js.undefined)
    @scala.inline
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerName: Self = this.set("layerName", js.undefined)
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
  
}

