package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSImport("pixi.js", "RopeGeometry")
@js.native
class RopeGeometry ()
  extends StObject
     with typings.pixiJs.PIXI.RopeGeometry {
  def this(width: Double) = this()
  def this(width: Double, points: js.Array[typings.pixiJs.PIXI.Point]) = this()
  def this(width: Unit, points: js.Array[typings.pixiJs.PIXI.Point]) = this()
  def this(width: Double, points: js.Array[typings.pixiJs.PIXI.Point], textureScale: Double) = this()
  def this(width: Double, points: Unit, textureScale: Double) = this()
  def this(width: Unit, points: js.Array[typings.pixiJs.PIXI.Point], textureScale: Double) = this()
  def this(width: Unit, points: Unit, textureScale: Double) = this()
}
