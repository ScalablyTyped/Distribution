package typings.ol

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertionErrorMod {
  
  @JSImport("ol/AssertionError", JSImport.Default)
  @js.native
  class default protected () extends AssertionError {
    def this(code: Double) = this()
  }
  
  @js.native
  trait AssertionError extends Error {
    
    /**
      * Error code. The meaning of the code can be found on
      * https://openlayers.org/en/latest/doc/errors/ (replace latest with
      * the version found in the OpenLayers script's header comment if a version
      * other than the latest is used).
      */
    var code: Double = js.native
  }
  object AssertionError {
    
    @scala.inline
    def apply(code: Double, message: String, name: String): AssertionError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionError]
    }
    
    @scala.inline
    implicit class AssertionErrorMutableBuilder[Self <: AssertionError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
