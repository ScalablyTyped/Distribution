package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeFunctionEntry extends StObject {
  
  var distDir: String
  
  var edgeFunctionEntry: Any
  
  var env: js.Array[String]
  
  var name: String
  
  var onWarning: js.UndefOr[Any] = js.undefined
  
  var paths: js.Array[String]
  
  var useCache: Boolean
}
object EdgeFunctionEntry {
  
  inline def apply(
    distDir: String,
    edgeFunctionEntry: Any,
    env: js.Array[String],
    name: String,
    paths: js.Array[String],
    useCache: Boolean
  ): EdgeFunctionEntry = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], edgeFunctionEntry = edgeFunctionEntry.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], useCache = useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeFunctionEntry]
  }
  
  extension [Self <: EdgeFunctionEntry](x: Self) {
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setEdgeFunctionEntry(value: Any): Self = StObject.set(x, "edgeFunctionEntry", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnWarning(value: Any): Self = StObject.set(x, "onWarning", value.asInstanceOf[js.Any])
    
    inline def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
  }
}
