package typings.parcelTypes.anon

import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle[ConfigType] extends StObject {
  
  var bundle: typings.parcelTypes.mod.Bundle
  
  var bundleGraph: typings.parcelTypes.mod.BundleGraph[typings.parcelTypes.mod.Bundle]
  
  var config: ConfigType
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object Bundle {
  
  inline def apply[ConfigType](
    bundle: typings.parcelTypes.mod.Bundle,
    bundleGraph: typings.parcelTypes.mod.BundleGraph[typings.parcelTypes.mod.Bundle],
    config: ConfigType,
    logger: PluginLogger,
    options: PluginOptions
  ): Bundle[ConfigType] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], bundleGraph = bundleGraph.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[ConfigType]]
  }
  
  extension [Self <: Bundle[?], ConfigType](x: Self & Bundle[ConfigType]) {
    
    inline def setBundle(value: typings.parcelTypes.mod.Bundle): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleGraph(value: typings.parcelTypes.mod.BundleGraph[typings.parcelTypes.mod.Bundle]): Self = StObject.set(x, "bundleGraph", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ConfigType): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
