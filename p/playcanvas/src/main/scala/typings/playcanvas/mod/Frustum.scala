package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A frustum is a shape that defines the viewing space of a camera. It can be used to determine
  * visibility of points and bounding spheres. Typically, you would not create a Frustum shape
  * directly, but instead query {@link CameraComponent#frustum}.
  */
trait Frustum extends StObject {
  
  /**
    * Tests whether a point is inside the frustum. Note that points lying in a frustum plane are
    * considered to be outside the frustum.
    *
    * @param {Vec3} point - The point to test.
    * @returns {boolean} True if the point is inside the frustum, false otherwise.
    */
  def containsPoint(point: Vec3): Boolean
  
  /**
    * Tests whether a bounding sphere intersects the frustum. If the sphere is outside the
    * frustum, zero is returned. If the sphere intersects the frustum, 1 is returned. If the
    * sphere is completely inside the frustum, 2 is returned. Note that a sphere touching a
    * frustum plane from the outside is considered to be outside the frustum.
    *
    * @param {BoundingSphere} sphere - The sphere to test.
    * @returns {number} 0 if the bounding sphere is outside the frustum, 1 if it intersects the
    * frustum and 2 if it is contained by the frustum.
    */
  def containsSphere(sphere: BoundingSphere): Double
  
  var planes: js.Array[js.Array[Any]]
  
  /**
    * Updates the frustum shape based on the supplied 4x4 matrix.
    *
    * @param {Mat4} matrix - The matrix describing the shape of the frustum.
    * @example
    * // Create a perspective projection matrix
    * var projMat = pc.Mat4();
    * projMat.setPerspective(45, 16 / 9, 1, 1000);
    *
    * // Create a frustum shape that is represented by the matrix
    * var frustum = new pc.Frustum();
    * frustum.setFromMat4(projMat);
    */
  def setFromMat4(matrix: Mat4): Unit
}
object Frustum {
  
  inline def apply(
    containsPoint: Vec3 => Boolean,
    containsSphere: BoundingSphere => Double,
    planes: js.Array[js.Array[Any]],
    setFromMat4: Mat4 => Unit
  ): Frustum = {
    val __obj = js.Dynamic.literal(containsPoint = js.Any.fromFunction1(containsPoint), containsSphere = js.Any.fromFunction1(containsSphere), planes = planes.asInstanceOf[js.Any], setFromMat4 = js.Any.fromFunction1(setFromMat4))
    __obj.asInstanceOf[Frustum]
  }
  
  extension [Self <: Frustum](x: Self) {
    
    inline def setContainsPoint(value: Vec3 => Boolean): Self = StObject.set(x, "containsPoint", js.Any.fromFunction1(value))
    
    inline def setContainsSphere(value: BoundingSphere => Double): Self = StObject.set(x, "containsSphere", js.Any.fromFunction1(value))
    
    inline def setPlanes(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "planes", value.asInstanceOf[js.Any])
    
    inline def setPlanesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "planes", js.Array(value*))
    
    inline def setSetFromMat4(value: Mat4 => Unit): Self = StObject.set(x, "setFromMat4", js.Any.fromFunction1(value))
  }
}
