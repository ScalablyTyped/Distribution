package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentInfo extends StObject {
  
  var creation_time: String
  
  var did: DID
  
  var expiration: Double
  
  var metrics: js.Any
  
  var name: AgentName
  
  var role: String | Null
  
  var url: AgentURL
  
  var verkey: Verkey
}
object AgentInfo {
  
  @scala.inline
  def apply(
    creation_time: String,
    did: DID,
    expiration: Double,
    metrics: js.Any,
    name: AgentName,
    url: AgentURL,
    verkey: Verkey
  ): AgentInfo = {
    val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any], did = did.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any], role = null)
    __obj.asInstanceOf[AgentInfo]
  }
  
  @scala.inline
  implicit class AgentInfoMutableBuilder[Self <: AgentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDid(value: DID): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: js.Any): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNull: Self = StObject.set(x, "role", null)
    
    @scala.inline
    def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerkey(value: Verkey): Self = StObject.set(x, "verkey", value.asInstanceOf[js.Any])
  }
}
