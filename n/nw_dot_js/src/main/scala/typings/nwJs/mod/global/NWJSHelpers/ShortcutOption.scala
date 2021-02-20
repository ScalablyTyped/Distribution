package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shortcut option is an object contains initial settings for the Shortcut.
  */
@js.native
trait ShortcutOption extends StObject {
  
  /**
    * {Function} (Optional) A callback when the hotkey is triggered.
    */
  var active: js.Function = js.native
  
  /**
    * {Function} (Optional) A callback when failed to register the hotkey.
    *
    * @param msg {string} Failure message
    */
  def failed(): js.Any = js.native
  def failed(msg: String): js.Any = js.native
  
  /**
    * {string} Key combinations of the shortcut, such as "ctrl+shift+a".
    */
  var key: String = js.native
}
