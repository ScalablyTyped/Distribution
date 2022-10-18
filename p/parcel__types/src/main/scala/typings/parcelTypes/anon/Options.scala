package typings.parcelTypes.anon

import typings.parcelTypes.mod.FilePath
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import typings.parcelTypes.mod.ResolveConfigFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var asset: typings.parcelTypes.mod.Asset
  
  var logger: PluginLogger
  
  var options: PluginOptions
  
  def resolveConfig(configNames: js.Array[FilePath]): js.Promise[js.UndefOr[FilePath | Null]]
  @JSName("resolveConfig")
  var resolveConfig_Original: ResolveConfigFn
}
object Options {
  
  inline def apply(
    asset: typings.parcelTypes.mod.Asset,
    logger: PluginLogger,
    options: PluginOptions,
    resolveConfig: /* configNames */ js.Array[FilePath] => js.Promise[js.UndefOr[FilePath | Null]]
  ): Options = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolveConfig = js.Any.fromFunction1(resolveConfig))
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAsset(value: typings.parcelTypes.mod.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setResolveConfig(value: /* configNames */ js.Array[FilePath] => js.Promise[js.UndefOr[FilePath | Null]]): Self = StObject.set(x, "resolveConfig", js.Any.fromFunction1(value))
  }
}
