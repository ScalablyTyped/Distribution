package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assets extends StObject {
  
  var assets: js.Array[FilePath]
  
  var env: js.Array[String]
  
  var name: String
  
  var paths: js.Array[String]
  
  var wasm: js.Array[FilePath]
}
object Assets {
  
  inline def apply(
    assets: js.Array[FilePath],
    env: js.Array[String],
    name: String,
    paths: js.Array[String],
    wasm: js.Array[FilePath]
  ): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], wasm = wasm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  
  extension [Self <: Assets](x: Self) {
    
    inline def setAssets(value: js.Array[FilePath]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: FilePath*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setWasm(value: js.Array[FilePath]): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
    
    inline def setWasmVarargs(value: FilePath*): Self = StObject.set(x, "wasm", js.Array(value*))
  }
}
