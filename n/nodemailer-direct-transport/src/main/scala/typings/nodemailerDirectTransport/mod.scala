package typings.nodemailerDirectTransport

import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer-direct-transport", JSImport.Namespace)
  @js.native
  def apply(options: DirectOptions): Transport = js.native
  
  @js.native
  trait AuthOptions extends StObject {
    
    var pass: js.UndefOr[String] = js.native
    
    var user: js.UndefOr[String] = js.native
    
    var xoauth2: js.UndefOr[js.Any] = js.native
  }
  object AuthOptions {
    
    @scala.inline
    def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      @scala.inline
      def setXoauth2(value: js.Any): Self = StObject.set(x, "xoauth2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoauth2Undefined: Self = StObject.set(x, "xoauth2", js.undefined)
    }
  }
  
  @js.native
  trait DirectOptions extends StObject {
    
    /**
      * if true, the connection emits all traffic between client and server as 'log' events
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * optional hostname of the client, used for identifying to the server
      */
    var name: js.UndefOr[String] = js.native
  }
  object DirectOptions {
    
    @scala.inline
    def apply(): DirectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectOptions]
    }
    
    @scala.inline
    implicit class DirectOptionsMutableBuilder[Self <: DirectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
