package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "ScriptLegacyComponent")
@js.native
open class ScriptLegacyComponent protected () extends Component {
  def this(system: Any, entity: Any) = this()
  
  def _loadFromCache(urls: Any): Boolean = js.native
  
  def _loadScripts(urls: Any): Unit = js.native
  
  def _updateScriptAttributes(oldValue: Any, newValue: Any): Boolean = js.native
  
  def onSetScripts(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def send(name: Any, functionName: Any, args: Any*): Any = js.native
}
