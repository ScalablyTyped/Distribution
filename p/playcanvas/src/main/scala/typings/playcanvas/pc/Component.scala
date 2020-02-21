package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Component
  * @augments pc.EventHandler
  * @classdesc Components are used to attach functionality on a {@link pc.Entity}. Components
  * can receive update events each frame, and expose properties to the PlayCanvas Editor.
  * @description Base constructor for a Component.
  * @param {pc.ComponentSystem} system - The ComponentSystem used to create this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {pc.ComponentSystem} system The ComponentSystem used to create this Component.
  * @property {pc.Entity} entity The Entity that this Component is attached to.
  * @property {boolean} enabled Enables or disables the component.
  */
@JSGlobal("pc.Component")
@js.native
class Component protected () extends EventHandler {
  def this(system: ComponentSystem, entity: Entity) = this()
  /**
    * Enables or disables the component.
    */
  var enabled: Boolean = js.native
  /**
    * The Entity that this Component is attached to.
    */
  var entity: Entity = js.native
  /**
    * The ComponentSystem used to create this Component.
    */
  var system: ComponentSystem = js.native
}

