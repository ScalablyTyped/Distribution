package typings.passportSaml

import typings.express.mod.Request_
import typings.passportSaml.mod.SamlConfig
import typings.passportSaml.mod.Strategy
import typings.passportSaml.mod.VerifyWithRequest
import typings.passportSaml.mod.VerifyWithoutRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSamlStrategyMod {
  
  @JSImport("passport-saml/multiSamlStrategy", JSImport.Namespace)
  @js.native
  open class ^ protected () extends MultiSamlStrategy {
    def this(config: MultiSamlConfig, verify: VerifyWithRequest) = this()
    def this(config: MultiSamlConfig, verify: VerifyWithoutRequest) = this()
  }
  
  trait MultiSamlConfig
    extends StObject
       with SamlConfig {
    
    def getSamlOptions(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      callback: SamlOptionsCallback
    ): Unit
  }
  object MultiSamlConfig {
    
    inline def apply(
      getSamlOptions: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], SamlOptionsCallback) => Unit
    ): MultiSamlConfig = {
      val __obj = js.Dynamic.literal(getSamlOptions = js.Any.fromFunction2(getSamlOptions))
      __obj.asInstanceOf[MultiSamlConfig]
    }
    
    extension [Self <: MultiSamlConfig](x: Self) {
      
      inline def setGetSamlOptions(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], SamlOptionsCallback) => Unit
      ): Self = StObject.set(x, "getSamlOptions", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait MultiSamlStrategy extends Strategy {
    
    def generateServiceProviderMetadata(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      decryptionCert: String,
      signingCert: String,
      callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
    ): String = js.native
    def generateServiceProviderMetadata(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      decryptionCert: String,
      signingCert: Null,
      callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
    ): String = js.native
    def generateServiceProviderMetadata(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      decryptionCert: Null,
      signingCert: String,
      callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
    ): String = js.native
    def generateServiceProviderMetadata(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      decryptionCert: Null,
      signingCert: Null,
      callback: js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[String], Unit]
    ): String = js.native
  }
  
  type SamlOptionsCallback = js.Function2[/* err */ js.Error | Null, /* samlOptions */ js.UndefOr[SamlConfig], Unit]
}
