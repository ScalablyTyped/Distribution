package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Via extends StObject {
  
  var channel: ViaChannel = js.native
  
  var source: ViaSource = js.native
}
object Via {
  
  @scala.inline
  def apply(channel: ViaChannel, source: ViaSource): Via = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Via]
  }
  
  @scala.inline
  implicit class ViaMutableBuilder[Self <: Via] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: ViaChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ViaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
