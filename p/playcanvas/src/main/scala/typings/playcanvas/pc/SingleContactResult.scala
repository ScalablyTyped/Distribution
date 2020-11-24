package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SingleContactResult extends js.Object {
  
  /**
    * The first entity involved in the contact.
    */
  var a: Entity = js.native
  
  /**
    * The second entity involved in the contact.
    */
  var b: Entity = js.native
  
  /**
    * The point on Entity A where the contact occurred, relative to A.
    */
  var localPointA: Vec3 = js.native
  
  /**
    * The point on Entity B where the contact occurred, relative to B.
    */
  var localPointB: Vec3 = js.native
  
  /**
    * The normal vector of the contact on Entity B, in world space.
    */
  var normal: Vec3 = js.native
  
  /**
    * The point on Entity A where the contact occurred, in world space.
    */
  var pointA: Vec3 = js.native
  
  /**
    * The point on Entity B where the contact occurred, in world space.
    */
  var pointB: Vec3 = js.native
}
object SingleContactResult {
  
  @scala.inline
  def apply(
    a: Entity,
    b: Entity,
    localPointA: Vec3,
    localPointB: Vec3,
    normal: Vec3,
    pointA: Vec3,
    pointB: Vec3
  ): SingleContactResult = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], localPointA = localPointA.asInstanceOf[js.Any], localPointB = localPointB.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], pointA = pointA.asInstanceOf[js.Any], pointB = pointB.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleContactResult]
  }
  
  @scala.inline
  implicit class SingleContactResultOps[Self <: SingleContactResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setA(value: Entity): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Entity): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPointA(value: Vec3): Self = this.set("localPointA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPointB(value: Vec3): Self = this.set("localPointB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: Vec3): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointA(value: Vec3): Self = this.set("pointA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointB(value: Vec3): Self = this.set("pointB", value.asInstanceOf[js.Any])
  }
}
