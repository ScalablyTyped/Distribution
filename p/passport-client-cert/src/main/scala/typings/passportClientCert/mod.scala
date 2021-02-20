package typings.passportClientCert

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.tlsMod.Certificate
import typings.passportClientCert.passportClientCertBooleans.`false`
import typings.passportClientCert.passportClientCertBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Strategy * / any */ @JSImport("passport-client-cert", "Strategy")
  @js.native
  class Strategy protected () extends StObject {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
    
    var name: String = js.native
  }
  
  @js.native
  trait PeerCertificate extends StObject {
    
    var fingerprint: String = js.native
    
    var issuer: Certificate = js.native
    
    var issuerInfo: Certificate = js.native
    
    var raw: js.Any = js.native
    
    var serialNumber: String = js.native
    
    var subject: Certificate = js.native
    
    var valid_from: String = js.native
    
    var valid_to: String = js.native
  }
  object PeerCertificate {
    
    @scala.inline
    def apply(
      fingerprint: String,
      issuer: Certificate,
      issuerInfo: Certificate,
      raw: js.Any,
      serialNumber: String,
      subject: Certificate,
      valid_from: String,
      valid_to: String
    ): PeerCertificate = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerInfo = issuerInfo.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerCertificate]
    }
    
    @scala.inline
    implicit class PeerCertificateMutableBuilder[Self <: PeerCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuer(value: Certificate): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerInfo(value: Certificate): Self = StObject.set(x, "issuerInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: Certificate): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid_from(value: String): Self = StObject.set(x, "valid_from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid_to(value: String): Self = StObject.set(x, "valid_to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrategyOptions extends StObject {
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionsWithRequest extends StObject {
    
    var passReqToCallback: `true` = js.native
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(passReqToCallback: `true`): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[VerifyOptions], 
    Unit
  ]
  
  type VerifyFunction = js.Function2[/* clientCert */ PeerCertificate, /* done */ VerifyCallback, Unit]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* clientCert */ PeerCertificate, 
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* done */ VerifyCallback, 
    Unit
  ]
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var message: String = js.native
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(message: String): VerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
