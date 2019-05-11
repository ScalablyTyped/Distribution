package typings
package phaserLib.PhaserNs.CamerasNs.Scene2DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Base Camera class.
  * 
  * The Camera is the way in which all games are rendered in Phaser. They provide a view into your game world,
  * and can be positioned, rotated, zoomed and scrolled accordingly.
  * 
  * A Camera consists of two elements: The viewport and the scroll values.
  * 
  * The viewport is the physical position and size of the Camera within your game. Cameras, by default, are
  * created the same size as your game, but their position and size can be set to anything. This means if you
  * wanted to create a camera that was 320x200 in size, positioned in the bottom-right corner of your game,
  * you'd adjust the viewport to do that (using methods like `setViewport` and `setSize`).
  * 
  * If you wish to change where the Camera is looking in your game, then you scroll it. You can do this
  * via the properties `scrollX` and `scrollY` or the method `setScroll`. Scrolling has no impact on the
  * viewport, and changing the viewport has no impact on the scrolling.
  * 
  * By default a Camera will render all Game Objects it can see. You can change this using the `ignore` method,
  * allowing you to filter Game Objects out on a per-Camera basis.
  * 
  * The Base Camera is extended by the Camera class, which adds in special effects including Fade,
  * Flash and Camera Shake, as well as the ability to follow Game Objects.
  * 
  * The Base Camera was introduced in Phaser 3.12. It was split off from the Camera class, to allow
  * you to isolate special effects as needed. Therefore the 'since' values for properties of this class relate
  * to when they were added to the Camera class.
  */
@JSGlobal("Phaser.Cameras.Scene2D.BaseCamera")
@js.native
class BaseCamera protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible {
  /**
    * 
    * @param x The x position of the Camera, relative to the top-left of the game canvas.
    * @param y The y position of the Camera, relative to the top-left of the game canvas.
    * @param width The width of the Camera, in pixels.
    * @param height The height of the Camera, in pixels.
    */
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  /**
    * The background color of this Camera. Only used if `transparent` is `false`.
    */
  var backgroundColor: phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * A reference to the Scene's Camera Manager to which this Camera belongs.
    */
  var cameraManager: CameraManager = js.native
  /**
    * The horizontal position of the center of the Camera's viewport, relative to the left of the game canvas.
    */
  val centerX: scala.Double = js.native
  /**
    * The vertical position of the center of the Camera's viewport, relative to the top of the game canvas.
    */
  val centerY: scala.Double = js.native
  /**
    * Is this Camera dirty?
    * 
    * A dirty Camera has had either its viewport size, bounds, scroll, rotation or zoom levels changed since the last frame.
    * 
    * This flag is cleared during the `postRenderCamera` method of the renderer.
    */
  var dirty: scala.Boolean = js.native
  /**
    * Should the camera cull Game Objects before checking them for input hit tests?
    * In some special cases it may be beneficial to disable this.
    */
  var disableCull: scala.Boolean = js.native
  /**
    * The displayed height of the camera viewport, factoring in the camera zoom level.
    * 
    * If a camera has a viewport height of 600 and a zoom of 0.5 then its display height
    * would be 1200, as it's displaying twice as many pixels as zoom level 1.
    * 
    * Equally, a camera with a height of 600 and zoom of 2 would have a display height
    * of 300 pixels.
    */
  val displayHeight: scala.Double = js.native
  /**
    * The displayed width of the camera viewport, factoring in the camera zoom level.
    * 
    * If a camera has a viewport width of 800 and a zoom of 0.5 then its display width
    * would be 1600, as it's displaying twice as many pixels as zoom level 1.
    * 
    * Equally, a camera with a width of 800 and zoom of 2 would have a display width
    * of 400 pixels.
    */
  val displayWidth: scala.Double = js.native
  /**
    * The height of the Camera viewport, in pixels.
    * 
    * The viewport is the area into which the Camera renders. Setting the viewport does
    * not restrict where the Camera can scroll to.
    */
  var height: scala.Double = js.native
  /**
    * The Camera ID. Assigned by the Camera Manager and used to handle camera exclusion.
    * This value is a bitmask.
    */
  val id: phaserLib.integer = js.native
  /**
    * The Mask this Camera is using during render.
    * Set the mask using the `setMask` method. Remove the mask using the `clearMask` method.
    */
  var mask: phaserLib.PhaserNs.DisplayNs.MasksNs.BitmapMask | phaserLib.PhaserNs.DisplayNs.MasksNs.GeometryMask = js.native
  /**
    * The mid-point of the Camera in 'world' coordinates.
    * 
    * Use it to obtain exactly where in the world the center of the camera is currently looking.
    * 
    * This value is updated in the preRender method, after the scroll values and follower
    * have been processed.
    */
  val midPoint: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The name of the Camera. This is left empty for your own use.
    */
  var name: java.lang.String = js.native
  /**
    * The horizontal origin of rotation for this Camera.
    * 
    * By default the camera rotates around the center of the viewport.
    * 
    * Changing the origin allows you to adjust the point in the viewport from which rotation happens.
    * A value of 0 would rotate from the top-left of the viewport. A value of 1 from the bottom right.
    * 
    * See `setOrigin` to set both origins in a single, chainable call.
    */
  var originX: scala.Double = js.native
  /**
    * The vertical origin of rotation for this Camera.
    * 
    * By default the camera rotates around the center of the viewport.
    * 
    * Changing the origin allows you to adjust the point in the viewport from which rotation happens.
    * A value of 0 would rotate from the top-left of the viewport. A value of 1 from the bottom right.
    * 
    * See `setOrigin` to set both origins in a single, chainable call.
    */
  var originY: scala.Double = js.native
  /**
    * This property is un-used in v3.16.
    * 
    * The resolution of the Game, used in most Camera calculations.
    */
  val resolution: scala.Double = js.native
  /**
    * Should this camera round its pixel values to integers?
    */
  var roundPixels: scala.Boolean = js.native
  /**
    * A reference to the Game Scale Manager.
    */
  var scaleManager: phaserLib.PhaserNs.ScaleNs.ScaleManager = js.native
  /**
    * A reference to the Scene this camera belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Game Scene Manager.
    */
  var sceneManager: phaserLib.PhaserNs.ScenesNs.SceneManager = js.native
  /**
    * The horizontal scroll position of this Camera.
    * 
    * Change this value to cause the Camera to scroll around your Scene.
    * 
    * Alternatively, setting the Camera to follow a Game Object, via the `startFollow` method,
    * will automatically adjust the Camera scroll values accordingly.
    * 
    * You can set the bounds within which the Camera can scroll via the `setBounds` method.
    */
  var scrollX: scala.Double = js.native
  /**
    * The vertical scroll position of this Camera.
    * 
    * Change this value to cause the Camera to scroll around your Scene.
    * 
    * Alternatively, setting the Camera to follow a Game Object, via the `startFollow` method,
    * will automatically adjust the Camera scroll values accordingly.
    * 
    * You can set the bounds within which the Camera can scroll via the `setBounds` method.
    */
  var scrollY: scala.Double = js.native
  /**
    * Does this Camera have a transparent background?
    */
  var transparent: scala.Boolean = js.native
  /**
    * Is this Camera using a bounds to restrict scrolling movement?
    * 
    * Set this property along with the bounds via `Camera.setBounds`.
    */
  var useBounds: scala.Boolean = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The width of the Camera viewport, in pixels.
    * 
    * The viewport is the area into which the Camera renders. Setting the viewport does
    * not restrict where the Camera can scroll to.
    */
  var width: scala.Double = js.native
  /**
    * The World View is a Rectangle that defines the area of the 'world' the Camera is currently looking at.
    * This factors in the Camera viewport size, zoom and scroll position and is updated in the Camera preRender step.
    * If you have enabled Camera bounds the worldview will be clamped to those bounds accordingly.
    * You can use it for culling or intersection checks.
    */
  val worldView: phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * The x position of the Camera viewport, relative to the top-left of the game canvas.
    * The viewport is the area into which the camera renders.
    * To adjust the position the camera is looking at in the game world, see the `scrollX` value.
    */
  var x: scala.Double = js.native
  /**
    * The y position of the Camera viewport, relative to the top-left of the game canvas.
    * The viewport is the area into which the camera renders.
    * To adjust the position the camera is looking at in the game world, see the `scrollY` value.
    */
  var y: scala.Double = js.native
  /**
    * The Camera zoom value. Change this value to zoom in, or out of, a Scene.
    * 
    * A value of 0.5 would zoom the Camera out, so you can now see twice as much
    * of the Scene as before. A value of 2 would zoom the Camera in, so every pixel
    * now takes up 2 pixels when rendered.
    * 
    * Set to 1 to return to the default zoom level.
    * 
    * Be careful to never set this value to zero.
    */
  var zoom: scala.Double = js.native
  /**
    * Moves the Camera so that it is centered on the given coordinates, bounds allowing.
    * @param x The horizontal coordinate to center on.
    * @param y The vertical coordinate to center on.
    */
  def centerOn(x: scala.Double, y: scala.Double): BaseCamera = js.native
  /**
    * Moves the Camera horizontally so that it is centered on the given x coordinate, bounds allowing.
    * Calling this does not change the scrollY value.
    * @param x The horizontal coordinate to center on.
    */
  def centerOnX(x: scala.Double): BaseCamera = js.native
  /**
    * Moves the Camera vertically so that it is centered on the given y coordinate, bounds allowing.
    * Calling this does not change the scrollX value.
    * @param y The vertical coordinate to center on.
    */
  def centerOnY(y: scala.Double): BaseCamera = js.native
  /**
    * Moves the Camera so that it is looking at the center of the Camera Bounds, if enabled.
    */
  def centerToBounds(): BaseCamera = js.native
  /**
    * Moves the Camera so that it is re-centered based on its viewport size.
    */
  def centerToSize(): BaseCamera = js.native
  /**
    * Takes an x value and checks it's within the range of the Camera bounds, adjusting if required.
    * Do not call this method if you are not using camera bounds.
    * @param x The value to horizontally scroll clamp.
    */
  def clampX(x: scala.Double): scala.Double = js.native
  /**
    * Takes a y value and checks it's within the range of the Camera bounds, adjusting if required.
    * Do not call this method if you are not using camera bounds.
    * @param y The value to vertically scroll clamp.
    */
  def clampY(y: scala.Double): scala.Double = js.native
  /**
    * Clears the mask that this Camera was using.
    * @param destroyMask Destroy the mask before clearing it? Default false.
    */
  def clearMask(): this.type = js.native
  def clearMask(destroyMask: scala.Boolean): this.type = js.native
  /**
    * Takes an array of Game Objects and returns a new array featuring only those objects
    * visible by this camera.
    * @param renderableObjects An array of Game Objects to cull.
    */
  def cull[G /* <: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject] */](renderableObjects: G): G = js.native
  /**
    * Returns a rectangle containing the bounds of the Camera.
    * 
    * If the Camera does not have any bounds the rectangle will be empty.
    * 
    * The rectangle is a copy of the bounds, so is safe to modify.
    * @param out An optional Rectangle to store the bounds in. If not given, a new Rectangle will be created.
    */
  def getBounds(): phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  def getBounds(out: phaserLib.PhaserNs.GeomNs.Rectangle): phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * Calculates what the Camera.scrollX and scrollY values would need to be in order to move
    * the Camera so it is centered on the given x and y coordinates, without actually moving
    * the Camera there. The results are clamped based on the Camera bounds, if set.
    * @param x The horizontal coordinate to center on.
    * @param y The vertical coordinate to center on.
    * @param out A Vec2 to store the values in. If not given a new Vec2 is created.
    */
  def getScroll(x: scala.Double, y: scala.Double): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def getScroll(x: scala.Double, y: scala.Double, out: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Converts the given `x` and `y` coordinates into World space, based on this Cameras transform.
    * You can optionally provide a Vector2, or similar object, to store the results in.
    * @param x The x position to convert to world space.
    * @param y The y position to convert to world space.
    * @param output An optional object to store the results in. If not provided a new Vector2 will be created.
    */
  def getWorldPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](x: scala.Double, y: scala.Double): O = js.native
  def getWorldPoint[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](x: scala.Double, y: scala.Double, output: O): O = js.native
  def ignore(entries: js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject]): BaseCamera = js.native
  /**
    * Given a Game Object, or an array of Game Objects, it will update all of their camera filter settings
    * so that they are ignored by this Camera. This means they will not be rendered by this Camera.
    * @param entries The Game Object, or array of Game Objects, to be ignored by this Camera.
    */
  def ignore(entries: phaserLib.PhaserNs.GameObjectsNs.GameObject): BaseCamera = js.native
  def ignore(entries: phaserLib.PhaserNs.GameObjectsNs.Group): BaseCamera = js.native
  /**
    * Internal preRender step.
    * @param resolution The game resolution, as set in the Scale Manager.
    */
  /* protected */ def preRender(resolution: scala.Double): scala.Unit = js.native
  /**
    * If this Camera has previously had movement bounds set on it, this will remove them.
    */
  def removeBounds(): BaseCamera = js.native
  /**
    * Set the rotation of this Camera. This causes everything it renders to appear rotated.
    * 
    * Rotating a camera does not rotate the viewport itself, it is applied during rendering.
    * @param value The cameras angle of rotation, given in degrees. Default 0.
    */
  def setAngle(): BaseCamera = js.native
  def setAngle(value: scala.Double): BaseCamera = js.native
  /**
    * Sets the background color for this Camera.
    * 
    * By default a Camera has a transparent background but it can be given a solid color, with any level
    * of transparency, via this method.
    * 
    * The color value can be specified using CSS color notation, hex or numbers.
    * @param color The color value. In CSS, hex or numeric color notation. Default 'rgba(0,0,0,0)'.
    */
  def setBackgroundColor(): BaseCamera = js.native
  def setBackgroundColor(color: java.lang.String): BaseCamera = js.native
  def setBackgroundColor(color: phaserLib.PhaserNs.TypesNs.DisplayNs.InputColorObject): BaseCamera = js.native
  def setBackgroundColor(color: scala.Double): BaseCamera = js.native
  /**
    * Set the bounds of the Camera. The bounds are an axis-aligned rectangle.
    * 
    * The Camera bounds controls where the Camera can scroll to, stopping it from scrolling off the
    * edges and into blank space. It does not limit the placement of Game Objects, or where
    * the Camera viewport can be positioned.
    * 
    * Temporarily disable the bounds by changing the boolean `Camera.useBounds`.
    * 
    * Clear the bounds entirely by calling `Camera.removeBounds`.
    * 
    * If you set bounds that are smaller than the viewport it will stop the Camera from being
    * able to scroll. The bounds can be positioned where-ever you wish. By default they are from
    * 0x0 to the canvas width x height. This means that the coordinate 0x0 is the top left of
    * the Camera bounds. However, you can position them anywhere. So if you wanted a game world
    * that was 2048x2048 in size, with 0x0 being the center of it, you can set the bounds x/y
    * to be -1024, -1024, with a width and height of 2048. Depending on your game you may find
    * it easier for 0x0 to be the top-left of the bounds, or you may wish 0x0 to be the middle.
    * @param x The top-left x coordinate of the bounds.
    * @param y The top-left y coordinate of the bounds.
    * @param width The width of the bounds, in pixels.
    * @param height The height of the bounds, in pixels.
    * @param centerOn If `true` the Camera will automatically be centered on the new bounds. Default false.
    */
  def setBounds(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer): BaseCamera = js.native
  def setBounds(
    x: phaserLib.integer,
    y: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    centerOn: scala.Boolean
  ): BaseCamera = js.native
  /**
    * Sets the mask to be applied to this Camera during rendering.
    * 
    * The mask must have been previously created and can be either a GeometryMask or a BitmapMask.
    * 
    * Bitmap Masks only work on WebGL. Geometry Masks work on both WebGL and Canvas.
    * 
    * If a mask is already set on this Camera it will be immediately replaced.
    * 
    * Masks have no impact on physics or input detection. They are purely a rendering component
    * that allows you to limit what is visible during the render pass.
    * 
    * Note: You cannot mask a Camera that has `renderToTexture` set.
    * @param mask The mask this Camera will use when rendering.
    * @param fixedPosition Should the mask translate along with the Camera, or be fixed in place and not impacted by the Cameras transform? Default true.
    */
  def setMask(mask: phaserLib.PhaserNs.DisplayNs.MasksNs.BitmapMask): this.type = js.native
  def setMask(mask: phaserLib.PhaserNs.DisplayNs.MasksNs.BitmapMask, fixedPosition: scala.Boolean): this.type = js.native
  def setMask(mask: phaserLib.PhaserNs.DisplayNs.MasksNs.GeometryMask): this.type = js.native
  def setMask(mask: phaserLib.PhaserNs.DisplayNs.MasksNs.GeometryMask, fixedPosition: scala.Boolean): this.type = js.native
  /**
    * Sets the name of this Camera.
    * This value is for your own use and isn't used internally.
    * @param value The name of the Camera. Default ''.
    */
  def setName(): BaseCamera = js.native
  def setName(value: java.lang.String): BaseCamera = js.native
  /**
    * Sets the rotation origin of this Camera.
    * 
    * The values are given in the range 0 to 1 and are only used when calculating Camera rotation.
    * 
    * By default the camera rotates around the center of the viewport.
    * 
    * Changing the origin allows you to adjust the point in the viewport from which rotation happens.
    * A value of 0 would rotate from the top-left of the viewport. A value of 1 from the bottom right.
    * @param x The horizontal origin value. Default 0.5.
    * @param y The vertical origin value. If not defined it will be set to the value of `x`. Default x.
    */
  def setOrigin(): this.type = js.native
  def setOrigin(x: scala.Double): this.type = js.native
  def setOrigin(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Set the position of the Camera viewport within the game.
    * 
    * This does not change where the camera is 'looking'. See `setScroll` to control that.
    * @param x The top-left x coordinate of the Camera viewport.
    * @param y The top-left y coordinate of the Camera viewport. Default x.
    */
  def setPosition(x: scala.Double): BaseCamera = js.native
  def setPosition(x: scala.Double, y: scala.Double): BaseCamera = js.native
  /**
    * Set the rotation of this Camera. This causes everything it renders to appear rotated.
    * 
    * Rotating a camera does not rotate the viewport itself, it is applied during rendering.
    * @param value The rotation of the Camera, in radians. Default 0.
    */
  def setRotation(): BaseCamera = js.native
  def setRotation(value: scala.Double): BaseCamera = js.native
  /**
    * Should the Camera round pixel values to whole integers when rendering Game Objects?
    * 
    * In some types of game, especially with pixel art, this is required to prevent sub-pixel aliasing.
    * @param value `true` to round Camera pixels, `false` to not.
    */
  def setRoundPixels(value: scala.Boolean): BaseCamera = js.native
  /**
    * Sets the Scene the Camera is bound to.
    * 
    * Also populates the `resolution` property and updates the internal size values.
    * @param scene The Scene the camera is bound to.
    */
  def setScene(scene: phaserLib.PhaserNs.Scene): BaseCamera = js.native
  /**
    * Set the position of where the Camera is looking within the game.
    * You can also modify the properties `Camera.scrollX` and `Camera.scrollY` directly.
    * Use this method, or the scroll properties, to move your camera around the game world.
    * 
    * This does not change where the camera viewport is placed. See `setPosition` to control that.
    * @param x The x coordinate of the Camera in the game world.
    * @param y The y coordinate of the Camera in the game world. Default x.
    */
  def setScroll(x: scala.Double): BaseCamera = js.native
  def setScroll(x: scala.Double, y: scala.Double): BaseCamera = js.native
  /**
    * Set the size of the Camera viewport.
    * 
    * By default a Camera is the same size as the game, but can be made smaller via this method,
    * allowing you to create mini-cam style effects by creating and positioning a smaller Camera
    * viewport within your game.
    * @param width The width of the Camera viewport.
    * @param height The height of the Camera viewport. Default width.
    */
  def setSize(width: phaserLib.integer): BaseCamera = js.native
  def setSize(width: phaserLib.integer, height: phaserLib.integer): BaseCamera = js.native
  /**
    * This method sets the position and size of the Camera viewport in a single call.
    * 
    * If you're trying to change where the Camera is looking at in your game, then see
    * the method `Camera.setScroll` instead. This method is for changing the viewport
    * itself, not what the camera can see.
    * 
    * By default a Camera is the same size as the game, but can be made smaller via this method,
    * allowing you to create mini-cam style effects by creating and positioning a smaller Camera
    * viewport within your game.
    * @param x The top-left x coordinate of the Camera viewport.
    * @param y The top-left y coordinate of the Camera viewport.
    * @param width The width of the Camera viewport.
    * @param height The height of the Camera viewport. Default width.
    */
  def setViewport(x: scala.Double, y: scala.Double, width: phaserLib.integer): BaseCamera = js.native
  def setViewport(x: scala.Double, y: scala.Double, width: phaserLib.integer, height: phaserLib.integer): BaseCamera = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
  /**
    * Set the zoom value of the Camera.
    * 
    * Changing to a smaller value, such as 0.5, will cause the camera to 'zoom out'.
    * Changing to a larger value, such as 2, will cause the camera to 'zoom in'.
    * 
    * A value of 1 means 'no zoom' and is the default.
    * 
    * Changing the zoom does not impact the Camera viewport in any way, it is only applied during rendering.
    * @param value The zoom value of the Camera. The minimum it can be is 0.001. Default 1.
    */
  def setZoom(): BaseCamera = js.native
  def setZoom(value: scala.Double): BaseCamera = js.native
  /**
    * Returns an Object suitable for JSON storage containing all of the Camera viewport and rendering properties.
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera = js.native
  /**
    * Internal method called automatically by the Camera Manager.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def update(time: phaserLib.integer, delta: scala.Double): scala.Unit = js.native
}

