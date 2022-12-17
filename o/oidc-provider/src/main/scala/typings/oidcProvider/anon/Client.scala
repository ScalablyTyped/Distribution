package typings.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.mod.ResourceServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var client: typings.oidcProvider.mod.Client
  
  var resourceServer: js.UndefOr[ResourceServer] = js.undefined
  
  var scope: String
}
object Client {
  
  inline def apply(client: typings.oidcProvider.mod.Client, scope: String): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: typings.oidcProvider.mod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setResourceServer(value: ResourceServer): Self = StObject.set(x, "resourceServer", value.asInstanceOf[js.Any])
    
    inline def setResourceServerUndefined: Self = StObject.set(x, "resourceServer", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
