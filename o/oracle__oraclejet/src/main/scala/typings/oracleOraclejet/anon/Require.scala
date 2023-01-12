package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Require extends StObject {
  
  var require: js.UndefOr[
    (js.Function1[/* module */ String, Any]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[Any], 
      /* errback */ js.UndefOr[Any], 
      Unit
    ])
  ] = js.undefined
  
  var viewPath: String
}
object Require {
  
  inline def apply(viewPath: String): Require = {
    val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Require]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Require] (val x: Self) extends AnyVal {
    
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
    
    inline def setViewPath(value: String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
  }
}
