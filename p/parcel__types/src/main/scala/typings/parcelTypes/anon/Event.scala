package typings.parcelTypes.anon

import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import typings.parcelTypes.mod.ReporterEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: ReporterEvent
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object Event {
  
  inline def apply(event: ReporterEvent, logger: PluginLogger, options: PluginOptions): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: ReporterEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
