package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Keyboard.Key
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cameras {
  
  object Controls {
    
    @js.native
    trait FixedKeyControlConfig extends StObject {
      
      /**
        * The Camera that this Control will update.
        */
      var camera: js.UndefOr[Camera] = js.native
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: js.UndefOr[Key] = js.native
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: js.UndefOr[Key] = js.native
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: js.UndefOr[Key] = js.native
      
      /**
        * The horizontal and vertical speed the camera will move.
        */
      var speed: js.UndefOr[Double | js.Object] = js.native
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: js.UndefOr[Key] = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: js.UndefOr[Key] = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: js.UndefOr[Key] = js.native
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: js.UndefOr[Double] = js.native
    }
    object FixedKeyControlConfig {
      
      @scala.inline
      def apply(): FixedKeyControlConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FixedKeyControlConfig]
      }
      
      @scala.inline
      implicit class FixedKeyControlConfigMutableBuilder[Self <: FixedKeyControlConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
        
        @scala.inline
        def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        @scala.inline
        def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setSpeed(value: Double | js.Object): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
        
        @scala.inline
        def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
        
        @scala.inline
        def setZoomIn(value: Key): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
        
        @scala.inline
        def setZoomOut(value: Key): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
        
        @scala.inline
        def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomSpeedUndefined: Self = StObject.set(x, "zoomSpeed", js.undefined)
      }
    }
    
    @js.native
    trait SmoothedKeyControlConfig extends StObject {
      
      /**
        * The horizontal and vertical acceleration the camera will move.
        */
      var acceleration: js.UndefOr[Double | js.Object] = js.native
      
      /**
        * The Camera that this Control will update.
        */
      var camera: js.UndefOr[Camera] = js.native
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: js.UndefOr[Key] = js.native
      
      /**
        * The horizontal and vertical drag applied to the camera when it is moving.
        */
      var drag: js.UndefOr[Double | js.Object] = js.native
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: js.UndefOr[Key] = js.native
      
      /**
        * The maximum horizontal and vertical speed the camera will move.
        */
      var maxSpeed: js.UndefOr[Double | js.Object] = js.native
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: js.UndefOr[Key] = js.native
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: js.UndefOr[Key] = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: js.UndefOr[Key] = js.native
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: js.UndefOr[Key] = js.native
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: js.UndefOr[Double] = js.native
    }
    object SmoothedKeyControlConfig {
      
      @scala.inline
      def apply(): SmoothedKeyControlConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SmoothedKeyControlConfig]
      }
      
      @scala.inline
      implicit class SmoothedKeyControlConfigMutableBuilder[Self <: SmoothedKeyControlConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAcceleration(value: Double | js.Object): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
        
        @scala.inline
        def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
        
        @scala.inline
        def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        @scala.inline
        def setDrag(value: Double | js.Object): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
        
        @scala.inline
        def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setMaxSpeed(value: Double | js.Object): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxSpeedUndefined: Self = StObject.set(x, "maxSpeed", js.undefined)
        
        @scala.inline
        def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
        
        @scala.inline
        def setZoomIn(value: Key): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
        
        @scala.inline
        def setZoomOut(value: Key): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
        
        @scala.inline
        def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomSpeedUndefined: Self = StObject.set(x, "zoomSpeed", js.undefined)
      }
    }
  }
  
  object Scene2D {
    
    @js.native
    trait CameraConfig extends StObject {
      
      /**
        * A CSS color string controlling the Camera background color.
        */
      var backgroundColor: js.UndefOr[`false` | String] = js.native
      
      /**
        * Defines the Camera bounds.
        */
      var bounds: js.UndefOr[js.Object] = js.native
      
      /**
        * The height of the Camera bounds.
        */
      @JSName("bounds.height")
      var boundsDotheight: js.UndefOr[Double] = js.native
      
      /**
        * The width of the Camera bounds.
        */
      @JSName("bounds.width")
      var boundsDotwidth: js.UndefOr[Double] = js.native
      
      /**
        * The top-left extent of the Camera bounds.
        */
      @JSName("bounds.x")
      var boundsDotx: js.UndefOr[Double] = js.native
      
      /**
        * The top-left extent of the Camera bounds.
        */
      @JSName("bounds.y")
      var boundsDoty: js.UndefOr[Double] = js.native
      
      /**
        * The height of the Camera viewport.
        */
      var height: js.UndefOr[integer] = js.native
      
      /**
        * The name of the Camera.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The rotation of the Camera, in radians.
        */
      var rotation: js.UndefOr[Double] = js.native
      
      /**
        * Should the Camera round pixels before rendering?
        */
      var roundPixels: js.UndefOr[Boolean] = js.native
      
      /**
        * The horizontal scroll position of the Camera.
        */
      var scrollX: js.UndefOr[Double] = js.native
      
      /**
        * The vertical scroll position of the Camera.
        */
      var scrollY: js.UndefOr[Double] = js.native
      
      /**
        * The width of the Camera viewport.
        */
      var width: js.UndefOr[integer] = js.native
      
      /**
        * The horizontal position of the Camera viewport.
        */
      var x: js.UndefOr[integer] = js.native
      
      /**
        * The vertical position of the Camera viewport.
        */
      var y: js.UndefOr[integer] = js.native
      
      /**
        * The default zoom level of the Camera.
        */
      var zoom: js.UndefOr[Double] = js.native
    }
    object CameraConfig {
      
      @scala.inline
      def apply(): CameraConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CameraConfig]
      }
      
      @scala.inline
      implicit class CameraConfigMutableBuilder[Self <: CameraConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackgroundColor(value: `false` | String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        @scala.inline
        def setBounds(value: js.Object): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsDotheight(value: Double): Self = StObject.set(x, "bounds.height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsDotheightUndefined: Self = StObject.set(x, "bounds.height", js.undefined)
        
        @scala.inline
        def setBoundsDotwidth(value: Double): Self = StObject.set(x, "bounds.width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsDotwidthUndefined: Self = StObject.set(x, "bounds.width", js.undefined)
        
        @scala.inline
        def setBoundsDotx(value: Double): Self = StObject.set(x, "bounds.x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsDotxUndefined: Self = StObject.set(x, "bounds.x", js.undefined)
        
        @scala.inline
        def setBoundsDoty(value: Double): Self = StObject.set(x, "bounds.y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsDotyUndefined: Self = StObject.set(x, "bounds.y", js.undefined)
        
        @scala.inline
        def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        @scala.inline
        def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
        
        @scala.inline
        def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoundPixelsUndefined: Self = StObject.set(x, "roundPixels", js.undefined)
        
        @scala.inline
        def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
        
        @scala.inline
        def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
        
        @scala.inline
        def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        @scala.inline
        def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYUndefined: Self = StObject.set(x, "y", js.undefined)
        
        @scala.inline
        def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      }
    }
    
    type CameraFadeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
    
    type CameraFlashCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
    
    type CameraPanCallback = js.Function4[/* camera */ Camera, /* progress */ Double, /* x */ Double, /* y */ Double, Unit]
    
    type CameraShakeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
    
    type CameraZoomCallback = js.Function3[/* camera */ Camera, /* progress */ Double, /* zoom */ Double, Unit]
    
    @js.native
    trait JSONCamera extends StObject {
      
      /**
        * The background color of camera
        */
      var backgroundColor: String = js.native
      
      /**
        * The bounds of camera
        */
      var bounds: js.UndefOr[JSONCameraBounds] = js.native
      
      /**
        * The height size of camera
        */
      var height: Double = js.native
      
      /**
        * The name of the camera
        */
      var name: String = js.native
      
      /**
        * The rotation of camera
        */
      var rotation: Double = js.native
      
      /**
        * The round pixels st status of camera
        */
      var roundPixels: Boolean = js.native
      
      /**
        * The horizontal scroll of camera
        */
      var scrollX: Double = js.native
      
      /**
        * The vertical scroll of camera
        */
      var scrollY: Double = js.native
      
      /**
        * The width size of camera
        */
      var width: Double = js.native
      
      /**
        * The horizontal position of camera
        */
      var x: Double = js.native
      
      /**
        * The vertical position of camera
        */
      var y: Double = js.native
      
      /**
        * The zoom of camera
        */
      var zoom: Double = js.native
    }
    object JSONCamera {
      
      @scala.inline
      def apply(
        backgroundColor: String,
        height: Double,
        name: String,
        rotation: Double,
        roundPixels: Boolean,
        scrollX: Double,
        scrollY: Double,
        width: Double,
        x: Double,
        y: Double,
        zoom: Double
      ): JSONCamera = {
        val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], roundPixels = roundPixels.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
        __obj.asInstanceOf[JSONCamera]
      }
      
      @scala.inline
      implicit class JSONCameraMutableBuilder[Self <: JSONCamera] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBounds(value: JSONCameraBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait JSONCameraBounds extends StObject {
      
      /**
        * The height size of camera
        */
      var height: Double = js.native
      
      /**
        * The width size of camera
        */
      var width: Double = js.native
      
      /**
        * The horizontal position of camera
        */
      var x: Double = js.native
      
      /**
        * The vertical position of camera
        */
      var y: Double = js.native
    }
    object JSONCameraBounds {
      
      @scala.inline
      def apply(height: Double, width: Double, x: Double, y: Double): JSONCameraBounds = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[JSONCameraBounds]
      }
      
      @scala.inline
      implicit class JSONCameraBoundsMutableBuilder[Self <: JSONCameraBounds] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
  }
}
