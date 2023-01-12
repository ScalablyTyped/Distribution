package typings.parcelTypes.anon

import typings.parcelTypes.mod.FilePath
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import typings.parcelTypes.mod.ResolveConfigWithPathFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assets extends StObject {
  
  var assets: js.Array[typings.parcelTypes.mod.Asset]
  
  var logger: PluginLogger
  
  var options: PluginOptions
  
  def resolveConfigWithPath(configNames: js.Array[FilePath], assetFilePath: String): js.Promise[js.UndefOr[FilePath | Null]]
  @JSName("resolveConfigWithPath")
  var resolveConfigWithPath_Original: ResolveConfigWithPathFn
}
object Assets {
  
  inline def apply(
    assets: js.Array[typings.parcelTypes.mod.Asset],
    logger: PluginLogger,
    options: PluginOptions,
    resolveConfigWithPath: (/* configNames */ js.Array[FilePath], /* assetFilePath */ String) => js.Promise[js.UndefOr[FilePath | Null]]
  ): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolveConfigWithPath = js.Any.fromFunction2(resolveConfigWithPath))
    __obj.asInstanceOf[Assets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[typings.parcelTypes.mod.Asset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: typings.parcelTypes.mod.Asset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setResolveConfigWithPath(
      value: (/* configNames */ js.Array[FilePath], /* assetFilePath */ String) => js.Promise[js.UndefOr[FilePath | Null]]
    ): Self = StObject.set(x, "resolveConfigWithPath", js.Any.fromFunction2(value))
  }
}
