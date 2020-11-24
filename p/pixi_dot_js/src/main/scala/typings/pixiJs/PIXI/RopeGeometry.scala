package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait RopeGeometry extends MeshGeometry {
  
  /**
    * The width (i.e., thickness) of the rope.
    * @member {number} PIXI.RopeGeometry#_width
    * @readOnly
    */
  val _width: Double = js.native
  
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
    * refreshes vertices of Rope mesh
    */
  def updateVertices(): Unit = js.native
  
  /**
    * The width (i.e., thickness) of the rope.
    * @member {number}
    * @readOnly
    */
  val width: Double = js.native
}
