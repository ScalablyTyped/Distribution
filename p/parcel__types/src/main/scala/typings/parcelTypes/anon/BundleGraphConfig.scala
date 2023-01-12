package typings.parcelTypes.anon

import typings.parcelTypes.mod.NamedBundle
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleGraphConfig extends StObject {
  
  var bundle: NamedBundle
  
  var bundleGraph: typings.parcelTypes.mod.BundleGraph[NamedBundle]
  
  var config: typings.parcelTypes.mod.Config
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object BundleGraphConfig {
  
  inline def apply(
    bundle: NamedBundle,
    bundleGraph: typings.parcelTypes.mod.BundleGraph[NamedBundle],
    config: typings.parcelTypes.mod.Config,
    logger: PluginLogger,
    options: PluginOptions
  ): BundleGraphConfig = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], bundleGraph = bundleGraph.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleGraphConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleGraphConfig] (val x: Self) extends AnyVal {
    
    inline def setBundle(value: NamedBundle): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleGraph(value: typings.parcelTypes.mod.BundleGraph[NamedBundle]): Self = StObject.set(x, "bundleGraph", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typings.parcelTypes.mod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
