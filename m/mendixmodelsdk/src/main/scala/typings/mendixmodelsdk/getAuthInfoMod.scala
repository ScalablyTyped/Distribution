package typings.mendixmodelsdk

import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAuthInfoMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/getAuthInfo", "getAuthInfo")
  @js.native
  def getAuthInfo(config: ISdkConfig): IAuthInfo = js.native
  
  @js.native
  trait IAuthInfo extends StObject {
    
    var openid: js.UndefOr[String] = js.native
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object IAuthInfo {
    
    @scala.inline
    def apply(password: String, username: String): IAuthInfo = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAuthInfo]
    }
    
    @scala.inline
    implicit class IAuthInfoMutableBuilder[Self <: IAuthInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
