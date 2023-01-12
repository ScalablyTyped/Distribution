package typings.octokitAuthToken

import typings.octokitAuthToken.distTypesTypesMod.Authentication
import typings.octokitAuthToken.distTypesTypesMod.StrategyInterface
import typings.octokitAuthToken.distTypesTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/auth-token", "createTokenAuth")
  @js.native
  val createTokenAuth: StrategyInterface = js.native
  
  trait Types extends StObject {
    
    var Authentication: typings.octokitAuthToken.distTypesTypesMod.Authentication
    
    var StrategyOptions: Token
  }
  object Types {
    
    inline def apply(Authentication: Authentication, StrategyOptions: Token): Types = {
      val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], StrategyOptions = StrategyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      inline def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
      
      inline def setStrategyOptions(value: Token): Self = StObject.set(x, "StrategyOptions", value.asInstanceOf[js.Any])
    }
  }
}
