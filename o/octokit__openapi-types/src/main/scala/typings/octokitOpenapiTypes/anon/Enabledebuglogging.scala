package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabledebuglogging extends StObject {
  
  /**
    * @description Whether to enable debug logging for the re-run.
    * @default false
    */
  var enable_debug_logging: js.UndefOr[Boolean] = js.undefined
}
object Enabledebuglogging {
  
  inline def apply(): Enabledebuglogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabledebuglogging]
  }
  
  extension [Self <: Enabledebuglogging](x: Self) {
    
    inline def setEnable_debug_logging(value: Boolean): Self = StObject.set(x, "enable_debug_logging", value.asInstanceOf[js.Any])
    
    inline def setEnable_debug_loggingUndefined: Self = StObject.set(x, "enable_debug_logging", js.undefined)
  }
}
