package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Console APIs
  * Currently interact with stdout.
  */
@js.native
trait Console_ extends StObject {
  
  def clear(): Unit = js.native
  
  /**
    * Executes a command using the legacy console REPL. This should not be used
    * by plugins, and exists only for servers to continue using old commands until
    * all functionality can be accomplished with this scripting API.
    *
    * @deprecated
    * @param command The command and arguments to execute.
    */
  def executeLegacy(command: String): Unit = js.native
  
  def log(message: Any, optionalParams: Any*): Unit = js.native
  def log(message: Unit, optionalParams: Any*): Unit = js.native
}
