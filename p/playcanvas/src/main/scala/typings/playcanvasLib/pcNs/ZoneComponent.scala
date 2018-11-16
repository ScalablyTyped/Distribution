package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @component
    * @name pc.ZoneComponent
    * @extends pc.Component
    * @class The ZoneComponent allows you to define an area in world space of certain size.
    * This can be used in various ways, such as affecting audio reverb when audiolistener is within zone.
    * Or create culling system with portals between zones to hide whole indoor sections for performance reasons.
    * And many other possible options. Zones are building blocks and meant to be used in many different ways.
    * @param {pc.ZoneComponentSystem} system The ComponentSystem that created this Component
    * @param {pc.Vec3} size The Size of Box of a Zone.
    */
@JSGlobal("pc.ZoneComponent")
@js.native
class ZoneComponent protected () extends Component {
  def this(system: ZoneComponentSystem, entity: Entity) = this()
}

