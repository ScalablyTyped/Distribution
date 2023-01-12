package typings.parcelTypes.anon

import typings.parcelTypes.mod.MutableBundleGraph
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleGraph[ConfigType] extends StObject {
  
  var bundleGraph: MutableBundleGraph
  
  var config: ConfigType
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object BundleGraph {
  
  inline def apply[ConfigType](bundleGraph: MutableBundleGraph, config: ConfigType, logger: PluginLogger, options: PluginOptions): BundleGraph[ConfigType] = {
    val __obj = js.Dynamic.literal(bundleGraph = bundleGraph.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleGraph[ConfigType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleGraph[?], ConfigType] (val x: Self & BundleGraph[ConfigType]) extends AnyVal {
    
    inline def setBundleGraph(value: MutableBundleGraph): Self = StObject.set(x, "bundleGraph", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ConfigType): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
