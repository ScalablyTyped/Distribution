package typings.passportWindowsauth

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.ldapjs.mod.Client
import typings.node.tlsMod.TlsOptions
import typings.passportWindowsauth.passportWindowsauthBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var bindCredentials: js.UndefOr[String] = js.undefined
    
    var bindDN: js.UndefOr[String] = js.undefined
    
    var binder: js.UndefOr[Client] = js.undefined
    
    var client: js.UndefOr[Client] = js.undefined
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    var reconnect: js.UndefOr[Boolean | FailAfter] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tlsOptions: js.UndefOr[TlsOptions] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Base {
    
    inline def apply(): Base = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBindCredentials(value: String): Self = StObject.set(x, "bindCredentials", value.asInstanceOf[js.Any])
      
      inline def setBindCredentialsUndefined: Self = StObject.set(x, "bindCredentials", js.undefined)
      
      inline def setBindDN(value: String): Self = StObject.set(x, "bindDN", value.asInstanceOf[js.Any])
      
      inline def setBindDNUndefined: Self = StObject.set(x, "bindDN", js.undefined)
      
      inline def setBinder(value: Client): Self = StObject.set(x, "binder", value.asInstanceOf[js.Any])
      
      inline def setBinderUndefined: Self = StObject.set(x, "binder", js.undefined)
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setReconnect(value: Boolean | FailAfter): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTlsOptions(value: TlsOptions): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FailAfter extends StObject {
    
    var failAfter: js.UndefOr[Double] = js.undefined
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
  }
  object FailAfter {
    
    inline def apply(): FailAfter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailAfter]
    }
    
    extension [Self <: FailAfter](x: Self) {
      
      inline def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
      
      inline def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    }
  }
  
  /* Inlined passport-windowsauth.passport-windowsauth.Options & {  passReqToCallback :true} */
  trait OptionspassReqToCallbackt extends StObject {
    
    var getUserNameFromHeader: js.UndefOr[
        js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String]
      ] = js.undefined
    
    var integrated: js.UndefOr[Boolean] = js.undefined
    
    var ldap: js.UndefOr[Base] = js.undefined
    
    var passReqToCallback: js.UndefOr[Boolean] & `true`
    
    var passwordField: js.UndefOr[String] = js.undefined
    
    var usernameField: js.UndefOr[String] = js.undefined
  }
  object OptionspassReqToCallbackt {
    
    inline def apply(passReqToCallback: js.UndefOr[Boolean] & `true`): OptionspassReqToCallbackt = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionspassReqToCallbackt]
    }
    
    extension [Self <: OptionspassReqToCallbackt](x: Self) {
      
      inline def setGetUserNameFromHeader(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = StObject.set(x, "getUserNameFromHeader", js.Any.fromFunction1(value))
      
      inline def setGetUserNameFromHeaderUndefined: Self = StObject.set(x, "getUserNameFromHeader", js.undefined)
      
      inline def setIntegrated(value: Boolean): Self = StObject.set(x, "integrated", value.asInstanceOf[js.Any])
      
      inline def setIntegratedUndefined: Self = StObject.set(x, "integrated", js.undefined)
      
      inline def setLdap(value: Base): Self = StObject.set(x, "ldap", value.asInstanceOf[js.Any])
      
      inline def setLdapUndefined: Self = StObject.set(x, "ldap", js.undefined)
      
      inline def setPassReqToCallback(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      inline def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
      
      inline def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      inline def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
    }
  }
}
