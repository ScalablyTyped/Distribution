package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.IAttachment
import typings.pixiSpineBase.mod.IBone
import typings.pixiSpineBase.mod.ISlot
import typings.pixiSpineBase.mod.ISlotData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "Slot")
@js.native
open class Slot protected ()
  extends StObject
     with ISlot {
  def this(data: SlotData, bone: Bone) = this()
  
  var attachment: Attachment | Null = js.native
  
  var attachmentState: Double = js.native
  
  /* CompleteClass */
  var blendMode: Double = js.native
  
  /* CompleteClass */
  var bone: IBone = js.native
  /** The bone this slot belongs to. */
  @JSName("bone")
  var bone_Slot: Bone = js.native
  
  /* CompleteClass */
  var color: Color = js.native
  
  /* CompleteClass */
  var darkColor: Color = js.native
  /** The dark color used to tint the slot's attachment for two color tinting, or null if two color tinting is not used. The dark
    * color's alpha is not used. */
  @JSName("darkColor")
  var darkColor_Slot: Color | Null = js.native
  
  /* CompleteClass */
  var data: ISlotData = js.native
  /** The slot's setup pose data. */
  @JSName("data")
  var data_Slot: SlotData = js.native
  
  /** Values to deform the slot's attachment. For an unweighted mesh, the entries are local positions for each vertex. For a
    * weighted mesh, the entries are an offset for each vertex which will be added to the mesh's local vertex positions.
    *
    * See {@link VertexAttachment#computeWorldVertices()} and {@link DeformTimeline}. */
  var deform: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getAttachment(): IAttachment = js.native
  
  /** The skeleton this slot belongs to. */
  def getSkeleton(): Skeleton = js.native
  
  /** The index of the texture region to display when the slot's attachment has a {@link Sequence}. -1 represents the
    * {@link Sequence#getSetupIndex()}. */
  var sequenceIndex: Double = js.native
  
  /** Sets the slot's attachment and, if the attachment changed, resets {@link #sequenceIndex} and clears the {@link #deform}.
    * The deform is not cleared if the old attachment has the same {@link VertexAttachment#getTimelineAttachment()} as the
    * specified attachment. */
  def setAttachment(): Unit = js.native
  def setAttachment(attachment: Attachment): Unit = js.native
  
  /** Sets this slot to the setup pose. */
  def setToSetupPose(): Unit = js.native
}
