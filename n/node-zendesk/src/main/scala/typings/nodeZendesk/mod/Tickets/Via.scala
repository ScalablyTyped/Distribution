package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Via extends StObject {
  
  var channel: ViaChannel
  
  var source: ViaSource
}
object Via {
  
  inline def apply(channel: ViaChannel, source: ViaSource): Via = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Via]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Via] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: ViaChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ViaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
