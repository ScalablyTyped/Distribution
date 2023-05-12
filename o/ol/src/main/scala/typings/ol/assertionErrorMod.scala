package typings.ol

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertionErrorMod {
  
  /**
    * Error object thrown when an assertion failed. This is an ECMA-262 Error,
    * extended with a `code` property.
    * See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error.
    */
  @JSImport("ol/AssertionError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AssertionError {
    /**
      * @param {number} code Error code.
      */
    def this(code: Double) = this()
    
    /**
      * Error code. The meaning of the code can be found on
      * https://openlayers.org/en/latest/doc/errors/ (replace `latest` with
      * the version found in the OpenLayers script's header comment if a version
      * other than the latest is used).
      * @type {number}
      * @deprecated ol/AssertionError and error codes will be removed in v8.0
      * @api
      */
    /* CompleteClass */
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * Error object thrown when an assertion failed. This is an ECMA-262 Error,
    * extended with a `code` property.
    * See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error.
    */
  trait AssertionError
    extends StObject
       with Error {
    
    /**
      * Error code. The meaning of the code can be found on
      * https://openlayers.org/en/latest/doc/errors/ (replace `latest` with
      * the version found in the OpenLayers script's header comment if a version
      * other than the latest is used).
      * @type {number}
      * @deprecated ol/AssertionError and error codes will be removed in v8.0
      * @api
      */
    var code: Double
  }
  object AssertionError {
    
    inline def apply(code: Double, message: String, name: String): AssertionError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssertionError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
