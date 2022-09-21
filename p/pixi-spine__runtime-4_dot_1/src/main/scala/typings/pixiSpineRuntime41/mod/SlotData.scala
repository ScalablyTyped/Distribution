package typings.pixiSpineRuntime41.mod

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.IBoneData
import typings.pixiSpineBase.mod.ISlotData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "SlotData")
@js.native
open class SlotData protected ()
  extends StObject
     with ISlotData {
  def this(index: Double, name: String, boneData: BoneData) = this()
  
  /* CompleteClass */
  var attachmentName: String = js.native
  /** The name of the attachment that is visible for this slot in the setup pose, or null if no attachment is visible. */
  @JSName("attachmentName")
  var attachmentName_SlotData: String | Null = js.native
  
  /* CompleteClass */
  var blendMode: BLEND_MODES = js.native
  
  /* CompleteClass */
  var boneData: IBoneData = js.native
  /** The bone this slot belongs to. */
  @JSName("boneData")
  var boneData_SlotData: BoneData = js.native
  
  /* CompleteClass */
  var color: Color = js.native
  
  /* CompleteClass */
  var darkColor: Color = js.native
  /** The dark color used to tint the slot's attachment for two color tinting, or null if two color tinting is not used. The dark
    * color's alpha is not used. */
  @JSName("darkColor")
  var darkColor_SlotData: Color | Null = js.native
  
  /* CompleteClass */
  var index: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
