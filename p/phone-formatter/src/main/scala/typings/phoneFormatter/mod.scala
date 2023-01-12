package typings.phoneFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phone-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(digits: String, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(digits.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(digits: String, format: String, options: FormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(digits.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def normalize(digits: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(digits.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait FormatOptions extends StObject {
    
    var normalize: Boolean
  }
  object FormatOptions {
    
    inline def apply(normalize: Boolean): FormatOptions = {
      val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    }
  }
}
