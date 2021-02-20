package typings.phoneFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phone-formatter", "format")
  @js.native
  def format(digits: String, format: String): String = js.native
  @JSImport("phone-formatter", "format")
  @js.native
  def format(digits: String, format: String, options: FormatOptions): String = js.native
  
  @JSImport("phone-formatter", "normalize")
  @js.native
  def normalize(digits: String): String = js.native
  
  @js.native
  trait FormatOptions extends StObject {
    
    var normalize: Boolean = js.native
  }
  object FormatOptions {
    
    @scala.inline
    def apply(normalize: Boolean): FormatOptions = {
      val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    }
  }
}
