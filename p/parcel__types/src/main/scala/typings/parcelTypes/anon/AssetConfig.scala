package typings.parcelTypes.anon

import typings.parcelTypes.mod.FilePath
import typings.parcelTypes.mod.MutableAsset
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import typings.parcelTypes.mod.ResolveFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetConfig[ConfigType] extends StObject {
  
  var asset: MutableAsset
  
  var config: ConfigType
  
  var logger: PluginLogger
  
  var options: PluginOptions
  
  def resolve(from: FilePath, to: String): js.Promise[FilePath]
  @JSName("resolve")
  var resolve_Original: ResolveFn
}
object AssetConfig {
  
  inline def apply[ConfigType](
    asset: MutableAsset,
    config: ConfigType,
    logger: PluginLogger,
    options: PluginOptions,
    resolve: (/* from */ FilePath, /* to */ String) => js.Promise[FilePath]
  ): AssetConfig[ConfigType] = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[AssetConfig[ConfigType]]
  }
  
  extension [Self <: AssetConfig[?], ConfigType](x: Self & AssetConfig[ConfigType]) {
    
    inline def setAsset(value: MutableAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ConfigType): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: (/* from */ FilePath, /* to */ String) => js.Promise[FilePath]): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
  }
}
