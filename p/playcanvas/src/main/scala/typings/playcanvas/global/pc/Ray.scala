package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An infinite ray.
  */
@JSGlobal("pc.Ray")
@js.native
/**
  * Creates a new Ray instance. The ray is infinite, starting at a given origin and pointing in
  * a given direction.
  *
  * @param {Vec3} [origin] - The starting point of the ray. The constructor takes a reference of
  * this parameter. Defaults to the origin (0, 0, 0).
  * @param {Vec3} [direction] - The direction of the ray. The constructor takes a reference of
  * this parameter. Defaults to a direction down the world negative Z axis (0, 0, -1).
  * @example
  * // Create a new ray starting at the position of this entity and pointing down
  * // the entity's negative Z axis
  * var ray = new pc.Ray(this.entity.getPosition(), this.entity.forward);
  */
open class Ray ()
  extends typings.playcanvas.mod.Ray {
  def this(origin: typings.playcanvas.mod.Vec3) = this()
  def this(origin: Unit, direction: typings.playcanvas.mod.Vec3) = this()
  def this(origin: typings.playcanvas.mod.Vec3, direction: typings.playcanvas.mod.Vec3) = this()
}
