package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorNativeDetailedErrorWrapperMod {
  
  inline def apply(error: Any, solution: Any, details: Any, code: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/error/NativeDetailedErrorWrapper", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NativeDetailedErrorWrapper {
    def this(error: Any, solution: Any, details: Any, code: Any) = this()
    
    /* private */ /* CompleteClass */
    var _code: Any = js.native
    
    /* private */ /* CompleteClass */
    var _details: Any = js.native
    
    /* private */ /* CompleteClass */
    var _error: Any = js.native
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
    
    /* private */ /* CompleteClass */
    var _setName: Any = js.native
    
    /* private */ /* CompleteClass */
    var _solution: Any = js.native
    
    /* private */ /* CompleteClass */
    var _sourceLocation: Any = js.native
    
    /* CompleteClass */
    override def toHtmlString(): Any = js.native
    
    /* CompleteClass */
    override def toSqlString(): Any = js.native
  }
  @JSImport("@nginstack/engine/lib/error/NativeDetailedErrorWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait NativeDetailedErrorWrapper extends StObject {
    
    /* private */ var _code: Any
    
    /* private */ var _details: Any
    
    /* private */ var _error: Any
    
    /* private */ var _name: Any
    
    /* private */ var _setName: Any
    
    /* private */ var _solution: Any
    
    /* private */ var _sourceLocation: Any
    
    def toHtmlString(): Any
    
    def toSqlString(): Any
  }
  object NativeDetailedErrorWrapper {
    
    inline def apply(
      _code: Any,
      _details: Any,
      _error: Any,
      _name: Any,
      _setName: Any,
      _solution: Any,
      _sourceLocation: Any,
      toHtmlString: () => Any,
      toSqlString: () => Any
    ): NativeDetailedErrorWrapper = {
      val __obj = js.Dynamic.literal(_code = _code.asInstanceOf[js.Any], _details = _details.asInstanceOf[js.Any], _error = _error.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], _setName = _setName.asInstanceOf[js.Any], _solution = _solution.asInstanceOf[js.Any], _sourceLocation = _sourceLocation.asInstanceOf[js.Any], toHtmlString = js.Any.fromFunction0(toHtmlString), toSqlString = js.Any.fromFunction0(toSqlString))
      __obj.asInstanceOf[NativeDetailedErrorWrapper]
    }
    
    extension [Self <: NativeDetailedErrorWrapper](x: Self) {
      
      inline def setToHtmlString(value: () => Any): Self = StObject.set(x, "toHtmlString", js.Any.fromFunction0(value))
      
      inline def setToSqlString(value: () => Any): Self = StObject.set(x, "toSqlString", js.Any.fromFunction0(value))
      
      inline def set_code(value: Any): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
      
      inline def set_details(value: Any): Self = StObject.set(x, "_details", value.asInstanceOf[js.Any])
      
      inline def set_error(value: Any): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
      
      inline def set_setName(value: Any): Self = StObject.set(x, "_setName", value.asInstanceOf[js.Any])
      
      inline def set_solution(value: Any): Self = StObject.set(x, "_solution", value.asInstanceOf[js.Any])
      
      inline def set_sourceLocation(value: Any): Self = StObject.set(x, "_sourceLocation", value.asInstanceOf[js.Any])
    }
  }
}
