package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./system.js').ScriptComponentSystem} ScriptComponentSystem */
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
object ScriptComponent {
  
  /* static member */
  object scriptMethods {
    
    @JSGlobal("pc.ScriptComponent.scriptMethods")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("pc.ScriptComponent.scriptMethods.initialize")
    @js.native
    def initialize: String = js.native
    inline def initialize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.ScriptComponent.scriptMethods.postInitialize")
    @js.native
    def postInitialize: String = js.native
    inline def postInitialize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postInitialize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.ScriptComponent.scriptMethods.postUpdate")
    @js.native
    def postUpdate: String = js.native
    inline def postUpdate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postUpdate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.ScriptComponent.scriptMethods.swap")
    @js.native
    def swap: String = js.native
    inline def swap_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("swap")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.ScriptComponent.scriptMethods.update")
    @js.native
    def update: String = js.native
    inline def update_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
  }
}
