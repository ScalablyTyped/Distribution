package typings.phaser.PhaserNs.GeomNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Ellipse object.
  * 
  * This is a geometry object, containing numerical values and related methods to inspect and modify them.
  * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
  * To render an Ellipse you should look at the capabilities of the Graphics class.
  */
@JSGlobal("Phaser.Geom.Ellipse")
@js.native
/**
  * 
  * @param x The x position of the center of the ellipse. Default 0.
  * @param y The y position of the center of the ellipse. Default 0.
  * @param width The width of the ellipse. Default 0.
  * @param height The height of the ellipse. Default 0.
  */
class Ellipse () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /**
    * The bottom position of the Ellipse.
    */
  var bottom: Double = js.native
  /**
    * The height of the ellipse.
    */
  var height: Double = js.native
  /**
    * The left position of the Ellipse.
    */
  var left: Double = js.native
  /**
    * The right position of the Ellipse.
    */
  var right: Double = js.native
  /**
    * The top position of the Ellipse.
    */
  var top: Double = js.native
  /**
    * The geometry constant type of this object: `GEOM_CONST.ELLIPSE`.
    * Used for fast type comparisons.
    */
  val `type`: integer = js.native
  /**
    * The width of the ellipse.
    */
  var width: Double = js.native
  /**
    * The x position of the center of the ellipse.
    */
  var x: Double = js.native
  /**
    * The y position of the center of the ellipse.
    */
  var y: Double = js.native
  /**
    * Check to see if the Ellipse contains the given x / y coordinates.
    * @param x The x coordinate to check within the ellipse.
    * @param y The y coordinate to check within the ellipse.
    */
  def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Returns the major radius of the ellipse. Also known as the Semi Major Axis.
    */
  def getMajorRadius(): Double = js.native
  /**
    * Returns the minor radius of the ellipse. Also known as the Semi Minor Axis.
    */
  def getMinorRadius(): Double = js.native
  /**
    * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
    * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
    * at 180 degrees around the circle.
    * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
    * @param out An object to store the return values in. If not given a Point object will be created.
    */
  def getPoint[O /* <: Point */](position: Double): O = js.native
  def getPoint[O /* <: Point */](position: Double, out: O): O = js.native
  /**
    * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
    * based on the given quantity or stepRate values.
    * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
    * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
    * @param output An array to insert the points in to. If not provided a new array will be created.
    */
  def getPoints(quantity: integer): js.Array[Point] = js.native
  def getPoints(quantity: integer, stepRate: Double): js.Array[Point] = js.native
  def getPoints(quantity: integer, stepRate: Double, output: js.Array[_]): js.Array[Point] = js.native
  /**
    * Returns a uniformly distributed random point from anywhere within the given Ellipse.
    * @param point A Point or point-like object to set the random `x` and `y` values in.
    */
  def getRandomPoint[O /* <: Point */](): O = js.native
  def getRandomPoint[O /* <: Point */](point: O): O = js.native
  /**
    * Checks to see if the Ellipse is empty: has a width or height equal to zero.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Sets this Ellipse to be empty with a width and height of zero.
    * Does not change its position.
    */
  def setEmpty(): Ellipse = js.native
  /**
    * Sets the position of this Ellipse.
    * @param x The x position of the center of the ellipse.
    * @param y The y position of the center of the ellipse.
    */
  def setPosition(x: Double, y: Double): Ellipse = js.native
  /**
    * Sets the size of this Ellipse.
    * Does not change its position.
    * @param width The width of the ellipse.
    * @param height The height of the ellipse. Default width.
    */
  def setSize(width: Double): Ellipse = js.native
  def setSize(width: Double, height: Double): Ellipse = js.native
  /**
    * Sets the x, y, width and height of this ellipse.
    * @param x The x position of the center of the ellipse.
    * @param y The y position of the center of the ellipse.
    * @param width The width of the ellipse.
    * @param height The height of the ellipse.
    */
  def setTo(x: Double, y: Double, width: Double, height: Double): Ellipse = js.native
}

/* static members */
@JSGlobal("Phaser.Geom.Ellipse")
@js.native
object Ellipse extends js.Object {
  /**
    * Calculates the area of the Ellipse.
    * @param ellipse The Ellipse to get the area of.
    */
  def Area(ellipse: Ellipse): Double = js.native
  /**
    * Returns the circumference of the given Ellipse.
    * @param ellipse The Ellipse to get the circumference of.
    */
  def Circumference(ellipse: Ellipse): Double = js.native
  /**
    * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse based on the given angle.
    * @param ellipse The Ellipse to get the circumference point on.
    * @param angle The angle from the center of the Ellipse to the circumference to return the point from. Given in radians.
    * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
    */
  def CircumferencePoint[O /* <: Point */](ellipse: Ellipse, angle: Double): O = js.native
  def CircumferencePoint[O /* <: Point */](ellipse: Ellipse, angle: Double, out: O): O = js.native
  /**
    * Creates a new Ellipse instance based on the values contained in the given source.
    * @param source The Ellipse to be cloned. Can be an instance of an Ellipse or a ellipse-like object, with x, y, width and height properties.
    */
  def Clone(source: Ellipse): Ellipse = js.native
  /**
    * Check to see if the Ellipse contains the given x / y coordinates.
    * @param ellipse The Ellipse to check.
    * @param x The x coordinate to check within the ellipse.
    * @param y The y coordinate to check within the ellipse.
    */
  def Contains(ellipse: Ellipse, x: Double, y: Double): Boolean = js.native
  def ContainsPoint(ellipse: Ellipse, point: js.Object): Boolean = js.native
  /**
    * Check to see if the Ellipse contains the given Point object.
    * @param ellipse The Ellipse to check.
    * @param point The Point object to check if it's within the Circle or not.
    */
  def ContainsPoint(ellipse: Ellipse, point: Point): Boolean = js.native
  def ContainsRect(ellipse: Ellipse, rect: js.Object): Boolean = js.native
  /**
    * Check to see if the Ellipse contains all four points of the given Rectangle object.
    * @param ellipse The Ellipse to check.
    * @param rect The Rectangle object to check if it's within the Ellipse or not.
    */
  def ContainsRect(ellipse: Ellipse, rect: Rectangle): Boolean = js.native
  /**
    * Copies the `x`, `y`, `width` and `height` properties from the `source` Ellipse
    * into the given `dest` Ellipse, then returns the `dest` Ellipse.
    * @param source The source Ellipse to copy the values from.
    * @param dest The destination Ellipse to copy the values to.
    */
  def CopyFrom[O /* <: Ellipse */](source: Ellipse, dest: O): O = js.native
  /**
    * Compares the `x`, `y`, `width` and `height` properties of the two given Ellipses.
    * Returns `true` if they all match, otherwise returns `false`.
    * @param ellipse The first Ellipse to compare.
    * @param toCompare The second Ellipse to compare.
    */
  def Equals(ellipse: Ellipse, toCompare: Ellipse): Boolean = js.native
  /**
    * Returns the bounds of the Ellipse object.
    * @param ellipse The Ellipse to get the bounds from.
    * @param out A Rectangle, or rectangle-like object, to store the ellipse bounds in. If not given a new Rectangle will be created.
    */
  def GetBounds[O /* <: Rectangle */](ellipse: Ellipse): O = js.native
  def GetBounds[O /* <: Rectangle */](ellipse: Ellipse, out: O): O = js.native
  /**
    * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
    * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
    * at 180 degrees around the circle.
    * @param ellipse The Ellipse to get the circumference point on.
    * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
    * @param out An object to store the return values in. If not given a Point object will be created.
    */
  def GetPoint[O /* <: Point */](ellipse: Ellipse, position: Double): O = js.native
  def GetPoint[O /* <: Point */](ellipse: Ellipse, position: Double, out: O): O = js.native
  /**
    * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
    * based on the given quantity or stepRate values.
    * @param ellipse The Ellipse to get the points from.
    * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
    * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
    * @param out An array to insert the points in to. If not provided a new array will be created.
    */
  def GetPoints[O /* <: js.Array[Point] */](ellipse: Ellipse, quantity: integer): O = js.native
  def GetPoints[O /* <: js.Array[Point] */](ellipse: Ellipse, quantity: integer, stepRate: Double): O = js.native
  def GetPoints[O /* <: js.Array[Point] */](ellipse: Ellipse, quantity: integer, stepRate: Double, out: O): O = js.native
  /**
    * Offsets the Ellipse by the values given.
    * @param ellipse The Ellipse to be offset (translated.)
    * @param x The amount to horizontally offset the Ellipse by.
    * @param y The amount to vertically offset the Ellipse by.
    */
  def Offset[O /* <: Ellipse */](ellipse: O, x: Double, y: Double): O = js.native
  def OffsetPoint[O /* <: Ellipse */](ellipse: O, point: js.Object): O = js.native
  /**
    * Offsets the Ellipse by the values given in the `x` and `y` properties of the Point object.
    * @param ellipse The Ellipse to be offset (translated.)
    * @param point The Point object containing the values to offset the Ellipse by.
    */
  def OffsetPoint[O /* <: Ellipse */](ellipse: O, point: Point): O = js.native
  /**
    * Returns a uniformly distributed random point from anywhere within the given Ellipse.
    * @param ellipse The Ellipse to get a random point from.
    * @param out A Point or point-like object to set the random `x` and `y` values in.
    */
  def Random[O /* <: Point */](ellipse: Ellipse): O = js.native
  def Random[O /* <: Point */](ellipse: Ellipse, out: O): O = js.native
}

