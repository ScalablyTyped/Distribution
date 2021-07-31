package typings.openlayers.mod

import typings.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SphereMetricOptions extends StObject {
  
  /**
    * Projection of the geometry.  By default, the geometry is assumed to be in
    * EPSG:3857 (Web Mercator).
    */
  var projection: js.UndefOr[Projection] = js.undefined
  
  /**
    * Sphere radius.  By default, the radius of the earth is used (Clarke 1866
    * Authalic Sphere).
    * @api
    */
  var radius: js.UndefOr[Double] = js.undefined
}
object SphereMetricOptions {
  
  @scala.inline
  def apply(): SphereMetricOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SphereMetricOptions]
  }
  
  @scala.inline
  implicit class SphereMetricOptionsMutableBuilder[Self <: SphereMetricOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
