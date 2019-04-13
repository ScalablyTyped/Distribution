package typings
package passportDashSamlLib.passportDashSamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.Strategy {
  def this(config: SamlConfig, verify: VerifyWithRequest) = this()
  def this(config: SamlConfig, verify: VerifyWithoutRequest) = this()
  def authenticate(req: expressLib.expressMod.Request, options: AuthenticateOptions): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.Request, options: AuthorizeOptions): scala.Unit = js.native
  def generateServiceProviderMetadata(): java.lang.String = js.native
  def generateServiceProviderMetadata(decryptionCert: java.lang.String): java.lang.String = js.native
  def generateServiceProviderMetadata(decryptionCert: java.lang.String, signingCert: java.lang.String): java.lang.String = js.native
  def logout(
    req: expressLib.expressMod.Request,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

