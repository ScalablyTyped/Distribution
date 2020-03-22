package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RopeGeometry allows you to draw a geometry across several points and then manipulate these points.
  *
  * ```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * const rope = new PIXI.RopeGeometry(100, points);
  * ```
  *
  * @class
  * @extends PIXI.MeshGeometry
  * @memberof PIXI
  *
  */
@JSGlobal("PIXI.RopeGeometry")
@js.native
class RopeGeometry () extends MeshGeometry {
  def this(width: Double) = this()
  def this(width: Double, points: js.Array[Point]) = this()
  def this(width: Double, points: js.Array[Point], textureScale: Double) = this()
  /**
    * An array of points that determine the rope
    * @member {PIXI.Point[]} PIXI.RopeGeometry#points
    */
  var points: js.Array[Point] = js.native
  /**
    * Rope texture scale, if zero then the rope texture is stretched.
    * @member {number} PIXI.RopeGeometry#textureScale
    * @readOnly
    */
  val textureScale: Double = js.native
  /**
    * The width (i.e., thickness) of the rope.
    * @member {number} PIXI.RopeGeometry#width
    * @readOnly
    */
  val width: Double = js.native
  /**
    * refreshes vertices of Rope mesh
    */
  def updateVertices(): Unit = js.native
}

