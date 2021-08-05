package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionRecipient extends StObject {
  
  var name: js.UndefOr[AgentName] = js.undefined
  
  var url: js.UndefOr[AgentURL] = js.undefined
}
object ConnectionRecipient {
  
  inline def apply(): ConnectionRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionRecipient]
  }
  
  extension [Self <: ConnectionRecipient](x: Self) {
    
    inline def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
