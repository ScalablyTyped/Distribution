package typings.passportHttp

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import typings.passportHttp.passportHttpBooleans.`false`
import typings.passportHttp.passportHttpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-http", "BasicStrategy")
  @js.native
  class BasicStrategy protected ()
    extends StObject
       with Strategy {
    def this(verify: BasicVerifyFunction) = this()
    def this(options: BasicStrategyOptions[`false`], verify: BasicVerifyFunction) = this()
    def this(options: BasicStrategyOptions[`true`], verify: BasicVerifyFunctionWithRequest) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_BasicStrategy: String = js.native
  }
  
  @JSImport("passport-http", "DigestStrategy")
  @js.native
  class DigestStrategy protected ()
    extends StObject
       with Strategy {
    def this(secret: DigestSecretFunction) = this()
    def this(options: DigestStrategyOptions, secret: DigestSecretFunction) = this()
    def this(secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
    def this(options: DigestStrategyOptions, secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
    
    @JSName("name")
    var name_DigestStrategy: String = js.native
  }
  
  trait BasicStrategyOptions[req /* <: Boolean */] extends StObject {
    
    var passReqToCallback: js.UndefOr[req] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
  }
  object BasicStrategyOptions {
    
    @scala.inline
    def apply[req /* <: Boolean */](): BasicStrategyOptions[req] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicStrategyOptions[req]]
    }
    
    @scala.inline
    implicit class BasicStrategyOptionsMutableBuilder[Self <: BasicStrategyOptions[?], req /* <: Boolean */] (val x: Self & BasicStrategyOptions[req]) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: req): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    }
  }
  
  type BasicVerifyFunction = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
    js.Any
  ]
  
  type BasicVerifyFunctionWithRequest = js.Function4[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
    js.Any
  ]
  
  type DigestSecretFunction = js.Function2[
    /* username */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      Unit
    ], 
    js.Any
  ]
  
  trait DigestStrategyOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var opaque: js.UndefOr[String] = js.undefined
    
    var qop: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
  }
  object DigestStrategyOptions {
    
    @scala.inline
    def apply(): DigestStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DigestStrategyOptions]
    }
    
    @scala.inline
    implicit class DigestStrategyOptionsMutableBuilder[Self <: DigestStrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setDomain(value: String | js.Array[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value :_*))
      
      @scala.inline
      def setOpaque(value: String): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      @scala.inline
      def setQop(value: String | js.Array[String]): Self = StObject.set(x, "qop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQopUndefined: Self = StObject.set(x, "qop", js.undefined)
      
      @scala.inline
      def setQopVarargs(value: String*): Self = StObject.set(x, "qop", js.Array(value :_*))
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    }
  }
  
  type DigestValidateFunction = js.Function2[
    /* params */ DigestValidateOptions, 
    /* done */ js.Function2[/* error */ js.Any, /* valid */ Boolean, Unit], 
    js.Any
  ]
  
  trait DigestValidateOptions extends StObject {
    
    var cnonce: String
    
    var nc: Double
    
    var nonce: String
    
    var opaque: String
  }
  object DigestValidateOptions {
    
    @scala.inline
    def apply(cnonce: String, nc: Double, nonce: String, opaque: String): DigestValidateOptions = {
      val __obj = js.Dynamic.literal(cnonce = cnonce.asInstanceOf[js.Any], nc = nc.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigestValidateOptions]
    }
    
    @scala.inline
    implicit class DigestValidateOptionsMutableBuilder[Self <: DigestValidateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCnonce(value: String): Self = StObject.set(x, "cnonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNc(value: Double): Self = StObject.set(x, "nc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpaque(value: String): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    }
  }
}
