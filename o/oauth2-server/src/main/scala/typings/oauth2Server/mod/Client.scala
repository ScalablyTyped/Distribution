package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the client and associated data
  */
trait Client
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var accessTokenLifetime: js.UndefOr[Double] = js.undefined
  
  var grants: String | js.Array[String]
  
  var id: String
  
  var redirectUris: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var refreshTokenLifetime: js.UndefOr[Double] = js.undefined
}
object Client {
  
  @scala.inline
  def apply(grants: String | js.Array[String], id: String): Client = {
    val __obj = js.Dynamic.literal(grants = grants.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessTokenLifetime(value: Double): Self = StObject.set(x, "accessTokenLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenLifetimeUndefined: Self = StObject.set(x, "accessTokenLifetime", js.undefined)
    
    @scala.inline
    def setGrants(value: String | js.Array[String]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantsVarargs(value: String*): Self = StObject.set(x, "grants", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUris(value: String | js.Array[String]): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrisUndefined: Self = StObject.set(x, "redirectUris", js.undefined)
    
    @scala.inline
    def setRedirectUrisVarargs(value: String*): Self = StObject.set(x, "redirectUris", js.Array(value :_*))
    
    @scala.inline
    def setRefreshTokenLifetime(value: Double): Self = StObject.set(x, "refreshTokenLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenLifetimeUndefined: Self = StObject.set(x, "refreshTokenLifetime", js.undefined)
  }
}
