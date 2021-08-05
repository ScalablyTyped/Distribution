package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestRecipient extends StObject {
  
  var did: js.UndefOr[DID] = js.undefined
  
  var name: js.UndefOr[AgentName] = js.undefined
}
object RequestRecipient {
  
  inline def apply(): RequestRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestRecipient]
  }
  
  extension [Self <: RequestRecipient](x: Self) {
    
    inline def setDid(value: DID): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    inline def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
    
    inline def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
