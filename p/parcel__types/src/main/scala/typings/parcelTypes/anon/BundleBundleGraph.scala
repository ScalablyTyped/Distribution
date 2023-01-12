package typings.parcelTypes.anon

import typings.parcelTypes.mod.NamedBundle
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleBundleGraph[ConfigType] extends StObject {
  
  var bundle: NamedBundle
  
  var bundleGraph: typings.parcelTypes.mod.BundleGraph[NamedBundle]
  
  var config: ConfigType
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object BundleBundleGraph {
  
  inline def apply[ConfigType](
    bundle: NamedBundle,
    bundleGraph: typings.parcelTypes.mod.BundleGraph[NamedBundle],
    config: ConfigType,
    logger: PluginLogger,
    options: PluginOptions
  ): BundleBundleGraph[ConfigType] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], bundleGraph = bundleGraph.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleBundleGraph[ConfigType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleBundleGraph[?], ConfigType] (val x: Self & BundleBundleGraph[ConfigType]) extends AnyVal {
    
    inline def setBundle(value: NamedBundle): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleGraph(value: typings.parcelTypes.mod.BundleGraph[NamedBundle]): Self = StObject.set(x, "bundleGraph", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ConfigType): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
