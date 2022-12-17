package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./system.js').ComponentSystem} ComponentSystem */
/** @typedef {import('../entity.js').Entity} Entity */
/**
  * Components are used to attach functionality on a {@link Entity}. Components can receive update
  * events each frame, and expose properties to the PlayCanvas Editor.
  *
  * @property {boolean} enabled Enables or disables the component.
  * @augments EventHandler
  */
@JSGlobal("pc.Component")
@js.native
open class Component protected ()
  extends typings.playcanvas.mod.Component {
  /**
    * Base constructor for a Component.
    *
    * @param {ComponentSystem} system - The ComponentSystem used to create this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.ComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
object Component {
  
  @JSGlobal("pc.Component")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def buildAccessors(obj: Any, schema: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_buildAccessors")(obj.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
