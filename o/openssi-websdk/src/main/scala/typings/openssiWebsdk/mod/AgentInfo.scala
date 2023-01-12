package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentInfo extends StObject {
  
  var creation_time: String
  
  var did: DID
  
  var expiration: Double
  
  var metrics: Any
  
  var name: AgentName
  
  var role: String | Null
  
  var url: AgentURL
  
  var verkey: Verkey
}
object AgentInfo {
  
  inline def apply(
    creation_time: String,
    did: DID,
    expiration: Double,
    metrics: Any,
    name: AgentName,
    url: AgentURL,
    verkey: Verkey
  ): AgentInfo = {
    val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any], did = did.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any], role = null)
    __obj.asInstanceOf[AgentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentInfo] (val x: Self) extends AnyVal {
    
    inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setDid(value: DID): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: Any): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerkey(value: Verkey): Self = StObject.set(x, "verkey", value.asInstanceOf[js.Any])
  }
}
