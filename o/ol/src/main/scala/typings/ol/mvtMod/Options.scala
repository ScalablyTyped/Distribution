package typings.ol.mvtMod

import typings.ol.olFeatureMod.FeatureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var featureClass: js.UndefOr[FeatureClass] = js.native
  var geometryName: js.UndefOr[String] = js.native
  var idProperty: js.UndefOr[String] = js.native
  var layerName: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFeatureClass(value: FeatureClass): Self = this.set("featureClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureClass: Self = this.set("featureClass", js.undefined)
    @scala.inline
    def setGeometryName(value: String): Self = this.set("geometryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryName: Self = this.set("geometryName", js.undefined)
    @scala.inline
    def setIdProperty(value: String): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdProperty: Self = this.set("idProperty", js.undefined)
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

