package typings.passportDashSaml.multiSamlStrategyMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.passportDashSaml.passportDashSamlMod.Strategy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSamlStrategy extends Strategy {
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: String,
    signingCert: String,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: String,
    signingCert: Null,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: Null,
    signingCert: String,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
  def generateServiceProviderMetadata(
    req: Request[ParamsDictionary],
    decryptionCert: Null,
    signingCert: Null,
    callback: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[String], Unit]
  ): String = js.native
}

