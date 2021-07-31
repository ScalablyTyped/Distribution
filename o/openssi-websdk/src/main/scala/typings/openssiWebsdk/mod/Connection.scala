package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  var id: String
  
  var local: js.UndefOr[ConnectionAgent] = js.undefined
  
  var properties: Properties
  
  var remote: js.UndefOr[ConnectionAgent] = js.undefined
  
  var role: String
  
  var state: ConnectionState
}
object Connection {
  
  @scala.inline
  def apply(id: String, properties: Properties, role: String, state: ConnectionState): Connection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: ConnectionAgent): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: ConnectionAgent): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ConnectionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
