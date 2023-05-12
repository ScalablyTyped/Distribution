package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Display.RGB
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Geom.Circle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.Phaser.Types.Math.Vector3Like
import typings.phaser.Phaser.Types.Math.Vector4Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2D point light.
  * 
  * These are typically created by a {@link Phaser.GameObjects.LightsManager}, available from within a scene via `this.lights`.
  * 
  * Any Game Objects using the Light2D pipeline will then be affected by these Lights as long as they have a normal map.
  * 
  * They can also simply be used to represent a point light for your own purposes.
  * 
  * As of Phaser 3.60 this Game Object now has the Transform and Origin components. However, changing the scale,
  * rotation or origin properties will not make any difference to the Light. They are simply present to allow you
  * to add this Light to a Container, or enable it for Physics.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.phaser.Phaser.GameObjects.Components.Transform because var conflicts: x, y. Inlined hasTransformComponent, z, w, scale, scaleX, scaleY, angle, rotation, copyPosition, copyPosition, copyPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRandomPosition, setRotation, setRotation, setAngle, setAngle, setScale, setScale, setScale, setScale, setX, setX, setY, setY, setZ, setZ, setW, setW, getLocalTransformMatrix, getLocalTransformMatrix, getWorldTransformMatrix, getWorldTransformMatrix, getWorldTransformMatrix, getWorldTransformMatrix, getLocalPoint, getLocalPoint, getLocalPoint, getLocalPoint, getParentRotation */ @js.native
trait Light
  extends StObject
     with Circle
     with Origin
     with ScrollFactor
     with Visible {
  
  /**
    * The angle of this Game Object as expressed in degrees.
    * 
    * Phaser uses a right-hand clockwise rotation system, where 0 is right, 90 is down, 180/-180 is left
    * and -90 is up.
    * 
    * If you prefer to work in radians, see the `rotation` property instead.
    */
  var angle: Double = js.native
  
  /**
    * A bitmask that controls if this Game Object is drawn by a Camera or not.
    * Not usually set directly, instead call `Camera.ignore`, however you can
    * set this property directly using the Camera.id property:
    */
  var cameraFilter: Double = js.native
  
  /**
    * The color of the light.
    */
  var color: RGB = js.native
  
  /**
    * Copies an object's coordinates to this Game Object's position.
    * @param source An object with numeric 'x', 'y', 'z', or 'w' properties. Undefined values are not copied.
    */
  /**
    * Copies an object's coordinates to this Game Object's position.
    * @param source An object with numeric 'x', 'y', 'z', or 'w' properties. Undefined values are not copied.
    */
  def copyPosition(source: Vector2Like): this.type = js.native
  def copyPosition(source: Vector3Like): this.type = js.native
  def copyPosition(source: Vector4Like): this.type = js.native
  
  /**
    * The height of this Light Game Object. This is the same as `Light.diameter`.
    */
  var displayHeight: Double = js.native
  
  /**
    * The width of this Light Game Object. This is the same as `Light.diameter`.
    */
  var displayWidth: Double = js.native
  
  /**
    * Takes the given `x` and `y` coordinates and converts them into local space for this
    * Game Object, taking into account parent and local transforms, and the Display Origin.
    * 
    * The returned Vector2 contains the translated point in its properties.
    * 
    * A Camera needs to be provided in order to handle modified scroll factors. If no
    * camera is specified, it will use the `main` camera from the Scene to which this
    * Game Object belongs.
    * @param x The x position to translate.
    * @param y The y position to translate.
    * @param point A Vector2, or point-like object, to store the results in.
    * @param camera The Camera which is being tested against. If not given will use the Scene default camera.
    */
  /**
    * Takes the given `x` and `y` coordinates and converts them into local space for this
    * Game Object, taking into account parent and local transforms, and the Display Origin.
    * 
    * The returned Vector2 contains the translated point in its properties.
    * 
    * A Camera needs to be provided in order to handle modified scroll factors. If no
    * camera is specified, it will use the `main` camera from the Scene to which this
    * Game Object belongs.
    * @param x The x position to translate.
    * @param y The y position to translate.
    * @param point A Vector2, or point-like object, to store the results in.
    * @param camera The Camera which is being tested against. If not given will use the Scene default camera.
    */
  def getLocalPoint(x: Double, y: Double): Vector2 = js.native
  def getLocalPoint(x: Double, y: Double, point: Unit, camera: Camera): Vector2 = js.native
  def getLocalPoint(x: Double, y: Double, point: Vector2): Vector2 = js.native
  def getLocalPoint(x: Double, y: Double, point: Vector2, camera: Camera): Vector2 = js.native
  
  /**
    * Gets the local transform matrix for this Game Object.
    * @param tempMatrix The matrix to populate with the values from this Game Object.
    */
  /**
    * Gets the local transform matrix for this Game Object.
    * @param tempMatrix The matrix to populate with the values from this Game Object.
    */
  def getLocalTransformMatrix(): TransformMatrix = js.native
  def getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
  
  /**
    * Gets the sum total rotation of all of this Game Objects parent Containers.
    * 
    * The returned value is in radians and will be zero if this Game Object has no parent container.
    */
  /**
    * Gets the sum total rotation of all of this Game Objects parent Containers.
    * 
    * The returned value is in radians and will be zero if this Game Object has no parent container.
    */
  def getParentRotation(): Double = js.native
  
  /**
    * Gets the world transform matrix for this Game Object, factoring in any parent Containers.
    * @param tempMatrix The matrix to populate with the values from this Game Object.
    * @param parentMatrix A temporary matrix to hold parent values during the calculations.
    */
  /**
    * Gets the world transform matrix for this Game Object, factoring in any parent Containers.
    * @param tempMatrix The matrix to populate with the values from this Game Object.
    * @param parentMatrix A temporary matrix to hold parent values during the calculations.
    */
  def getWorldTransformMatrix(): TransformMatrix = js.native
  def getWorldTransformMatrix(tempMatrix: Unit, parentMatrix: TransformMatrix): TransformMatrix = js.native
  def getWorldTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
  def getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix = js.native
  
  /**
    * A property indicating that a Game Object has this component.
    */
  val hasTransformComponent: Boolean = js.native
  
  /**
    * The height of this Light Game Object. This is the same as `Light.diameter`.
    */
  var height: Double = js.native
  
  /**
    * The intensity of the light.
    */
  var intensity: Double = js.native
  
  /**
    * The flags that are compared against `RENDER_MASK` to determine if this Game Object will render or not.
    * The bits are 0001 | 0010 | 0100 | 1000 set by the components Visible, Alpha, Transform and Texture respectively.
    * If those components are not used by your custom class then you can use this bitmask as you wish.
    */
  var renderFlags: Double = js.native
  
  /**
    * The angle of this Game Object in radians.
    * 
    * Phaser uses a right-hand clockwise rotation system, where 0 is right, PI/2 is down, +-PI is left
    * and -PI/2 is up.
    * 
    * If you prefer to work in degrees, see the `angle` property instead.
    */
  var rotation: Double = js.native
  
  /**
    * This is a special setter that allows you to set both the horizontal and vertical scale of this Game Object
    * to the same value, at the same time. When reading this value the result returned is `(scaleX + scaleY) / 2`.
    * 
    * Use of this property implies you wish the horizontal and vertical scales to be equal to each other. If this
    * isn't the case, use the `scaleX` or `scaleY` properties instead.
    */
  var scale: Double = js.native
  
  /**
    * The horizontal scale of this Game Object.
    */
  var scaleX: Double = js.native
  
  /**
    * The vertical scale of this Game Object.
    */
  var scaleY: Double = js.native
  
  /**
    * Sets the angle of this Game Object.
    * @param degrees The rotation of this Game Object, in degrees. Default 0.
    */
  /**
    * Sets the angle of this Game Object.
    * @param degrees The rotation of this Game Object, in degrees. Default 0.
    */
  def setAngle(): this.type = js.native
  def setAngle(degrees: Double): this.type = js.native
  
  /**
    * Set the color of the light from a single integer RGB value.
    * @param rgb The integer RGB color of the light.
    */
  def setColor(rgb: Double): this.type = js.native
  
  /**
    * Set the intensity of the light.
    * @param intensity The intensity of the light.
    */
  def setIntensity(intensity: Double): this.type = js.native
  
  /**
    * Set the radius of the light.
    * @param radius The radius of the light.
    */
  def setRadius(radius: Double): this.type = js.native
  
  /**
    * Sets the position of this Game Object to be a random position within the confines of
    * the given area.
    * 
    * If no area is specified a random position between 0 x 0 and the game width x height is used instead.
    * 
    * The position does not factor in the size of this Game Object, meaning that only the origin is
    * guaranteed to be within the area.
    * @param x The x position of the top-left of the random area. Default 0.
    * @param y The y position of the top-left of the random area. Default 0.
    * @param width The width of the random area.
    * @param height The height of the random area.
    */
  /**
    * Sets the position of this Game Object to be a random position within the confines of
    * the given area.
    * 
    * If no area is specified a random position between 0 x 0 and the game width x height is used instead.
    * 
    * The position does not factor in the size of this Game Object, meaning that only the origin is
    * guaranteed to be within the area.
    * @param x The x position of the top-left of the random area. Default 0.
    * @param y The y position of the top-left of the random area. Default 0.
    * @param width The width of the random area.
    * @param height The height of the random area.
    */
  def setRandomPosition(): this.type = js.native
  def setRandomPosition(x: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Double, width: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Double, width: Double, height: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Double, width: Unit, height: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Unit, width: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Unit, width: Double, height: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
  def setRandomPosition(x: Unit, y: Double): this.type = js.native
  def setRandomPosition(x: Unit, y: Double, width: Double): this.type = js.native
  def setRandomPosition(x: Unit, y: Double, width: Double, height: Double): this.type = js.native
  def setRandomPosition(x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
  def setRandomPosition(x: Unit, y: Unit, width: Double): this.type = js.native
  def setRandomPosition(x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
  def setRandomPosition(x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
  
  /**
    * Sets the rotation of this Game Object.
    * @param radians The rotation of this Game Object, in radians. Default 0.
    */
  /**
    * Sets the rotation of this Game Object.
    * @param radians The rotation of this Game Object, in radians. Default 0.
    */
  def setRotation(): this.type = js.native
  def setRotation(radians: Double): this.type = js.native
  
  /**
    * Sets the scale of this Game Object.
    * @param x The horizontal scale of this Game Object. Default 1.
    * @param y The vertical scale of this Game Object. If not set it will use the `x` value. Default x.
    */
  /**
    * Sets the scale of this Game Object.
    * @param x The horizontal scale of this Game Object. Default 1.
    * @param y The vertical scale of this Game Object. If not set it will use the `x` value. Default x.
    */
  def setScale(): this.type = js.native
  def setScale(x: Double): this.type = js.native
  def setScale(x: Double, y: Double): this.type = js.native
  def setScale(x: Unit, y: Double): this.type = js.native
  
  /**
    * Sets the w position of this Game Object.
    * @param value The w position of this Game Object. Default 0.
    */
  /**
    * Sets the w position of this Game Object.
    * @param value The w position of this Game Object. Default 0.
    */
  def setW(): this.type = js.native
  def setW(value: Double): this.type = js.native
  
  /**
    * Sets the x position of this Game Object.
    * @param value The x position of this Game Object. Default 0.
    */
  /**
    * Sets the x position of this Game Object.
    * @param value The x position of this Game Object. Default 0.
    */
  def setX(): this.type = js.native
  def setX(value: Double): this.type = js.native
  
  /**
    * Sets the y position of this Game Object.
    * @param value The y position of this Game Object. Default 0.
    */
  /**
    * Sets the y position of this Game Object.
    * @param value The y position of this Game Object. Default 0.
    */
  def setY(): this.type = js.native
  def setY(value: Double): this.type = js.native
  
  /**
    * Sets the z position of this Game Object.
    * 
    * Note: The z position does not control the rendering order of 2D Game Objects. Use
    * {@link Phaser.GameObjects.Components.Depth#setDepth} instead.
    * @param value The z position of this Game Object. Default 0.
    */
  /**
    * Sets the z position of this Game Object.
    * 
    * Note: The z position does not control the rendering order of 2D Game Objects. Use
    * {@link Phaser.GameObjects.Components.Depth#setDepth} instead.
    * @param value The z position of this Game Object. Default 0.
    */
  def setZ(): this.type = js.native
  def setZ(value: Double): this.type = js.native
  
  /**
    * The w position of this Game Object.
    */
  var w: Double = js.native
  
  /**
    * The width of this Light Game Object. This is the same as `Light.diameter`.
    */
  var width: Double = js.native
  
  /**
    * Compares the renderMask with the renderFlags to see if this Game Object will render or not.
    * Also checks the Game Object against the given Cameras exclusion list.
    * @param camera The Camera to check against this Game Object.
    */
  def willRender(camera: Camera): Boolean = js.native
  
  /**
    * The z position of this Game Object.
    * 
    * Note: The z position does not control the rendering order of 2D Game Objects. Use
    * {@link Phaser.GameObjects.Components.Depth#depth} instead.
    */
  var z: Double = js.native
}
