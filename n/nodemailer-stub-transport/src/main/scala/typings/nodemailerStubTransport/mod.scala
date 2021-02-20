package typings.nodemailerStubTransport

import typings.nodemailer.mod.Transport
import typings.nodemailerStubTransport.mod.StubTransportStatic.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a stub transport.
    * @param {Options} [options] Options.
    * @return {Transport} The stub transport.
    */
  @JSImport("nodemailer-stub-transport", JSImport.Namespace)
  @js.native
  def apply(): Transport = js.native
  @JSImport("nodemailer-stub-transport", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transport = js.native
  
  object StubTransportStatic {
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Specifies a custom error.
        * @type {any}
        */
      var error: js.UndefOr[js.Any] = js.native
      
      /**
        * Value that indicates if the BCC addresses must be included in generated message.
        * @type {boolean}
        */
      var keepBcc: js.UndefOr[Boolean] = js.native
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
        def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        @scala.inline
        def setKeepBcc(value: Boolean): Self = StObject.set(x, "keepBcc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepBccUndefined: Self = StObject.set(x, "keepBcc", js.undefined)
      }
    }
  }
}
