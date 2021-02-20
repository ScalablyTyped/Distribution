package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononPopoverItem extends StObject {
  
  var text: String = js.native
  
  var value: String = js.native
}
object PhononPopoverItem {
  
  @scala.inline
  def apply(text: String, value: String): PhononPopoverItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPopoverItem]
  }
  
  @scala.inline
  implicit class PhononPopoverItemMutableBuilder[Self <: PhononPopoverItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
