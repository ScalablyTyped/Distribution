package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Component
  * @extends pc.EventHandler
  * @classdesc Components are used to attach functionality on a {@link pc.Entity}. Components
  * can receive update events each frame, and expose properties to the PlayCanvas Editor.
  * @description Base constructor for a Component
  * @param {pc.ComponentSystem} system The ComponentSystem used to create this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to
  * @property {pc.ComponentSystem} system The ComponentSystem used to create this Component
  * @property {pc.Entity} entity The Entity that this Component is attached to
  * @property {Boolean} enabled Enables or disables the component.
  */
@JSImport("playcanvas", "Component")
@js.native
class Component protected ()
  extends typings.playcanvas.pc.Component {
  def this(system: typings.playcanvas.pc.ComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

