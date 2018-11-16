package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Convex")
@js.native
class Convex ()
  extends p2Lib.p2Mod.p2Ns.Convex {
  def this(options: p2Lib.p2Mod.p2Ns.ConvexOptions) = this()
  /* CompleteClass */
  override var angle: scala.Double = js.native
  /* CompleteClass */
  override var area: scala.Double = js.native
  /* CompleteClass */
  override var axes: js.Array[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override var boundingRadius: scala.Double = js.native
  /* CompleteClass */
  override var centerOfMass: js.Array[scala.Double] = js.native
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
  override var triangles: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override var vertices: js.Array[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override def computeAABB(out: p2Lib.p2Mod.p2Ns.AABB, position: js.Array[scala.Double], angle: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def computeMomentOfInertia(mass: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def projectOntoLocalAxis(localAxis: js.Array[scala.Double], result: js.Array[scala.Double]): scala.Unit = js.native
  /* CompleteClass */
  override def projectOntoWorldAxis(
    localAxis: js.Array[scala.Double],
    shapeOffset: js.Array[scala.Double],
    shapeAngle: scala.Double,
    result: js.Array[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def updateArea(): scala.Unit = js.native
  /* CompleteClass */
  override def updateBoundingRadius(): scala.Double = js.native
  /* CompleteClass */
  override def updateCenterOfMass(): scala.Unit = js.native
}

@JSImport("p2", "Convex")
@js.native
object Convex extends js.Object {
  def triangleArea(a: js.Array[scala.Double], b: js.Array[scala.Double], c: js.Array[scala.Double]): scala.Double = js.native
}

