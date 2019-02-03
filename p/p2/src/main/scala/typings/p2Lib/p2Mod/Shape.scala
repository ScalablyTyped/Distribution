package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Shape")
@js.native
class Shape ()
  extends p2Lib.p2Mod.p2Ns.Shape {
  def this(options: p2Lib.p2Mod.p2Ns.ShapeOptions) = this()
  /* CompleteClass */
  override var angle: scala.Double = js.native
  /* CompleteClass */
  override var area: scala.Double = js.native
  /* CompleteClass */
  override var boundingRadius: scala.Double = js.native
  /* CompleteClass */
  override var collisionGroup: scala.Double = js.native
  /* CompleteClass */
  override var collisionMask: scala.Double = js.native
  /* CompleteClass */
  override var collisionResponse: scala.Boolean = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  /* CompleteClass */
  override var material: p2Lib.p2Mod.p2Ns.Material = js.native
  /* CompleteClass */
  override var position: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var sensor: scala.Boolean = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override def computeAABB(out: p2Lib.p2Mod.p2Ns.AABB, position: js.Array[scala.Double], angle: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def computeMomentOfInertia(mass: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def updateArea(): scala.Unit = js.native
  /* CompleteClass */
  override def updateBoundingRadius(): scala.Double = js.native
}

/* static members */
@JSImport("p2", "Shape")
@js.native
object Shape extends js.Object {
  var BOX: scala.Double = js.native
  var CAPSULE: scala.Double = js.native
  var CIRCLE: scala.Double = js.native
  var CONVEX: scala.Double = js.native
  var HEIGHTFIELD: scala.Double = js.native
  var LINE: scala.Double = js.native
  var PARTICLE: scala.Double = js.native
  var PLANE: scala.Double = js.native
  var idCounter: scala.Double = js.native
}

