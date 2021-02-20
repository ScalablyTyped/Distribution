package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Clientid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthorizationsGetGrantResponseData extends StObject {
  
  var app: Clientid = js.native
  
  var created_at: String = js.native
  
  var id: Double = js.native
  
  var scopes: js.Array[String] = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object OauthAuthorizationsGetGrantResponseData {
  
  @scala.inline
  def apply(
    app: Clientid,
    created_at: String,
    id: Double,
    scopes: js.Array[String],
    updated_at: String,
    url: String
  ): OauthAuthorizationsGetGrantResponseData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetGrantResponseData]
  }
  
  @scala.inline
  implicit class OauthAuthorizationsGetGrantResponseDataMutableBuilder[Self <: OauthAuthorizationsGetGrantResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: Clientid): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
