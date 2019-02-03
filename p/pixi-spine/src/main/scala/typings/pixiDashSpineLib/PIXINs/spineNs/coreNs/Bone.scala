package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Bone")
@js.native
class Bone protected () extends Updatable {
  def this(data: BoneData, skeleton: Skeleton, parent: Bone) = this()
  var appliedValid: scala.Boolean = js.native
  var arotation: scala.Double = js.native
  var ascaleX: scala.Double = js.native
  var ascaleY: scala.Double = js.native
  var ashearX: scala.Double = js.native
  var ashearY: scala.Double = js.native
  var ax: scala.Double = js.native
  var ay: scala.Double = js.native
  var children: js.Array[Bone] = js.native
  var data: BoneData = js.native
  var matrix: pixiDotJsLib.PIXINs.Matrix = js.native
  var parent: Bone = js.native
  var rotation: scala.Double = js.native
  var scaleX: scala.Double = js.native
  var scaleY: scala.Double = js.native
  var shearX: scala.Double = js.native
  var shearY: scala.Double = js.native
  var skeleton: Skeleton = js.native
  var sorted: scala.Boolean = js.native
  val worldX: scala.Double = js.native
  val worldY: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def getWorldRotationX(): scala.Double = js.native
  def getWorldRotationY(): scala.Double = js.native
  def getWorldScaleX(): scala.Double = js.native
  def getWorldScaleY(): scala.Double = js.native
  def localToWorld(local: Vector2): Vector2 = js.native
  def localToWorldRotation(localRotation: scala.Double): scala.Double = js.native
  def rotateWorld(degrees: scala.Double): scala.Unit = js.native
  def setToSetupPose(): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
  def updateAppliedTransform(): scala.Unit = js.native
  def updateWorldTransform(): scala.Unit = js.native
  def updateWorldTransformWith(
    x: scala.Double,
    y: scala.Double,
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    shearX: scala.Double,
    shearY: scala.Double
  ): scala.Unit = js.native
  def worldToLocal(world: Vector2): Vector2 = js.native
  def worldToLocalRotation(worldRotation: scala.Double): scala.Double = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Bone")
@js.native
object Bone extends js.Object {
  var yDown: scala.Boolean = js.native
}

