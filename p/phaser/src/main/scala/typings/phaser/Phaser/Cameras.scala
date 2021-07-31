package typings.phaser.Phaser

import typings.phaser.CameraRotateCallback
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Fade
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Flash
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Pan
import typings.phaser.Phaser.Cameras.Scene2D.Effects.RotateTo
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cameras {
  
  object Controls {
    
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
    trait FixedKeyControl extends StObject {
      
      /**
        * A flag controlling if the Controls will update the Camera or not.
        */
      var active: Boolean
      
      /**
        * The Camera that this Control will update.
        */
      var camera: Camera
      
      /**
        * Destroys this Key Control.
        */
      def destroy(): Unit
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: Key
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: Key
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: Key
      
      /**
        * Binds this Key Control to a camera.
        * @param camera The camera to bind this Key Control to.
        */
      def setCamera(camera: Camera): this.type
      
      /**
        * The horizontal speed the camera will move.
        */
      var speedX: Double
      
      /**
        * The vertical speed the camera will move.
        */
      var speedY: Double
      
      /**
        * Starts the Key Control running, providing it has been linked to a camera.
        */
      def start(): this.type
      
      /**
        * Stops this Key Control from running. Call `start` to start it again.
        */
      def stop(): this.type
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: Key
      
      /**
        * Applies the results of pressing the control keys to the Camera.
        * 
        * You must call this every step, it is not called automatically.
        * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
        */
      def update(delta: Double): Unit
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: Key
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: Key
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: Double
    }
    object FixedKeyControl {
      
      @scala.inline
      def apply(
        active: Boolean,
        camera: Camera,
        destroy: () => Unit,
        down: Key,
        left: Key,
        right: Key,
        setCamera: Camera => FixedKeyControl,
        speedX: Double,
        speedY: Double,
        start: () => FixedKeyControl,
        stop: () => FixedKeyControl,
        up: Key,
        update: Double => Unit,
        zoomIn: Key,
        zoomOut: Key,
        zoomSpeed: Double
      ): FixedKeyControl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setCamera = js.Any.fromFunction1(setCamera), speedX = speedX.asInstanceOf[js.Any], speedY = speedY.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), up = up.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
        __obj.asInstanceOf[FixedKeyControl]
      }
      
      @scala.inline
      implicit class FixedKeyControlMutableBuilder[Self <: FixedKeyControl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetCamera(value: Camera => FixedKeyControl): Self = StObject.set(x, "setCamera", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSpeedX(value: Double): Self = StObject.set(x, "speedX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeedY(value: Double): Self = StObject.set(x, "speedY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: () => FixedKeyControl): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStop(value: () => FixedKeyControl): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
        
        @scala.inline
        def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        
        @scala.inline
        def setZoomIn(value: Key): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomOut(value: Key): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
      }
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
    trait SmoothedKeyControl extends StObject {
      
      /**
        * The horizontal acceleration the camera will move.
        */
      var accelX: Double
      
      /**
        * The vertical acceleration the camera will move.
        */
      var accelY: Double
      
      /**
        * A flag controlling if the Controls will update the Camera or not.
        */
      var active: Boolean
      
      /**
        * The Camera that this Control will update.
        */
      var camera: Camera
      
      /**
        * Destroys this Key Control.
        */
      def destroy(): Unit
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: Key
      
      /**
        * The horizontal drag applied to the camera when it is moving.
        */
      var dragX: Double
      
      /**
        * The vertical drag applied to the camera when it is moving.
        */
      var dragY: Double
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: Key
      
      /**
        * The maximum horizontal speed the camera will move.
        */
      var maxSpeedX: Double
      
      /**
        * The maximum vertical speed the camera will move.
        */
      var maxSpeedY: Double
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: Key
      
      /**
        * Binds this Key Control to a camera.
        * @param camera The camera to bind this Key Control to.
        */
      def setCamera(camera: Camera): this.type
      
      /**
        * Starts the Key Control running, providing it has been linked to a camera.
        */
      def start(): this.type
      
      /**
        * Stops this Key Control from running. Call `start` to start it again.
        */
      def stop(): this.type
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: Key
      
      /**
        * Applies the results of pressing the control keys to the Camera.
        * 
        * You must call this every step, it is not called automatically.
        * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
        */
      def update(delta: Double): Unit
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: Key
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: Key
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: Double
    }
    object SmoothedKeyControl {
      
      @scala.inline
      def apply(
        accelX: Double,
        accelY: Double,
        active: Boolean,
        camera: Camera,
        destroy: () => Unit,
        down: Key,
        dragX: Double,
        dragY: Double,
        left: Key,
        maxSpeedX: Double,
        maxSpeedY: Double,
        right: Key,
        setCamera: Camera => SmoothedKeyControl,
        start: () => SmoothedKeyControl,
        stop: () => SmoothedKeyControl,
        up: Key,
        update: Double => Unit,
        zoomIn: Key,
        zoomOut: Key,
        zoomSpeed: Double
      ): SmoothedKeyControl = {
        val __obj = js.Dynamic.literal(accelX = accelX.asInstanceOf[js.Any], accelY = accelY.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), down = down.asInstanceOf[js.Any], dragX = dragX.asInstanceOf[js.Any], dragY = dragY.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], maxSpeedX = maxSpeedX.asInstanceOf[js.Any], maxSpeedY = maxSpeedY.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setCamera = js.Any.fromFunction1(setCamera), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), up = up.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
        __obj.asInstanceOf[SmoothedKeyControl]
      }
      
      @scala.inline
      implicit class SmoothedKeyControlMutableBuilder[Self <: SmoothedKeyControl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccelX(value: Double): Self = StObject.set(x, "accelX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccelY(value: Double): Self = StObject.set(x, "accelY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDragX(value: Double): Self = StObject.set(x, "dragX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDragY(value: Double): Self = StObject.set(x, "dragY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxSpeedX(value: Double): Self = StObject.set(x, "maxSpeedX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxSpeedY(value: Double): Self = StObject.set(x, "maxSpeedY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetCamera(value: Camera => SmoothedKeyControl): Self = StObject.set(x, "setCamera", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStart(value: () => SmoothedKeyControl): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStop(value: () => SmoothedKeyControl): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
        
        @scala.inline
        def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
        
        @scala.inline
        def setZoomIn(value: Key): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomOut(value: Key): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object Scene2D {
    
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
    trait BaseCamera
      extends StObject
         with EventEmitter
         with Alpha
         with Visible {
      
      /**
        * The background color of this Camera. Only used if `transparent` is `false`.
        */
      var backgroundColor: Color = js.native
      
      /**
        * A reference to the Scene's Camera Manager to which this Camera belongs.
        */
      var cameraManager: CameraManager = js.native
      
      /**
        * Moves the Camera so that it is centered on the given coordinates, bounds allowing.
        * @param x The horizontal coordinate to center on.
        * @param y The vertical coordinate to center on.
        */
      def centerOn(x: Double, y: Double): this.type = js.native
      
      /**
        * Moves the Camera horizontally so that it is centered on the given x coordinate, bounds allowing.
        * Calling this does not change the scrollY value.
        * @param x The horizontal coordinate to center on.
        */
      def centerOnX(x: Double): this.type = js.native
      
      /**
        * Moves the Camera vertically so that it is centered on the given y coordinate, bounds allowing.
        * Calling this does not change the scrollX value.
        * @param y The vertical coordinate to center on.
        */
      def centerOnY(y: Double): this.type = js.native
      
      /**
        * Moves the Camera so that it is looking at the center of the Camera Bounds, if enabled.
        */
      def centerToBounds(): this.type = js.native
      
      /**
        * Moves the Camera so that it is re-centered based on its viewport size.
        */
      def centerToSize(): this.type = js.native
      
      /**
        * The horizontal position of the center of the Camera's viewport, relative to the left of the game canvas.
        */
      val centerX: Double = js.native
      
      /**
        * The vertical position of the center of the Camera's viewport, relative to the top of the game canvas.
        */
      val centerY: Double = js.native
      
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
      
      def ignore(entries: js.Array[GameObject]): this.type = js.native
      /**
        * Given a Game Object, or an array of Game Objects, it will update all of their camera filter settings
        * so that they are ignored by this Camera. This means they will not be rendered by this Camera.
        * @param entries The Game Object, or array of Game Objects, to be ignored by this Camera.
        */
      def ignore(entries: GameObject): this.type = js.native
      def ignore(entries: Group): this.type = js.native
      
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
        * Internal preRender step.
        * @param resolution The game resolution, as set in the Scale Manager.
        */
      /* protected */ def preRender(resolution: Double): Unit = js.native
      
      /**
        * If this Camera has previously had movement bounds set on it, this will remove them.
        */
      def removeBounds(): this.type = js.native
      
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
        * Set the rotation of this Camera. This causes everything it renders to appear rotated.
        * 
        * Rotating a camera does not rotate the viewport itself, it is applied during rendering.
        * @param value The cameras angle of rotation, given in degrees. Default 0.
        */
      def setAngle(): this.type = js.native
      def setAngle(value: Double): this.type = js.native
      
      /**
        * Sets the background color for this Camera.
        * 
        * By default a Camera has a transparent background but it can be given a solid color, with any level
        * of transparency, via this method.
        * 
        * The color value can be specified using CSS color notation, hex or numbers.
        * @param color The color value. In CSS, hex or numeric color notation. Default 'rgba(0,0,0,0)'.
        */
      def setBackgroundColor(): this.type = js.native
      def setBackgroundColor(color: String): this.type = js.native
      def setBackgroundColor(color: Double): this.type = js.native
      def setBackgroundColor(color: InputColorObject): this.type = js.native
      
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
      def setBounds(x: integer, y: integer, width: integer, height: integer): this.type = js.native
      def setBounds(x: integer, y: integer, width: integer, height: integer, centerOn: Boolean): this.type = js.native
      
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
      def setName(): this.type = js.native
      def setName(value: String): this.type = js.native
      
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
      def setOrigin(x: Unit, y: Double): this.type = js.native
      
      /**
        * Set the position of the Camera viewport within the game.
        * 
        * This does not change where the camera is 'looking'. See `setScroll` to control that.
        * @param x The top-left x coordinate of the Camera viewport.
        * @param y The top-left y coordinate of the Camera viewport. Default x.
        */
      def setPosition(x: Double): this.type = js.native
      def setPosition(x: Double, y: Double): this.type = js.native
      
      /**
        * Set the rotation of this Camera. This causes everything it renders to appear rotated.
        * 
        * Rotating a camera does not rotate the viewport itself, it is applied during rendering.
        * @param value The rotation of the Camera, in radians. Default 0.
        */
      def setRotation(): this.type = js.native
      def setRotation(value: Double): this.type = js.native
      
      /**
        * Should the Camera round pixel values to whole integers when rendering Game Objects?
        * 
        * In some types of game, especially with pixel art, this is required to prevent sub-pixel aliasing.
        * @param value `true` to round Camera pixels, `false` to not.
        */
      def setRoundPixels(value: Boolean): this.type = js.native
      
      /**
        * Sets the Scene the Camera is bound to.
        * 
        * Also populates the `resolution` property and updates the internal size values.
        * @param scene The Scene the camera is bound to.
        */
      def setScene(scene: Scene): this.type = js.native
      
      /**
        * Set the position of where the Camera is looking within the game.
        * You can also modify the properties `Camera.scrollX` and `Camera.scrollY` directly.
        * Use this method, or the scroll properties, to move your camera around the game world.
        * 
        * This does not change where the camera viewport is placed. See `setPosition` to control that.
        * @param x The x coordinate of the Camera in the game world.
        * @param y The y coordinate of the Camera in the game world. Default x.
        */
      def setScroll(x: Double): this.type = js.native
      def setScroll(x: Double, y: Double): this.type = js.native
      
      /**
        * Set the size of the Camera viewport.
        * 
        * By default a Camera is the same size as the game, but can be made smaller via this method,
        * allowing you to create mini-cam style effects by creating and positioning a smaller Camera
        * viewport within your game.
        * @param width The width of the Camera viewport.
        * @param height The height of the Camera viewport. Default width.
        */
      def setSize(width: integer): this.type = js.native
      def setSize(width: integer, height: integer): this.type = js.native
      
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
      def setViewport(x: Double, y: Double, width: integer): this.type = js.native
      def setViewport(x: Double, y: Double, width: integer, height: integer): this.type = js.native
      
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
      def setZoom(): this.type = js.native
      def setZoom(value: Double): this.type = js.native
      
      /**
        * Returns an Object suitable for JSON storage containing all of the Camera viewport and rendering properties.
        */
      def toJSON(): JSONCamera = js.native
      
      /**
        * Does this Camera have a transparent background?
        */
      var transparent: Boolean = js.native
      
      /**
        * Internal method called automatically by the Camera Manager.
        * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
        * @param delta The delta time, in ms, elapsed since the last frame.
        */
      /* protected */ def update(time: integer, delta: Double): Unit = js.native
      
      /**
        * Is this Camera using a bounds to restrict scrolling movement?
        * 
        * Set this property along with the bounds via `Camera.setBounds`.
        */
      var useBounds: Boolean = js.native
      
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
    trait Camera
      extends StObject
         with BaseCamera
         with Flip
         with Tint {
      
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
        * If this Camera was set to render to a texture, this will clear the resources it was using and
        * redirect it to render back to the primary Canvas again.
        * 
        * If you only wish to temporarily disable rendering to a texture then you can toggle the
        * property `renderToTexture` instead.
        */
      def clearRenderToTexture(): this.type = js.native
      
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
      ): this.type = js.native
      
      /**
        * The Camera Fade effect handler.
        * To fade this camera see the `Camera.fade` methods.
        */
      var fadeEffect: Fade = js.native
      
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
      ): this.type = js.native
      
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
      ): this.type = js.native
      
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
      ): this.type = js.native
      
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
      ): this.type = js.native
      
      /**
        * The Camera Flash effect handler.
        * To flash this camera see the `Camera.flash` method.
        */
      var flashEffect: Flash = js.native
      
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
      def pan(x: Double, y: Double): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: String): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: String, force: Boolean): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: String,
        force: Boolean,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: String, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: String,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: String, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: String, force: Unit, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: String,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: js.Function): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: js.Function, force: Boolean): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: js.Function,
        force: Boolean,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: js.Function,
        force: Unit,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: js.Function, force: Unit, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: js.Function,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: Unit, force: Boolean): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: Unit, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: Unit, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: Unit,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: Unit, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def pan(x: Double, y: Double, duration: Unit, ease: Unit, force: Unit, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: Unit,
        ease: Unit,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: integer): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: String): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: String, force: Boolean): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: String,
        force: Boolean,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: String, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: String,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: String,
        force: Unit,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: String, force: Unit, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: String,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: js.Function): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: js.Function, force: Boolean): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Unit,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Unit,
        callback: CameraPanCallback
      ): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: js.Function,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: Unit, force: Boolean): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: Unit,
        force: Boolean,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: Unit, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: Unit,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: Unit, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def pan(x: Double, y: Double, duration: integer, ease: Unit, force: Unit, callback: CameraPanCallback): this.type = js.native
      def pan(
        x: Double,
        y: Double,
        duration: integer,
        ease: Unit,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      
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
        * If this Camera is rendering to a texture (via `setRenderToTexture`) then you
        * have the option to control if it should also render to the Game canvas as well.
        * 
        * By default, a Camera will render both to its texture and to the Game canvas.
        * 
        * However, if you set ths property to `false` it will only render to the texture
        * and skip rendering to the Game canvas.
        * 
        * Setting this property if the Camera isn't rendering to a texture has no effect.
        */
      var renderToGame: Boolean = js.native
      
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
        * Resets any active FX, such as a fade, flash or shake. Useful to call after a fade in order to
        * remove the fade.
        */
      def resetFX(): this.type = js.native
      
      /**
        * This effect will rotate the Camera so that the viewport finishes at the given angle in radians,
        * over the duration and with the ease specified.
        * @param radians The destination angle in radians to rotate the Camera viewport to. If the angle is positive then the rotation is clockwise else anticlockwise
        * @param shortestPath If shortest path is set to true the camera will rotate in the quickest direction clockwise or anti-clockwise. Default false.
        * @param duration The duration of the effect in milliseconds. Default 1000.
        * @param ease The ease to use for the rotation. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
        * @param force Force the rotation effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
        * the current camera rotation angle in radians.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def rotateTo(
        radians: Double,
        shortestPath: js.UndefOr[Boolean],
        duration: js.UndefOr[integer],
        ease: js.UndefOr[String | js.Function],
        force: js.UndefOr[Boolean],
        callback: js.UndefOr[CameraRotateCallback],
        context: js.UndefOr[js.Any]
      ): Camera = js.native
      
      /**
        * The Camera Rotate To effect handler.
        * To rotate this camera see the `Camera.rotateTo` method.
        */
      var rotateToEffect: RotateTo = js.native
      
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
      def setDeadzone(): this.type = js.native
      def setDeadzone(width: Double): this.type = js.native
      def setDeadzone(width: Double, height: Double): this.type = js.native
      def setDeadzone(width: Unit, height: Double): this.type = js.native
      
      /**
        * Sets the horizontal and vertical offset of the camera from its follow target.
        * The values are subtracted from the targets position during the Cameras update step.
        * @param x The horizontal offset from the camera follow target.x position. Default 0.
        * @param y The vertical offset from the camera follow target.y position. Default 0.
        */
      def setFollowOffset(): this.type = js.native
      def setFollowOffset(x: Double): this.type = js.native
      def setFollowOffset(x: Double, y: Double): this.type = js.native
      def setFollowOffset(x: Unit, y: Double): this.type = js.native
      
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
      def setLerp(x: Unit, y: Double): this.type = js.native
      
      /**
        * Sets the WebGL pipeline this Camera is using when rendering to a texture.
        * 
        * You can pass either the string-based name of the pipeline, or a reference to the pipeline itself.
        * 
        * Call this method with no arguments to clear any previously set pipeline.
        * @param pipeline The WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference. Or if left empty it will clear the pipeline.
        */
      def setPipeline(): this.type = js.native
      def setPipeline(pipeline: String): this.type = js.native
      def setPipeline(pipeline: WebGLPipeline): this.type = js.native
      
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
        * If you only require the Camera to render to a texture, and not also to the Game,
        * them set the `renderToGame` parameter to `false`.
        * 
        * To temporarily disable rendering to a texture, toggle the `renderToTexture` boolean.
        * 
        * If you no longer require the Camera to render to a texture, call the `clearRenderToTexture` method,
        * which will delete the respective textures and free-up resources.
        * @param pipeline An optional WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference.
        * @param renderToGame If you do not need the Camera to still render to the Game, set this parameter to `false`. Default true.
        */
      def setRenderToTexture(): this.type = js.native
      def setRenderToTexture(pipeline: String): this.type = js.native
      def setRenderToTexture(pipeline: String, renderToGame: Boolean): this.type = js.native
      def setRenderToTexture(pipeline: Unit, renderToGame: Boolean): this.type = js.native
      def setRenderToTexture(pipeline: WebGLPipeline): this.type = js.native
      def setRenderToTexture(pipeline: WebGLPipeline, renderToGame: Boolean): this.type = js.native
      
      /**
        * Shakes the Camera by the given intensity over the duration specified.
        * @param duration The duration of the effect in milliseconds. Default 100.
        * @param intensity The intensity of the shake. Default 0.05.
        * @param force Force the shake effect to start immediately, even if already running. Default false.
        * @param callback This callback will be invoked every frame for the duration of the effect.
        * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
        * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
        */
      def shake(): this.type = js.native
      def shake(duration: Unit, intensity: Double): this.type = js.native
      def shake(duration: Unit, intensity: Double, force: Boolean): this.type = js.native
      def shake(duration: Unit, intensity: Double, force: Boolean, callback: js.Function): this.type = js.native
      def shake(duration: Unit, intensity: Double, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Double, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Double, force: Unit, callback: js.Function): this.type = js.native
      def shake(duration: Unit, intensity: Double, force: Unit, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Double, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Unit, force: Boolean): this.type = js.native
      def shake(duration: Unit, intensity: Unit, force: Boolean, callback: js.Function): this.type = js.native
      def shake(duration: Unit, intensity: Unit, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Unit, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Unit, force: Unit, callback: js.Function): this.type = js.native
      def shake(duration: Unit, intensity: Unit, force: Unit, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Unit, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Vector2): this.type = js.native
      def shake(duration: Unit, intensity: Vector2, force: Boolean): this.type = js.native
      def shake(duration: Unit, intensity: Vector2, force: Boolean, callback: js.Function): this.type = js.native
      def shake(duration: Unit, intensity: Vector2, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Vector2, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Vector2, force: Unit, callback: js.Function): this.type = js.native
      def shake(duration: Unit, intensity: Vector2, force: Unit, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: Unit, intensity: Vector2, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: integer): this.type = js.native
      def shake(duration: integer, intensity: Double): this.type = js.native
      def shake(duration: integer, intensity: Double, force: Boolean): this.type = js.native
      def shake(duration: integer, intensity: Double, force: Boolean, callback: js.Function): this.type = js.native
      def shake(duration: integer, intensity: Double, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Double, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Double, force: Unit, callback: js.Function): this.type = js.native
      def shake(duration: integer, intensity: Double, force: Unit, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Double, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Unit, force: Boolean): this.type = js.native
      def shake(duration: integer, intensity: Unit, force: Boolean, callback: js.Function): this.type = js.native
      def shake(duration: integer, intensity: Unit, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Unit, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Unit, force: Unit, callback: js.Function): this.type = js.native
      def shake(duration: integer, intensity: Unit, force: Unit, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Unit, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Vector2): this.type = js.native
      def shake(duration: integer, intensity: Vector2, force: Boolean): this.type = js.native
      def shake(duration: integer, intensity: Vector2, force: Boolean, callback: js.Function): this.type = js.native
      def shake(duration: integer, intensity: Vector2, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Vector2, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Vector2, force: Unit, callback: js.Function): this.type = js.native
      def shake(duration: integer, intensity: Vector2, force: Unit, callback: js.Function, context: js.Any): this.type = js.native
      def shake(duration: integer, intensity: Vector2, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      
      /**
        * The Camera Shake effect handler.
        * To shake this camera see the `Camera.shake` method.
        */
      var shakeEffect: Shake = js.native
      
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
      def startFollow(
        target: GameObject | js.Object,
        roundPixels: js.UndefOr[Boolean],
        lerpX: js.UndefOr[Double],
        lerpY: js.UndefOr[Double],
        offsetX: js.UndefOr[Double],
        offsetY: js.UndefOr[Double]
      ): this.type = js.native
      
      /**
        * Stops a Camera from following a Game Object, if previously set via `Camera.startFollow`.
        */
      def stopFollow(): this.type = js.native
      
      /**
        * The Camera Zoom effect handler.
        * To zoom this camera see the `Camera.zoom` method.
        */
      var zoomEffect: Zoom = js.native
      
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
      def zoomTo(zoom: Double): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: String): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: String, force: Boolean): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: String, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: String, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: Unit,
        ease: String,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: String, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: String, force: Unit, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: Unit,
        ease: String,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: js.Function): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: js.Function, force: Boolean): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: js.Function, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: js.Function, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: Unit,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: js.Function, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: js.Function, force: Unit, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: Unit,
        ease: js.Function,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: Unit, force: Boolean): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: Unit, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: Unit, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: Unit,
        ease: Unit,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: Unit, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: Unit, ease: Unit, force: Unit, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: Unit,
        ease: Unit,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: integer): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String, force: Boolean): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: String,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: String, force: Unit, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: String,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Boolean): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: Unit,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: js.Function,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Unit, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: js.Function,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: Unit, force: Boolean): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: Unit, force: Boolean, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: Unit, force: Boolean, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: Unit,
        force: Boolean,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: Unit, force: Unit, callback: Unit, context: js.Any): this.type = js.native
      def zoomTo(zoom: Double, duration: integer, ease: Unit, force: Unit, callback: CameraPanCallback): this.type = js.native
      def zoomTo(
        zoom: Double,
        duration: integer,
        ease: Unit,
        force: Unit,
        callback: CameraPanCallback,
        context: js.Any
      ): this.type = js.native
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
    trait CameraManager extends StObject {
      
      /**
        * A default un-transformed Camera that doesn't exist on the camera list and doesn't
        * count towards the total number of cameras being managed. It exists for other
        * systems, as well as your own code, should they require a basic un-transformed
        * camera instance from which to calculate a view matrix.
        */
      var default: Camera = js.native
      
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
      
      /**
        * An Array of the Camera objects being managed by this Camera Manager.
        * The Cameras are updated and rendered in the same order in which they appear in this array.
        * Do not directly add or remove entries to this array. However, you can move the contents
        * around the array should you wish to adjust the display order.
        */
      var cameras: js.Array[Camera] = js.native
      
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
        * The main update loop. Called automatically when the Scene steps.
        * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
        * @param delta The delta time, in ms, elapsed since the last frame.
        */
      /* protected */ def update(time: integer, delta: Double): Unit = js.native
    }
    
    object Effects {
      
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
      trait Fade extends StObject {
        
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit
        
        /**
          * The direction of the fade.
          * `true` = fade out (transparent to color), `false` = fade in (color to transparent)
          */
        val direction: Boolean
        
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer
        
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit
        
        /**
          * Has this effect finished running?
          * 
          * This is different from `isRunning` because it remains set to `true` when the effect is over,
          * until the effect is either reset or started again.
          */
        val isComplete: Boolean
        
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean
        
        /**
          * Called internally by the Canvas Renderer.
          * @param ctx The Canvas context to render to.
          */
        def postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean
        
        /**
          * Called internally by the WebGL Renderer.
          * @param pipeline The WebGL Pipeline to render to.
          * @param getTintFunction A function that will return the gl safe tint colors.
          */
        def postRenderWebGL(pipeline: TextureTintPipeline, getTintFunction: js.Function): Boolean
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit
        
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
        ): Camera
        
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit
      }
      object Fade {
        
        @scala.inline
        def apply(
          camera: Camera,
          destroy: () => Unit,
          direction: Boolean,
          duration: integer,
          effectComplete: () => Unit,
          isComplete: Boolean,
          isRunning: Boolean,
          postRenderCanvas: CanvasRenderingContext2D => Boolean,
          postRenderWebGL: (TextureTintPipeline, js.Function) => Boolean,
          progress: Double,
          reset: () => Unit,
          start: (js.UndefOr[Boolean], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[Boolean], js.UndefOr[CameraFadeCallback], js.UndefOr[js.Any]) => Camera,
          update: (integer, Double) => Unit
        ): Fade = {
          val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effectComplete = js.Any.fromFunction0(effectComplete), isComplete = isComplete.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], postRenderCanvas = js.Any.fromFunction1(postRenderCanvas), postRenderWebGL = js.Any.fromFunction2(postRenderWebGL), progress = progress.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction8(start), update = js.Any.fromFunction2(update))
          __obj.asInstanceOf[Fade]
        }
        
        @scala.inline
        implicit class FadeMutableBuilder[Self <: Fade] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
          
          @scala.inline
          def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEffectComplete(value: () => Unit): Self = StObject.set(x, "effectComplete", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPostRenderCanvas(value: CanvasRenderingContext2D => Boolean): Self = StObject.set(x, "postRenderCanvas", js.Any.fromFunction1(value))
          
          @scala.inline
          def setPostRenderWebGL(value: (TextureTintPipeline, js.Function) => Boolean): Self = StObject.set(x, "postRenderWebGL", js.Any.fromFunction2(value))
          
          @scala.inline
          def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
          
          @scala.inline
          def setStart(
            value: (js.UndefOr[Boolean], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[Boolean], js.UndefOr[CameraFadeCallback], js.UndefOr[js.Any]) => Camera
          ): Self = StObject.set(x, "start", js.Any.fromFunction8(value))
          
          @scala.inline
          def setUpdate(value: (integer, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
        }
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
      trait Flash extends StObject {
        
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit
        
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer
        
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit
        
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean
        
        /**
          * Called internally by the Canvas Renderer.
          * @param ctx The Canvas context to render to.
          */
        def postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean
        
        /**
          * Called internally by the WebGL Renderer.
          * @param pipeline The WebGL Pipeline to render to.
          * @param getTintFunction A function that will return the gl safe tint colors.
          */
        def postRenderWebGL(pipeline: TextureTintPipeline, getTintFunction: js.Function): Boolean
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit
        
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
        ): Camera
        
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit
      }
      object Flash {
        
        @scala.inline
        def apply(
          camera: Camera,
          destroy: () => Unit,
          duration: integer,
          effectComplete: () => Unit,
          isRunning: Boolean,
          postRenderCanvas: CanvasRenderingContext2D => Boolean,
          postRenderWebGL: (TextureTintPipeline, js.Function) => Boolean,
          progress: Double,
          reset: () => Unit,
          start: (js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[Boolean], js.UndefOr[CameraFlashCallback], js.UndefOr[js.Any]) => Camera,
          update: (integer, Double) => Unit
        ): Flash = {
          val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], effectComplete = js.Any.fromFunction0(effectComplete), isRunning = isRunning.asInstanceOf[js.Any], postRenderCanvas = js.Any.fromFunction1(postRenderCanvas), postRenderWebGL = js.Any.fromFunction2(postRenderWebGL), progress = progress.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction7(start), update = js.Any.fromFunction2(update))
          __obj.asInstanceOf[Flash]
        }
        
        @scala.inline
        implicit class FlashMutableBuilder[Self <: Flash] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
          
          @scala.inline
          def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEffectComplete(value: () => Unit): Self = StObject.set(x, "effectComplete", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPostRenderCanvas(value: CanvasRenderingContext2D => Boolean): Self = StObject.set(x, "postRenderCanvas", js.Any.fromFunction1(value))
          
          @scala.inline
          def setPostRenderWebGL(value: (TextureTintPipeline, js.Function) => Boolean): Self = StObject.set(x, "postRenderWebGL", js.Any.fromFunction2(value))
          
          @scala.inline
          def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
          
          @scala.inline
          def setStart(
            value: (js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[integer], js.UndefOr[Boolean], js.UndefOr[CameraFlashCallback], js.UndefOr[js.Any]) => Camera
          ): Self = StObject.set(x, "start", js.Any.fromFunction7(value))
          
          @scala.inline
          def setUpdate(value: (integer, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
        }
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
      trait Pan extends StObject {
        
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
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        
        /**
          * The ease function to use during the pan.
          */
        var ease: js.Function = js.native
        
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean = js.native
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit = js.native
        
        /**
          * The starting scroll coordinates to pan the camera from.
          */
        var source: Vector2 = js.native
        
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
        def start(x: Double, y: Double, duration: Unit, ease: String): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: String, force: Boolean): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: String,
          force: Boolean,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: String, force: Boolean, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: String,
          force: Boolean,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: String, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: String, force: Unit, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: String,
          force: Unit,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: js.Function): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: js.Function, force: Boolean): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: js.Function,
          force: Boolean,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: js.Function,
          force: Boolean,
          callback: CameraPanCallback
        ): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: js.Function,
          force: Boolean,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: js.Function,
          force: Unit,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: js.Function, force: Unit, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: js.Function,
          force: Unit,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: Unit, force: Boolean): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: Unit, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: Unit, force: Boolean, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: Unit,
          force: Boolean,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: Unit, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(x: Double, y: Double, duration: Unit, ease: Unit, force: Unit, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: Unit,
          ease: Unit,
          force: Unit,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: integer): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: String): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: String, force: Boolean): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: String,
          force: Boolean,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
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
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: String,
          force: Unit,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: String, force: Unit, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: String,
          force: Unit,
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
          callback: Unit,
          context: js.Any
        ): Camera = js.native
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
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: js.Function,
          force: Unit,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: js.Function,
          force: Unit,
          callback: CameraPanCallback
        ): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: js.Function,
          force: Unit,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: Unit, force: Boolean): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: Unit,
          force: Boolean,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: Unit, force: Boolean, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: Unit,
          force: Boolean,
          callback: CameraPanCallback,
          context: js.Any
        ): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: Unit, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(x: Double, y: Double, duration: integer, ease: Unit, force: Unit, callback: CameraPanCallback): Camera = js.native
        def start(
          x: Double,
          y: Double,
          duration: integer,
          ease: Unit,
          force: Unit,
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
        * A Camera Rotate effect.
        * 
        * This effect will rotate the Camera so that the its viewport finishes at the given angle in radians,
        * over the duration and with the ease specified.
        * 
        * Camera rotation always takes place based on the Camera viewport. By default, rotation happens
        * in the center of the viewport. You can adjust this with the `originX` and `originY` properties.
        * 
        * Rotation influences the rendering of _all_ Game Objects visible by this Camera. However, it does not
        * rotate the Camera viewport itself, which always remains an axis-aligned rectangle.
        * 
        * Only the camera is rotates. None of the objects it is displaying are impacted, i.e. their positions do
        * not change.
        * 
        * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
        * which is invoked each frame for the duration of the effect if required.
        */
      trait RotateTo extends StObject {
        
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera
        
        /**
          * The direction of the rotation.
          */
        var clockwise: Boolean
        
        /**
          * The constantly updated value based on the force.
          */
        var current: Double
        
        /**
          * The destination angle in radians to rotate the camera to.
          */
        var destination: Double
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit
        
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer
        
        /**
          * The ease function to use during the Rotate.
          */
        var ease: js.Function
        
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit
        
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit
        
        /**
          * The shortest direction to the target rotation.
          */
        var shortestPath: Boolean
        
        /**
          * The starting angle to rotate the camera from.
          */
        var source: Double
        
        /**
          * This effect will scroll the Camera so that the center of its viewport finishes at the given angle,
          * over the duration and with the ease specified.
          * @param radians The destination angle in radians to rotate the Camera viewport to. If the angle is positive then the rotation is clockwise else anticlockwise
          * @param shortestPath If shortest path is set to true the camera will rotate in the quickest direction clockwise or anti-clockwise. Default false.
          * @param duration The duration of the effect in milliseconds. Default 1000.
          * @param ease The ease to use for the Rotate. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
          * @param force Force the rotation effect to start immediately, even if already running. Default false.
          * @param callback This callback will be invoked every frame for the duration of the effect.
          * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
          * the current camera scroll x coordinate and the current camera scroll y coordinate.
          * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
          */
        def start(
          radians: Double,
          shortestPath: js.UndefOr[Boolean],
          duration: js.UndefOr[integer],
          ease: js.UndefOr[String | js.Function],
          force: js.UndefOr[Boolean],
          callback: js.UndefOr[CameraRotateCallback],
          context: js.UndefOr[js.Any]
        ): Camera
        
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        def update(time: integer, delta: Double): Unit
      }
      object RotateTo {
        
        @scala.inline
        def apply(
          camera: Camera,
          clockwise: Boolean,
          current: Double,
          destination: Double,
          destroy: () => Unit,
          duration: integer,
          ease: js.Function,
          effectComplete: () => Unit,
          isRunning: Boolean,
          progress: Double,
          reset: () => Unit,
          shortestPath: Boolean,
          source: Double,
          start: (Double, js.UndefOr[Boolean], js.UndefOr[integer], js.UndefOr[String | js.Function], js.UndefOr[Boolean], js.UndefOr[CameraRotateCallback], js.UndefOr[js.Any]) => Camera,
          update: (integer, Double) => Unit
        ): RotateTo = {
          val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], clockwise = clockwise.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], effectComplete = js.Any.fromFunction0(effectComplete), isRunning = isRunning.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), shortestPath = shortestPath.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = js.Any.fromFunction7(start), update = js.Any.fromFunction2(update))
          __obj.asInstanceOf[RotateTo]
        }
        
        @scala.inline
        implicit class RotateToMutableBuilder[Self <: RotateTo] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
          
          @scala.inline
          def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEase(value: js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEffectComplete(value: () => Unit): Self = StObject.set(x, "effectComplete", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
          
          @scala.inline
          def setShortestPath(value: Boolean): Self = StObject.set(x, "shortestPath", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStart(
            value: (Double, js.UndefOr[Boolean], js.UndefOr[integer], js.UndefOr[String | js.Function], js.UndefOr[Boolean], js.UndefOr[CameraRotateCallback], js.UndefOr[js.Any]) => Camera
          ): Self = StObject.set(x, "start", js.Any.fromFunction7(value))
          
          @scala.inline
          def setUpdate(value: (integer, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
        }
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
      trait Shake extends StObject {
        
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera = js.native
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        
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
          * The pre-render step for this effect. Called automatically by the Camera.
          */
        def preRender(): Unit = js.native
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        
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
        def start(duration: Unit, intensity: Double): Camera = js.native
        def start(duration: Unit, intensity: Double, force: Boolean): Camera = js.native
        def start(duration: Unit, intensity: Double, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Double, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(duration: Unit, intensity: Double, force: Boolean, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Double, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Double, force: Unit, callback: CameraShakeCallback): Camera = js.native
        def start(duration: Unit, intensity: Double, force: Unit, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Unit, force: Boolean): Camera = js.native
        def start(duration: Unit, intensity: Unit, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Unit, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(duration: Unit, intensity: Unit, force: Boolean, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Unit, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Unit, force: Unit, callback: CameraShakeCallback): Camera = js.native
        def start(duration: Unit, intensity: Unit, force: Unit, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Vector2): Camera = js.native
        def start(duration: Unit, intensity: Vector2, force: Boolean): Camera = js.native
        def start(duration: Unit, intensity: Vector2, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Vector2, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(duration: Unit, intensity: Vector2, force: Boolean, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Vector2, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: Unit, intensity: Vector2, force: Unit, callback: CameraShakeCallback): Camera = js.native
        def start(duration: Unit, intensity: Vector2, force: Unit, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: integer): Camera = js.native
        def start(duration: integer, intensity: Double): Camera = js.native
        def start(duration: integer, intensity: Double, force: Boolean): Camera = js.native
        def start(duration: integer, intensity: Double, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Double, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(
          duration: integer,
          intensity: Double,
          force: Boolean,
          callback: CameraShakeCallback,
          context: js.Any
        ): Camera = js.native
        def start(duration: integer, intensity: Double, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Double, force: Unit, callback: CameraShakeCallback): Camera = js.native
        def start(duration: integer, intensity: Double, force: Unit, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Unit, force: Boolean): Camera = js.native
        def start(duration: integer, intensity: Unit, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Unit, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(duration: integer, intensity: Unit, force: Boolean, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Unit, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Unit, force: Unit, callback: CameraShakeCallback): Camera = js.native
        def start(duration: integer, intensity: Unit, force: Unit, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Vector2): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Boolean): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Boolean, callback: CameraShakeCallback): Camera = js.native
        def start(
          duration: integer,
          intensity: Vector2,
          force: Boolean,
          callback: CameraShakeCallback,
          context: js.Any
        ): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Unit, callback: CameraShakeCallback): Camera = js.native
        def start(duration: integer, intensity: Vector2, force: Unit, callback: CameraShakeCallback, context: js.Any): Camera = js.native
        
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
      trait Zoom extends StObject {
        
        /**
          * The Camera this effect belongs to.
          */
        val camera: Camera = js.native
        
        /**
          * The destination zoom value.
          */
        var destination: Double = js.native
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        def destroy(): Unit = js.native
        
        /**
          * The duration of the effect, in milliseconds.
          */
        val duration: integer = js.native
        
        /**
          * The ease function to use during the zoom.
          */
        var ease: js.Function = js.native
        
        /**
          * Called internally when the effect completes.
          */
        def effectComplete(): Unit = js.native
        
        /**
          * Is this effect actively running?
          */
        val isRunning: Boolean = js.native
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        var progress: Double = js.native
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        def reset(): Unit = js.native
        
        /**
          * The starting zoom value;
          */
        var source: Double = js.native
        
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
        def start(zoom: Double, duration: Unit, ease: String): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: String, force: Boolean): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: String, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: String, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: Unit,
          ease: String,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: String, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: String, force: Unit, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: Unit,
          ease: String,
          force: Unit,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: js.Function): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: js.Function, force: Boolean): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: js.Function, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: js.Function, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: Unit,
          ease: js.Function,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: js.Function, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: js.Function, force: Unit, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: Unit,
          ease: js.Function,
          force: Unit,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: Unit, force: Boolean): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: Unit, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: Unit, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: Unit,
          ease: Unit,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: Unit, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: Unit, ease: Unit, force: Unit, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: Unit,
          ease: Unit,
          force: Unit,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String, force: Boolean): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: String,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: integer, ease: String, force: Unit, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: String,
          force: Unit,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function, force: Boolean): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: js.Function,
          force: Boolean,
          callback: Unit,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: js.Function,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: integer, ease: js.Function, force: Unit, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: js.Function,
          force: Unit,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer, ease: Unit, force: Boolean): Camera = js.native
        def start(zoom: Double, duration: integer, ease: Unit, force: Boolean, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: integer, ease: Unit, force: Boolean, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: Unit,
          force: Boolean,
          callback: CameraZoomCallback,
          context: js.Any
        ): Camera = js.native
        def start(zoom: Double, duration: integer, ease: Unit, force: Unit, callback: Unit, context: js.Any): Camera = js.native
        def start(zoom: Double, duration: integer, ease: Unit, force: Unit, callback: CameraZoomCallback): Camera = js.native
        def start(
          zoom: Double,
          duration: integer,
          ease: Unit,
          force: Unit,
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
  }
}
