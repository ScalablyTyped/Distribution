package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new frustum shape.
  * @example
  * var frustum = new pc.Frustum();
  */
@js.native
trait Frustum extends js.Object {
  /**
    * Tests whether a point is inside the frustum. Note that points lying in a frustum plane are
    * considered to be outside the frustum.
    * @param point - The point to test.
    * @returns True if the point is inside the frustum, false otherwise.
    */
  def containsPoint(point: Vec3): Boolean = js.native
  /**
    * Tests whether a bounding sphere intersects the frustum. If the sphere is outside the frustum,
    * zero is returned. If the sphere intersects the frustum, 1 is returned. If the sphere is completely inside
    * the frustum, 2 is returned. Note that a sphere touching a frustum plane from the outside is considered to
    * be outside the frustum.
    * @param sphere - The sphere to test.
    * @returns 0 if the bounding sphere is outside the frustum, 1 if it intersects the frustum and 2 if
    * it is contained by the frustum.
    */
  def containsSphere(sphere: BoundingSphere): Double = js.native
  /**
    * Updates the frustum shape based on the supplied 4x4 matrix.
    * @example
    * // Create a perspective projection matrix
    * var projMat = pc.Mat4();
    * projMat.setPerspective(45, 16 / 9, 1, 1000);
    *
    * // Create a frustum shape that is represented by the matrix
    * var frustum = new pc.Frustum();
    * frustum.setFromMat4(projMat);
    * @param matrix - The matrix describing the shape of the frustum.
    */
  def setFromMat4(matrix: Mat4): Unit = js.native
}

object Frustum {
  @scala.inline
  def apply(
    containsPoint: Vec3 => Boolean,
    containsSphere: BoundingSphere => Double,
    setFromMat4: Mat4 => Unit
  ): Frustum = {
    val __obj = js.Dynamic.literal(containsPoint = js.Any.fromFunction1(containsPoint), containsSphere = js.Any.fromFunction1(containsSphere), setFromMat4 = js.Any.fromFunction1(setFromMat4))
    __obj.asInstanceOf[Frustum]
  }
  @scala.inline
  implicit class FrustumOps[Self <: Frustum] (val x: Self) extends AnyVal {
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
    def setContainsPoint(value: Vec3 => Boolean): Self = this.set("containsPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setContainsSphere(value: BoundingSphere => Double): Self = this.set("containsSphere", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFromMat4(value: Mat4 => Unit): Self = this.set("setFromMat4", js.Any.fromFunction1(value))
  }
  
}

