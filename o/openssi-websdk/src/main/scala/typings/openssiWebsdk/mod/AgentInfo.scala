package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentInfo extends js.Object {
  
  var creation_time: String = js.native
  
  var did: DID = js.native
  
  var expiration: Double = js.native
  
  var metrics: js.Any = js.native
  
  var name: AgentName = js.native
  
  var role: String | Null = js.native
  
  var url: AgentURL = js.native
  
  var verkey: Verkey = js.native
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
    val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any], did = did.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentInfo]
  }
  
  @scala.inline
  implicit class AgentInfoOps[Self <: AgentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreation_time(value: String): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDid(value: DID): Self = this.set("did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: js.Any): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AgentName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: AgentURL): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerkey(value: Verkey): Self = this.set("verkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNull: Self = this.set("role", null)
  }
}
