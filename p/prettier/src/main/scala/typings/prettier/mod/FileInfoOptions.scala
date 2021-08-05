package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInfoOptions extends StObject {
  
  var ignorePath: js.UndefOr[String] = js.undefined
  
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  
  var resolveConfig: js.UndefOr[Boolean] = js.undefined
  
  var withNodeModules: js.UndefOr[Boolean] = js.undefined
}
object FileInfoOptions {
  
  inline def apply(): FileInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInfoOptions]
  }
  
  extension [Self <: FileInfoOptions](x: Self) {
    
    inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
    
    inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
    
    inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setResolveConfig(value: Boolean): Self = StObject.set(x, "resolveConfig", value.asInstanceOf[js.Any])
    
    inline def setResolveConfigUndefined: Self = StObject.set(x, "resolveConfig", js.undefined)
    
    inline def setWithNodeModules(value: Boolean): Self = StObject.set(x, "withNodeModules", value.asInstanceOf[js.Any])
    
    inline def setWithNodeModulesUndefined: Self = StObject.set(x, "withNodeModules", js.undefined)
  }
}
