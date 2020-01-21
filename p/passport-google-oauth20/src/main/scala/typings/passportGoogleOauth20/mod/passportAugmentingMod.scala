package typings.passportGoogleOauth20.mod

import typings.passportGoogleOauth20.passportGoogleOauth20Strings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("passport", JSImport.Namespace)
@js.native
object passportAugmentingMod extends js.Object {
  @js.native
  trait Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthorizeOptions] extends js.Object {
    @JSName("authenticate")
    def authenticate_google(strategy: google, options: AuthenticateOptionsGoogle): AuthenticateRet = js.native
    @JSName("authenticate")
    def authenticate_google(
      strategy: google,
      options: AuthenticateOptionsGoogle,
      callback: js.Function1[/* repeated */ js.Any, _]
    ): AuthenticateRet = js.native
    @JSName("authorize")
    def authorize_google(strategy: google, options: AuthenticateOptionsGoogle): AuthorizeRet = js.native
    @JSName("authorize")
    def authorize_google(
      strategy: google,
      options: AuthenticateOptionsGoogle,
      callback: js.Function1[/* repeated */ js.Any, _]
    ): AuthorizeRet = js.native
  }
  
}

