package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./system.js').ScriptComponentSystem} ScriptComponentSystem */
/** @typedef {import('../../script/script-type.js').ScriptType} ScriptType */
/**
  * The ScriptComponent allows you to extend the functionality of an Entity by attaching your own
  * Script Types defined in JavaScript files to be executed with access to the Entity. For more
  * details on scripting see [Scripting](https://developer.playcanvas.com/user-manual/scripting/).
  *
  * @augments Component
  */
@JSGlobal("pc.ScriptComponent")
@js.native
open class ScriptComponent protected ()
  extends typings.playcanvas.mod.ScriptComponent {
  /**
    * Create a new ScriptComponent instance.
    *
    * @param {ScriptComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.ScriptComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
