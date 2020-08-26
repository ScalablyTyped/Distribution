package typings.oauth2Server.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions
  extends AuthenticateOptions
     with AuthorizeOptions
     with TokenOptions {
  /**
    * Model object
    */
  var model: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel = js.native
}

object ServerOptions {
  @scala.inline
  def apply(
    model: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def setModel(
      value: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel
    ): Self = this.set("model", value.asInstanceOf[js.Any])
  }
  
}

