package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ZoneComponent allows you to define an area in world space of certain size. This can be used
  * in various ways, such as affecting audio reverb when {@link AudioListenerComponent} is within
  * zone. Or create culling system with portals between zones to hide whole indoor sections for
  * performance reasons. And many other possible options. Zones are building blocks and meant to be
  * used in many different ways.
  *
  * @augments Component
  * @ignore
  */
@JSGlobal("pc.ZoneComponent")
@js.native
open class ZoneComponent protected ()
  extends typings.playcanvas.mod.ZoneComponent {
  /**
    * Create a new ZoneComponent instance.
    *
    * @param {import('./system.js').ZoneComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.ZoneComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
