package typings.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Bone")
@js.native
class Bone protected ()
  extends typings.pixiSpine.PIXI.spine.core.Bone {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.BoneData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    parent: typings.pixiSpine.PIXI.spine.core.Bone
  ) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var appliedValid: Boolean = js.native
  /* CompleteClass */
  override var arotation: Double = js.native
  /* CompleteClass */
  override var ascaleX: Double = js.native
  /* CompleteClass */
  override var ascaleY: Double = js.native
  /* CompleteClass */
  override var ashearX: Double = js.native
  /* CompleteClass */
  override var ashearY: Double = js.native
  /* CompleteClass */
  override var ax: Double = js.native
  /* CompleteClass */
  override var ay: Double = js.native
  /* CompleteClass */
  override var children: js.Array[typings.pixiSpine.PIXI.spine.core.Bone] = js.native
  /* CompleteClass */
  override var data: typings.pixiSpine.PIXI.spine.core.BoneData = js.native
  /* CompleteClass */
  override var matrix: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Matrix */ js.Any = js.native
  /* CompleteClass */
  override var parent: typings.pixiSpine.PIXI.spine.core.Bone = js.native
  /* CompleteClass */
  override var rotation: Double = js.native
  /* CompleteClass */
  override var scaleX: Double = js.native
  /* CompleteClass */
  override var scaleY: Double = js.native
  /* CompleteClass */
  override var shearX: Double = js.native
  /* CompleteClass */
  override var shearY: Double = js.native
  /* CompleteClass */
  override var skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton = js.native
  /* CompleteClass */
  override var sorted: Boolean = js.native
  /* CompleteClass */
  override val worldX: Double = js.native
  /* CompleteClass */
  override val worldY: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def getWorldRotationX(): Double = js.native
  /* CompleteClass */
  override def getWorldRotationY(): Double = js.native
  /* CompleteClass */
  override def getWorldScaleX(): Double = js.native
  /* CompleteClass */
  override def getWorldScaleY(): Double = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def localToWorld(local: typings.pixiSpine.PIXI.spine.core.Vector2): typings.pixiSpine.PIXI.spine.core.Vector2 = js.native
  /* CompleteClass */
  override def localToWorldRotation(localRotation: Double): Double = js.native
  /* CompleteClass */
  override def rotateWorld(degrees: Double): Unit = js.native
  /* CompleteClass */
  override def setToSetupPose(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
  /* CompleteClass */
  override def updateAppliedTransform(): Unit = js.native
  /* CompleteClass */
  override def updateWorldTransform(): Unit = js.native
  /* CompleteClass */
  override def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit = js.native
  /* CompleteClass */
  override def worldToLocal(world: typings.pixiSpine.PIXI.spine.core.Vector2): typings.pixiSpine.PIXI.spine.core.Vector2 = js.native
  /* CompleteClass */
  override def worldToLocalRotation(worldRotation: Double): Double = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Bone")
@js.native
object Bone extends js.Object {
  var yDown: Boolean = js.native
}

