package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.ClippingAttachment")
@js.native
class ClippingAttachment protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.ClippingAttachment {
  def this(name: String) = this()
  
  /* CompleteClass */
  var bones: js.Array[Double] = js.native
  
  /* CompleteClass */
  var color: typings.pixiSpine.PIXI.spine.core.Color = js.native
  
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
  var endSlot: typings.pixiSpine.PIXI.spine.core.SlotData = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var vertices: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  var worldVerticesLength: Double = js.native
}
