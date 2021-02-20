package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkinEntry extends StObject {
  
  var attachment: Attachment = js.native
  
  var name: String = js.native
  
  var slotIndex: Double = js.native
}
object SkinEntry {
  
  @scala.inline
  def apply(attachment: Attachment, name: String, slotIndex: Double): SkinEntry = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinEntry]
  }
  
  @scala.inline
  implicit class SkinEntryMutableBuilder[Self <: SkinEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
