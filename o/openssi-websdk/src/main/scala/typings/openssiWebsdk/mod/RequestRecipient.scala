package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestRecipient extends StObject {
  
  var did: js.UndefOr[DID] = js.native
  
  var name: js.UndefOr[AgentName] = js.native
}
object RequestRecipient {
  
  @scala.inline
  def apply(): RequestRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestRecipient]
  }
  
  @scala.inline
  implicit class RequestRecipientMutableBuilder[Self <: RequestRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDid(value: DID): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
    
    @scala.inline
    def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
