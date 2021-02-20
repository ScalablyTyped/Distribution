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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorOptions extends StObject {
  
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
  implicit class VectorOptionsMutableBuilder[Self <: VectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[Feature] | Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: typings.openlayers.mod.format.Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLoader(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => Unit): Self = StObject.set(x, "loader", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
    
    @scala.inline
    def setStrategy(value: (/* extent */ Extent_, /* resolution */ Double) => js.Array[Extent_]): Self = StObject.set(x, "strategy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setUrl(value: String | FeatureUrlFunction): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFunction3(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => String): Self = StObject.set(x, "url", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseSpatialIndex(value: Boolean): Self = StObject.set(x, "useSpatialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSpatialIndexUndefined: Self = StObject.set(x, "useSpatialIndex", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
