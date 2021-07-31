package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCreateFromManifestResponseData extends StObject {
  
  var client_id: String
  
  var client_secret: String
  
  var created_at: String
  
  var description: String
  
  var external_url: String
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var owner: Avatarurl
  
  var pem: String
  
  var updated_at: String
  
  var webhook_secret: String
}
object AppsCreateFromManifestResponseData {
  
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    created_at: String,
    description: String,
    external_url: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    owner: Avatarurl,
    pem: String,
    updated_at: String,
    webhook_secret: String
  ): AppsCreateFromManifestResponseData = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pem = pem.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], webhook_secret = webhook_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateFromManifestResponseData]
  }
  
  @scala.inline
  implicit class AppsCreateFromManifestResponseDataMutableBuilder[Self <: AppsCreateFromManifestResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhook_secret(value: String): Self = StObject.set(x, "webhook_secret", value.asInstanceOf[js.Any])
  }
}
