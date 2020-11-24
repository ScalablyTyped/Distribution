package typings.openapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationUrl extends js.Object {
  
  var authorizationUrl: String = js.native
  
  var refreshUrl: js.UndefOr[String] = js.native
  
  var scopes: StringDictionary[String] = js.native
}
object AuthorizationUrl {
  
  @scala.inline
  def apply(authorizationUrl: String, scopes: StringDictionary[String]): AuthorizationUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationUrl]
  }
  
  @scala.inline
  implicit class AuthorizationUrlOps[Self <: AuthorizationUrl] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: StringDictionary[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUrl(value: String): Self = this.set("refreshUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshUrl: Self = this.set("refreshUrl", js.undefined)
  }
}
