package typings
package phaserLib.PhaserNs.CurvesNs

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
  def this(`type`: java.lang.String) = this()
  /**
    * [description]
    */
  var active: scala.Boolean = js.native
  /**
    * The quantity of arc length divisions within the curve.
    */
  var arcLengthDivisions: phaserLib.integer = js.native
  /**
    * An array of cached arc length values.
    */
  var cacheArcLengths: js.Array[scala.Double] = js.native
  /**
    * The default number of divisions within the curve.
    */
  var defaultDivisions: phaserLib.integer = js.native
  /**
    * Does the data of this curve need updating?
    */
  var needsUpdate: scala.Boolean = js.native
  /**
    * String based identifier for the type of curve.
    */
  var `type`: java.lang.String = js.native
  /**
    * Draws this curve on the given Graphics object.
    * 
    * The curve is drawn using `Graphics.strokePoints` so will be drawn at whatever the present Graphics stroke color is.
    * The Graphics object is not cleared before the draw, so the curve will appear on-top of anything else already rendered to it.
    * @param graphics The Graphics instance onto which this curve will be drawn.
    * @param pointsTotal The resolution of the curve. The higher the value the smoother it will render, at the cost of rendering performance. Default 32.
    */
  def draw[G /* <: phaserLib.PhaserNs.GameObjectsNs.Graphics */](graphics: G): G = js.native
  def draw[G /* <: phaserLib.PhaserNs.GameObjectsNs.Graphics */](graphics: G, pointsTotal: phaserLib.integer): G = js.native
  /**
    * Returns a Rectangle where the position and dimensions match the bounds of this Curve.
    * 
    * You can control the accuracy of the bounds. The value given is used to work out how many points
    * to plot across the curve. Higher values are more accurate at the cost of calculation speed.
    * @param out The Rectangle to store the bounds in. If falsey a new object will be created.
    * @param accuracy The accuracy of the bounds calculations. Default 16.
    */
  def getBounds(): phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  def getBounds(out: phaserLib.PhaserNs.GeomNs.Rectangle): phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  def getBounds(out: phaserLib.PhaserNs.GeomNs.Rectangle, accuracy: phaserLib.integer): phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * Returns an array of points, spaced out X distance pixels apart.
    * The smaller the distance, the larger the array will be.
    * @param distance The distance, in pixels, between each point along the curve.
    */
  def getDistancePoints(distance: phaserLib.integer): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
  /**
    * [description]
    * @param out Optional Vector object to store the result in.
    */
  def getEndPoint(): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def getEndPoint(out: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * [description]
    */
  def getLength(): scala.Double = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getLengths(): js.Array[scala.Double] = js.native
  def getLengths(divisions: phaserLib.integer): js.Array[scala.Double] = js.native
  /**
    * [description]
    * @param u [description]
    * @param out [description]
    */
  def getPointAt[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](u: scala.Double): O = js.native
  def getPointAt[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](u: scala.Double, out: O): O = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getPoints(): js.Array[phaserLib.PhaserNs.MathNs.Vector2] = js.native
  def getPoints(divisions: phaserLib.integer): js.Array[phaserLib.PhaserNs.MathNs.Vector2] = js.native
  /**
    * [description]
    * @param out [description]
    */
  def getRandomPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getRandomPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](out: O): O = js.native
  /**
    * [description]
    * @param divisions [description]
    */
  def getSpacedPoints(): js.Array[phaserLib.PhaserNs.MathNs.Vector2] = js.native
  def getSpacedPoints(divisions: phaserLib.integer): js.Array[phaserLib.PhaserNs.MathNs.Vector2] = js.native
  /**
    * [description]
    * @param out [description]
    */
  def getStartPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getStartPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](out: O): O = js.native
  /**
    * [description]
    * @param distance [description]
    * @param divisions [description]
    */
  def getTFromDistance(distance: phaserLib.integer): scala.Double = js.native
  def getTFromDistance(distance: phaserLib.integer, divisions: phaserLib.integer): scala.Double = js.native
  /**
    * [description]
    * @param t [description]
    * @param out [description]
    */
  def getTangent[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double): O = js.native
  def getTangent[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](t: scala.Double, out: O): O = js.native
  /**
    * [description]
    * @param u [description]
    * @param out [description]
    */
  def getTangentAt[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](u: scala.Double): O = js.native
  def getTangentAt[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](u: scala.Double, out: O): O = js.native
  /**
    * [description]
    * @param u [description]
    * @param distance [description]
    * @param divisions [description]
    */
  def getUtoTmapping(u: scala.Double, distance: phaserLib.integer): scala.Double = js.native
  def getUtoTmapping(u: scala.Double, distance: phaserLib.integer, divisions: phaserLib.integer): scala.Double = js.native
  /**
    * [description]
    */
  def updateArcLengths(): scala.Unit = js.native
}

