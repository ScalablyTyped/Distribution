package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Component
  * @classdesc Components are used to attach functionality on a {@link pc.Entity}. Components
  * can receive update events each frame, and expose properties to the PlayCanvas Editor.
  * @description Base constructor for a Component
  * @param {pc.ComponentSystem} system The ComponentSystem used to create this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to
  * @property {Boolean} enabled Enables or disables the component.
  */
@JSGlobal("pc.Component")
@js.native
class Component protected () extends js.Object {
  def this(system: ComponentSystem, entity: Entity) = this()
  /**
    * Enables or disables the component.
    */
  var enabled: Boolean = js.native
}

