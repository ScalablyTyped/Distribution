package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.metroFileMapStrings.`watch-project`
import typings.metroFileMap.metroFileMapStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.metroFileMap.anon.Command
  - typings.metroFileMap.anon.Type
  - typings.metroFileMap.anon.Warning
*/
trait WatcherStatus extends StObject
object WatcherStatus {
  
  inline def Command(command: `watch-project` | query, timeElapsed: Double): typings.metroFileMap.anon.Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], timeElapsed = timeElapsed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("watchman_slow_command")
    __obj.asInstanceOf[typings.metroFileMap.anon.Command]
  }
  
  inline def Type(command: `watch-project` | query, timeElapsed: Double): typings.metroFileMap.anon.Type = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], timeElapsed = timeElapsed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("watchman_slow_command_complete")
    __obj.asInstanceOf[typings.metroFileMap.anon.Type]
  }
  
  inline def Warning(command: `watch-project` | query, warning: Any): typings.metroFileMap.anon.Warning = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("watchman_warning")
    __obj.asInstanceOf[typings.metroFileMap.anon.Warning]
  }
}
