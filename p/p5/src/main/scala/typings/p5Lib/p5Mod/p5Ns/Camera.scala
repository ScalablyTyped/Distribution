package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Camera extends js.Object {
  /**
       *   Sets a camera's position and orientation. This is
       *   equivalent to calling camera() on a p5.Camera
       *   object.
       */
  def camera(): scala.Unit
  /**
       *   Reorients the camera to look at a position in
       *   world space.
       *   @param x x position of a point in world space
       *   @param y y position of a point in world space
       *   @param z z position of a point in world space
       */
  def lookAt(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit
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
  def move(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit
  /**
       *   Sets an orthographic projection for a p5.Camera
       *   object and sets parameters for that projection
       *   according to ortho() syntax.
       */
  def ortho(): scala.Unit
  /**
       *   Panning rotates the camera view to the left and
       *   right.
       *   @param angle amount to rotate camera in current
       *   angleMode units. Greater than 0 values rotate
       *   counterclockwise (to the left).
       */
  def pan(angle: scala.Double): scala.Unit
  /**
       *   Sets a perspective projection for a p5.Camera
       *   object and sets parameters for that projection
       *   according to perspective() syntax.
       */
  def perspective(): scala.Unit
  /**
       *   Set camera position in world-space while
       *   maintaining current camera orientation.
       *   @param x x position of a point in world space
       *   @param y y position of a point in world space
       *   @param z z position of a point in world space
       */
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit
  /**
       *   Tilting rotates the camera view up and down.
       *   @param angle amount to rotate camera in current
       *   angleMode units. Greater than 0 values rotate
       *   counterclockwise (to the left).
       */
  def tilt(angle: scala.Double): scala.Unit
}

