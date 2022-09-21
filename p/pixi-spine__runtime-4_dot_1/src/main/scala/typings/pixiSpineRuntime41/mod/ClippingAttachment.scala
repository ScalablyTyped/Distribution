package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.ISlotData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pixiSpineBase.mod.IAttachment because Already inherited
- typings.pixiSpineBase.mod.IVertexAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined 
- typings.pixiSpineBase.mod.IClippingAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined endSlot */ @JSImport("@pixi-spine/runtime-4.1", "ClippingAttachment")
@js.native
open class ClippingAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  
  /** The color of the clipping polygon as it was in Spine. Available only when nonessential data was exported. Clipping polygons
    * are not usually rendered at runtime. */
  var color: Color = js.native
  
  /** Clipping is performed between the clipping polygon's slot and the end slot. Returns null if clipping is done until the end of
    * the skeleton's rendering. */
  var endSlot: js.UndefOr[ISlotData | Null | SlotData] = js.native
}
