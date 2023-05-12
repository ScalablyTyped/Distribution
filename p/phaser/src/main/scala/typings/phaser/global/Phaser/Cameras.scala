package typings.phaser.global.Phaser

import typings.phaser.CameraRotateCallback
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Keyboard.Key
import typings.phaser.Phaser.Renderer.WebGL.Pipelines.MultiPipeline
import typings.phaser.Phaser.Types.Cameras.Controls.FixedKeyControlConfig
import typings.phaser.Phaser.Types.Cameras.Controls.SmoothedKeyControlConfig
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraFadeCallback
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraFlashCallback
import typings.std.CanvasRenderingContext2D
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
    @JSGlobal("Phaser.Cameras.Controls.FixedKeyControl")
    @js.native
    open class FixedKeyControl protected ()
      extends StObject
         with typings.phaser.Phaser.Cameras.Controls.FixedKeyControl {
      /**
        * 
        * @param config The Fixed Key Control configuration object.
        */
      def this(config: FixedKeyControlConfig) = this()
      
      /**
        * A flag controlling if the Controls will update the Camera or not.
        */
      /* CompleteClass */
      var active: Boolean = js.native
      
      /**
        * The Camera that this Control will update.
        */
      /* CompleteClass */
      var camera: Camera | Null = js.native
      
      /**
        * Destroys this Key Control.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      /* CompleteClass */
      var down: Key | Null = js.native
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      /* CompleteClass */
      var left: Key | Null = js.native
      
      /**
        * The largest zoom value the camera will reach when zoomed in.
        */
      /* CompleteClass */
      var maxZoom: Double = js.native
      
      /**
        * The smallest zoom value the camera will reach when zoomed out.
        */
      /* CompleteClass */
      var minZoom: Double = js.native
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      /* CompleteClass */
      var right: Key | Null = js.native
      
      /**
        * Binds this Key Control to a camera.
        * @param camera The camera to bind this Key Control to.
        */
      /* CompleteClass */
      override def setCamera(camera: Camera): this.type = js.native
      
      /**
        * The horizontal speed the camera will move.
        */
      /* CompleteClass */
      var speedX: Double = js.native
      
      /**
        * The vertical speed the camera will move.
        */
      /* CompleteClass */
      var speedY: Double = js.native
      
      /**
        * Starts the Key Control running, providing it has been linked to a camera.
        */
      /* CompleteClass */
      override def start(): this.type = js.native
      
      /**
        * Stops this Key Control from running. Call `start` to start it again.
        */
      /* CompleteClass */
      override def stop(): this.type = js.native
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      /* CompleteClass */
      var up: Key | Null = js.native
      
      /**
        * Applies the results of pressing the control keys to the Camera.
        * 
        * You must call this every step, it is not called automatically.
        * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
        */
      /* CompleteClass */
      override def update(delta: Double): Unit = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      /* CompleteClass */
      var zoomIn: Key | Null = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      /* CompleteClass */
      var zoomOut: Key | Null = js.native
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      /* CompleteClass */
      var zoomSpeed: Double = js.native
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
    @JSGlobal("Phaser.Cameras.Controls.SmoothedKeyControl")
    @js.native
    open class SmoothedKeyControl protected ()
      extends StObject
         with typings.phaser.Phaser.Cameras.Controls.SmoothedKeyControl {
      /**
        * 
        * @param config The Smoothed Key Control configuration object.
        */
      def this(config: SmoothedKeyControlConfig) = this()
      
      /**
        * The horizontal acceleration the camera will move.
        */
      /* CompleteClass */
      var accelX: Double = js.native
      
      /**
        * The vertical acceleration the camera will move.
        */
      /* CompleteClass */
      var accelY: Double = js.native
      
      /**
        * A flag controlling if the Controls will update the Camera or not.
        */
      /* CompleteClass */
      var active: Boolean = js.native
      
      /**
        * The Camera that this Control will update.
        */
      /* CompleteClass */
      var camera: Camera | Null = js.native
      
      /**
        * Destroys this Key Control.
        */
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      /* CompleteClass */
      var down: Key | Null = js.native
      
      /**
        * The horizontal drag applied to the camera when it is moving.
        */
      /* CompleteClass */
      var dragX: Double = js.native
      
      /**
        * The vertical drag applied to the camera when it is moving.
        */
      /* CompleteClass */
      var dragY: Double = js.native
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      /* CompleteClass */
      var left: Key | Null = js.native
      
      /**
        * The maximum horizontal speed the camera will move.
        */
      /* CompleteClass */
      var maxSpeedX: Double = js.native
      
      /**
        * The maximum vertical speed the camera will move.
        */
      /* CompleteClass */
      var maxSpeedY: Double = js.native
      
      /**
        * The largest zoom value the camera will reach when zoomed in.
        */
      /* CompleteClass */
      var maxZoom: Double = js.native
      
      /**
        * The smallest zoom value the camera will reach when zoomed out.
        */
      /* CompleteClass */
      var minZoom: Double = js.native
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      /* CompleteClass */
      var right: Key | Null = js.native
      
      /**
        * Binds this Key Control to a camera.
        * @param camera The camera to bind this Key Control to.
        */
      /* CompleteClass */
      override def setCamera(camera: Camera): this.type = js.native
      
      /**
        * Starts the Key Control running, providing it has been linked to a camera.
        */
      /* CompleteClass */
      override def start(): this.type = js.native
      
      /**
        * Stops this Key Control from running. Call `start` to start it again.
        */
      /* CompleteClass */
      override def stop(): this.type = js.native
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      /* CompleteClass */
      var up: Key | Null = js.native
      
      /**
        * Applies the results of pressing the control keys to the Camera.
        * 
        * You must call this every step, it is not called automatically.
        * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
        */
      /* CompleteClass */
      override def update(delta: Double): Unit = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      /* CompleteClass */
      var zoomIn: Key | Null = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      /* CompleteClass */
      var zoomOut: Key | Null = js.native
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      /* CompleteClass */
      var zoomSpeed: Double = js.native
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
    @JSGlobal("Phaser.Cameras.Scene2D.BaseCamera")
    @js.native
    open class BaseCamera protected ()
      extends StObject
         with typings.phaser.Phaser.Cameras.Scene2D.BaseCamera {
      /**
        * 
        * @param x The x position of the Camera, relative to the top-left of the game canvas.
        * @param y The y position of the Camera, relative to the top-left of the game canvas.
        * @param width The width of the Camera, in pixels.
        * @param height The height of the Camera, in pixels.
        */
      def this(x: Double, y: Double, width: Double, height: Double) = this()
      
      /**
        * Sets the visibility of this Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        * @param value The visible state of the Game Object.
        */
      /* CompleteClass */
      override def setVisible(value: Boolean): this.type = js.native
      
      /**
        * The visible state of the Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        */
      /* CompleteClass */
      var visible: Boolean = js.native
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
    @JSGlobal("Phaser.Cameras.Scene2D.Camera")
    @js.native
    open class Camera protected ()
      extends StObject
         with typings.phaser.Phaser.Cameras.Scene2D.Camera {
      /**
        * 
        * @param x The x position of the Camera, relative to the top-left of the game canvas.
        * @param y The y position of the Camera, relative to the top-left of the game canvas.
        * @param width The width of the Camera, in pixels.
        * @param height The height of the Camera, in pixels.
        */
      def this(x: Double, y: Double, width: Double, height: Double) = this()
      
      /**
        * Sets the visibility of this Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        * @param value The visible state of the Game Object.
        */
      /* CompleteClass */
      override def setVisible(value: Boolean): this.type = js.native
      
      /**
        * The visible state of the Game Object.
        * 
        * An invisible Game Object will skip rendering, but will still process update logic.
        */
      /* CompleteClass */
      var visible: Boolean = js.native
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
    @JSGlobal("Phaser.Cameras.Scene2D.CameraManager")
    @js.native
    open class CameraManager protected ()
      extends StObject
         with typings.phaser.Phaser.Cameras.Scene2D.CameraManager {
      /**
        * 
        * @param scene The Scene that owns the Camera Manager plugin.
        */
      def this(scene: typings.phaser.Phaser.Scene) = this()
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
      @JSGlobal("Phaser.Cameras.Scene2D.Effects.Fade")
      @js.native
      open class Fade protected ()
        extends StObject
           with typings.phaser.Phaser.Cameras.Scene2D.Effects.Fade {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.Phaser.Cameras.Scene2D.Camera) = this()
        
        /**
          * The Camera this effect belongs to.
          */
        /* CompleteClass */
        override val camera: typings.phaser.Phaser.Cameras.Scene2D.Camera = js.native
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /**
          * The direction of the fade.
          * `true` = fade out (transparent to color), `false` = fade in (color to transparent)
          */
        /* CompleteClass */
        override val direction: Boolean = js.native
        
        /**
          * The duration of the effect, in milliseconds.
          */
        /* CompleteClass */
        override val duration: Double = js.native
        
        /**
          * Called internally when the effect completes.
          */
        /* CompleteClass */
        override def effectComplete(): Unit = js.native
        
        /**
          * Has this effect finished running?
          * 
          * This is different from `isRunning` because it remains set to `true` when the effect is over,
          * until the effect is either reset or started again.
          */
        /* CompleteClass */
        override val isComplete: Boolean = js.native
        
        /**
          * Is this effect actively running?
          */
        /* CompleteClass */
        override val isRunning: Boolean = js.native
        
        /**
          * Called internally by the Canvas Renderer.
          * @param ctx The Canvas context to render to.
          */
        /* CompleteClass */
        override def postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = js.native
        
        /**
          * Called internally by the WebGL Renderer.
          * @param pipeline The WebGL Pipeline to render to. Must provide the `drawFillRect` method.
          * @param getTintFunction A function that will return the gl safe tint colors.
          */
        /* CompleteClass */
        override def postRenderWebGL(pipeline: MultiPipeline, getTintFunction: js.Function): Boolean = js.native
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        /* CompleteClass */
        var progress: Double = js.native
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        /* CompleteClass */
        override def reset(): Unit = js.native
        
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
        /* CompleteClass */
        override def start(
          direction: js.UndefOr[Boolean],
          duration: js.UndefOr[Double],
          red: js.UndefOr[Double],
          green: js.UndefOr[Double],
          blue: js.UndefOr[Double],
          force: js.UndefOr[Boolean],
          callback: js.UndefOr[CameraFadeCallback],
          context: js.UndefOr[Any]
        ): typings.phaser.Phaser.Cameras.Scene2D.Camera = js.native
        
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        /* CompleteClass */
        override def update(time: Double, delta: Double): Unit = js.native
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
      @JSGlobal("Phaser.Cameras.Scene2D.Effects.Flash")
      @js.native
      open class Flash protected ()
        extends StObject
           with typings.phaser.Phaser.Cameras.Scene2D.Effects.Flash {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.Phaser.Cameras.Scene2D.Camera) = this()
        
        /**
          * The value of the alpha channel used during the flash effect.
          * A value between 0 and 1.
          */
        /* CompleteClass */
        var alpha: Double = js.native
        
        /**
          * The Camera this effect belongs to.
          */
        /* CompleteClass */
        override val camera: typings.phaser.Phaser.Cameras.Scene2D.Camera = js.native
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /**
          * The duration of the effect, in milliseconds.
          */
        /* CompleteClass */
        override val duration: Double = js.native
        
        /**
          * Called internally when the effect completes.
          */
        /* CompleteClass */
        override def effectComplete(): Unit = js.native
        
        /**
          * Is this effect actively running?
          */
        /* CompleteClass */
        override val isRunning: Boolean = js.native
        
        /**
          * Called internally by the Canvas Renderer.
          * @param ctx The Canvas context to render to.
          */
        /* CompleteClass */
        override def postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = js.native
        
        /**
          * Called internally by the WebGL Renderer.
          * @param pipeline The WebGL Pipeline to render to. Must provide the `drawFillRect` method.
          * @param getTintFunction A function that will return the gl safe tint colors.
          */
        /* CompleteClass */
        override def postRenderWebGL(pipeline: MultiPipeline, getTintFunction: js.Function): Boolean = js.native
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        /* CompleteClass */
        var progress: Double = js.native
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /**
          * Flashes the Camera to or from the given color over the duration specified.
          * @param duration The duration of the effect in milliseconds. Default 250.
          * @param red The amount to flash the red channel towards. A value between 0 and 255. Default 255.
          * @param green The amount to flash the green channel towards. A value between 0 and 255. Default 255.
          * @param blue The amount to flash the blue channel towards. A value between 0 and 255. Default 255.
          * @param force Force the effect to start immediately, even if already running. Default false.
          * @param callback This callback will be invoked every frame for the duration of the effect.
          * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
          * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
          */
        /* CompleteClass */
        override def start(
          duration: js.UndefOr[Double],
          red: js.UndefOr[Double],
          green: js.UndefOr[Double],
          blue: js.UndefOr[Double],
          force: js.UndefOr[Boolean],
          callback: js.UndefOr[CameraFlashCallback],
          context: js.UndefOr[Any]
        ): typings.phaser.Phaser.Cameras.Scene2D.Camera = js.native
        
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        /* CompleteClass */
        override def update(time: Double, delta: Double): Unit = js.native
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
      @JSGlobal("Phaser.Cameras.Scene2D.Effects.Pan")
      @js.native
      open class Pan protected ()
        extends StObject
           with typings.phaser.Phaser.Cameras.Scene2D.Effects.Pan {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.Phaser.Cameras.Scene2D.Camera) = this()
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
      @JSGlobal("Phaser.Cameras.Scene2D.Effects.RotateTo")
      @js.native
      open class RotateTo protected ()
        extends StObject
           with typings.phaser.Phaser.Cameras.Scene2D.Effects.RotateTo {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.Phaser.Cameras.Scene2D.Camera) = this()
        
        /**
          * The Camera this effect belongs to.
          */
        /* CompleteClass */
        override val camera: typings.phaser.Phaser.Cameras.Scene2D.Camera = js.native
        
        /**
          * The direction of the rotation.
          */
        /* CompleteClass */
        var clockwise: Boolean = js.native
        
        /**
          * The constantly updated value based on the force.
          */
        /* CompleteClass */
        var current: Double = js.native
        
        /**
          * The destination angle in radians to rotate the camera to.
          */
        /* CompleteClass */
        var destination: Double = js.native
        
        /**
          * Destroys this effect, releasing it from the Camera.
          */
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /**
          * The duration of the effect, in milliseconds.
          */
        /* CompleteClass */
        override val duration: Double = js.native
        
        /**
          * The ease function to use during the Rotate.
          */
        /* CompleteClass */
        var ease: js.Function = js.native
        
        /**
          * Called internally when the effect completes.
          */
        /* CompleteClass */
        override def effectComplete(): Unit = js.native
        
        /**
          * Is this effect actively running?
          */
        /* CompleteClass */
        override val isRunning: Boolean = js.native
        
        /**
          * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
          */
        /* CompleteClass */
        var progress: Double = js.native
        
        /**
          * Resets this camera effect.
          * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
          */
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /**
          * The shortest direction to the target rotation.
          */
        /* CompleteClass */
        var shortestPath: Boolean = js.native
        
        /**
          * The starting angle to rotate the camera from.
          */
        /* CompleteClass */
        var source: Double = js.native
        
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
        /* CompleteClass */
        override def start(
          radians: Double,
          shortestPath: js.UndefOr[Boolean],
          duration: js.UndefOr[Double],
          ease: js.UndefOr[String | js.Function],
          force: js.UndefOr[Boolean],
          callback: js.UndefOr[CameraRotateCallback],
          context: js.UndefOr[Any]
        ): typings.phaser.Phaser.Cameras.Scene2D.Camera = js.native
        
        /**
          * The main update loop for this effect. Called automatically by the Camera.
          * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
          * @param delta The delta time, in ms, elapsed since the last frame.
          */
        /* CompleteClass */
        override def update(time: Double, delta: Double): Unit = js.native
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
      @JSGlobal("Phaser.Cameras.Scene2D.Effects.Shake")
      @js.native
      open class Shake protected ()
        extends StObject
           with typings.phaser.Phaser.Cameras.Scene2D.Effects.Shake {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.Phaser.Cameras.Scene2D.Camera) = this()
      }
      
      /**
        * A Camera Zoom effect.
        * 
        * This effect will zoom the Camera to the given scale, over the duration and with the ease specified.
        * 
        * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
        * which is invoked each frame for the duration of the effect if required.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Effects.Zoom")
      @js.native
      open class Zoom protected ()
        extends StObject
           with typings.phaser.Phaser.Cameras.Scene2D.Effects.Zoom {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.Phaser.Cameras.Scene2D.Camera) = this()
      }
    }
    
    object Events {
      
      /**
        * The Destroy Camera Event.
        * 
        * This event is dispatched by a Camera instance when it is destroyed by the Camera Manager.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('cameradestroy', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.DESTROY, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.DESTROY")
      @js.native
      val DESTROY: String = js.native
      
      /**
        * The Camera Fade In Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Fade In Effect completes.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeincomplete', listener)`.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.FADE_IN_COMPLETE")
      @js.native
      val FADE_IN_COMPLETE: String = js.native
      
      /**
        * The Camera Fade In Start Event.
        * 
        * This event is dispatched by a Camera instance when the Fade In Effect starts.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeinstart', listener)`.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.FADE_IN_START")
      @js.native
      val FADE_IN_START: String = js.native
      
      /**
        * The Camera Fade Out Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Fade Out Effect completes.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeoutcomplete', listener)`.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.FADE_OUT_COMPLETE")
      @js.native
      val FADE_OUT_COMPLETE: String = js.native
      
      /**
        * The Camera Fade Out Start Event.
        * 
        * This event is dispatched by a Camera instance when the Fade Out Effect starts.
        * 
        * Listen to it from a Camera instance using `Camera.on('camerafadeoutstart', listener)`.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.FADE_OUT_START")
      @js.native
      val FADE_OUT_START: String = js.native
      
      /**
        * The Camera Flash Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Flash Effect completes.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('cameraflashcomplete', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.FLASH_COMPLETE, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.FLASH_COMPLETE")
      @js.native
      val FLASH_COMPLETE: String = js.native
      
      /**
        * The Camera Flash Start Event.
        * 
        * This event is dispatched by a Camera instance when the Flash Effect starts.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('cameraflashstart', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.FLASH_START, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.FLASH_START")
      @js.native
      val FLASH_START: String = js.native
      
      /**
        * The Camera Follower Update Event.
        * 
        * This event is dispatched by a Camera instance when it is following a
        * Game Object and the Camera position has been updated as a result of
        * that following.
        * 
        * Listen to it from a Camera instance using: `camera.on('followupdate', listener)`.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.FOLLOW_UPDATE")
      @js.native
      val FOLLOW_UPDATE: String = js.native
      
      /**
        * The Camera Pan Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Pan Effect completes.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerapancomplete', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.PAN_COMPLETE, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.PAN_COMPLETE")
      @js.native
      val PAN_COMPLETE: String = js.native
      
      /**
        * The Camera Pan Start Event.
        * 
        * This event is dispatched by a Camera instance when the Pan Effect starts.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerapanstart', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.PAN_START, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.PAN_START")
      @js.native
      val PAN_START: String = js.native
      
      /**
        * The Camera Post-Render Event.
        * 
        * This event is dispatched by a Camera instance after is has finished rendering.
        * It is only dispatched if the Camera is rendering to a texture.
        * 
        * Listen to it from a Camera instance using: `camera.on('postrender', listener)`.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.POST_RENDER")
      @js.native
      val POST_RENDER: String = js.native
      
      /**
        * The Camera Pre-Render Event.
        * 
        * This event is dispatched by a Camera instance when it is about to render.
        * It is only dispatched if the Camera is rendering to a texture.
        * 
        * Listen to it from a Camera instance using: `camera.on('prerender', listener)`.
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.PRE_RENDER")
      @js.native
      val PRE_RENDER: String = js.native
      
      /**
        * The Camera Rotate Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Rotate Effect completes.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerarotatecomplete', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.ROTATE_COMPLETE, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.ROTATE_COMPLETE")
      @js.native
      val ROTATE_COMPLETE: String = js.native
      
      /**
        * The Camera Rotate Start Event.
        * 
        * This event is dispatched by a Camera instance when the Rotate Effect starts.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerarotatestart', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.ROTATE_START, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.ROTATE_START")
      @js.native
      val ROTATE_START: String = js.native
      
      /**
        * The Camera Shake Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Shake Effect completes.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerashakecomplete', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.SHAKE_COMPLETE, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.SHAKE_COMPLETE")
      @js.native
      val SHAKE_COMPLETE: String = js.native
      
      /**
        * The Camera Shake Start Event.
        * 
        * This event is dispatched by a Camera instance when the Shake Effect starts.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerashakestart', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.SHAKE_START, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.SHAKE_START")
      @js.native
      val SHAKE_START: String = js.native
      
      /**
        * The Camera Zoom Complete Event.
        * 
        * This event is dispatched by a Camera instance when the Zoom Effect completes.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerazoomcomplete', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.ZOOM_COMPLETE, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.ZOOM_COMPLETE")
      @js.native
      val ZOOM_COMPLETE: String = js.native
      
      /**
        * The Camera Zoom Start Event.
        * 
        * This event is dispatched by a Camera instance when the Zoom Effect starts.
        * 
        * Listen for it via either of the following:
        * 
        * ```js
        * this.cameras.main.on('camerazoomstart', () => {});
        * ```
        * 
        * or use the constant, to avoid having to remember the correct event string:
        * 
        * ```js
        * this.cameras.main.on(Phaser.Cameras.Scene2D.Events.ZOOM_START, () => {});
        * ```
        */
      @JSGlobal("Phaser.Cameras.Scene2D.Events.ZOOM_START")
      @js.native
      val ZOOM_START: String = js.native
    }
  }
}
