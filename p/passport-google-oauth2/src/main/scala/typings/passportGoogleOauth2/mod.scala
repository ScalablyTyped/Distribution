package typings.passportGoogleOauth2

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportGoogleOauth2.anon.Accesstoken
import typings.passportGoogleOauth2.passportGoogleOauth2Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-google-oauth2", "Strategy")
  @js.native
  class Strategy protected () extends StObject {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequestAndParams) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = js.native
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
    
    var name: String = js.native
  }
  
  trait StrategyOptions extends StObject {
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var passReqToCallback: js.UndefOr[`true`] = js.undefined
    
    var proxy: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[js.Array[String]] = js.undefined
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  trait StrategyOptionsWithRequest extends StObject {
    
    var callbackURL: String
    
    var clientID: String
    
    var clientSecret: String
    
    var passReqToCallback: `true`
    
    var scope: js.UndefOr[js.Array[String]] = js.undefined
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[VerifyOptions], 
    Unit
  ]
  
  type VerifyFunction = js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]
  
  type VerifyFunctionWithRequestAndParams = js.Function6[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* params */ Accesstoken, 
    /* profile */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]
  
  trait VerifyOptions extends StObject {
    
    var message: String
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
