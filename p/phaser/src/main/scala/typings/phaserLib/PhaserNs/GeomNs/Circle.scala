package typings
package phaserLib.PhaserNs.GeomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Circle object.
  * 
  * This is a geometry object, containing numerical values and related methods to inspect and modify them.
  * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
  * To render a Circle you should look at the capabilities of the Graphics class.
  */
@JSGlobal("Phaser.Geom.Circle")
@js.native
/**
  * 
  * @param x The x position of the center of the circle. Default 0.
  * @param y The y position of the center of the circle. Default 0.
  * @param radius The radius of the circle. Default 0.
  */
class Circle () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, radius: scala.Double) = this()
  /**
    * The bottom position of the Circle.
    */
  var bottom: scala.Double = js.native
  /**
    * The diameter of the Circle.
    */
  var diameter: scala.Double = js.native
  /**
    * The left position of the Circle.
    */
  var left: scala.Double = js.native
  /**
    * The radius of the Circle.
    */
  var radius: scala.Double = js.native
  /**
    * The right position of the Circle.
    */
  var right: scala.Double = js.native
  /**
    * The top position of the Circle.
    */
  var top: scala.Double = js.native
  /**
    * The x position of the center of the circle.
    */
  var x: scala.Double = js.native
  /**
    * The y position of the center of the circle.
    */
  var y: scala.Double = js.native
  /**
    * Check to see if the Circle contains the given x / y coordinates.
    * @param x The x coordinate to check within the circle.
    * @param y The y coordinate to check within the circle.
    */
  def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Returns a Point object containing the coordinates of a point on the circumference of the Circle
    * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
    * at 180 degrees around the circle.
    * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
    * @param out An object to store the return values in. If not given a Point object will be created.
    */
  def getPoint[O /* <: Point */](position: scala.Double): O = js.native
  def getPoint[O /* <: Point */](position: scala.Double, out: O): O = js.native
  /**
    * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
    * based on the given quantity or stepRate values.
    * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
    * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
    * @param output An array to insert the points in to. If not provided a new array will be created.
    */
  def getPoints[O /* <: js.Array[Point] */](quantity: phaserLib.integer): O = js.native
  def getPoints[O /* <: js.Array[Point] */](quantity: phaserLib.integer, stepRate: scala.Double): O = js.native
  def getPoints[O /* <: js.Array[Point] */](quantity: phaserLib.integer, stepRate: scala.Double, output: O): O = js.native
  /**
    * Returns a uniformly distributed random point from anywhere within the Circle.
    * @param point A Point or point-like object to set the random `x` and `y` values in.
    */
  def getRandomPoint[O /* <: Point */](): O = js.native
  def getRandomPoint[O /* <: Point */](point: O): O = js.native
  /**
    * Checks to see if the Circle is empty: has a radius of zero.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * Sets this Circle to be empty with a radius of zero.
    * Does not change its position.
    */
  def setEmpty(): Circle = js.native
  /**
    * Sets the position of this Circle.
    * @param x The x position of the center of the circle. Default 0.
    * @param y The y position of the center of the circle. Default 0.
    */
  def setPosition(): Circle = js.native
  def setPosition(x: scala.Double): Circle = js.native
  def setPosition(x: scala.Double, y: scala.Double): Circle = js.native
  /**
    * Sets the x, y and radius of this circle.
    * @param x The x position of the center of the circle. Default 0.
    * @param y The y position of the center of the circle. Default 0.
    * @param radius The radius of the circle. Default 0.
    */
  def setTo(): Circle = js.native
  def setTo(x: scala.Double): Circle = js.native
  def setTo(x: scala.Double, y: scala.Double): Circle = js.native
  def setTo(x: scala.Double, y: scala.Double, radius: scala.Double): Circle = js.native
}

/* static members */
@JSGlobal("Phaser.Geom.Circle")
@js.native
object Circle extends js.Object {
  /**
    * Calculates the area of the circle.
    * @param circle The Circle to get the area of.
    */
  def Area(circle: phaserLib.PhaserNs.GeomNs.Circle): scala.Double = js.native
  /**
    * Returns the circumference of the given Circle.
    * @param circle The Circle to get the circumference of.
    */
  def Circumference(circle: phaserLib.PhaserNs.GeomNs.Circle): scala.Double = js.native
  /**
    * Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.
    * @param circle The Circle to get the circumference point on.
    * @param angle The angle from the center of the Circle to the circumference to return the point from. Given in radians.
    * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
    */
  def CircumferencePoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, angle: scala.Double): O = js.native
  def CircumferencePoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, angle: scala.Double, out: O): O = js.native
  def Clone(source: js.Object): phaserLib.PhaserNs.GeomNs.Circle = js.native
  /**
    * Creates a new Circle instance based on the values contained in the given source.
    * @param source The Circle to be cloned. Can be an instance of a Circle or a circle-like object, with x, y and radius properties.
    */
  def Clone(source: phaserLib.PhaserNs.GeomNs.Circle): phaserLib.PhaserNs.GeomNs.Circle = js.native
  /**
    * Check to see if the Circle contains the given x / y coordinates.
    * @param circle The Circle to check.
    * @param x The x coordinate to check within the circle.
    * @param y The y coordinate to check within the circle.
    */
  def Contains(circle: phaserLib.PhaserNs.GeomNs.Circle, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def ContainsPoint(circle: phaserLib.PhaserNs.GeomNs.Circle, point: js.Object): scala.Boolean = js.native
  /**
    * Check to see if the Circle contains the given Point object.
    * @param circle The Circle to check.
    * @param point The Point object to check if it's within the Circle or not.
    */
  def ContainsPoint(circle: phaserLib.PhaserNs.GeomNs.Circle, point: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
  def ContainsRect(circle: phaserLib.PhaserNs.GeomNs.Circle, rect: js.Object): scala.Boolean = js.native
  /**
    * Check to see if the Circle contains all four points of the given Rectangle object.
    * @param circle The Circle to check.
    * @param rect The Rectangle object to check if it's within the Circle or not.
    */
  def ContainsRect(circle: phaserLib.PhaserNs.GeomNs.Circle, rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
  /**
    * Copies the `x`, `y` and `radius` properties from the `source` Circle
    * into the given `dest` Circle, then returns the `dest` Circle.
    * @param source The source Circle to copy the values from.
    * @param dest The destination Circle to copy the values to.
    */
  def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](source: phaserLib.PhaserNs.GeomNs.Circle, dest: O): O = js.native
  /**
    * Compares the `x`, `y` and `radius` properties of the two given Circles.
    * Returns `true` if they all match, otherwise returns `false`.
    * @param circle The first Circle to compare.
    * @param toCompare The second Circle to compare.
    */
  def Equals(circle: phaserLib.PhaserNs.GeomNs.Circle, toCompare: phaserLib.PhaserNs.GeomNs.Circle): scala.Boolean = js.native
  /**
    * Returns the bounds of the Circle object.
    * @param circle The Circle to get the bounds from.
    * @param out A Rectangle, or rectangle-like object, to store the circle bounds in. If not given a new Rectangle will be created.
    */
  def GetBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](circle: phaserLib.PhaserNs.GeomNs.Circle): O = js.native
  def GetBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](circle: phaserLib.PhaserNs.GeomNs.Circle, out: O): O = js.native
  /**
    * Returns a Point object containing the coordinates of a point on the circumference of the Circle
    * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
    * at 180 degrees around the circle.
    * @param circle The Circle to get the circumference point on.
    * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
    * @param out An object to store the return values in. If not given a Point object will be created.
    */
  def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, position: scala.Double): O = js.native
  def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, position: scala.Double, out: O): O = js.native
  /**
    * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
    * based on the given quantity or stepRate values.
    * @param circle The Circle to get the points from.
    * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
    * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
    * @param output An array to insert the points in to. If not provided a new array will be created.
    */
  def GetPoints(circle: phaserLib.PhaserNs.GeomNs.Circle, quantity: phaserLib.integer): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
  def GetPoints(circle: phaserLib.PhaserNs.GeomNs.Circle, quantity: phaserLib.integer, stepRate: scala.Double): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
  def GetPoints(
    circle: phaserLib.PhaserNs.GeomNs.Circle,
    quantity: phaserLib.integer,
    stepRate: scala.Double,
    output: js.Array[_]
  ): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
  /**
    * Offsets the Circle by the values given.
    * @param circle The Circle to be offset (translated.)
    * @param x The amount to horizontally offset the Circle by.
    * @param y The amount to vertically offset the Circle by.
    */
  def Offset[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](circle: O, x: scala.Double, y: scala.Double): O = js.native
  def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](circle: O, point: js.Object): O = js.native
  /**
    * Offsets the Circle by the values given in the `x` and `y` properties of the Point object.
    * @param circle The Circle to be offset (translated.)
    * @param point The Point object containing the values to offset the Circle by.
    */
  def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](circle: O, point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
  /**
    * Returns a uniformly distributed random point from anywhere within the given Circle.
    * @param circle The Circle to get a random point from.
    * @param out A Point or point-like object to set the random `x` and `y` values in.
    */
  def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle): O = js.native
  def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, out: O): O = js.native
}

