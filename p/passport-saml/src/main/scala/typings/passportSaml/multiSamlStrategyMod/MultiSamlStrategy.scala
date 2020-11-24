package typings.passportSaml.multiSamlStrategyMod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportSaml.mod.Strategy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSamlStrategy extends Strategy {
  
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary, _, _, Query],
    decryptionCert: String,
    signingCert: String,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary, _, _, Query],
    decryptionCert: String,
    signingCert: Null,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary, _, _, Query],
    decryptionCert: Null,
    signingCert: String,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request_[ParamsDictionary, _, _, Query],
    decryptionCert: Null,
    signingCert: Null,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
}
