package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionRecipient extends StObject {
  
  var name: js.UndefOr[AgentName] = js.native
  
  var url: js.UndefOr[AgentURL] = js.native
}
object ConnectionRecipient {
  
  @scala.inline
  def apply(): ConnectionRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionRecipient]
  }
  
  @scala.inline
  implicit class ConnectionRecipientMutableBuilder[Self <: ConnectionRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
