package typings.phaser.PhaserNs.CurvesNs

import typings.phaser.PhaserNs.GameObjectsNs.Graphics
import typings.phaser.PhaserNs.GeomNs.Point
import typings.phaser.PhaserNs.GeomNs.Rectangle
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Base Curve class, which all other curve types extend.
  * 
  * Based on the three.js Curve classes created by [zz85](http://www.lab4games.net/zz85/blog)
  */
@JSGlobal("Phaser.Curves.Curve")
@js.native
class Curve protected () extends js.Object {
  /**
    * 
    * @param type [description]
    */
  def this(`type`: String) = this()
  /**
    * [description]
    */
  var active: Boolean = js.native
  /**
    * The quantity of arc length divisions within the curve.
    */
  var arcLengthDivisions: integer = js.native
  /**
    * An array of cached arc length values.
    */
  var cacheArcLengths: js.Array[Double] = js.native
  /**
    * The default number of divisions within the curve.
    */
  var defaultDivisions: integer = js.native
  /**
    * Does the data of this curve need updating?
    */
  var needsUpdate: Boolean = js.native
  /**
    * String based identifier for the type of curve.
    */
  var `type`: String = js.native
  /**
    * Draws this curve on the given Graphics object.
    * 
    * The curve is drawn using `Graphics.strokePoints` so will be drawn at whatever the present Graphics stroke color is.
    * The Graphics object is not cleared before the draw, so the curve will appear on-top of anything else already rendered to it.
    * @param graphics The Graphics instance onto which this curve will be drawn.
    * @param pointsTotal The resolution of the curve. The higher the value the smoother it will render, at the cost of rendering performance. Default 32.
    */
  def draw[G /* <: Graphics */](graphics: G): G = js.native
  def draw[G /* <: Graphics */](graphics: G, pointsTotal: integer): G = js.native
  /**
    * Returns a Rectangle where the position and dimensions match the bounds of this Curve.
    * 
    * You can control the accuracy of the bounds. The value given is used to work out how many points
    * to plot across the curve. Higher values are more accurate at the cost of calculation speed.
    * @param out The Rectangle to store the bounds in. If falsey a new object will be created.
    * @param accuracy The accuracy of the bounds calculations. Default 16.
    */
  def getBounds(): Rectangle = js.native
  def getBounds(out: Rectangle): Rectangle = js.native
  def getBounds(out: Rectangle, accuracy: integer): Rectangle = js.native
  /**
    * Returns an array of points, spaced out X distance pixels apart.
    * The smaller the distance, the larger the array will be.
    * @param distance The distance, in pixels, between each point along the curve.
    */
  def getDistancePoints(distance: integer): js.Array[Point] = js.native
  /**
    * [description]
    * @param out Optional Vector object to store the result in.
    */
  def getEndPoint(): Vector2 = js.native
  def getEndPoint(out: Vector2): Vector2 = js.native
  /**
    * Get total curve arc length
    */
  def getLength(): Double = js.native
  /**
    * Get list of cumulative segment lengths
    * @param divisions [description]
    */
  def getLengths(): js.Array[Double] = js.native
  def getLengths(divisions: integer): js.Array[Double] = js.native
  /**
    * [description]
    * @param u [description]
    * @param out [description]
    */
  def getPointAt[O /* <: Vector2 */](u: Double): O = js.native
  def getPointAt[O /* <: Vector2 */](u: Double, out: O): O = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getPoints(): js.Array[Vector2] = js.native
  def getPoints(divisions: integer): js.Array[Vector2] = js.native
  /**
    * [description]
    * @param out [description]
    */
  def getRandomPoint[O /* <: Vector2 */](): O = js.native
  def getRandomPoint[O /* <: Vector2 */](out: O): O = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getSpacedPoints(): js.Array[Vector2] = js.native
  def getSpacedPoints(divisions: integer): js.Array[Vector2] = js.native
  /**
    * [description]
    * @param out [description]
    */
  def getStartPoint[O /* <: Vector2 */](): O = js.native
  def getStartPoint[O /* <: Vector2 */](out: O): O = js.native
  /**
    * [description]
    * @param distance [description]
    * @param divisions [description]
    */
  def getTFromDistance(distance: integer): Double = js.native
  def getTFromDistance(distance: integer, divisions: integer): Double = js.native
  /**
    * Returns a unit vector tangent at t
    * In case any sub curve does not implement its tangent derivation,
    * 2 points a small delta apart will be used to find its gradient
    * which seems to give a reasonable approximation
    * @param t [description]
    * @param out [description]
    */
  def getTangent[O /* <: Vector2 */](t: Double): O = js.native
  def getTangent[O /* <: Vector2 */](t: Double, out: O): O = js.native
  /**
    * [description]
    * @param u [description]
    * @param out [description]
    */
  def getTangentAt[O /* <: Vector2 */](u: Double): O = js.native
  def getTangentAt[O /* <: Vector2 */](u: Double, out: O): O = js.native
  /**
    * [description]
    * @param u [description]
    * @param distance [description]
    * @param divisions [description]
    */
  def getUtoTmapping(u: Double, distance: integer): Double = js.native
  def getUtoTmapping(u: Double, distance: integer, divisions: integer): Double = js.native
  /**
    * [description]
    */
  def updateArcLengths(): Unit = js.native
}

