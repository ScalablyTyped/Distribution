package typings.ol

import typings.ol.circleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordinateMod {
  
  @JSImport("ol/coordinate", "add")
  @js.native
  def add(coordinate: Coordinate, delta: Coordinate): Coordinate = js.native
  
  @JSImport("ol/coordinate", "closestOnCircle")
  @js.native
  def closestOnCircle(coordinate: Coordinate, circle: default): Coordinate = js.native
  
  @JSImport("ol/coordinate", "closestOnSegment")
  @js.native
  def closestOnSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): Coordinate = js.native
  
  @JSImport("ol/coordinate", "createStringXY")
  @js.native
  def createStringXY(): CoordinateFormat = js.native
  @JSImport("ol/coordinate", "createStringXY")
  @js.native
  def createStringXY(opt_fractionDigits: Double): CoordinateFormat = js.native
  
  @JSImport("ol/coordinate", "degreesToStringHDMS")
  @js.native
  def degreesToStringHDMS(hemispheres: String, degrees: Double): String = js.native
  @JSImport("ol/coordinate", "degreesToStringHDMS")
  @js.native
  def degreesToStringHDMS(hemispheres: String, degrees: Double, opt_fractionDigits: Double): String = js.native
  
  @JSImport("ol/coordinate", "distance")
  @js.native
  def distance(coord1: Coordinate, coord2: Coordinate): Double = js.native
  
  @JSImport("ol/coordinate", "equals")
  @js.native
  def equals_(coordinate1: Coordinate, coordinate2: Coordinate): Boolean = js.native
  
  @JSImport("ol/coordinate", "format")
  @js.native
  def format(coordinate: Coordinate, template: String): String = js.native
  @JSImport("ol/coordinate", "format")
  @js.native
  def format(coordinate: Coordinate, template: String, opt_fractionDigits: Double): String = js.native
  
  @JSImport("ol/coordinate", "getWorldsAway")
  @js.native
  def getWorldsAway(coordinate: Coordinate, projection: typings.ol.projectionMod.default): Double = js.native
  @JSImport("ol/coordinate", "getWorldsAway")
  @js.native
  def getWorldsAway(
    coordinate: Coordinate,
    projection: typings.ol.projectionMod.default,
    opt_sourceExtentWidth: Double
  ): Double = js.native
  
  @JSImport("ol/coordinate", "rotate")
  @js.native
  def rotate(coordinate: Coordinate, angle: Double): Coordinate = js.native
  
  @JSImport("ol/coordinate", "scale")
  @js.native
  def scale(coordinate: Coordinate, scale: Double): Coordinate = js.native
  
  @JSImport("ol/coordinate", "squaredDistance")
  @js.native
  def squaredDistance(coord1: Coordinate, coord2: Coordinate): Double = js.native
  
  @JSImport("ol/coordinate", "squaredDistanceToSegment")
  @js.native
  def squaredDistanceToSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): Double = js.native
  
  @JSImport("ol/coordinate", "toStringHDMS")
  @js.native
  def toStringHDMS(coordinate: Coordinate): String = js.native
  @JSImport("ol/coordinate", "toStringHDMS")
  @js.native
  def toStringHDMS(coordinate: Coordinate, opt_fractionDigits: Double): String = js.native
  
  @JSImport("ol/coordinate", "toStringXY")
  @js.native
  def toStringXY(coordinate: Coordinate): String = js.native
  @JSImport("ol/coordinate", "toStringXY")
  @js.native
  def toStringXY(coordinate: Coordinate, opt_fractionDigits: Double): String = js.native
  
  @JSImport("ol/coordinate", "wrapX")
  @js.native
  def wrapX(coordinate: Coordinate, projection: typings.ol.projectionMod.default): Coordinate = js.native
  
  type Coordinate = js.Array[Double]
  
  type CoordinateFormat = js.Function1[/* p0 */ js.UndefOr[Coordinate], String]
}
