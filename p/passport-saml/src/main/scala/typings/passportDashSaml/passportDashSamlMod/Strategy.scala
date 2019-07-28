package typings.passportDashSaml.passportDashSamlMod

import typings.express.expressMod.Request
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(config: SamlConfig, verify: VerifyWithRequest) = this()
  def this(config: SamlConfig, verify: VerifyWithoutRequest) = this()
  def authenticate(req: Request, options: AuthenticateOptions): Unit = js.native
  def authenticate(req: Request, options: AuthorizeOptions): Unit = js.native
  def generateServiceProviderMetadata(): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: String, signingCert: String): String = js.native
  def generateServiceProviderMetadata(decryptionCert: Null, signingCert: String): String = js.native
  def logout(req: Request, callback: js.Function2[/* err */ Error | Null, /* url */ js.UndefOr[String], Unit]): Unit = js.native
}

