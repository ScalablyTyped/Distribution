package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkinEntry extends js.Object {
  
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
  implicit class SkinEntryOps[Self <: SkinEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachment(value: Attachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotIndex(value: Double): Self = this.set("slotIndex", value.asInstanceOf[js.Any])
  }
}
