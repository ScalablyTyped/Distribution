package typings.pino.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait redactOptions extends StObject {
  
  var censor: js.UndefOr[String | (js.Function2[/* value */ Any, /* path */ js.Array[String], Any])] = js.undefined
  
  var paths: js.Array[String]
  
  var remove: js.UndefOr[Boolean] = js.undefined
}
object redactOptions {
  
  inline def apply(paths: js.Array[String]): redactOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[redactOptions]
  }
  
  extension [Self <: redactOptions](x: Self) {
    
    inline def setCensor(value: String | (js.Function2[/* value */ Any, /* path */ js.Array[String], Any])): Self = StObject.set(x, "censor", value.asInstanceOf[js.Any])
    
    inline def setCensorFunction2(value: (/* value */ Any, /* path */ js.Array[String]) => Any): Self = StObject.set(x, "censor", js.Any.fromFunction2(value))
    
    inline def setCensorUndefined: Self = StObject.set(x, "censor", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
