package typings.metroFileMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWatcherMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroFileMap.anon.Error
    - typings.metroFileMap.anon.TimeElapsed
    - typings.metroFileMap.anon.PauseReason
  */
  trait HealthCheckResult extends StObject
  object HealthCheckResult {
    
    inline def Error(error: js.Error, timeout: Double): typings.metroFileMap.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], watcher = null)
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typings.metroFileMap.anon.Error]
    }
    
    inline def PauseReason(timeout: Double): typings.metroFileMap.anon.PauseReason = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], pauseReason = null, watcher = null)
      __obj.updateDynamic("type")("timeout")
      __obj.asInstanceOf[typings.metroFileMap.anon.PauseReason]
    }
    
    inline def TimeElapsed(timeElapsed: Double, timeout: Double): typings.metroFileMap.anon.TimeElapsed = {
      val __obj = js.Dynamic.literal(timeElapsed = timeElapsed.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], watcher = null)
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[typings.metroFileMap.anon.TimeElapsed]
    }
  }
}
