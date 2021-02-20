package typings.passportWindowsauth

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.ldapjs.mod.Client
import typings.node.tlsMod.TlsOptions
import typings.passportWindowsauth.passportWindowsauthBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base extends StObject {
    
    var base: js.UndefOr[String] = js.native
    
    var bindCredentials: js.UndefOr[String] = js.native
    
    var bindDN: js.UndefOr[String] = js.native
    
    var binder: js.UndefOr[Client] = js.native
    
    var client: js.UndefOr[Client] = js.native
    
    var connectTimeout: js.UndefOr[Double] = js.native
    
    var idleTimeout: js.UndefOr[Double] = js.native
    
    var maxConnections: js.UndefOr[Double] = js.native
    
    var reconnect: js.UndefOr[Boolean | FailAfter] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var tlsOptions: js.UndefOr[TlsOptions] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Base {
    
    @scala.inline
    def apply(): Base = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBindCredentials(value: String): Self = StObject.set(x, "bindCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindCredentialsUndefined: Self = StObject.set(x, "bindCredentials", js.undefined)
      
      @scala.inline
      def setBindDN(value: String): Self = StObject.set(x, "bindDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindDNUndefined: Self = StObject.set(x, "bindDN", js.undefined)
      
      @scala.inline
      def setBinder(value: Client): Self = StObject.set(x, "binder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinderUndefined: Self = StObject.set(x, "binder", js.undefined)
      
      @scala.inline
      def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      @scala.inline
      def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean | FailAfter): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTlsOptions(value: TlsOptions): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait FailAfter extends StObject {
    
    var failAfter: js.UndefOr[Double] = js.native
    
    var initialDelay: js.UndefOr[Double] = js.native
    
    var maxDelay: js.UndefOr[Double] = js.native
  }
  object FailAfter {
    
    @scala.inline
    def apply(): FailAfter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailAfter]
    }
    
    @scala.inline
    implicit class FailAfterMutableBuilder[Self <: FailAfter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
      
      @scala.inline
      def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    }
  }
  
  /* Inlined passport-windowsauth.passport-windowsauth.Options & {  passReqToCallback :true} */
  @js.native
  trait OptionspassReqToCallbackt extends StObject {
    
    var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
    
    var integrated: js.UndefOr[Boolean] = js.native
    
    var ldap: js.UndefOr[Base] = js.native
    
    var passReqToCallback: js.UndefOr[Boolean] with `true` = js.native
    
    var passwordField: js.UndefOr[String] = js.native
    
    var usernameField: js.UndefOr[String] = js.native
  }
  object OptionspassReqToCallbackt {
    
    @scala.inline
    def apply(passReqToCallback: js.UndefOr[Boolean] with `true`): OptionspassReqToCallbackt = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionspassReqToCallbackt]
    }
    
    @scala.inline
    implicit class OptionspassReqToCallbacktMutableBuilder[Self <: OptionspassReqToCallbackt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUserNameFromHeader(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = StObject.set(x, "getUserNameFromHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUserNameFromHeaderUndefined: Self = StObject.set(x, "getUserNameFromHeader", js.undefined)
      
      @scala.inline
      def setIntegrated(value: Boolean): Self = StObject.set(x, "integrated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegratedUndefined: Self = StObject.set(x, "integrated", js.undefined)
      
      @scala.inline
      def setLdap(value: Base): Self = StObject.set(x, "ldap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLdapUndefined: Self = StObject.set(x, "ldap", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
      
      @scala.inline
      def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
    }
  }
}
