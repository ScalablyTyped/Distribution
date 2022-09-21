package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  /**
    *   Sets the camera's position and orientation.
    *   Accepts the same parameters as the global
    *   camera(). More information on this function can be
    *   found there.
    */
  def camera(): Unit
  
  /**
    *   x coordinate representing center of the sketch
    */
  var centerX: Double
  
  /**
    *   y coordinate representing center of the sketch
    */
  var centerY: Double
  
  /**
    *   z coordinate representing center of the sketch
    */
  var centerZ: Double
  
  /**
    *   camera position value on x axis
    */
  var eyeX: Double
  
  /**
    *   camera position value on y axis
    */
  var eyeY: Double
  
  /**
    *   camera position value on z axis
    */
  var eyeZ: Double
  
  /**
    *   Sets the camera's frustum. Accepts the same
    *   parameters as the global frustum(). More
    *   information on this function can be found there.
    */
  def frustum(): Unit
  
  /**
    *   Reorients the camera to look at a position in
    *   world space.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  def lookAt(x: Double, y: Double, z: Double): Unit
  
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
  def move(x: Double, y: Double, z: Double): Unit
  
  /**
    *   Sets an orthographic projection. Accepts the same
    *   parameters as the global ortho(). More information
    *   on this function can be found there.
    */
  def ortho(): Unit
  
  /**
    *   Panning rotates the camera view to the left and
    *   right.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  def pan(angle: Double): Unit
  
  /**
    *   Sets a perspective projection. Accepts the same
    *   parameters as the global perspective(). More
    *   information on this function can be found there.
    */
  def perspective(): Unit
  
  /**
    *   Set camera position in world-space while
    *   maintaining current camera orientation.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  def setPosition(x: Double, y: Double, z: Double): Unit
  
  /**
    *   Tilting rotates the camera view up and down.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  def tilt(angle: Double): Unit
  
  /**
    *   x component of direction 'up' from camera
    */
  var upX: Double
  
  /**
    *   y component of direction 'up' from camera
    */
  var upY: Double
  
  /**
    *   z component of direction 'up' from camera
    */
  var upZ: Double
}
object Camera {
  
  inline def apply(
    camera: () => Unit,
    centerX: Double,
    centerY: Double,
    centerZ: Double,
    eyeX: Double,
    eyeY: Double,
    eyeZ: Double,
    frustum: () => Unit,
    lookAt: (Double, Double, Double) => Unit,
    move: (Double, Double, Double) => Unit,
    ortho: () => Unit,
    pan: Double => Unit,
    perspective: () => Unit,
    setPosition: (Double, Double, Double) => Unit,
    tilt: Double => Unit,
    upX: Double,
    upY: Double,
    upZ: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(camera = js.Any.fromFunction0(camera), centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], centerZ = centerZ.asInstanceOf[js.Any], eyeX = eyeX.asInstanceOf[js.Any], eyeY = eyeY.asInstanceOf[js.Any], eyeZ = eyeZ.asInstanceOf[js.Any], frustum = js.Any.fromFunction0(frustum), lookAt = js.Any.fromFunction3(lookAt), move = js.Any.fromFunction3(move), ortho = js.Any.fromFunction0(ortho), pan = js.Any.fromFunction1(pan), perspective = js.Any.fromFunction0(perspective), setPosition = js.Any.fromFunction3(setPosition), tilt = js.Any.fromFunction1(tilt), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  extension [Self <: Camera](x: Self) {
    
    inline def setCamera(value: () => Unit): Self = StObject.set(x, "camera", js.Any.fromFunction0(value))
    
    inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setCenterZ(value: Double): Self = StObject.set(x, "centerZ", value.asInstanceOf[js.Any])
    
    inline def setEyeX(value: Double): Self = StObject.set(x, "eyeX", value.asInstanceOf[js.Any])
    
    inline def setEyeY(value: Double): Self = StObject.set(x, "eyeY", value.asInstanceOf[js.Any])
    
    inline def setEyeZ(value: Double): Self = StObject.set(x, "eyeZ", value.asInstanceOf[js.Any])
    
    inline def setFrustum(value: () => Unit): Self = StObject.set(x, "frustum", js.Any.fromFunction0(value))
    
    inline def setLookAt(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "lookAt", js.Any.fromFunction3(value))
    
    inline def setMove(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
    
    inline def setOrtho(value: () => Unit): Self = StObject.set(x, "ortho", js.Any.fromFunction0(value))
    
    inline def setPan(value: Double => Unit): Self = StObject.set(x, "pan", js.Any.fromFunction1(value))
    
    inline def setPerspective(value: () => Unit): Self = StObject.set(x, "perspective", js.Any.fromFunction0(value))
    
    inline def setSetPosition(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction3(value))
    
    inline def setTilt(value: Double => Unit): Self = StObject.set(x, "tilt", js.Any.fromFunction1(value))
    
    inline def setUpX(value: Double): Self = StObject.set(x, "upX", value.asInstanceOf[js.Any])
    
    inline def setUpY(value: Double): Self = StObject.set(x, "upY", value.asInstanceOf[js.Any])
    
    inline def setUpZ(value: Double): Self = StObject.set(x, "upZ", value.asInstanceOf[js.Any])
  }
}
