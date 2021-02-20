package typings.nodemailerSendgrid

import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer-sendgrid", JSImport.Namespace)
  @js.native
  def apply(options: SendgridOptions): Transport = js.native
  
  @js.native
  trait SendgridOptions extends StObject {
    
    var apiKey: String = js.native
  }
  object SendgridOptions {
    
    @scala.inline
    def apply(apiKey: String): SendgridOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendgridOptions]
    }
    
    @scala.inline
    implicit class SendgridOptionsMutableBuilder[Self <: SendgridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    }
  }
}
