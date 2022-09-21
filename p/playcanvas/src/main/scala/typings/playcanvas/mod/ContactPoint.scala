package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object holding the result of a contact between two Entities.
  */
@JSImport("playcanvas", "ContactPoint")
@js.native
open class ContactPoint protected () extends StObject {
  /**
    * Create a new ContactPoint instance.
    *
    * @param {Vec3} [localPoint] - The point on the entity where the contact occurred, relative to
    * the entity.
    * @param {Vec3} [localPointOther] - The point on the other entity where the contact occurred,
    * relative to the other entity.
    * @param {Vec3} [point] - The point on the entity where the contact occurred, in world space.
    * @param {Vec3} [pointOther] - The point on the other entity where the contact occurred, in
    * world space.
    * @param {Vec3} [normal] - The normal vector of the contact on the other entity, in world
    * space.
    * @param {number} [impulse] - The total accumulated impulse applied by the constraint solver
    * during the last sub-step. Describes how hard two objects collide. Defaults to 0.
    * @hideconstructor
    */
  def this(
    localPoint: js.UndefOr[Vec3],
    localPointOther: js.UndefOr[Vec3],
    point: js.UndefOr[Vec3],
    pointOther: js.UndefOr[Vec3],
    normal: js.UndefOr[Vec3],
    impulse: js.UndefOr[Double]
  ) = this()
  
  /**
    * The total accumulated impulse applied by the constraint solver during the last sub-step.
    * Describes how hard two objects collide.
    *
    * @type {number}
    */
  var impulse: Double = js.native
  
  /**
    * The point on the entity where the contact occurred, relative to the entity.
    *
    * @type {Vec3}
    */
  var localPoint: Vec3 = js.native
  
  /**
    * The point on the other entity where the contact occurred, relative to the other entity.
    *
    * @type {Vec3}
    */
  var localPointOther: Vec3 = js.native
  
  /**
    * The normal vector of the contact on the other entity, in world space.
    *
    * @type {Vec3}
    */
  var normal: Vec3 = js.native
  
  /**
    * The point on the entity where the contact occurred, in world space.
    *
    * @type {Vec3}
    */
  var point: Vec3 = js.native
  
  /**
    * The point on the other entity where the contact occurred, in world space.
    *
    * @type {Vec3}
    */
  var pointOther: Vec3 = js.native
}
