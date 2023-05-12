package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JointComponent adds a physics joint constraint linking two rigid bodies.
  *
  * @augments Component
  * @ignore
  */
@JSGlobal("pc.JointComponent")
@js.native
open class JointComponent protected ()
  extends typings.playcanvas.mod.JointComponent {
  /**
    * Create a new JointComponent instance.
    *
    * @param {import('./system.js').JointComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.JointComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
