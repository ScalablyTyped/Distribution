package typings.passportWindowsauth

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Profile
import typings.passport.mod.Strategy
import typings.passportWindowsauth.anon.Base
import typings.passportWindowsauth.anon.OptionspassReqToCallbackt
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-windowsauth", JSImport.Namespace)
  @js.native
  class ^ protected () extends Strategy {
    def this(verify: Verify) = this()
    def this(options: OptionspassReqToCallbackt, verify: VerifyWithReq) = this()
    def this(options: Options, verify: Verify) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
    
    var integrated: js.UndefOr[Boolean] = js.native
    
    var ldap: js.UndefOr[Base] = js.native
    
    var passReqToCallback: js.UndefOr[Boolean] = js.native
    
    var passwordField: js.UndefOr[String] = js.native
    
    var usernameField: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
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
  
  type Verified = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type Verify = js.Function2[/* profile */ Profile, /* done */ Verified, Unit]
  
  type VerifyWithReq = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* profile */ Profile, 
    /* done */ Verified, 
    Unit
  ]
  
  type windowsauth = Strategy
}
