package typings.phaser.PhaserNs.GeomNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Polygon object
  * 
  * The polygon is a closed shape consists of a series of connected straight lines defined by list of ordered points.
  * Several formats are supported to define the list of points, check the setTo method for details. 
  * This is a geometry object allowing you to define and inspect the shape.
  * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
  * To render a Polygon you should look at the capabilities of the Graphics class.
  */
@JSGlobal("Phaser.Geom.Polygon")
@js.native
/**
  * 
  * @param points List of points defining the perimeter of this Polygon. Several formats are supported: 
  * - A string containing paired x y values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
  * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
  * - An array of objects with public x y properties: `[obj1, obj2, ...]`
  * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
  * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
  */
class Polygon () extends js.Object {
  def this(points: js.Array[Point]) = this()
  /**
    * The area of this Polygon.
    */
  var area: Double = js.native
  /**
    * An array of number pair objects that make up this polygon. I.e. [ {x,y}, {x,y}, {x,y} ]
    */
  var points: js.Array[Point] = js.native
  /**
    * The geometry constant type of this object: `GEOM_CONST.POLYGON`.
    * Used for fast type comparisons.
    */
  val `type`: integer = js.native
  /**
    * Calculates the area of the Polygon. This is available in the property Polygon.area
    */
  def calculateArea(): Double = js.native
  /**
    * Check to see if the Polygon contains the given x / y coordinates.
    * @param x The x coordinate to check within the polygon.
    * @param y The y coordinate to check within the polygon.
    */
  def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
    * based on the given quantity or stepRate values.
    * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
    * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
    * @param output An array to insert the points in to. If not provided a new array will be created.
    */
  def getPoints(quantity: integer): js.Array[Point] = js.native
  def getPoints(quantity: integer, stepRate: Double): js.Array[Point] = js.native
  def getPoints(quantity: integer, stepRate: Double, output: js.Array[_]): js.Array[Point] = js.native
  /**
    * Sets this Polygon to the given points.
    * 
    * The points can be set from a variety of formats:
    * 
    * - A string containing paired values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
    * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
    * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
    * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
    * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
    * 
    * `setTo` may also be called without any arguments to remove all points.
    * @param points Points defining the perimeter of this polygon. Please check function description above for the different supported formats.
    */
  def setTo(points: js.Array[_]): Polygon = js.native
}

/* static members */
@JSGlobal("Phaser.Geom.Polygon")
@js.native
object Polygon extends js.Object {
  /**
    * Create a new polygon which is a copy of the specified polygon
    * @param polygon The polygon to create a clone of
    */
  def Clone(polygon: Polygon): Polygon = js.native
  /**
    * Checks if a point is within the bounds of a Polygon.
    * @param polygon The Polygon to check against.
    * @param x The X coordinate of the point to check.
    * @param y The Y coordinate of the point to check.
    */
  def Contains(polygon: Polygon, x: Double, y: Double): Boolean = js.native
  /**
    * [description]
    * @param polygon [description]
    * @param point [description]
    */
  def ContainsPoint(polygon: Polygon, point: Point): Boolean = js.native
  /**
    * Calculates the bounding AABB rectangle of a polygon.
    * @param polygon The polygon that should be calculated.
    * @param out The rectangle or object that has x, y, width, and height properties to store the result. Optional.
    */
  def GetAABB[O /* <: Rectangle */](polygon: Polygon): O = js.native
  def GetAABB[O /* <: Rectangle */](polygon: Polygon, out: O): O = js.native
  /**
    * Stores all of the points of a Polygon into a flat array of numbers following the sequence [ x,y, x,y, x,y ],
    * i.e. each point of the Polygon, in the order it's defined, corresponds to two elements of the resultant
    * array for the point's X and Y coordinate.
    * @param polygon The Polygon whose points to export.
    * @param output An array to which the points' coordinates should be appended.
    */
  def GetNumberArray[O /* <: js.Array[Double] */](polygon: Polygon): O = js.native
  def GetNumberArray[O /* <: js.Array[Double] */](polygon: Polygon, output: O): O = js.native
  /**
    * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
    * based on the given quantity or stepRate values.
    * @param polygon The Polygon to get the points from.
    * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
    * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
    * @param output An array to insert the points in to. If not provided a new array will be created.
    */
  def GetPoints(polygon: Polygon, quantity: integer): js.Array[Point] = js.native
  def GetPoints(polygon: Polygon, quantity: integer, stepRate: Double): js.Array[Point] = js.native
  def GetPoints(polygon: Polygon, quantity: integer, stepRate: Double, output: js.Array[_]): js.Array[Point] = js.native
  /**
    * Returns the perimeter of the given Polygon.
    * @param polygon The Polygon to get the perimeter of.
    */
  def Perimeter(polygon: Polygon): Double = js.native
  /**
    * Reverses the order of the points of a Polygon.
    * @param polygon The Polygon to modify.
    */
  def Reverse[O /* <: Polygon */](polygon: O): O = js.native
  /**
    * Takes a Polygon object and applies Chaikin's smoothing algorithm on its points.
    * @param polygon The polygon to be smoothed. The polygon will be modified in-place and returned.
    */
  def Smooth[O /* <: Polygon */](polygon: O): O = js.native
}

