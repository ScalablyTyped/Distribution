package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.CommsConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: CommsConnection
}
object Client {
  
  inline def apply(client: CommsConnection): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: CommsConnection): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
  }
}
