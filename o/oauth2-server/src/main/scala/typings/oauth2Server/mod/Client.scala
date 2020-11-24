package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the client and associated data
  */
@js.native
trait Client
  extends /* key */ StringDictionary[js.Any] {
  
  var accessTokenLifetime: js.UndefOr[Double] = js.native
  
  var grants: String | js.Array[String] = js.native
  
  var id: String = js.native
  
  var redirectUris: js.UndefOr[String | js.Array[String]] = js.native
  
  var refreshTokenLifetime: js.UndefOr[Double] = js.native
}
object Client {
  
  @scala.inline
  def apply(grants: String | js.Array[String], id: String): Client = {
    val __obj = js.Dynamic.literal(grants = grants.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
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
    def setGrantsVarargs(value: String*): Self = this.set("grants", js.Array(value :_*))
    
    @scala.inline
    def setGrants(value: String | js.Array[String]): Self = this.set("grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenLifetime(value: Double): Self = this.set("accessTokenLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessTokenLifetime: Self = this.set("accessTokenLifetime", js.undefined)
    
    @scala.inline
    def setRedirectUrisVarargs(value: String*): Self = this.set("redirectUris", js.Array(value :_*))
    
    @scala.inline
    def setRedirectUris(value: String | js.Array[String]): Self = this.set("redirectUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUris: Self = this.set("redirectUris", js.undefined)
    
    @scala.inline
    def setRefreshTokenLifetime(value: Double): Self = this.set("refreshTokenLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshTokenLifetime: Self = this.set("refreshTokenLifetime", js.undefined)
  }
}
