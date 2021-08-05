package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions
  extends StObject
     with AuthenticateOptions
     with AuthorizeOptions
     with TokenOptions {
  
  /**
    * Model object
    */
  var model: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel
}
object ServerOptions {
  
  inline def apply(
    model: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  
  extension [Self <: ServerOptions](x: Self) {
    
    inline def setModel(
      value: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel
    ): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
