package typings.parcelTypes.anon

import typings.node.streamMod.Readable
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var logger: PluginLogger
  
  var options: PluginOptions
  
  var stream: Readable
}
object Logger {
  
  inline def apply(logger: PluginLogger, options: PluginOptions, stream: Readable): Logger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
