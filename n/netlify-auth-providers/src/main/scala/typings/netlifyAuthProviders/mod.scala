package typings.netlifyAuthProviders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("netlify-auth-providers", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Authenticator {
    def this(config: Config) = this()
    
    /* CompleteClass */
    override def authenticate(options: AuthenticatorConfig, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  }
  
  trait Authenticator extends StObject {
    
    def authenticate(options: AuthenticatorConfig, cb: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
  }
  object Authenticator {
    
    inline def apply(
      authenticate: (AuthenticatorConfig, js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => Unit
    ): Authenticator = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
      __obj.asInstanceOf[Authenticator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Authenticator] (val x: Self) extends AnyVal {
      
      inline def setAuthenticate(value: (AuthenticatorConfig, js.Function2[/* err */ js.Error, /* data */ Any, Unit]) => Unit): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    }
  }
  
  trait AuthenticatorConfig extends StObject {
    
    var provider: String
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object AuthenticatorConfig {
    
    inline def apply(provider: String): AuthenticatorConfig = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticatorConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticatorConfig] (val x: Self) extends AnyVal {
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var base_url: js.UndefOr[String] = js.undefined
    
    var site_id: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setBase_url(value: String): Self = StObject.set(x, "base_url", value.asInstanceOf[js.Any])
      
      inline def setBase_urlUndefined: Self = StObject.set(x, "base_url", js.undefined)
      
      inline def setSite_id(value: String): Self = StObject.set(x, "site_id", value.asInstanceOf[js.Any])
      
      inline def setSite_idUndefined: Self = StObject.set(x, "site_id", js.undefined)
    }
  }
}
