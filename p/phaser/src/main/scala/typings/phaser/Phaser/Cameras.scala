package typings.phaser.Phaser

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Fade
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Flash
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Pan
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Shake
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Zoom
import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.Display.Masks.BitmapMask
import typings.phaser.Phaser.Display.Masks.GeometryMask
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Group
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Input.Keyboard.Key
import typings.phaser.Phaser.Input.Pointer
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline
import typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Scale.ScaleManager
import typings.phaser.Phaser.Scenes.SceneManager
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Structs.Size
import typings.phaser.Phaser.Types.Cameras.Controls.FixedKeyControlConfig
import typings.phaser.Phaser.Types.Cameras.Controls.SmoothedKeyControlConfig
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraConfig
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraFadeCallback
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraFlashCallback
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraPanCallback
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraShakeCallback
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraZoomCallback
import typings.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typings.phaser.Phaser.Types.Display.InputColorObject
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Cameras")
@js.native
object Cameras extends js.Object {
  @js.native
  object Controls extends js.Object {
    /**
      * A Fixed Key Camera Control.
      * 
      * This allows you to control the movement and zoom of a camera using the defined keys.
      * 
      * ```javascript
      * var camControl = new FixedKeyControl({
      *     camera: this.cameras.main,
      *     left: cursors.left,
      *     right: cursors.right,
      *     speed: float OR { x: 0, y: 0 }
      * });
      * ```
      * 
      * Movement is precise and has no 'smoothing' applied to it.
      * 
      * You must call the `update` method of this controller every frame.
      */
    @js.native
    class FixedKeyControl protected () extends js.Object {
      /**
        * 
        * @param config The Fixed Key Control configuration object.
        */
      def this(config: FixedKeyControlConfig) = this()
      /**
        * A flag controlling if the Controls will update the Camera or not.
        */
      var active: Boolean = js.native
      /**
        * The Camera that this Control will update.
        */
      var camera: Camera = js.native
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: Key = js.native
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: Key = js.native
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: Key = js.native
      /**
        * The horizontal speed the camera will move.
        */
      var speedX: Double = js.native
      /**
        * The vertical speed the camera will move.
        */
      var speedY: Double = js.native
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: Key = js.native
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: Key = js.native
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: Key = js.native
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: Double = js.native
      /**
        * Destroys this Key Control.
        */
      def destroy(): Unit = js.native
      /**
        * Binds this Key Control to a camera.
        * @param camera The camera to bind this Key Control to.
        */
      def setCamera(camera: Camera): FixedKeyControl = js.native
      /**
        * Starts the Key Control running, providing it has been linked to a camera.
        */
      def start(): FixedKeyControl = js.native
      /**
        * Stops this Key Control from running. Call `start` to start it again.
        */
      def stop(): FixedKeyControl = js.native
      /**
        * Applies the results of pressing the control keys to the Camera.
        * 
        * You must call this every step, it is not called automatically.
        * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
        */
      def update(delta: Double): Unit = js.native
    }
    
    /**
      * A Smoothed Key Camera Control.
      * 
      * This allows you to control the movement and zoom of a camera using the defined keys.
      * Unlike the Fixed Camera Control you can also provide physics values for acceleration, drag and maxSpeed for smoothing effects.
      * 
      * ```javascript
      * var controlConfig = {
      *     camera: this.cameras.main,
      *     left: cursors.left,
      *     right: cursors.right,
      *     up: cursors.up,
      *     down: cursors.down,
      *     zoomIn: this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.Q),
      *     zoomOut: this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.E),
      *     zoomSpeed: 0.02,
      *     acceleration: 0.06,
      *     drag: 0.0005,
      *     maxSpeed: 1.0
      * };
      * ```
      * 
      * You must call the `update` method of this controller every frame.
      */
    @js.native
    class SmoothedKeyControl protected () extends js.Object {
      /**
        * 
        * @param config The Smoothed Key Control configuration object.
        */
      def this(config: SmoothedKeyControlConfig) = this()
      /**
        * The horizontal acceleration the camera will move.
        */
      var accelX: Double = js.native
      /**
        * The vertical acceleration the camera will move.
        */
      var accelY: Double = js.native
      /**
        * A flag controlling if the Controls will update the Camera or not.
        */
      var active: Boolean = js.native
      /**
        * The Camera that this Control will update.
        */
      var camera: Camera = js.native
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: Key = js.native
      /**
        * The horizontal drag applied to the camera when it is moving.
        */
      var dragX: Double = js.native
      /**
        * The vertical drag applied to the camera when it is moving.
        */
      var dragY: Double = js.native
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: Key = js.native
      /**
        * The maximum horizontal speed the camera will move.
        */
      var maxSpeedX: Double = js.native
      /**
        * The maximum vertical speed the camera will move.
        */
      var maxSpeedY: Double = js.native
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: Key = js.native
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: Key = js.native
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: Key = js.native
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: Key = js.native
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: Double = js.native
      /**
        * Destroys this Key Control.
        */
      def destroy(): Unit = js.native
      /**
        * Binds this Key Control to a camera.
        * @param camera The camera to bind this Key Control to.
        */
      def setCamera(camera: Camera): SmoothedKeyControl = js.native
      /**
        * Starts the Key Control running, providing it has been linked to a camera.
        */
      def start(): SmoothedKeyControl = js.native
      /**
        * Stops this Key Control from running. Call `start` to start it again.
        */
      def stop(): SmoothedKeyControl = js.native
      /**
        * Applies the results of pressing the control keys to the Camera.
        * 
        * You must call this every step, it is not called automatically.
        * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
        */
      def update(delta: Double): Unit = js.native
    }
    
  }
  
  @js.native
  object Scene2D extends js.Object {
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
    @js.native
    class BaseCamera protected ()
      extends EventEmitter
         with Alpha
         with Visible {
      /**
        * 
        * @param x The x position of the Camera, relative to the top-left of the game canvas.
        * @param y The y position of the Camera, relative to the top-left of the game canvas.
        * @param width The width of the Camera, in pixels.
        * @param height The height of the Camera, in pixels.
        */
      def this(x: Double, y: Double, width: Double, height: Double) = this()
      /**
        * The background color of this Camera. Only used if `transparent` is `false`.
        */
      var backgroundColor: Color = js.native
      /**
        * A reference to the Scene's Camera Manager to which this Camera belongs.
        */
      var cameraManager: CameraManager = js.native
      /**
        * The horizontal position of the center of the Camera's viewport, relative to the left of the game canvas.
        */
      val centerX: Double = js.native
      /**
        * The vertical position of the center of the Camera's viewport, relative to the top of the game canvas.
        */
      val centerY: Double = js.native
      /**
        * Is this Camera dirty?
        * 
        * A dirty Camera has had either its viewport size, bounds, scroll, rotation or zoom levels changed since the last frame.
        * 
        * This flag is cleared during the `postRenderCamera` method of the renderer.
        */
      var dirty: Boolean = js.native
      /**
        * Should the camera cull Game Objects before checking them for input hit tests?
        * In some special cases it may be beneficial to disable this.
        */
      var disableCull: Boolean = js.native
      /**
        * The displayed height of the camera viewport, factoring in the camera zoom level.
        * 
        * If a camera has a viewport height of 600 and a zoom of 0.5 then its display height
        * would be 1200, as it's displaying twice as many pixels as zoom level 1.
        * 
        * Equally, a camera with a height of 600 and zoom of 2 would have a display height
        * of 300 pixels.
        */
      val displayHeight: Double = js.native
      /**
        * The displayed width of the camera viewport, factoring in the camera zoom level.
        * 
        * If a camera has a viewport width of 800 and a zoom of 0.5 then its display width
        * would be 1600, as it's displaying twice as many pixels as zoom level 1.
        * 
        * Equally, a camera with a width of 800 and zoom of 2 would have a display width
        * of 400 pixels.
        */
      val displayWidth: Double = js.native
      /**
        * The height of the Camera viewport, in pixels.
        * 
        * The viewport is the area into which the Camera renders. Setting the viewport does
        * not restrict where the Camera can scroll to.
        */
      var height: Double = js.native
      /**
        * The Camera ID. Assigned by the Camera Manager and used to handle camera exclusion.
        * This value is a bitmask.
        */
      val id: integer = js.native
      /**
        * The Mask this Camera is using during render.
        * Set the mask using the `setMask` method. Remove the mask using the `clearMask` method.
        */
      var mask: BitmapMask | GeometryMask = js.native
      /**
        * The mid-point of the Camera in 'world' coordinates.
        * 
        * Use it to obtain exactly where in the world the center of the camera is currently looking.
        * 
        * This value is updated in the preRender method, after the scroll values and follower
        * have been processed.
        */
      val midPoint: Vector2 = js.native
      /**
        * The name of the Camera. This is left empty for your own use.
        */
      var name: String = js.native
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
      var originX: Double = js.native
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
      var originY: Double = js.native
      /**
        * This property is un-used in v3.16.
        * 
        * The resolution of the Game, used in most Camera calculations.
        */
      val resolution: Double = js.native
      /**
        * Should this camera round its pixel values to integers?
        */
      var roundPixels: Boolean = js.native
      /**
        * A reference to the Game Scale Manager.
        */
      var scaleManager: ScaleManager = js.native
      /**
        * A reference to the Scene this camera belongs to.
        */
      var scene: Scene = js.native
      /**
        * A reference to the Game Scene Manager.
        */
      var sceneManager: SceneManager = js.native
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
      var scrollX: Double = js.native
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
      var scrollY: Double = js.native
      /**
        * Does this Camera have a transparent background?
        */
      var transparent: Boolean = js.native
      /**
        * Is this Camera using a bounds to restrict scrolling movement?
        * 
        * Set this property along with the bounds via `Camera.setBounds`.
        */
      var useBounds: Boolean = js.native
      /**
        * The visible state of the Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        */
      /* CompleteClass */
      override var visible: Boolean = js.native
      /**
        * The width of the Camera viewport, in pixels.
        * 
        * The viewport is the area into which the Camera renders. Setting the viewport does
        * not restrict where the Camera can scroll to.
        */
      var width: Double = js.native
      /**
        * The World View is a Rectangle that defines the area of the 'world' the Camera is currently looking at.
        * This factors in the Camera viewport size, zoom and scroll position and is updated in the Camera preRender step.
        * If you have enabled Camera bounds the worldview will be clamped to those bounds accordingly.
        * You can use it for culling or intersection checks.
        */
      val worldView: Rectangle = js.native
      /**
        * The x position of the Camera viewport, relative to the top-left of the game canvas.
        * The viewport is the area into which the camera renders.
        * To adjust the position the camera is looking at in the game world, see the `scrollX` value.
        */
      var x: Double = js.native
      /**
        * The y position of the Camera viewport, relative to the top-left of the game canvas.
        * The viewport is the area into which the camera renders.
        * To adjust the position the camera is looking at in the game world, see the `scrollY` value.
        */
      var y: Double = js.native
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
      var zoom: Double = js.native
      /**
        * Moves the Camera so that it is centered on the given coordinates, bounds allowing.
        * @param x The horizontal coordinate to center on.
        * @param y The vertical coordinate to center on.
        */
      def centerOn(x: Double, y: Double): BaseCamera = js.native
      /**
        * Moves the Camera horizontally so that it is centered on the given x coordinate, bounds allowing.
        * Calling this does not change the scrollY value.
        * @param x The horizontal coordinate to center on.
        */
      def centerOnX(x: Double): BaseCamera = js.native
      /**
        * Moves the Camera vertically so that it is centered on the given y coordinate, bounds allowing.
        * Calling this does not change the scrollX value.
        * @param y The vertical coordinate to center on.
        */
      def centerOnY(y: Double): BaseCamera = js.native
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
      def clampX(x: Double): Double = js.native
      /**
        * Takes a y value and checks it's within the range of the Camera bounds, adjusting if required.
        * Do not call this method if you are not using camera bounds.
        * @param y The value to vertically scroll clamp.
        */
      def clampY(y: Double): Double = js.native
      /**
        * Clears the mask that this Camera was using.
        * @param destroyMask Destroy the mask before clearing it? Default false.
        */
      def clearMask(): this.type = js.native
      def clearMask(destroyMask: Boolean): this.type = js.native
      /**
        * Takes an array of Game Objects and returns a new array featuring only those objects
        * visible by this camera.
        * @param renderableObjects An array of Game Objects to cull.
        */
      def cull[G /* <: js.Array[GameObject] */](renderableObjects: G): G = js.native
      /**
        * Returns a rectangle containing the bounds of the Camera.
        * 
        * If the Camera does not have any bounds the rectangle will be empty.
        * 
        * The rectangle is a copy of the bounds, so is safe to modify.
        * @param out An optional Rectangle to store the bounds in. If not given, a new Rectangle will be created.
        */
      def getBounds(): Rectangle = js.native
      def getBounds(out: Rectangle): Rectangle = js.native
      /**
        * Calculates what the Camera.scrollX and scrollY values would need to be in order to move
        * the Camera so it is centered on the given x and y coordinates, without actually moving
        * the Camera there. The results are clamped based on the Camera bounds, if set.
        * @param x The horizontal coordinate to center on.
        * @param y The vertical coordinate to center on.
        * @param out A Vector2 to store the values in. If not given a new Vector2 is created.
        */
      def getScroll(x: Double, y: Double): Vector2 = js.native
      def getScroll(x: Double, y: Double, out: Vector2): Vector2 = js.native
      /**
        * Converts the given `x` and `y` coordinates into World space, based on this Cameras transform.
        * You can optionally provide a Vector2, or similar object, to store the results in.
        * @param x The x position to convert to world space.
        * @param y The y position to convert to world space.
        * @param output An optional object to store the results in. If not provided a new Vector2 will be created.
        */
      def getWorldPoint[O /* <: Vector2 */](x: Double, y: Double): O = js.native
      def getWorldPoint[O /* <: Vector2 */](x: Double, y: Double, output: O): O = js.native
      def ignore(entries: js.Array[GameObject]): BaseCamera = js.native
      /**
        * Given a Game Object, or an array of Game Objects, it will update all of their camera filter settings
        * so that they are ignored by this Camera. This means they will not be rendered by this Camera.
        * @param entries The Game Object, or array of Game Objects, to be ignored by this Camera.
        */
      def ignore(entries: GameObject): BaseCamera = js.native
      def ignore(entries: Group): BaseCamera = js.native
      /**
        * Internal preRender step.
        * @param resolution The game resolution, as set in the Scale Manager.
        */
      /* protected */ def preRender(resolution: Double): Unit = js.native
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
      def setAngle(value: Double): BaseCamera = js.native
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
      def setBackgroundColor(color: String): BaseCamera = js.native
      def setBackgroundColor(color: Double): BaseCamera = js.native
      def setBackgroundColor(color: InputColorObject): BaseCamera = js.native
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
      def setBounds(x: integer, y: integer, width: integer, height: integer): BaseCamera = js.native
      def setBounds(x: integer, y: integer, width: integer, height: integer, centerOn: Boolean): BaseCamera = js.native
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
      def setMask(mask: BitmapMask): this.type = js.native
      def setMask(mask: BitmapMask, fixedPosition: Boolean): this.type = js.native
      def setMask(mask: GeometryMask): this.type = js.native
      def setMask(mask: GeometryMask, fixedPosition: Boolean): this.type = js.native
      /**
        * Sets the name of this Camera.
        * This value is for your own use and isn't used internally.
        * @param value The name of the Camera. Default ''.
        */
      def setName(): BaseCamera = js.native
      def setName(value: String): BaseCamera = js.native
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
      def setOrigin(x: Double): this.type = js.native
      def setOrigin(x: Double, y: Double): this.type = js.native
      /**
        * Set the position of the Camera viewport within the game.
        * 
        * This does not change where the camera is 'looking'. See `setScroll` to control that.
        * @param x The top-left x coordinate of the Camera viewport.
        * @param y The top-left y coordinate of the Camera viewport. Default x.
        */
      def setPosition(x: Double): BaseCamera = js.native
      def setPosition(x: Double, y: Double): BaseCamera = js.native
      /**
        * Set the rotation of this Camera. This causes everything it renders to appear rotated.
        * 
        * Rotating a camera does not rotate the viewport itself, it is applied during rendering.
        * @param value The rotation of the Camera, in radians. Default 0.
        */
      def setRotation(): BaseCamera = js.native
      def setRotation(value: Double): BaseCamera = js.native
      /**
        * Should the Camera round pixel values to whole integers when rendering Game Objects?
        * 
        * In some types of game, especially with pixel art, this is required to prevent sub-pixel aliasing.
        * @param value `true` to round Camera pixels, `false` to not.
        */
      def setRoundPixels(value: Boolean): BaseCamera = js.native
      /**
        * Sets the Scene the Camera is bound to.
        * 
        * Also populates the `resolution` property and updates the internal size values.
        * @param scene The Scene the camera is bound to.
        */
      def setScene(scene: Scene): BaseCamera = js.native
      /**
        * Set the position of where the Camera is looking within the game.
        * You can also modify the properties `Camera.scrollX` and `Camera.scrollY` directly.
        * Use this method, or the scroll properties, to move your camera around the game world.
        * 
        * This does not change where the camera viewport is placed. See `setPosition` to control that.
        * @param x The x coordinate of the Camera in the game world.
        * @param y The y coordinate of the Camera in the game world. Default x.
        */
      def setScroll(x: Double): BaseCamera = js.native
      def setScroll(x: Double, y: Double): BaseCamera = js.native
      /**
        * Set the size of the Camera viewport.
        * 
        * By default a Camera is the same size as the game, but can be made smaller via this method,
        * allowing you to create mini-cam style effects by creating and positioning a smaller Camera
        * viewport within your game.
        * @param width The width of the Camera viewport.
        * @param height The height of the Camera viewport. Default width.
        */
      def setSize(width: integer): BaseCamera = js.native
      def setSize(width: integer, height: integer): BaseCamera = js.native
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
      def setViewport(x: Double, y: Double, width: integer): BaseCamera = js.native
      def setViewport(x: Double, y: Double, width: integer, height: integer): BaseCamera = js.native
      /**
        * Sets the visibility of this Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        * @param value The visible state of the Game Object.
        */
      /* CompleteClass */
      override def setVisible(value: Boolean): this.type = js.native
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
      def setZoom(value: Double): BaseCamera = js.native
      /**
        * Returns an Object suitable for JSON storage containing all of the Camera viewport and rendering properties.
        */
      def toJSON(): JSONCamera = js.native
      /**
        * Internal method called automatically by the Camera Manager.
        * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
        * @param delta The delta time, in ms, elapsed since the last frame.
        */
      /* protected */ def update(time: integer, delta: Double): Unit = js.native
    }
    
    /**
      * A Camera.
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
      * A Camera also has built-in special effects including Fade, Flash and Camera Shake.
      */
    @js.native
    class Camera protected ()
      extends BaseCamera
         with Flip
         with Tint {
      /**
        * 
        * @param x The x position of the Camera, relative to the top-left of the game canvas.
        * @param y The y position of the Camera, relative to the top-left of the game canvas.
        * @param width The width of the Camera, in pixels.
        * @param height The height of the Camera, in pixels.
        */
      def this(x: Double, y: Double, width: Double, height: Double) = this()
      /**
        * If this Camera has been set to render to a texture then this holds a reference
        * to the HTML Canvas Element that the Camera is drawing to.
        * 
        * Enable texture rendering using the method `setRenderToTexture`.
        * 
        * This is only populated if Phaser is running with the Canvas Renderer.
        */
      var canvas: HTMLCanvasElement = js.native
      /**
        * If this Camera has been set to render to a texture then this holds a reference
        * to the Rendering Context belonging to the Canvas element the Camera is drawing to.
        * 
        * Enable texture rendering using the method `setRenderToTexture`.
        * 
        * This is only populated if Phaser is running with the Canvas Renderer.
        */
      var context: CanvasRenderingContext2D = js.native
      /**
        * The Camera dead zone.
        * 
        * The deadzone is only used when the camera is following a target.
        * 
        * It defines a rectangular region within which if the target is present, the camera will not scroll.
        * If the target moves outside of this area, the camera will begin scrolling in order to follow it.
        * 
        * The `lerp` values that you can set for a follower target also apply when using a deadzone.
        * 
        * You can directly set this property to be an instance of a Rectangle. Or, you can use the
        * `setDeadzone` method for a chainable approach.
        * 
        * The rectangle you provide can have its dimensions adjusted dynamically, however, please
        * note that its position is updated every frame, as it is constantly re-centered on the cameras mid point.
        * 
        * Calling `setDeadzone` with no arguments will reset an active deadzone, as will setting this property
        * to `null`.
        */
      var deadzone: Rectangle = js.native
      /**
        * The Camera Fade effect handler.
        * To fade this camera see the `Camera.fade` methods.
        */
      var fadeEffect: Fade = js.native
      /**
        * The Camera Flash effect handler.
        * To flash this camera see the `Camera.flash` method.
        */
      var flashEffect: Flash = js.native
      /**
        * The horizontally flipped state of the Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      override var flipX: Boolean = js.native
      /**
        * The vertically flipped state of the Game Object.
        * 
        * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      override var flipY: Boolean = js.native
      /**
        * The values stored in this property are subtracted from the Camera targets position, allowing you to
        * offset the camera from the actual target x/y coordinates by this amount.
        * Can also be set via `setFollowOffset` or as part of the `startFollow` call.
        */
      var followOffset: Vector2 = js.native
      /**
        * If this Camera has been set to render to a texture then this holds a reference
        * to the GL Frame Buffer belonging the Camera is drawing to.
        * 
        * Enable texture rendering using the method `setRenderToTexture`.
        * 
        * This is only set if Phaser is running with the WebGL Renderer.
        */
      var framebuffer: WebGLFramebuffer = js.native
      /**
        * If this Camera has been set to render to a texture then this holds a reference
        * to the GL Texture belonging the Camera is drawing to.
        * 
        * Enable texture rendering using the method `setRenderToTexture`.
        * 
        * This is only set if Phaser is running with the WebGL Renderer.
        */
      var glTexture: WebGLTexture = js.native
      /**
        * Does this Camera allow the Game Objects it renders to receive input events?
        */
      var inputEnabled: Boolean = js.native
      /**
        * The linear interpolation value to use when following a target.
        * 
        * Can also be set via `setLerp` or as part of the `startFollow` call.
        * 
        * The default values of 1 means the camera will instantly snap to the target coordinates.
        * A lower value, such as 0.1 means the camera will more slowly track the target, giving
        * a smooth transition. You can set the horizontal and vertical values independently, and also
        * adjust this value in real-time during your game.
        * 
        * Be sure to keep the value between 0 and 1. A value of zero will disable tracking on that axis.
        */
      var lerp: Vector2 = js.native
      /**
        * The Camera Pan effect handler.
        * To pan this camera see the `Camera.pan` method.
        */
      var panEffect: Pan = js.native
      /**
        * If this Camera has been set to render to a texture and to use a custom pipeline,
        * then this holds a reference to the pipeline the Camera is drawing with.
        * 
        * Enable texture rendering using the method `setRenderToTexture`.
        * 
        * This is only set if Phaser is running with the WebGL Renderer.
        */
      var pipeline: js.Any = js.native
      /**
        * Is this Camera rendering directly to the canvas or to a texture?
        * 
        * Enable rendering to texture with the method `setRenderToTexture` (just enabling this boolean won't be enough)
        * 
        * Once enabled you can toggle it by switching this property.
        * 
        * To properly remove a render texture you should call the `clearRenderToTexture()` method.
        */
      var renderToTexture: Boolean = js.native
      /**
        * The Camera Shake effect handler.
        * To shake this camera see the `Camera.shake` method.
        */
      var shakeEffect: Shake = js.native
      /**
        * The Camera Zoom effect handler.
        * To zoom this camera see the `Camera.zoom` method.
        */
      var zoomEffect: Zoom = js.native
      /**
        * If this Camera was set to render to a texture, this will clear the resources it was using and
        * redirect it to render back to the primary Canvas again.
        * 
        * If you only wish to temporarily disable rendering to a texture then you can toggle the
        * property `renderToTexture` instead.
        */
      def clearRenderToTexture(): Camera = js.native
      /**
        * Fades the Camera from transparent to the given color over the duration specified.
        * @param duration The duration of the effect in milliseconds. Default 1000.
        * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
        * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
        * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
        * @param force Force the effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def fade(
        duration: js.UndefOr[integer],
        red: js.UndefOr[integer],
        green: js.UndefOr[integer],
        blue: js.UndefOr[integer],
        force: js.UndefOr[Boolean],
        callback: js.UndefOr[js.Function],
        context: js.UndefOr[js.Any]
      ): Camera = js.native
      /**
        * Fades the Camera from the given color to transparent over the duration specified.
        * @param duration The duration of the effect in milliseconds. Default 1000.
        * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
        * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
        * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
        * @param force Force the effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def fadeFrom(
        duration: js.UndefOr[integer],
        red: js.UndefOr[integer],
        green: js.UndefOr[integer],
        blue: js.UndefOr[integer],
        force: js.UndefOr[Boolean],
        callback: js.UndefOr[js.Function],
        context: js.UndefOr[js.Any]
      ): Camera = js.native
      /**
        * Fades the Camera in from the given color over the duration specified.
        * @param duration The duration of the effect in milliseconds. Default 1000.
        * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
        * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
        * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def fadeIn(
        duration: js.UndefOr[integer],
        red: js.UndefOr[integer],
        green: js.UndefOr[integer],
        blue: js.UndefOr[integer],
        callback: js.UndefOr[js.Function],
        context: js.UndefOr[js.Any]
      ): Camera = js.native
      /**
        * Fades the Camera out to the given color over the duration specified.
        * This is an alias for Camera.fade that forces the fade to start, regardless of existing fades.
        * @param duration The duration of the effect in milliseconds. Default 1000.
        * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
        * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
        * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def fadeOut(
        duration: js.UndefOr[integer],
        red: js.UndefOr[integer],
        green: js.UndefOr[integer],
        blue: js.UndefOr[integer],
        callback: js.UndefOr[js.Function],
        context: js.UndefOr[js.Any]
      ): Camera = js.native
      /**
        * Flashes the Camera by setting it to the given color immediately and then fading it away again quickly over the duration specified.
        * @param duration The duration of the effect in milliseconds. Default 250.
        * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 255.
        * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 255.
        * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 255.
        * @param force Force the effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def flash(
        duration: js.UndefOr[integer],
        red: js.UndefOr[integer],
        green: js.UndefOr[integer],
        blue: js.UndefOr[integer],
        force: js.UndefOr[Boolean],
        callback: js.UndefOr[js.Function],
        context: js.UndefOr[js.Any]
      ): Camera = js.native
      /**
        * This effect will scroll the Camera so that the center of its viewport finishes at the given destination,
        * over the duration and with the ease specified.
        * @param x The destination x coordinate to scroll the center of the Camera viewport to.
        * @param y The destination y coordinate to scroll the center of the Camera viewport to.
        * @param duration The duration of the effect in milliseconds. Default 1000.
        * @param ease The ease to use for the pan. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
        * @param force Force the pan effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
        * the current camera scroll x coordinate and the current camera scroll y coordinate.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def pan(x: Double, y: Double): Camera = js.native
      def pan(x: Double, y: Double, duration: integer): Camera = js.native
      def pan(x: Double, y: Double, duration: integer, ease: String): Camera = js.native
      def pan(x: Double, y: Double, duration: integer, ease: String, force: Boolean): Camera = js.native
      def pan(x: Double, y: Double, duration: integer, ease: String, force: Boolean, callback: CameraPanCallback): Camera = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: String,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): Camera = js.native
      def pan(x: Double, y: Double, duration: integer, ease: js.Function): Camera = js.native
      def pan(x: Double, y: Double, duration: integer, ease: js.Function, force: Boolean): Camera = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback
      ): Camera = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): Camera = js.native
      /**
        * Resets any active FX, such as a fade, flash or shake. Useful to call after a fade in order to
        * remove the fade.
        */
      def resetFX(): Camera = js.native
      /**
        * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
        */
      /* CompleteClass */
      override def resetFlip(): this.type = js.native
      /**
        * Sets the Camera dead zone.
        * 
        * The deadzone is only used when the camera is following a target.
        * 
        * It defines a rectangular region within which if the target is present, the camera will not scroll.
        * If the target moves outside of this area, the camera will begin scrolling in order to follow it.
        * 
        * The deadzone rectangle is re-positioned every frame so that it is centered on the mid-point
        * of the camera. This allows you to use the object for additional game related checks, such as
        * testing if an object is within it or not via a Rectangle.contains call.
        * 
        * The `lerp` values that you can set for a follower target also apply when using a deadzone.
        * 
        * Calling this method with no arguments will reset an active deadzone.
        * @param width The width of the deadzone rectangle in pixels. If not specified the deadzone is removed.
        * @param height The height of the deadzone rectangle in pixels.
        */
      def setDeadzone(): Camera = js.native
      def setDeadzone(width: Double): Camera = js.native
      def setDeadzone(width: Double, height: Double): Camera = js.native
      /**
        * Sets the horizontal and vertical flipped state of this Game Object.
        * 
        * A Game Object that is flipped will render inversed on the flipped axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlip(x: Boolean, y: Boolean): this.type = js.native
      /**
        * Sets the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipX(value: Boolean): this.type = js.native
      /**
        * Sets the vertical flipped state of this Game Object.
        * @param value The flipped state. `false` for no flip, or `true` to be flipped.
        */
      /* CompleteClass */
      override def setFlipY(value: Boolean): this.type = js.native
      /**
        * Sets the horizontal and vertical offset of the camera from its follow target.
        * The values are subtracted from the targets position during the Cameras update step.
        * @param x The horizontal offset from the camera follow target.x position. Default 0.
        * @param y The vertical offset from the camera follow target.y position. Default 0.
        */
      def setFollowOffset(): this.type = js.native
      def setFollowOffset(x: Double): this.type = js.native
      def setFollowOffset(x: Double, y: Double): this.type = js.native
      /**
        * Sets the linear interpolation value to use when following a target.
        * 
        * The default values of 1 means the camera will instantly snap to the target coordinates.
        * A lower value, such as 0.1 means the camera will more slowly track the target, giving
        * a smooth transition. You can set the horizontal and vertical values independently, and also
        * adjust this value in real-time during your game.
        * 
        * Be sure to keep the value between 0 and 1. A value of zero will disable tracking on that axis.
        * @param x The amount added to the horizontal linear interpolation of the follow target. Default 1.
        * @param y The amount added to the vertical linear interpolation of the follow target. Default 1.
        */
      def setLerp(): this.type = js.native
      def setLerp(x: Double): this.type = js.native
      def setLerp(x: Double, y: Double): this.type = js.native
      /**
        * Sets the WebGL pipeline this Camera is using when rendering to a texture.
        * 
        * You can pass either the string-based name of the pipeline, or a reference to the pipeline itself.
        * 
        * Call this method with no arguments to clear any previously set pipeline.
        * @param pipeline The WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference. Or if left empty it will clear the pipeline.
        */
      def setPipeline(): Camera = js.native
      def setPipeline(pipeline: String): Camera = js.native
      def setPipeline(pipeline: WebGLPipeline): Camera = js.native
      /**
        * Sets the Camera to render to a texture instead of to the main canvas.
        * 
        * The Camera will redirect all Game Objects it's asked to render to this texture.
        * 
        * During the render sequence, the texture itself will then be rendered to the main canvas.
        * 
        * Doing this gives you the ability to modify the texture before this happens,
        * allowing for special effects such as Camera specific shaders, or post-processing
        * on the texture.
        * 
        * If running under Canvas the Camera will render to its `canvas` property.
        * 
        * If running under WebGL the Camera will create a frame buffer, which is stored in its `framebuffer` and `glTexture` properties.
        * 
        * If you set a camera to render to a texture then it will emit 2 events during the render loop:
        * 
        * First, it will emit the event `prerender`. This happens right before any Game Object's are drawn to the Camera texture.
        * 
        * Then, it will emit the event `postrender`. This happens after all Game Object's have been drawn, but right before the
        * Camera texture is rendered to the main game canvas. It's the final point at which you can manipulate the texture before
        * it appears in-game.
        * 
        * You should not enable this unless you plan on actually using the texture it creates
        * somehow, otherwise you're just doubling the work required to render your game.
        * 
        * To temporarily disable rendering to a texture, toggle the `renderToTexture` boolean.
        * 
        * If you no longer require the Camera to render to a texture, call the `clearRenderToTexture` method,
        * which will delete the respective textures and free-up resources.
        * @param pipeline An optional WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference.
        */
      def setRenderToTexture(): Camera = js.native
      def setRenderToTexture(pipeline: String): Camera = js.native
      def setRenderToTexture(pipeline: WebGLPipeline): Camera = js.native
      /**
        * Shakes the Camera by the given intensity over the duration specified.
        * @param duration The duration of the effect in milliseconds. Default 100.
        * @param intensity The intensity of the shake. Default 0.05.
        * @param force Force the shake effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def shake(): Camera = js.native
      def shake(duration: integer): Camera = js.native
      def shake(duration: integer, intensity: Double): Camera = js.native
      def shake(duration: integer, intensity: Double, force: Boolean): Camera = js.native
      def shake(duration: integer, intensity: Double, force: Boolean, callback: js.Function): Camera = js.native
      def shake(duration: integer, intensity: Double, force: Boolean, callback: js.Function, context: js.Any): Camera = js.native
      def shake(duration: integer, intensity: Vector2): Camera = js.native
      def shake(duration: integer, intensity: Vector2, force: Boolean): Camera = js.native
      def shake(duration: integer, intensity: Vector2, force: Boolean, callback: js.Function): Camera = js.native
      def shake(duration: integer, intensity: Vector2, force: Boolean, callback: js.Function, context: js.Any): Camera = js.native
      def startFollow(target: js.Object): this.type = js.native
      def startFollow(target: js.Object, roundPixels: Boolean): this.type = js.native
      def startFollow(target: js.Object, roundPixels: Boolean, lerpX: Double): this.type = js.native
      def startFollow(target: js.Object, roundPixels: Boolean, lerpX: Double, lerpY: Double): this.type = js.native
      def startFollow(target: js.Object, roundPixels: Boolean, lerpX: Double, lerpY: Double, offsetX: Double): this.type = js.native
      def startFollow(
        target: js.Object,
        roundPixels: Boolean,
        lerpX: Double,
        lerpY: Double,
        offsetX: Double,
        offsetY: Double
      ): this.type = js.native
      /**
        * Sets the Camera to follow a Game Object.
        * 
        * When enabled the Camera will automatically adjust its scroll position to keep the target Game Object
        * in its center.
        * 
        * You can set the linear interpolation value used in the follow code.
        * Use low lerp values (such as 0.1) to automatically smooth the camera motion.
        * 
        * If you find you're getting a slight "jitter" effect when following an object it's probably to do with sub-pixel
        * rendering of the targets position. This can be rounded by setting the `roundPixels` argument to `true` to
        * force full pixel rounding rendering. Note that this can still be broken if you have specified a non-integer zoom
        * value on the camera. So be sure to keep the camera zoom to integers.
        * @param target The target for the Camera to follow.
        * @param roundPixels Round the camera position to whole integers to avoid sub-pixel rendering? Default false.
        * @param lerpX A value between 0 and 1. This value specifies the amount of linear interpolation to use when horizontally tracking the target. The closer the value to 1, the faster the camera will track. Default 1.
        * @param lerpY A value between 0 and 1. This value specifies the amount of linear interpolation to use when vertically tracking the target. The closer the value to 1, the faster the camera will track. Default 1.
        * @param offsetX The horizontal offset from the camera follow target.x position. Default 0.
        * @param offsetY The vertical offset from the camera follow target.y position. Default 0.
        */
      def startFollow(target: GameObject): this.type = js.native
      def startFollow(target: GameObject, roundPixels: Boolean): this.type = js.native
      def startFollow(target: GameObject, roundPixels: Boolean, lerpX: Double): this.type = js.native
      def startFollow(target: GameObject, roundPixels: Boolean, lerpX: Double, lerpY: Double): this.type = js.native
      def startFollow(target: GameObject, roundPixels: Boolean, lerpX: Double, lerpY: Double, offsetX: Double): this.type = js.native
      def startFollow(
        target: GameObject,
        roundPixels: Boolean,
        lerpX: Double,
        lerpY: Double,
        offsetX: Double,
        offsetY: Double
      ): this.type = js.native
      /**
        * Stops a Camera from following a Game Object, if previously set via `Camera.startFollow`.
        */
      def stopFollow(): Camera = js.native
      /**
        * Toggles the horizontal flipped state of this Game Object.
        * 
        * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
        * Flipping always takes place from the middle of the texture and does not impact the scale value.
        * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
        */
      /* CompleteClass */
      override def toggleFlipX(): this.type = js.native
      /**
        * Toggles the vertical flipped state of this Game Object.
        */
      /* CompleteClass */
      override def toggleFlipY(): this.type = js.native
      /**
        * This effect will zoom the Camera to the given scale, over the duration and with the ease specified.
        * @param zoom The target Camera zoom value.
        * @param duration The duration of the effect in milliseconds. Default 1000.
        * @param ease The ease to use for the pan. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
        * @param force Force the pan effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
        * the current camera scroll x coordinate and the current camera scroll y coordinate.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def zoomTo(zoom: Double): Camera = js.native
      def zoomTo(zoom: Double, duration: integer): Camera = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String): Camera = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String, force: Boolean): Camera = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String, force: Boolean, callback: CameraPanCallback): Camera = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: String,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): Camera = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function): Camera = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Boolean): Camera = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Boolean, callback: CameraPanCallback): Camera = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): Camera = js.native
    }
    
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
    class CameraManager protected () extends js.Object {
      /**
        * 
        * @param scene The Scene that owns the Camera Manager plugin.
        */
      def this(scene: Scene) = this()
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
      def fromJSON(config: js.Array[CameraConfig]): CameraManager = js.native
      /**
        * Populates this Camera Manager based on the given configuration object, or an array of config objects.
        * 
        * See the `Phaser.Types.Cameras.Scene2D.CameraConfig` documentation for details of the object structure.
        * @param config A Camera configuration object, or an array of them, to be added to this Camera Manager.
        */
      def fromJSON(config: CameraConfig): CameraManager = js.native
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
    
    @js.native
    object Effects extends js.Object {
      /**
        * A Camera Fade effect.
        * 
        * This effect will fade the camera viewport to the given color, over the duration specified.
        * 
        * Only the camera viewport is faded. None of the objects it is displaying are impacted, i.e. their colors do
        * not change.
        * 
        * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
        * which is invoked each frame for the duration of the effect, if required.
        */
      @js.native
      class Fade protected () extends js.Object {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: Camera) = this()
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera = js.native
        /**
          * The direction of the fade.
          * `true` = fade out (transparent to color), `false` = fade in (color to transparent)
          */
        val direction: Boolean = js.native
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        /**
          * Has this effect finished running?
          * 
          * This is different from `isRunning` because it remains set to `true` when the effect is over,
          * until the effect is either reset or started again.
          */
        val isComplete: Boolean = js.native
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean = js.native
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        /**
          * Called internally by the Canvas Renderer.
          * @param ctx The Canvas context to render to.
          */
        def postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = js.native
        /**
          * Called internally by the WebGL Renderer.
          * @param pipeline The WebGL Pipeline to render to.
          * @param getTintFunction A function that will return the gl safe tint colors.
          */
        def postRenderWebGL(pipeline: TextureTintPipeline, getTintFunction: js.Function): Boolean = js.native
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit = js.native
        /**
          * Fades the Camera to or from the given color over the duration specified.
          * @param direction The direction of the fade. `true` = fade out (transparent to color), `false` = fade in (color to transparent) Default true.
          * @param duration The duration of the effect in milliseconds. Default 1000.
          * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
          * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
          * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
          * @param force Force the effect to start immediately, even if already running. Default false.
          * @param callback This callback will be invoked every frame for the duration of the effect.
          * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
          * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
          */
        def start(
          direction: js.UndefOr[Boolean],
          duration: js.UndefOr[integer],
          red: js.UndefOr[integer],
          green: js.UndefOr[integer],
          blue: js.UndefOr[integer],
          force: js.UndefOr[Boolean],
          callback: js.UndefOr[CameraFadeCallback],
          context: js.UndefOr[js.Any]
        ): Camera = js.native
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit = js.native
      }
      
      /**
        * A Camera Flash effect.
        * 
        * This effect will flash the camera viewport to the given color, over the duration specified.
        * 
        * Only the camera viewport is flashed. None of the objects it is displaying are impacted, i.e. their colors do
        * not change.
        * 
        * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
        * which is invoked each frame for the duration of the effect, if required.
        */
      @js.native
      class Flash protected () extends js.Object {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: Camera) = this()
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera = js.native
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean = js.native
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        /**
          * Called internally by the Canvas Renderer.
          * @param ctx The Canvas context to render to.
          */
        def postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = js.native
        /**
          * Called internally by the WebGL Renderer.
          * @param pipeline The WebGL Pipeline to render to.
          * @param getTintFunction A function that will return the gl safe tint colors.
          */
        def postRenderWebGL(pipeline: TextureTintPipeline, getTintFunction: js.Function): Boolean = js.native
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit = js.native
        /**
          * Flashes the Camera to or from the given color over the duration specified.
          * @param duration The duration of the effect in milliseconds. Default 250.
          * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 255.
          * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 255.
          * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 255.
          * @param force Force the effect to start immediately, even if already running. Default false.
          * @param callback This callback will be invoked every frame for the duration of the effect.
          * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
          * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
          */
        def start(
          duration: js.UndefOr[integer],
          red: js.UndefOr[integer],
          green: js.UndefOr[integer],
          blue: js.UndefOr[integer],
          force: js.UndefOr[Boolean],
          callback: js.UndefOr[CameraFlashCallback],
          context: js.UndefOr[js.Any]
        ): Camera = js.native
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit = js.native
      }
      
      /**
        * A Camera Pan effect.
        * 
        * This effect will scroll the Camera so that the center of its viewport finishes at the given destination,
        * over the duration and with the ease specified.
        * 
        * Only the camera scroll is moved. None of the objects it is displaying are impacted, i.e. their positions do
        * not change.
        * 
        * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
        * which is invoked each frame for the duration of the effect if required.
        */
      @js.native
      class Pan protected () extends js.Object {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: Camera) = this()
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera = js.native
        /**
          * The constantly updated value based on zoom.
          */
        var current: Vector2 = js.native
        /**
          * The destination scroll coordinates to pan the camera to.
          */
        var destination: Vector2 = js.native
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        /**
          * The ease function to use during the pan.
          */
        var ease: js.Function = js.native
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean = js.native
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        /**
          * The starting scroll coordinates to pan the camera from.
          */
        var source: Vector2 = js.native
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit = js.native
        /**
          * This effect will scroll the Camera so that the center of its viewport finishes at the given destination,
          * over the duration and with the ease specified.
          * @param x The destination x coordinate to scroll the center of the Camera viewport to.
          * @param y The destination y coordinate to scroll the center of the Camera viewport to.
          * @param duration The duration of the effect in milliseconds. Default 1000.
          * @param ease The ease to use for the pan. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
          * @param force Force the pan effect to start immediately, even if already running. Default false.
          * @param callback This callback will be invoked every frame for the duration of the effect.
          * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
          * the current camera scroll x coordinate and the current camera scroll y coordinate.
          * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
          */
        def start(x: Double, y: Double): Camera = js.native
        def start(x: Double, y: Double, duration: integer): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: String): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: String, force: Boolean): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: String, force: Boolean, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: String,
          force: Boolean,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: js.Function): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: js.Function, force: Boolean): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: js.Function,
          force: Boolean,
          callback: CameraPanCallback
        ): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: js.Function,
          force: Boolean,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit = js.native
      }
      
      /**
        * A Camera Shake effect.
        * 
        * This effect will shake the camera viewport by a random amount, bounded by the specified intensity, each frame.
        * 
        * Only the camera viewport is moved. None of the objects it is displaying are impacted, i.e. their positions do
        * not change.
        * 
        * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
        * which is invoked each frame for the duration of the effect if required.
        */
      @js.native
      class Shake protected () extends js.Object {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: Camera) = this()
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera = js.native
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        /**
          * The intensity of the effect. Use small float values. The default when the effect starts is 0.05.
          * This is a Vector2 object, allowing you to control the shake intensity independently across x and y.
          * You can modify this value while the effect is active to create more varied shake effects.
          */
        var intensity: Vector2 = js.native
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean = js.native
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        /**
          * The pre-render step for this effect. Called automatically by the Camera.
          */
        def preRender(): Unit = js.native
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit = js.native
        /**
          * Shakes the Camera by the given intensity over the duration specified.
          * @param duration The duration of the effect in milliseconds. Default 100.
          * @param intensity The intensity of the shake. Default 0.05.
          * @param force Force the shake effect to start immediately, even if already running. Default false.
          * @param callback This callback will be invoked every frame for the duration of the effect.
          * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
          * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
          */
        def start(): Camera = js.native
        def start(duration: integer): Camera = js.native
        def start(duration: integer, intensity: Double): Camera = js.native
        def start(duration: integer, intensity: Double, force: Boolean): Camera = js.native
        def start(duration: integer, intensity: Double, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(
          duration: integer,
          intensity: Double,
          force: Boolean,
          callback: CameraShakeCallback,
          context: js.Any
        ): Camera = js.native
        def start(duration: integer, intensity: Vector2): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Boolean): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(
          duration: integer,
          intensity: Vector2,
          force: Boolean,
          callback: CameraShakeCallback,
          context: js.Any
        ): Camera = js.native
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit = js.native
      }
      
      /**
        * A Camera Zoom effect.
        * 
        * This effect will zoom the Camera to the given scale, over the duration and with the ease specified.
        * 
        * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
        * which is invoked each frame for the duration of the effect if required.
        */
      @js.native
      class Zoom protected () extends js.Object {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: Camera) = this()
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera = js.native
        /**
          * The destination zoom value.
          */
        var destination: Double = js.native
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        /**
          * The ease function to use during the zoom.
          */
        var ease: js.Function = js.native
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean = js.native
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        /**
          * The starting zoom value;
          */
        var source: Double = js.native
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit = js.native
        /**
          * This effect will zoom the Camera to the given scale, over the duration and with the ease specified.
          * @param zoom The target Camera zoom value.
          * @param duration The duration of the effect in milliseconds. Default 1000.
          * @param ease The ease to use for the Zoom. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
          * @param force Force the zoom effect to start immediately, even if already running. Default false.
          * @param callback This callback will be invoked every frame for the duration of the effect.
          * It is sent three arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
          * and the current camera zoom value.
          * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
          */
        def start(zoom: Double): Camera = js.native
        def start(zoom: Double, duration: integer): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String, force: Boolean): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: String,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function, force: Boolean): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: js.Function,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit = js.native
      }
      
    }
    
    @js.native
    object Events extends js.Object {
      /**
        * The Destroy Camera Event.
        * 
        * This event is dispatched by a Camera instance when it is destroyed by the Camera Manager.
        */
      val DESTROY: js.Any = js.native
      /**
        * The Camera Fade In Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Fade In Effect completes.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeincomplete', listener)`.
        */
      val FADE_IN_COMPLETE: js.Any = js.native
      /**
        * The Camera Fade In Start Event.
        * 
        * This event is dispatched by a Camera instance when the Fade In Effect starts.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeinstart', listener)`.
        */
      val FADE_IN_START: js.Any = js.native
      /**
        * The Camera Fade Out Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Fade Out Effect completes.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeoutcomplete', listener)`.
        */
      val FADE_OUT_COMPLETE: js.Any = js.native
      /**
        * The Camera Fade Out Start Event.
        * 
        * This event is dispatched by a Camera instance when the Fade Out Effect starts.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeoutstart', listener)`.
        */
      val FADE_OUT_START: js.Any = js.native
      /**
        * The Camera Flash Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Flash Effect completes.
        */
      val FLASH_COMPLETE: js.Any = js.native
      /**
        * The Camera Flash Start Event.
        * 
        * This event is dispatched by a Camera instance when the Flash Effect starts.
        */
      val FLASH_START: js.Any = js.native
      /**
        * The Camera Pan Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Pan Effect completes.
        */
      val PAN_COMPLETE: js.Any = js.native
      /**
        * The Camera Pan Start Event.
        * 
        * This event is dispatched by a Camera instance when the Pan Effect starts.
        */
      val PAN_START: js.Any = js.native
      /**
        * The Camera Post-Render Event.
        * 
        * This event is dispatched by a Camera instance after is has finished rendering.
        * It is only dispatched if the Camera is rendering to a texture.
        * 
        * Listen to it from a Camera instance using: `camera.on('postrender', listener)`.
        */
      val POST_RENDER: js.Any = js.native
      /**
        * The Camera Pre-Render Event.
        * 
        * This event is dispatched by a Camera instance when it is about to render.
        * It is only dispatched if the Camera is rendering to a texture.
        * 
        * Listen to it from a Camera instance using: `camera.on('prerender', listener)`.
        */
      val PRE_RENDER: js.Any = js.native
      /**
        * The Camera Shake Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Shake Effect completes.
        */
      val SHAKE_COMPLETE: js.Any = js.native
      /**
        * The Camera Shake Start Event.
        * 
        * This event is dispatched by a Camera instance when the Shake Effect starts.
        */
      val SHAKE_START: js.Any = js.native
      /**
        * The Camera Zoom Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Zoom Effect completes.
        */
      val ZOOM_COMPLETE: js.Any = js.native
      /**
        * The Camera Zoom Start Event.
        * 
        * This event is dispatched by a Camera instance when the Zoom Effect starts.
        */
      val ZOOM_START: js.Any = js.native
    }
    
  }
  
}

