package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevertClientResponse extends StObject {
  
  /**
    * Client as it appears in the latest container version since the last workspace synchronization operation. If no client is present, that means the client was deleted in the latest
    * container version.
    */
  var client: js.UndefOr[Client] = js.undefined
}
object RevertClientResponse {
  
  inline def apply(): RevertClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertClientResponse]
  }
  
  extension [Self <: RevertClientResponse](x: Self) {
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
  }
}
