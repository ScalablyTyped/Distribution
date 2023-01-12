package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViaSource extends StObject {
  
  var from: js.Object
  
  var rel: String | Null
  
  var to: js.Object
}
object ViaSource {
  
  inline def apply(from: js.Object, to: js.Object): ViaSource = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], rel = null)
    __obj.asInstanceOf[ViaSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViaSource] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: js.Object): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelNull: Self = StObject.set(x, "rel", null)
    
    inline def setTo(value: js.Object): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
