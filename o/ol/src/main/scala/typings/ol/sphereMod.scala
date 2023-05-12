package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.default
import typings.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphereMod {
  
  @JSImport("ol/sphere", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/sphere", "DEFAULT_RADIUS")
  @js.native
  val DEFAULT_RADIUS: Double = js.native
  
  inline def getArea(geometry: default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getArea")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getArea(geometry: default, options: SphereMetricOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getArea")(geometry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDistance(c1: js.Array[Any], c2: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDistance(c1: js.Array[Any], c2: js.Array[Any], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLength(geometry: default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getLength(geometry: default, options: SphereMetricOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(geometry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def offset(c1: Coordinate, distance: Double, bearing: Double): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(c1.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  inline def offset(c1: Coordinate, distance: Double, bearing: Double, radius: Double): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(c1.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  trait SphereMetricOptions extends StObject {
    
    /**
      * Projection of the  geometry.  By default, the geometry is assumed to be in
      * Web Mercator.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Sphere radius.  By default, the
      * [mean Earth radius](https://en.wikipedia.org/wiki/Earth_radius#Mean_radius)
      * for the WGS84 ellipsoid is used.
      */
    var radius: js.UndefOr[Double] = js.undefined
  }
  object SphereMetricOptions {
    
    inline def apply(): SphereMetricOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SphereMetricOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SphereMetricOptions] (val x: Self) extends AnyVal {
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
