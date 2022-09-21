package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.ClippingAttachment")
@js.native
open class ClippingAttachment protected ()
  extends StObject
     with typings.phaser.spine.ClippingAttachment {
  def this(name: String) = this()
  
  /* CompleteClass */
  var bones: js.Array[Double] = js.native
  
  /* CompleteClass */
  var color: typings.phaser.spine.Color = js.native
  
  /* CompleteClass */
  override def computeWorldVertices(
    slot: typings.phaser.spine.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def copy(): typings.phaser.spine.Attachment = js.native
  
  /* CompleteClass */
  override def copyTo(attachment: typings.phaser.spine.VertexAttachment): Unit = js.native
  
  /* CompleteClass */
  var deformAttachment: typings.phaser.spine.VertexAttachment = js.native
  
  /* CompleteClass */
  var endSlot: typings.phaser.spine.SlotData = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var vertices: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  var worldVerticesLength: Double = js.native
}
