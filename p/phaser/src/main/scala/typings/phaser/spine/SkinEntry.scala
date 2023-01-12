package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkinEntry extends StObject {
  
  var attachment: Attachment
  
  var name: String
  
  var slotIndex: Double
}
object SkinEntry {
  
  inline def apply(attachment: Attachment, name: String, slotIndex: Double): SkinEntry = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkinEntry] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
