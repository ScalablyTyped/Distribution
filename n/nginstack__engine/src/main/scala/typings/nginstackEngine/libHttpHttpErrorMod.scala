package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpHttpErrorMod {
  
  inline def apply(error: String): Unit = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(error: String, solution: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: Unit, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: Unit, details: Unit, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/http/HttpError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HttpError {
    def this(error: String) = this()
    def this(error: String, solution: String) = this()
    def this(error: String, solution: String, details: String) = this()
    def this(error: String, solution: Unit, details: String) = this()
    def this(error: String, solution: String, details: String, code: Double) = this()
    def this(error: String, solution: String, details: Unit, code: Double) = this()
    def this(error: String, solution: Unit, details: String, code: Double) = this()
    def this(error: String, solution: Unit, details: Unit, code: Double) = this()
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/http/HttpError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BadRequest(error: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("BadRequest")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def BadRequest(error: String, solution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BadRequest")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BadRequest(error: String, solution: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BadRequest")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BadRequest(error: String, solution: Unit, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BadRequest")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Forbidden(error: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Forbidden")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def Forbidden(error: String, solution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Forbidden")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Forbidden(error: String, solution: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Forbidden")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Forbidden(error: String, solution: Unit, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Forbidden")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def NotAcceptable(error: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("NotAcceptable")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def NotAcceptable(error: String, opt_solution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NotAcceptable")(error.asInstanceOf[js.Any], opt_solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def NotAcceptable(error: String, opt_solution: String, opt_details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NotAcceptable")(error.asInstanceOf[js.Any], opt_solution.asInstanceOf[js.Any], opt_details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def NotAcceptable(error: String, opt_solution: Unit, opt_details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NotAcceptable")(error.asInstanceOf[js.Any], opt_solution.asInstanceOf[js.Any], opt_details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def NotFound(error: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("NotFound")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def NotFound(error: String, solution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NotFound")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def NotFound(error: String, solution: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NotFound")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def NotFound(error: String, solution: Unit, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NotFound")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ServiceUnavailable(error: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceUnavailable")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ServiceUnavailable(error: String, solution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ServiceUnavailable")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ServiceUnavailable(error: String, solution: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ServiceUnavailable")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ServiceUnavailable(error: String, solution: Unit, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ServiceUnavailable")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Unauthorized(error: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Unauthorized")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def Unauthorized(error: String, solution: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Unauthorized")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Unauthorized(error: String, solution: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Unauthorized")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Unauthorized(error: String, solution: Unit, details: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Unauthorized")(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HttpError extends StObject {
    
    /* private */ var _name: Any
  }
  object HttpError {
    
    inline def apply(_name: Any): HttpError = {
      val __obj = js.Dynamic.literal(_name = _name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpError] (val x: Self) extends AnyVal {
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
