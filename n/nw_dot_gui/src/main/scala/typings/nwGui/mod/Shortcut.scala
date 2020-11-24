package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nw.gui", "Shortcut")
@js.native
class Shortcut protected () extends EventEmitter {
  def this(option: ShortcutOption) = this()
  
  var active: js.Function = js.native
  
  var failed: js.Function = js.native
  
  var key: String = js.native
}
