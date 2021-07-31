package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.format.Feature
import typings.openlayers.mod.geom.Point
import typings.openlayers.mod.source.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var extent: js.UndefOr[Extent_] = js.undefined
  
  var format: js.UndefOr[Feature] = js.undefined
  
  var geometryFunction: js.UndefOr[js.Function1[/* feature */ typings.openlayers.mod.Feature, Point]] = js.undefined
  
  var logo: js.UndefOr[String] = js.undefined
  
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  
  var source: Vector
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object ClusterOptions {
  
  @scala.inline
  def apply(source: Vector): ClusterOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
  
  @scala.inline
  implicit class ClusterOptionsMutableBuilder[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setFormat(value: Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGeometryFunction(value: /* feature */ typings.openlayers.mod.Feature => Point): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
