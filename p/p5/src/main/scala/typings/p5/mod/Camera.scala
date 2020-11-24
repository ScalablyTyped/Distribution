package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends js.Object {
  
  /**
    *   Sets a camera's position and orientation. This is
    *   equivalent to calling camera() on a p5.Camera
    *   object.
    */
  def camera(): Unit = js.native
  
  /**
    *   Reorients the camera to look at a position in
    *   world space.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  def lookAt(x: Double, y: Double, z: Double): Unit = js.native
  
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
  def move(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    *   Sets an orthographic projection for a p5.Camera
    *   object and sets parameters for that projection
    *   according to ortho() syntax.
    */
  def ortho(): Unit = js.native
  
  /**
    *   Panning rotates the camera view to the left and
    *   right.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  def pan(angle: Double): Unit = js.native
  
  /**
    *   Sets a perspective projection for a p5.Camera
    *   object and sets parameters for that projection
    *   according to perspective() syntax.
    */
  def perspective(): Unit = js.native
  
  /**
    *   Set camera position in world-space while
    *   maintaining current camera orientation.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    *   Tilting rotates the camera view up and down.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  def tilt(angle: Double): Unit = js.native
}
object Camera {
  
  @scala.inline
  def apply(
    camera: () => Unit,
    lookAt: (Double, Double, Double) => Unit,
    move: (Double, Double, Double) => Unit,
    ortho: () => Unit,
    pan: Double => Unit,
    perspective: () => Unit,
    setPosition: (Double, Double, Double) => Unit,
    tilt: Double => Unit
  ): Camera = {
    val __obj = js.Dynamic.literal(camera = js.Any.fromFunction0(camera), lookAt = js.Any.fromFunction3(lookAt), move = js.Any.fromFunction3(move), ortho = js.Any.fromFunction0(ortho), pan = js.Any.fromFunction1(pan), perspective = js.Any.fromFunction0(perspective), setPosition = js.Any.fromFunction3(setPosition), tilt = js.Any.fromFunction1(tilt))
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit class CameraOps[Self <: Camera] (val x: Self) extends AnyVal {
    
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
    def setCamera(value: () => Unit): Self = this.set("camera", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookAt(value: (Double, Double, Double) => Unit): Self = this.set("lookAt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMove(value: (Double, Double, Double) => Unit): Self = this.set("move", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOrtho(value: () => Unit): Self = this.set("ortho", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPan(value: Double => Unit): Self = this.set("pan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPerspective(value: () => Unit): Self = this.set("perspective", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPosition(value: (Double, Double, Double) => Unit): Self = this.set("setPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTilt(value: Double => Unit): Self = this.set("tilt", js.Any.fromFunction1(value))
  }
}
