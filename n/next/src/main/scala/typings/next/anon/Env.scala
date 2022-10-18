package typings.next.anon

import typings.next.distServerWebTypesMod.NodejsRequestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env extends StObject {
  
  var distDir: String
  
  var edgeFunctionEntry: PickEdgeFunctionDefinitioAssets
  
  var env: js.Array[String]
  
  var name: String
  
  var onWarning: js.UndefOr[js.Function1[/* warn */ js.Error, Unit]] = js.undefined
  
  var paths: js.Array[String]
  
  var request: NodejsRequestData
  
  var useCache: Boolean
}
object Env {
  
  inline def apply(
    distDir: String,
    edgeFunctionEntry: PickEdgeFunctionDefinitioAssets,
    env: js.Array[String],
    name: String,
    paths: js.Array[String],
    request: NodejsRequestData,
    useCache: Boolean
  ): Env = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], edgeFunctionEntry = edgeFunctionEntry.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], useCache = useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  extension [Self <: Env](x: Self) {
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setEdgeFunctionEntry(value: PickEdgeFunctionDefinitioAssets): Self = StObject.set(x, "edgeFunctionEntry", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnWarning(value: /* warn */ js.Error => Unit): Self = StObject.set(x, "onWarning", js.Any.fromFunction1(value))
    
    inline def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setRequest(value: NodejsRequestData): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
  }
}
