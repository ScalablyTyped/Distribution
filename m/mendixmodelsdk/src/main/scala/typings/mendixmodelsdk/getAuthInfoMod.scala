package typings.mendixmodelsdk

import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.mendixmodelsdkStrings.basic
import typings.mendixmodelsdk.mendixmodelsdkStrings.pat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAuthInfoMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/getAuthInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuthInfo(config: ISdkConfig): AuthInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthInfo")(config.asInstanceOf[js.Any]).asInstanceOf[AuthInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.getAuthInfoMod.IBasicAuthInfo
    - typings.mendixmodelsdk.getAuthInfoMod.IPATAuthInfo
  */
  trait AuthInfo extends StObject
  object AuthInfo {
    
    inline def IBasicAuthInfo(password: String, username: String): typings.mendixmodelsdk.getAuthInfoMod.IBasicAuthInfo = {
      val __obj = js.Dynamic.literal(auth = "basic", password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mendixmodelsdk.getAuthInfoMod.IBasicAuthInfo]
    }
    
    inline def IPATAuthInfo(personalAccessToken: String): typings.mendixmodelsdk.getAuthInfoMod.IPATAuthInfo = {
      val __obj = js.Dynamic.literal(auth = "pat", personalAccessToken = personalAccessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mendixmodelsdk.getAuthInfoMod.IPATAuthInfo]
    }
  }
  
  trait IBasicAuthInfo
    extends StObject
       with AuthInfo {
    
    var auth: basic
    
    var openid: js.UndefOr[String] = js.undefined
    
    var password: String
    
    var username: String
  }
  object IBasicAuthInfo {
    
    inline def apply(password: String, username: String): IBasicAuthInfo = {
      val __obj = js.Dynamic.literal(auth = "basic", password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBasicAuthInfo]
    }
    
    extension [Self <: IBasicAuthInfo](x: Self) {
      
      inline def setAuth(value: basic): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
      
      inline def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPATAuthInfo
    extends StObject
       with AuthInfo {
    
    var auth: pat
    
    var personalAccessToken: String
  }
  object IPATAuthInfo {
    
    inline def apply(personalAccessToken: String): IPATAuthInfo = {
      val __obj = js.Dynamic.literal(auth = "pat", personalAccessToken = personalAccessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPATAuthInfo]
    }
    
    extension [Self <: IPATAuthInfo](x: Self) {
      
      inline def setAuth(value: pat): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setPersonalAccessToken(value: String): Self = StObject.set(x, "personalAccessToken", value.asInstanceOf[js.Any])
    }
  }
}
