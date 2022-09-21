package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object holding the result of a successful raycast hit.
  */
@JSImport("playcanvas", "RaycastResult")
@js.native
open class RaycastResult protected () extends StObject {
  /**
    * Create a new RaycastResult instance.
    *
    * @param {Entity} entity - The entity that was hit.
    * @param {Vec3} point - The point at which the ray hit the entity in world space.
    * @param {Vec3} normal - The normal vector of the surface where the ray hit in world space.
    * @hideconstructor
    */
  def this(entity: Entity, point: Vec3, normal: Vec3) = this()
  
  /**
    * The entity that was hit.
    *
    * @type {Entity}
    */
  var entity: Entity = js.native
  
  /**
    * The normal vector of the surface where the ray hit in world space.
    *
    * @type {Vec3}
    */
  var normal: Vec3 = js.native
  
  /**
    * The point at which the ray hit the entity in world space.
    *
    * @type {Vec3}
    */
  var point: Vec3 = js.native
}
