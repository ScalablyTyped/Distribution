package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Collection
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.FeatureLoader_
import typings.openlayers.mod.FeatureUrlFunction
import typings.openlayers.mod.LoadingStrategy_
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorOptions extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var features: js.UndefOr[js.Array[Feature] | Collection[Feature]] = js.native
  
  var format: js.UndefOr[typings.openlayers.mod.format.Feature] = js.native
  
  var loader: js.UndefOr[FeatureLoader_] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var overlaps: js.UndefOr[Boolean] = js.native
  
  var strategy: js.UndefOr[LoadingStrategy_] = js.native
  
  var url: js.UndefOr[String | FeatureUrlFunction] = js.native
  
  var useSpatialIndex: js.UndefOr[Boolean] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object VectorOptions {
  
  @scala.inline
  def apply(): VectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorOptions]
  }
  
  @scala.inline
  implicit class VectorOptionsOps[Self <: VectorOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributionsVarargs(value: (Attribution | String)*): Self = this.set("attributions", js.Array(value :_*))
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[Feature] | Collection[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setFormat(value: typings.openlayers.mod.format.Feature): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLoader(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => Unit): Self = this.set("loader", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setOverlaps(value: Boolean): Self = this.set("overlaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlaps: Self = this.set("overlaps", js.undefined)
    
    @scala.inline
    def setStrategy(value: (/* extent */ Extent_, /* resolution */ Double) => js.Array[Extent_]): Self = this.set("strategy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setUrlFunction3(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => String): Self = this.set("url", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUrl(value: String | FeatureUrlFunction): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseSpatialIndex(value: Boolean): Self = this.set("useSpatialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSpatialIndex: Self = this.set("useSpatialIndex", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
