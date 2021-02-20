package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ScriptComponent allows you to extend the functionality of an Entity by attaching your own Script Types defined in JavaScript files
  * to be executed with access to the Entity. For more details on scripting see <a href="//developer.playcanvas.com/user-manual/scripting/">Scripting</a>.
  * @property scripts - An array of all script instances attached to an entity. This Array shall not be modified by developer.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.ScriptComponent")
@js.native
class ScriptComponent protected ()
  extends typings.playcanvas.pc.ScriptComponent {
  def this(system: typings.playcanvas.pc.ScriptComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}
