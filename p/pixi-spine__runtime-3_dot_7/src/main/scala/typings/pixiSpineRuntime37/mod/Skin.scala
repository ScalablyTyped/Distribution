package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.IAttachment
import typings.pixiSpineBase.mod.ISkin
import typings.pixiSpineBase.mod.Map2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "Skin")
@js.native
open class Skin protected ()
  extends StObject
     with ISkin {
  def this(name: String) = this()
  
  def addAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit = js.native
  
  /** Attach each attachment in this skin if the corresponding attachment in the old skin is currently attached. */
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit = js.native
  
  /* CompleteClass */
  var attachments: js.Array[Map2[IAttachment]] = js.native
  @JSName("attachments")
  var attachments_Skin: js.Array[Map2[Attachment]] = js.native
  
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): IAttachment | Null = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
