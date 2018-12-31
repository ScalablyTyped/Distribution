package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Camera")
@js.native
class Camera ()
  extends p5Lib.p5Mod.p5Ns.Camera {
  /**
    *   Sets a camera's position and orientation. This is
    *   equivalent to calling camera() on a p5.Camera
    *   object.
    */
  /* CompleteClass */
  override def camera(): scala.Unit = js.native
  /**
    *   Reorients the camera to look at a position in
    *   world space.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  /* CompleteClass */
  override def lookAt(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
    *   Move camera along its local axes while maintaining
    *   current camera orientation.
    *   @param x amount to move along camera's left-right
    *   axis
    *   @param y amount to move along camera's up-down
    *   axis
    *   @param z amount to move along camera's
    *   forward-backward axis
    */
  /* CompleteClass */
  override def move(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
    *   Sets an orthographic projection for a p5.Camera
    *   object and sets parameters for that projection
    *   according to ortho() syntax.
    */
  /* CompleteClass */
  override def ortho(): scala.Unit = js.native
  /**
    *   Panning rotates the camera view to the left and
    *   right.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  /* CompleteClass */
  override def pan(angle: scala.Double): scala.Unit = js.native
  /**
    *   Sets a perspective projection for a p5.Camera
    *   object and sets parameters for that projection
    *   according to perspective() syntax.
    */
  /* CompleteClass */
  override def perspective(): scala.Unit = js.native
  /**
    *   Set camera position in world-space while
    *   maintaining current camera orientation.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  /* CompleteClass */
  override def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
    *   Tilting rotates the camera view up and down.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  /* CompleteClass */
  override def tilt(angle: scala.Double): scala.Unit = js.native
}

