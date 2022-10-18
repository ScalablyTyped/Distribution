package typings.playcanvas.global.pc

import typings.playcanvas.mod.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object holding the result of a successful raycast hit.
  */
@JSGlobal("pc.RaycastResult")
@js.native
open class RaycastResult protected ()
  extends typings.playcanvas.mod.RaycastResult {
  /**
    * Create a new RaycastResult instance.
    *
    * @param {Entity} entity - The entity that was hit.
    * @param {Vec3} point - The point at which the ray hit the entity in world space.
    * @param {Vec3} normal - The normal vector of the surface where the ray hit in world space.
    * @hideconstructor
    */
  def this(entity: typings.playcanvas.mod.Entity, point: Vec3, normal: Vec3) = this()
}
