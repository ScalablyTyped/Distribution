package typings.passportSaml

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportSaml.mod.SamlConfig
import typings.passportSaml.mod.Strategy
import typings.passportSaml.mod.VerifyWithRequest
import typings.passportSaml.mod.VerifyWithoutRequest
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSamlStrategyMod {
  
  @JSImport("passport-saml/multiSamlStrategy", JSImport.Namespace)
  @js.native
  class ^ protected () extends MultiSamlStrategy {
    def this(config: MultiSamlConfig, verify: VerifyWithRequest) = this()
    def this(config: MultiSamlConfig, verify: VerifyWithoutRequest) = this()
  }
  
  @js.native
  trait MultiSamlConfig extends SamlConfig {
    
    def getSamlOptions(req: Request_[ParamsDictionary, _, _, Query], callback: SamlOptionsCallback): Unit = js.native
  }
  object MultiSamlConfig {
    
    @scala.inline
    def apply(getSamlOptions: (Request_[ParamsDictionary, _, _, Query], SamlOptionsCallback) => Unit): MultiSamlConfig = {
      val __obj = js.Dynamic.literal(getSamlOptions = js.Any.fromFunction2(getSamlOptions))
      __obj.asInstanceOf[MultiSamlConfig]
    }
    
    @scala.inline
    implicit class MultiSamlConfigMutableBuilder[Self <: MultiSamlConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSamlOptions(value: (Request_[ParamsDictionary, _, _, Query], SamlOptionsCallback) => Unit): Self = StObject.set(x, "getSamlOptions", js.Any.fromFunction2(value))
    }
  }
  
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
  
  type SamlOptionsCallback = js.Function2[/* err */ Error | Null, /* samlOptions */ js.UndefOr[SamlConfig], Unit]
}
