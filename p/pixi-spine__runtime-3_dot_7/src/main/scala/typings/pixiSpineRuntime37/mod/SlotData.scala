package typings.pixiSpineRuntime37.mod

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.IBoneData
import typings.pixiSpineBase.mod.ISlotData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "SlotData")
@js.native
open class SlotData protected ()
  extends StObject
     with ISlotData {
  def this(index: Double, name: String, boneData: BoneData) = this()
  
  /* CompleteClass */
  var attachmentName: String = js.native
  
  /* CompleteClass */
  var blendMode: BLEND_MODES = js.native
  
  /* CompleteClass */
  var boneData: IBoneData = js.native
  @JSName("boneData")
  var boneData_SlotData: BoneData = js.native
  
  /* CompleteClass */
  var color: Color = js.native
  
  /* CompleteClass */
  var darkColor: Color = js.native
  
  /* CompleteClass */
  var index: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
