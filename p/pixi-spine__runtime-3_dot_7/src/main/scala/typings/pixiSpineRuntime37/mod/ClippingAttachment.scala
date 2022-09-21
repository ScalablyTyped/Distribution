package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.ISlotData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pixiSpineBase.mod.IAttachment because Already inherited
- typings.pixiSpineBase.mod.IVertexAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined 
- typings.pixiSpineBase.mod.IClippingAttachment because var conflicts: id, name, `type`, worldVerticesLength. Inlined endSlot */ @JSImport("@pixi-spine/runtime-3.7", "ClippingAttachment")
@js.native
open class ClippingAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  
  var color: Color = js.native
  
  var endSlot: js.UndefOr[ISlotData | SlotData] = js.native
}
