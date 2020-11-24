package typings.ol.sourceVectorMod

import typings.ol.extentMod.Extent
import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.featureloaderMod.FeatureUrlFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var features: js.UndefOr[
    js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] | typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
  ] = js.native
  
  var format: js.UndefOr[typings.ol.featureMod.default] = js.native
  
  var loader: js.UndefOr[FeatureLoader] = js.native
  
  var overlaps: js.UndefOr[Boolean] = js.native
  
  var strategy: js.UndefOr[LoadingStrategy] = js.native
  
  var url: js.UndefOr[String | FeatureUrlFunction] = js.native
  
  var useSpatialIndex: js.UndefOr[Boolean] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
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
    def setAttributionsVarargs(value: String*): Self = this.set("attributions", js.Array(value :_*))
    
    @scala.inline
    def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = this.set("attributions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(
      value: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] | typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
    ): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setFormat(value: typings.ol.featureMod.default): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLoader(value: FeatureLoader): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setOverlaps(value: Boolean): Self = this.set("overlaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlaps: Self = this.set("overlaps", js.undefined)
    
    @scala.inline
    def setStrategy(value: (/* p0 */ Extent, /* p1 */ Double) => js.Array[Extent]): Self = this.set("strategy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setUrlFunction3(value: (/* p0 */ Extent, /* p1 */ Double, /* p2 */ typings.ol.projectionMod.default) => String): Self = this.set("url", js.Any.fromFunction3(value))
    
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
