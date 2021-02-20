package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViaSource extends StObject {
  
  var from: js.Object = js.native
  
  var rel: String | Null = js.native
  
  var to: js.Object = js.native
}
object ViaSource {
  
  @scala.inline
  def apply(from: js.Object, to: js.Object): ViaSource = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViaSource]
  }
  
  @scala.inline
  implicit class ViaSourceMutableBuilder[Self <: ViaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: js.Object): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelNull: Self = StObject.set(x, "rel", null)
    
    @scala.inline
    def setTo(value: js.Object): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
