package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new SingleContactResult.
  * @property a - The first entity involved in the contact.
  * @property b - The second entity involved in the contact.
  * @property localPointA - The point on Entity A where the contact occurred, relative to A.
  * @property localPointB - The point on Entity B where the contact occurred, relative to B.
  * @property pointA - The point on Entity A where the contact occurred, in world space.
  * @property pointB - The point on Entity B where the contact occurred, in world space.
  * @property normal - The normal vector of the contact on Entity B, in world space.
  * @param a - The first entity involved in the contact.
  * @param b - The second entity involved in the contact.
  * @param contactPoint - The contact point between the two entities.
  */
@JSImport("playcanvas", "SingleContactResult")
@js.native
class SingleContactResult protected ()
  extends StObject
     with typings.playcanvas.pc.SingleContactResult {
  def this(
    a: typings.playcanvas.pc.Entity,
    b: typings.playcanvas.pc.Entity,
    contactPoint: typings.playcanvas.pc.ContactPoint
  ) = this()
  
  /**
    * The first entity involved in the contact.
    */
  /* CompleteClass */
  var a: typings.playcanvas.pc.Entity = js.native
  
  /**
    * The second entity involved in the contact.
    */
  /* CompleteClass */
  var b: typings.playcanvas.pc.Entity = js.native
  
  /**
    * The point on Entity A where the contact occurred, relative to A.
    */
  /* CompleteClass */
  var localPointA: typings.playcanvas.pc.Vec3 = js.native
  
  /**
    * The point on Entity B where the contact occurred, relative to B.
    */
  /* CompleteClass */
  var localPointB: typings.playcanvas.pc.Vec3 = js.native
  
  /**
    * The normal vector of the contact on Entity B, in world space.
    */
  /* CompleteClass */
  var normal: typings.playcanvas.pc.Vec3 = js.native
  
  /**
    * The point on Entity A where the contact occurred, in world space.
    */
  /* CompleteClass */
  var pointA: typings.playcanvas.pc.Vec3 = js.native
  
  /**
    * The point on Entity B where the contact occurred, in world space.
    */
  /* CompleteClass */
  var pointB: typings.playcanvas.pc.Vec3 = js.native
}
