package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryMod.default
import typings.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphereMod {
  
  @JSImport("ol/sphere", "DEFAULT_RADIUS")
  @js.native
  val DEFAULT_RADIUS: Double = js.native
  
  @JSImport("ol/sphere", "getArea")
  @js.native
  def getArea(geometry: default): Double = js.native
  @JSImport("ol/sphere", "getArea")
  @js.native
  def getArea(geometry: default, opt_options: SphereMetricOptions): Double = js.native
  
  @JSImport("ol/sphere", "getDistance")
  @js.native
  def getDistance(c1: js.Array[_], c2: js.Array[_]): Double = js.native
  @JSImport("ol/sphere", "getDistance")
  @js.native
  def getDistance(c1: js.Array[_], c2: js.Array[_], opt_radius: Double): Double = js.native
  
  @JSImport("ol/sphere", "getLength")
  @js.native
  def getLength(geometry: default): Double = js.native
  @JSImport("ol/sphere", "getLength")
  @js.native
  def getLength(geometry: default, opt_options: SphereMetricOptions): Double = js.native
  
  @JSImport("ol/sphere", "offset")
  @js.native
  def offset(c1: Coordinate, distance: Double, bearing: Double): Coordinate = js.native
  @JSImport("ol/sphere", "offset")
  @js.native
  def offset(c1: Coordinate, distance: Double, bearing: Double, opt_radius: Double): Coordinate = js.native
  
  @js.native
  trait SphereMetricOptions extends StObject {
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var radius: js.UndefOr[Double] = js.native
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
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
