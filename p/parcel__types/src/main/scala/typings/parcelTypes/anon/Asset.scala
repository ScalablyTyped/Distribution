package typings.parcelTypes.anon

import typings.parcelTypes.mod.ConfigResult
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  var asset: typings.parcelTypes.mod.Asset
  
  var config: ConfigResult | Unit
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object Asset {
  
  inline def apply(
    asset: typings.parcelTypes.mod.Asset,
    config: ConfigResult | Unit,
    logger: PluginLogger,
    options: PluginOptions
  ): Asset = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: typings.parcelTypes.mod.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ConfigResult | Unit): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
