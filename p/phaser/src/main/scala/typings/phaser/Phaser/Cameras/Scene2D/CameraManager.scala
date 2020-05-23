package typings.phaser.Phaser.Cameras.Scene2D

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Input.Pointer
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Structs.Size
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Camera Manager is a plugin that belongs to a Scene and is responsible for managing all of the Scene Cameras.
  * 
  * By default you can access the Camera Manager from within a Scene using `this.cameras`, although this can be changed
  * in your game config.
  * 
  * Create new Cameras using the `add` method. Or extend the Camera class with your own addition code and then add
  * the new Camera in using the `addExisting` method.
  * 
  * Cameras provide a view into your game world, and can be positioned, rotated, zoomed and scrolled accordingly.
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
  * allowing you to filter Game Objects out on a per-Camera basis. The Camera Manager can manage up to 31 unique 
  * 'Game Object ignore capable' Cameras. Any Cameras beyond 31 that you create will all be given a Camera ID of
  * zero, meaning that they cannot be used for Game Object exclusion. This means if you need your Camera to ignore
  * Game Objects, make sure it's one of the first 31 created.
  * 
  * A Camera also has built-in special effects including Fade, Flash, Camera Shake, Pan and Zoom.
  */
@js.native
trait CameraManager extends js.Object {
  /**
    * An Array of the Camera objects being managed by this Camera Manager.
    * The Cameras are updated and rendered in the same order in which they appear in this array.
    * Do not directly add or remove entries to this array. However, you can move the contents
    * around the array should you wish to adjust the display order.
    */
  var cameras: js.Array[Camera] = js.native
  /**
    * A default un-transformed Camera that doesn't exist on the camera list and doesn't
    * count towards the total number of cameras being managed. It exists for other
    * systems, as well as your own code, should they require a basic un-transformed
    * camera instance from which to calculate a view matrix.
    */
  var default: Camera = js.native
  /**
    * A handy reference to the 'main' camera. By default this is the first Camera the
    * Camera Manager creates. You can also set it directly, or use the `makeMain` argument
    * in the `add` and `addExisting` methods. It allows you to access it from your game:
    * 
    * ```javascript
    * var cam = this.cameras.main;
    * ```
    * 
    * Also see the properties `camera1`, `camera2` and so on.
    */
  var main: Camera = js.native
  /**
    * All Cameras created by, or added to, this Camera Manager, will have their `roundPixels`
    * property set to match this value. By default it is set to match the value set in the
    * game configuration, but can be changed at any point. Equally, individual cameras can
    * also be changed as needed.
    */
  var roundPixels: Boolean = js.native
  /**
    * The Scene that owns the Camera Manager plugin.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene.Systems handler for the Scene that owns the Camera Manager.
    */
  var systems: Systems = js.native
  /**
    * Adds a new Camera into the Camera Manager. The Camera Manager can support up to 31 different Cameras.
    * 
    * Each Camera has its own viewport, which controls the size of the Camera and its position within the canvas.
    * 
    * Use the `Camera.scrollX` and `Camera.scrollY` properties to change where the Camera is looking, or the
    * Camera methods such as `centerOn`. Cameras also have built in special effects, such as fade, flash, shake,
    * pan and zoom.
    * 
    * By default Cameras are transparent and will render anything that they can see based on their `scrollX`
    * and `scrollY` values. Game Objects can be set to be ignored by a Camera by using the `Camera.ignore` method.
    * 
    * The Camera will have its `roundPixels` property set to whatever `CameraManager.roundPixels` is. You can change
    * it after creation if required.
    * 
    * See the Camera class documentation for more details.
    * @param x The horizontal position of the Camera viewport. Default 0.
    * @param y The vertical position of the Camera viewport. Default 0.
    * @param width The width of the Camera viewport. If not given it'll be the game config size.
    * @param height The height of the Camera viewport. If not given it'll be the game config size.
    * @param makeMain Set this Camera as being the 'main' camera. This just makes the property `main` a reference to it. Default false.
    * @param name The name of the Camera. Default ''.
    */
  def add(
    x: js.UndefOr[integer],
    y: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    makeMain: js.UndefOr[Boolean],
    name: js.UndefOr[String]
  ): Camera = js.native
  /**
    * Adds an existing Camera into the Camera Manager.
    * 
    * The Camera should either be a `Phaser.Cameras.Scene2D.Camera` instance, or a class that extends from it.
    * 
    * The Camera will have its `roundPixels` property set to whatever `CameraManager.roundPixels` is. You can change
    * it after addition if required.
    * 
    * The Camera will be assigned an ID, which is used for Game Object exclusion and then added to the
    * manager. As long as it doesn't already exist in the manager it will be added then returned.
    * 
    * If this method returns `null` then the Camera already exists in this Camera Manager.
    * @param camera The Camera to be added to the Camera Manager.
    * @param makeMain Set this Camera as being the 'main' camera. This just makes the property `main` a reference to it. Default false.
    */
  def addExisting(camera: Camera): Camera = js.native
  def addExisting(camera: Camera, makeMain: Boolean): Camera = js.native
  def fromJSON(config: js.Array[CameraConfig]): this.type = js.native
  /**
    * Populates this Camera Manager based on the given configuration object, or an array of config objects.
    * 
    * See the `Phaser.Types.Cameras.Scene2D.CameraConfig` documentation for details of the object structure.
    * @param config A Camera configuration object, or an array of them, to be added to this Camera Manager.
    */
  def fromJSON(config: CameraConfig): this.type = js.native
  /**
    * Gets a Camera based on its name.
    * 
    * Camera names are optional and don't have to be set, so this method is only of any use if you
    * have given your Cameras unique names.
    * @param name The name of the Camera.
    */
  def getCamera(name: String): Camera = js.native
  /**
    * Returns an array of all cameras below the given Pointer.
    * 
    * The first camera in the array is the top-most camera in the camera list.
    * @param pointer The Pointer to check against.
    */
  def getCamerasBelowPointer(pointer: Pointer): js.Array[Camera] = js.native
  /**
    * Gets the total number of Cameras in this Camera Manager.
    * 
    * If the optional `isVisible` argument is set it will only count Cameras that are currently visible.
    * @param isVisible Set the `true` to only include visible Cameras in the total. Default false.
    */
  def getTotal(): integer = js.native
  def getTotal(isVisible: Boolean): integer = js.native
  /**
    * The event handler that manages the `resize` event dispatched by the Scale Manager.
    * @param gameSize The default Game Size object. This is the un-modified game dimensions.
    * @param baseSize The base Size object. The game dimensions multiplied by the resolution. The canvas width / height values match this.
    */
  def onResize(gameSize: Size, baseSize: Size): Unit = js.native
  def remove(camera: js.Array[Camera]): integer = js.native
  def remove(camera: js.Array[Camera], runDestroy: Boolean): integer = js.native
  /**
    * Removes the given Camera, or an array of Cameras, from this Camera Manager.
    * 
    * If found in the Camera Manager it will be immediately removed from the local cameras array.
    * If also currently the 'main' camera, 'main' will be reset to be camera 0.
    * 
    * The removed Cameras are automatically destroyed if the `runDestroy` argument is `true`, which is the default.
    * If you wish to re-use the cameras then set this to `false`, but know that they will retain their references
    * and internal data until destroyed or re-added to a Camera Manager.
    * @param camera The Camera, or an array of Cameras, to be removed from this Camera Manager.
    * @param runDestroy Automatically call `Camera.destroy` on each Camera removed from this Camera Manager. Default true.
    */
  def remove(camera: Camera): integer = js.native
  def remove(camera: Camera, runDestroy: Boolean): integer = js.native
  /**
    * The internal render method. This is called automatically by the Scene and should not be invoked directly.
    * 
    * It will iterate through all local cameras and render them in turn, as long as they're visible and have
    * an alpha level > 0.
    * @param renderer The Renderer that will render the children to this camera.
    * @param children An array of renderable Game Objects.
    * @param interpolation Interpolation value. Reserved for future use.
    */
  /* protected */ def render(renderer: CanvasRenderer, children: js.Array[GameObject], interpolation: Double): Unit = js.native
  /* protected */ def render(renderer: WebGLRenderer, children: js.Array[GameObject], interpolation: Double): Unit = js.native
  /**
    * Resets this Camera Manager.
    * 
    * This will iterate through all current Cameras, destroying them all, then it will reset the
    * cameras array, reset the ID counter and create 1 new single camera using the default values.
    */
  def resetAll(): Camera = js.native
  /**
    * Resizes all cameras to the given dimensions.
    * @param width The new width of the camera.
    * @param height The new height of the camera.
    */
  def resize(width: Double, height: Double): Unit = js.native
  /**
    * The main update loop. Called automatically when the Scene steps.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def update(time: integer, delta: Double): Unit = js.native
}

