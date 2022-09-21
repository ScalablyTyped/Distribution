package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Keyboard.Key
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cameras {
  
  object Controls {
    
    trait FixedKeyControlConfig extends StObject {
      
      /**
        * The Camera that this Control will update.
        */
      var camera: js.UndefOr[Camera] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: js.UndefOr[Key] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: js.UndefOr[Key] = js.undefined
      
      /**
        * The largest zoom value the camera will reach when zoomed in.
        */
      var maxZoom: js.UndefOr[Double] = js.undefined
      
      /**
        * The smallest zoom value the camera will reach when zoomed out.
        */
      var minZoom: js.UndefOr[Double] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: js.UndefOr[Key] = js.undefined
      
      /**
        * The horizontal and vertical speed the camera will move.
        */
      var speed: js.UndefOr[Double | js.Object] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: js.UndefOr[Key] = js.undefined
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: js.UndefOr[Key] = js.undefined
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: js.UndefOr[Key] = js.undefined
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: js.UndefOr[Double] = js.undefined
    }
    object FixedKeyControlConfig {
      
      inline def apply(): FixedKeyControlConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FixedKeyControlConfig]
      }
      
      extension [Self <: FixedKeyControlConfig](x: Self) {
        
        inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
        
        inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
        
        inline def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        inline def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
        
        inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
        
        inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
        
        inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
        
        inline def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        inline def setSpeed(value: Double | js.Object): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
        
        inline def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
        
        inline def setZoomIn(value: Key): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
        
        inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
        
        inline def setZoomOut(value: Key): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
        
        inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
        
        inline def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
        
        inline def setZoomSpeedUndefined: Self = StObject.set(x, "zoomSpeed", js.undefined)
      }
    }
    
    trait SmoothedKeyControlConfig extends StObject {
      
      /**
        * The horizontal and vertical acceleration the camera will move.
        */
      var acceleration: js.UndefOr[Double | js.Object] = js.undefined
      
      /**
        * The Camera that this Control will update.
        */
      var camera: js.UndefOr[Camera] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera down.
        */
      var down: js.UndefOr[Key] = js.undefined
      
      /**
        * The horizontal and vertical drag applied to the camera when it is moving.
        */
      var drag: js.UndefOr[Double | js.Object] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera left.
        */
      var left: js.UndefOr[Key] = js.undefined
      
      /**
        * The maximum horizontal and vertical speed the camera will move.
        */
      var maxSpeed: js.UndefOr[Double | js.Object] = js.undefined
      
      /**
        * The largest zoom value the camera will reach when zoomed in.
        */
      var maxZoom: js.UndefOr[Double] = js.undefined
      
      /**
        * The smallest zoom value the camera will reach when zoomed out.
        */
      var minZoom: js.UndefOr[Double] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera right.
        */
      var right: js.UndefOr[Key] = js.undefined
      
      /**
        * The Key to be pressed that will move the Camera up.
        */
      var up: js.UndefOr[Key] = js.undefined
      
      /**
        * The Key to be pressed that will zoom the Camera in.
        */
      var zoomIn: js.UndefOr[Key] = js.undefined
      
      /**
        * The Key to be pressed that will zoom the Camera out.
        */
      var zoomOut: js.UndefOr[Key] = js.undefined
      
      /**
        * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
        */
      var zoomSpeed: js.UndefOr[Double] = js.undefined
    }
    object SmoothedKeyControlConfig {
      
      inline def apply(): SmoothedKeyControlConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SmoothedKeyControlConfig]
      }
      
      extension [Self <: SmoothedKeyControlConfig](x: Self) {
        
        inline def setAcceleration(value: Double | js.Object): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
        
        inline def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
        
        inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
        
        inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
        
        inline def setDown(value: Key): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
        
        inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
        
        inline def setDrag(value: Double | js.Object): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
        
        inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
        
        inline def setLeft(value: Key): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setMaxSpeed(value: Double | js.Object): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
        
        inline def setMaxSpeedUndefined: Self = StObject.set(x, "maxSpeed", js.undefined)
        
        inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
        
        inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
        
        inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
        
        inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
        
        inline def setRight(value: Key): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        inline def setUp(value: Key): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
        
        inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
        
        inline def setZoomIn(value: Key): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
        
        inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
        
        inline def setZoomOut(value: Key): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
        
        inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
        
        inline def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
        
        inline def setZoomSpeedUndefined: Self = StObject.set(x, "zoomSpeed", js.undefined)
      }
    }
  }
  
  object Scene2D {
    
    trait CameraConfig extends StObject {
      
      /**
        * A CSS color string controlling the Camera background color.
        */
      var backgroundColor: js.UndefOr[`false` | String] = js.undefined
      
      /**
        * Defines the Camera bounds.
        */
      var bounds: js.UndefOr[js.Object] = js.undefined
      
      /**
        * The height of the Camera bounds.
        */
      @JSName("bounds.height")
      var boundsDotheight: js.UndefOr[Double] = js.undefined
      
      /**
        * The width of the Camera bounds.
        */
      @JSName("bounds.width")
      var boundsDotwidth: js.UndefOr[Double] = js.undefined
      
      /**
        * The top-left extent of the Camera bounds.
        */
      @JSName("bounds.x")
      var boundsDotx: js.UndefOr[Double] = js.undefined
      
      /**
        * The top-left extent of the Camera bounds.
        */
      @JSName("bounds.y")
      var boundsDoty: js.UndefOr[Double] = js.undefined
      
      /**
        * The height of the Camera viewport.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * The name of the Camera.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The rotation of the Camera, in radians.
        */
      var rotation: js.UndefOr[Double] = js.undefined
      
      /**
        * Should the Camera round pixels before rendering?
        */
      var roundPixels: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The horizontal scroll position of the Camera.
        */
      var scrollX: js.UndefOr[Double] = js.undefined
      
      /**
        * The vertical scroll position of the Camera.
        */
      var scrollY: js.UndefOr[Double] = js.undefined
      
      /**
        * The width of the Camera viewport.
        */
      var width: js.UndefOr[Double] = js.undefined
      
      /**
        * The horizontal position of the Camera viewport.
        */
      var x: js.UndefOr[Double] = js.undefined
      
      /**
        * The vertical position of the Camera viewport.
        */
      var y: js.UndefOr[Double] = js.undefined
      
      /**
        * The default zoom level of the Camera.
        */
      var zoom: js.UndefOr[Double] = js.undefined
    }
    object CameraConfig {
      
      inline def apply(): CameraConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CameraConfig]
      }
      
      extension [Self <: CameraConfig](x: Self) {
        
        inline def setBackgroundColor(value: `false` | String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setBounds(value: js.Object): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsDotheight(value: Double): Self = StObject.set(x, "bounds.height", value.asInstanceOf[js.Any])
        
        inline def setBoundsDotheightUndefined: Self = StObject.set(x, "bounds.height", js.undefined)
        
        inline def setBoundsDotwidth(value: Double): Self = StObject.set(x, "bounds.width", value.asInstanceOf[js.Any])
        
        inline def setBoundsDotwidthUndefined: Self = StObject.set(x, "bounds.width", js.undefined)
        
        inline def setBoundsDotx(value: Double): Self = StObject.set(x, "bounds.x", value.asInstanceOf[js.Any])
        
        inline def setBoundsDotxUndefined: Self = StObject.set(x, "bounds.x", js.undefined)
        
        inline def setBoundsDoty(value: Double): Self = StObject.set(x, "bounds.y", value.asInstanceOf[js.Any])
        
        inline def setBoundsDotyUndefined: Self = StObject.set(x, "bounds.y", js.undefined)
        
        inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
        
        inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
        
        inline def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
        
        inline def setRoundPixelsUndefined: Self = StObject.set(x, "roundPixels", js.undefined)
        
        inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
        
        inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
        
        inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
        
        inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
        
        inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
        
        inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      }
    }
    
    type CameraFadeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
    
    type CameraFlashCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
    
    type CameraPanCallback = js.Function4[/* camera */ Camera, /* progress */ Double, /* x */ Double, /* y */ Double, Unit]
    
    type CameraShakeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
    
    type CameraZoomCallback = js.Function3[/* camera */ Camera, /* progress */ Double, /* zoom */ Double, Unit]
    
    trait JSONCamera extends StObject {
      
      /**
        * The background color of camera
        */
      var backgroundColor: String
      
      /**
        * The bounds of camera
        */
      var bounds: js.UndefOr[JSONCameraBounds] = js.undefined
      
      /**
        * The height size of camera
        */
      var height: Double
      
      /**
        * The name of the camera
        */
      var name: String
      
      /**
        * The rotation of camera
        */
      var rotation: Double
      
      /**
        * The round pixels st status of camera
        */
      var roundPixels: Boolean
      
      /**
        * The horizontal scroll of camera
        */
      var scrollX: Double
      
      /**
        * The vertical scroll of camera
        */
      var scrollY: Double
      
      /**
        * The width size of camera
        */
      var width: Double
      
      /**
        * The horizontal position of camera
        */
      var x: Double
      
      /**
        * The vertical position of camera
        */
      var y: Double
      
      /**
        * The zoom of camera
        */
      var zoom: Double
    }
    object JSONCamera {
      
      inline def apply(
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
      
      extension [Self <: JSONCamera](x: Self) {
        
        inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBounds(value: JSONCameraBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
        
        inline def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
        
        inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
        
        inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      }
    }
    
    trait JSONCameraBounds extends StObject {
      
      /**
        * The height size of camera
        */
      var height: Double
      
      /**
        * The width size of camera
        */
      var width: Double
      
      /**
        * The horizontal position of camera
        */
      var x: Double
      
      /**
        * The vertical position of camera
        */
      var y: Double
    }
    object JSONCameraBounds {
      
      inline def apply(height: Double, width: Double, x: Double, y: Double): JSONCameraBounds = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[JSONCameraBounds]
      }
      
      extension [Self <: JSONCameraBounds](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
  }
}
