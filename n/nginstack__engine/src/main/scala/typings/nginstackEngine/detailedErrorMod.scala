package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailedErrorMod {
  
  inline def apply(error: String): Unit = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(error: String, solution: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: String, code: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: Unit, code: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: Unit, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: String, code: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: Unit, code: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: Unit, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/error/DetailedError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DetailedError {
    def this(error: String) = this()
    def this(error: String, solution: String) = this()
    def this(error: String, solution: String, details: String) = this()
    def this(error: String, solution: Unit, details: String) = this()
    def this(error: String, solution: String, details: String, code: String) = this()
    def this(error: String, solution: String, details: String, code: Double) = this()
    def this(error: String, solution: String, details: Unit, code: String) = this()
    def this(error: String, solution: String, details: Unit, code: Double) = this()
    def this(error: String, solution: Unit, details: String, code: String) = this()
    def this(error: String, solution: Unit, details: String, code: Double) = this()
    def this(error: String, solution: Unit, details: Unit, code: String) = this()
    def this(error: String, solution: Unit, details: Unit, code: Double) = this()
    
    /* CompleteClass */
    var code: String | Double = js.native
    
    /* CompleteClass */
    var details: String = js.native
    
    /* CompleteClass */
    var error: String = js.native
    
    /* CompleteClass */
    var errorCode: String | Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var solution: String = js.native
    
    /* CompleteClass */
    var sourceLocation: String = js.native
  }
  @JSImport("@nginstack/engine/lib/error/DetailedError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DetailedError extends StObject {
    
    var code: String | Double
    
    var details: String
    
    var error: String
    
    var errorCode: String | Double
    
    var message: String
    
    var solution: String
    
    var sourceLocation: String
  }
  object DetailedError {
    
    inline def apply(
      code: String | Double,
      details: String,
      error: String,
      errorCode: String | Double,
      message: String,
      solution: String,
      sourceLocation: String
    ): DetailedError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedError]
    }
    
    extension [Self <: DetailedError](x: Self) {
      
      inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: String | Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSolution(value: String): Self = StObject.set(x, "solution", value.asInstanceOf[js.Any])
      
      inline def setSourceLocation(value: String): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    }
  }
}
