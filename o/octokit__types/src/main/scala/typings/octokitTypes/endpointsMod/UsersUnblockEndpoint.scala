package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersUnblockEndpoint extends StObject {
  
  var username: String
}
object UsersUnblockEndpoint {
  
  inline def apply(username: String): UsersUnblockEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersUnblockEndpoint]
  }
  
  extension [Self <: UsersUnblockEndpoint](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
