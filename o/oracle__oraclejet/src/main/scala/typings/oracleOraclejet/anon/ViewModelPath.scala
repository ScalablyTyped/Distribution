package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModelPath extends StObject {
  
  var require: js.UndefOr[
    (js.Function1[/* module */ String, Any]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[Any], 
      /* errback */ js.UndefOr[Any], 
      Unit
    ])
  ] = js.undefined
  
  var viewModelPath: String
}
object ViewModelPath {
  
  inline def apply(viewModelPath: String): ViewModelPath = {
    val __obj = js.Dynamic.literal(viewModelPath = viewModelPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModelPath]
  }
  
  extension [Self <: ViewModelPath](x: Self) {
    
    inline def setRequire(
      value: (js.Function1[/* module */ String, Any]) | (js.Function3[
          /* modules */ js.Array[String], 
          /* ready */ js.UndefOr[Any], 
          /* errback */ js.UndefOr[Any], 
          Unit
        ])
    ): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireFunction1(value: /* module */ String => Any): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
    
    inline def setRequireFunction3(
      value: (/* modules */ js.Array[String], /* ready */ js.UndefOr[Any], /* errback */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "require", js.Any.fromFunction3(value))
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setViewModelPath(value: String): Self = StObject.set(x, "viewModelPath", value.asInstanceOf[js.Any])
  }
}
