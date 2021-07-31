package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ContactPoint.
  * @property localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @property localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @property point - The point on the entity where the contact occurred, in world space.
  * @property pointOther - The point on the other entity where the contact occurred, in world space.
  * @property normal - The normal vector of the contact on the other entity, in world space.
  * @param localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @param localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @param point - The point on the entity where the contact occurred, in world space.
  * @param pointOther - The point on the other entity where the contact occurred, in world space.
  * @param normal - The normal vector of the contact on the other entity, in world space.
  */
trait ContactPoint extends StObject {
  
  /**
    * The point on the entity where the contact occurred, relative to the entity.
    */
  var localPoint: Vec3
  
  /**
    * The point on the other entity where the contact occurred, relative to the other entity.
    */
  var localPointOther: Vec3
  
  /**
    * The normal vector of the contact on the other entity, in world space.
    */
  var normal: Vec3
  
  /**
    * The point on the entity where the contact occurred, in world space.
    */
  var point: Vec3
  
  /**
    * The point on the other entity where the contact occurred, in world space.
    */
  var pointOther: Vec3
}
object ContactPoint {
  
  @scala.inline
  def apply(localPoint: Vec3, localPointOther: Vec3, normal: Vec3, point: Vec3, pointOther: Vec3): ContactPoint = {
    val __obj = js.Dynamic.literal(localPoint = localPoint.asInstanceOf[js.Any], localPointOther = localPointOther.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointOther = pointOther.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPoint]
  }
  
  @scala.inline
  implicit class ContactPointMutableBuilder[Self <: ContactPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPoint(value: Vec3): Self = StObject.set(x, "localPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPointOther(value: Vec3): Self = StObject.set(x, "localPointOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: Vec3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Vec3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOther(value: Vec3): Self = StObject.set(x, "pointOther", value.asInstanceOf[js.Any])
  }
}
