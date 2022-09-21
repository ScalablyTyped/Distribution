package typings.passportClientCert

import typings.express.mod.Request_
import typings.node.tlsMod.Certificate
import typings.passportClientCert.passportClientCertBooleans.`false`
import typings.passportClientCert.passportClientCertBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-client-cert", "Strategy")
  @js.native
  open class Strategy protected () extends StObject {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
    
    var name: String = js.native
  }
  
  trait PeerCertificate extends StObject {
    
    var fingerprint: String
    
    var issuer: Certificate
    
    var issuerInfo: Certificate
    
    var raw: Any
    
    var serialNumber: String
    
    var subject: Certificate
    
    var valid_from: String
    
    var valid_to: String
  }
  object PeerCertificate {
    
    inline def apply(
      fingerprint: String,
      issuer: Certificate,
      issuerInfo: Certificate,
      raw: Any,
      serialNumber: String,
      subject: Certificate,
      valid_from: String,
      valid_to: String
    ): PeerCertificate = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerInfo = issuerInfo.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerCertificate]
    }
    
    extension [Self <: PeerCertificate](x: Self) {
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: Certificate): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerInfo(value: Certificate): Self = StObject.set(x, "issuerInfo", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: Certificate): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setValid_from(value: String): Self = StObject.set(x, "valid_from", value.asInstanceOf[js.Any])
      
      inline def setValid_to(value: String): Self = StObject.set(x, "valid_to", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOptions extends StObject {
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  trait StrategyOptionsWithRequest extends StObject {
    
    var passReqToCallback: `true`
  }
  object StrategyOptionsWithRequest {
    
    inline def apply(): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    extension [Self <: StrategyOptionsWithRequest](x: Self) {
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyCallback = js.Function3[
    /* error */ Any, 
    /* user */ js.UndefOr[Any], 
    /* options */ js.UndefOr[VerifyOptions], 
    Unit
  ]
  
  type VerifyFunction = js.Function2[/* clientCert */ PeerCertificate, /* done */ VerifyCallback, Unit]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* clientCert */ PeerCertificate, 
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* done */ VerifyCallback, 
    Unit
  ]
  
  trait VerifyOptions extends StObject {
    
    var message: String
  }
  object VerifyOptions {
    
    inline def apply(message: String): VerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
