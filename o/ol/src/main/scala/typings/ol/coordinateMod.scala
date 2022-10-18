package typings.ol

import typings.ol.geomCircleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordinateMod {
  
  @JSImport("ol/coordinate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(coordinate: Coordinate, delta: Coordinate): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(coordinate.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def closestOnCircle(coordinate: Coordinate, circle: default): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("closestOnCircle")(coordinate.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def closestOnSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("closestOnSegment")(coordinate.asInstanceOf[js.Any], segment.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def createStringXY(): CoordinateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringXY")().asInstanceOf[CoordinateFormat]
  inline def createStringXY(opt_fractionDigits: Double): CoordinateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringXY")(opt_fractionDigits.asInstanceOf[js.Any]).asInstanceOf[CoordinateFormat]
  
  inline def degreesToStringHDMS(hemispheres: String, degrees: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("degreesToStringHDMS")(hemispheres.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def degreesToStringHDMS(hemispheres: String, degrees: Double, opt_fractionDigits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("degreesToStringHDMS")(hemispheres.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any], opt_fractionDigits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def distance(coord1: Coordinate, coord2: Coordinate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(coord1.asInstanceOf[js.Any], coord2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equals_(coordinate1: Coordinate, coordinate2: Coordinate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(coordinate1.asInstanceOf[js.Any], coordinate2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def format(coordinate: Coordinate, template: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(coordinate.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(coordinate: Coordinate, template: String, opt_fractionDigits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(coordinate.asInstanceOf[js.Any], template.asInstanceOf[js.Any], opt_fractionDigits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWorldsAway(coordinate: Coordinate, projection: typings.ol.projProjectionMod.default): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorldsAway")(coordinate.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getWorldsAway(
    coordinate: Coordinate,
    projection: typings.ol.projProjectionMod.default,
    opt_sourceExtentWidth: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorldsAway")(coordinate.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], opt_sourceExtentWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rotate(coordinate: Coordinate, angle: Double): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(coordinate.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def scale(coordinate: Coordinate, scale: Double): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(coordinate.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def squaredDistance(coord1: Coordinate, coord2: Coordinate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(coord1.asInstanceOf[js.Any], coord2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def squaredDistanceToSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistanceToSegment")(coordinate.asInstanceOf[js.Any], segment.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toStringHDMS(coordinate: Coordinate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringHDMS")(coordinate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toStringHDMS(coordinate: Coordinate, opt_fractionDigits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toStringHDMS")(coordinate.asInstanceOf[js.Any], opt_fractionDigits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toStringXY(coordinate: Coordinate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringXY")(coordinate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toStringXY(coordinate: Coordinate, opt_fractionDigits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toStringXY")(coordinate.asInstanceOf[js.Any], opt_fractionDigits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def wrapX(coordinate: Coordinate, projection: typings.ol.projProjectionMod.default): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapX")(coordinate.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  type Coordinate = js.Array[Double]
  
  type CoordinateFormat = js.Function1[/* p0 */ js.UndefOr[Coordinate], String]
}
