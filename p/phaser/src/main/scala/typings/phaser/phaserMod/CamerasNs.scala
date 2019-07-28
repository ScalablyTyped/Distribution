package typings.phaser.phaserMod

import typings.phaser.PhaserNs.TypesNs.CamerasNs.ControlsNs.FixedKeyControlConfig
import typings.phaser.PhaserNs.TypesNs.CamerasNs.ControlsNs.SmoothedKeyControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Cameras")
@js.native
object CamerasNs extends js.Object {
  @JSName("Controls")
  @js.native
  object ControlsNs extends js.Object {
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
    class FixedKeyControl protected ()
      extends typings.phaser.PhaserNs.CamerasNs.ControlsNs.FixedKeyControl {
      /**
        * 
        * @param config The Fixed Key Control configuration object.
        */
      def this(config: FixedKeyControlConfig) = this()
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
    class SmoothedKeyControl protected ()
      extends typings.phaser.PhaserNs.CamerasNs.ControlsNs.SmoothedKeyControl {
      /**
        * 
        * @param config The Smoothed Key Control configuration object.
        */
      def this(config: SmoothedKeyControlConfig) = this()
    }
    
  }
  
  @JSName("Scene2D")
  @js.native
  object Scene2DNs extends js.Object {
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
      extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.BaseCamera {
      /**
        * 
        * @param x The x position of the Camera, relative to the top-left of the game canvas.
        * @param y The y position of the Camera, relative to the top-left of the game canvas.
        * @param width The width of the Camera, in pixels.
        * @param height The height of the Camera, in pixels.
        */
      def this(x: Double, y: Double, width: Double, height: Double) = this()
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
      extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera {
      /**
        * 
        * @param x The x position of the Camera, relative to the top-left of the game canvas.
        * @param y The y position of the Camera, relative to the top-left of the game canvas.
        * @param width The width of the Camera, in pixels.
        * @param height The height of the Camera, in pixels.
        */
      def this(x: Double, y: Double, width: Double, height: Double) = this()
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
    class CameraManager protected ()
      extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.CameraManager {
      /**
        * 
        * @param scene The Scene that owns the Camera Manager plugin.
        */
      def this(scene: typings.phaser.PhaserNs.Scene) = this()
    }
    
    @JSName("Effects")
    @js.native
    object EffectsNs extends js.Object {
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
      class Fade protected ()
        extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Fade {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera) = this()
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
      class Flash protected ()
        extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Flash {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera) = this()
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
      class Pan protected ()
        extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Pan {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera) = this()
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
      class Shake protected ()
        extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Shake {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera) = this()
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
      class Zoom protected ()
        extends typings.phaser.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Zoom {
        /**
          * 
          * @param camera The camera this effect is acting upon.
          */
        def this(camera: typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera) = this()
      }
      
    }
    
    @JSName("Events")
    @js.native
    object EventsNs extends js.Object {
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

