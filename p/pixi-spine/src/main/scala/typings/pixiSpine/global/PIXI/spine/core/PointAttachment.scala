package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.PointAttachment")
@js.native
class PointAttachment protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.PointAttachment {
  def this(name: String) = this()
  
  /* CompleteClass */
  var bones: js.Array[Double] = js.native
  
  /* CompleteClass */
  var color: typings.pixiSpine.PIXI.spine.core.Color = js.native
  
  /* CompleteClass */
  override def computeWorldPosition(bone: typings.pixiSpine.PIXI.spine.core.Bone, point: typings.pixiSpine.PIXI.spine.core.Vector2): typings.pixiSpine.PIXI.spine.core.Vector2 = js.native
  
  /* CompleteClass */
  override def computeWorldRotation(bone: typings.pixiSpine.PIXI.spine.core.Bone): Double = js.native
  
  /* CompleteClass */
  override def computeWorldVertices(
    slot: typings.pixiSpine.PIXI.spine.core.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def computeWorldVerticesOld(slot: typings.pixiSpine.PIXI.spine.core.Slot, worldVertices: ArrayLike[Double]): Unit = js.native
  
  /* CompleteClass */
  override def copy(): typings.pixiSpine.PIXI.spine.core.Attachment = js.native
  
  /* CompleteClass */
  override def copyTo(attachment: typings.pixiSpine.PIXI.spine.core.VertexAttachment): Unit = js.native
  
  /* CompleteClass */
  var deformAttachment: typings.pixiSpine.PIXI.spine.core.VertexAttachment = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var rotation: Double = js.native
  
  /* CompleteClass */
  var vertices: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  var worldVerticesLength: Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
