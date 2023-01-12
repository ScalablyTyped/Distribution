package typings.parcelTypes.anon

import typings.parcelTypes.mod.FilePath
import typings.parcelTypes.mod.MutableAsset
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import typings.parcelTypes.mod.ResolveFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetsConfig[ConfigType] extends StObject {
  
  var assets: js.Array[MutableAsset]
  
  var config: ConfigType
  
  var logger: PluginLogger
  
  var options: PluginOptions
  
  def resolve(from: FilePath, to: String): js.Promise[FilePath]
  @JSName("resolve")
  var resolve_Original: ResolveFn
}
object AssetsConfig {
  
  inline def apply[ConfigType](
    assets: js.Array[MutableAsset],
    config: ConfigType,
    logger: PluginLogger,
    options: PluginOptions,
    resolve: (/* from */ FilePath, /* to */ String) => js.Promise[FilePath]
  ): AssetsConfig[ConfigType] = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[AssetsConfig[ConfigType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetsConfig[?], ConfigType] (val x: Self & AssetsConfig[ConfigType]) extends AnyVal {
    
    inline def setAssets(value: js.Array[MutableAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: MutableAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setConfig(value: ConfigType): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: (/* from */ FilePath, /* to */ String) => js.Promise[FilePath]): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
  }
}
