package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the refresh token and associated data.
  */
@js.native
trait RefreshToken
  extends /* key */ StringDictionary[js.Any] {
  
  var client: Client = js.native
  
  var refreshToken: String = js.native
  
  var refreshTokenExpiresAt: js.UndefOr[Date] = js.native
  
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  
  var user: User = js.native
}
object RefreshToken {
  
  @scala.inline
  def apply(client: Client, refreshToken: String, user: User): RefreshToken = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
  
  @scala.inline
  implicit class RefreshTokenOps[Self <: RefreshToken] (val x: Self) extends AnyVal {
    
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
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiresAt(value: Date): Self = this.set("refreshTokenExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshTokenExpiresAt: Self = this.set("refreshTokenExpiresAt", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
