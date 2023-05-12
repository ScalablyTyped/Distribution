package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object holding the result of a contact between two rigid bodies.
  */
@JSImport("playcanvas", "SingleContactResult")
@js.native
open class SingleContactResult protected () extends StObject {
  /**
    * Create a new SingleContactResult instance.
    *
    * @param {import('../../entity.js').Entity} a - The first entity involved in the contact.
    * @param {import('../../entity.js').Entity} b - The second entity involved in the contact.
    * @param {ContactPoint} contactPoint - The contact point between the two entities.
    * @hideconstructor
    */
  def this(a: Entity, b: Entity, contactPoint: ContactPoint, args: Any*) = this()
  
  /**
    * The first entity involved in the contact.
    *
    * @type {import('../../entity.js').Entity}
    */
  var a: Entity = js.native
  
  /**
    * The second entity involved in the contact.
    *
    * @type {import('../../entity.js').Entity}
    */
  var b: Entity = js.native
  
  /**
    * The total accumulated impulse applied by the constraint solver during the last
    * sub-step. Describes how hard two bodies collided.
    *
    * @type {number}
    */
  var impulse: Double = js.native
  
  /**
    * The point on Entity A where the contact occurred, relative to A.
    *
    * @type {Vec3}
    */
  var localPointA: Vec3 = js.native
  
  /**
    * The point on Entity B where the contact occurred, relative to B.
    *
    * @type {Vec3}
    */
  var localPointB: Vec3 = js.native
  
  /**
    * The normal vector of the contact on Entity B, in world space.
    *
    * @type {Vec3}
    */
  var normal: Vec3 = js.native
  
  /**
    * The point on Entity A where the contact occurred, in world space.
    *
    * @type {Vec3}
    */
  var pointA: Vec3 = js.native
  
  /**
    * The point on Entity B where the contact occurred, in world space.
    *
    * @type {Vec3}
    */
  var pointB: Vec3 = js.native
}
