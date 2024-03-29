package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.AttachmentType
import typings.pixiSpineBase.mod.IAttachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "Attachment")
@js.native
abstract class Attachment protected ()
  extends StObject
     with IAttachment {
  def this(name: String) = this()
  
  def copy(): Attachment = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var `type`: AttachmentType = js.native
}
