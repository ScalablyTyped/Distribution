package typings.nodemailerPickupTransport

import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer-pickup-transport", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transport = js.native
  
  @js.native
  trait Options extends StObject {
    
    var directory: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(directory: String): Options = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    }
  }
}
