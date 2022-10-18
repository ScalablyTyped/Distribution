package typings.next.anon

import typings.next.distCompiledWebpackWebpackMod.webpack.EntryObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: EntryObject
  
  var edgeServer: EntryObject
  
  var middlewareMatchers: Unit
  
  var server: EntryObject
}
object Client {
  
  inline def apply(client: EntryObject, edgeServer: EntryObject, middlewareMatchers: Unit, server: EntryObject): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], edgeServer = edgeServer.asInstanceOf[js.Any], middlewareMatchers = middlewareMatchers.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: EntryObject): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setEdgeServer(value: EntryObject): Self = StObject.set(x, "edgeServer", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareMatchers(value: Unit): Self = StObject.set(x, "middlewareMatchers", value.asInstanceOf[js.Any])
    
    inline def setServer(value: EntryObject): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
