package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A frustum is a shape that defines the viewing space of a camera. It can be used to determine
  * visibility of points and bounding spheres. Typically, you would not create a Frustum shape
  * directly, but instead query {@link CameraComponent#frustum}.
  */
@JSImport("playcanvas", "Frustum")
@js.native
open class Frustum () extends StObject {
  
  /**
    * Tests whether a point is inside the frustum. Note that points lying in a frustum plane are
    * considered to be outside the frustum.
    *
    * @param {Vec3} point - The point to test.
    * @returns {boolean} True if the point is inside the frustum, false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  
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
  def containsSphere(sphere: BoundingSphere): Double = js.native
  
  var planes: js.Array[js.Array[Any]] = js.native
  
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
  def setFromMat4(matrix: Mat4): Unit = js.native
}
object Frustum {
  
  @JSImport("playcanvas", "Frustum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getPoints(camera: Any, near: Any, far: Any): js.Array[Vec3] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(camera.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vec3]]
}
