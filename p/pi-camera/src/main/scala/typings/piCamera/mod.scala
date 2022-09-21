package typings.piCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pi-camera", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PiCamera {
    def this(config: CameraConfig) = this()
  }
  
  trait CameraConfig extends StObject {
    
    var annotate: js.UndefOr[String | Double] = js.undefined
    
    var brightness: js.UndefOr[Double] = js.undefined
    
    var contrast: js.UndefOr[Double] = js.undefined
    
    var datetime: js.UndefOr[Boolean] = js.undefined
    
    var demo: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var exif: js.UndefOr[String] = js.undefined
    
    var framerate: js.UndefOr[Double] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hflip: js.UndefOr[Boolean] = js.undefined
    
    var latest: js.UndefOr[String] = js.undefined
    
    var mode: Mode
    
    var nopreview: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var output: js.UndefOr[String] = js.undefined
    
    var preview: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var saturation: js.UndefOr[Double] = js.undefined
    
    var shutter: js.UndefOr[Double] = js.undefined
    
    var thumb: js.UndefOr[String] = js.undefined
    
    var timelapse: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timestamp: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var vflip: js.UndefOr[Boolean] = js.undefined
    
    var vstab: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object CameraConfig {
    
    inline def apply(mode: Mode): CameraConfig = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraConfig]
    }
    
    extension [Self <: CameraConfig](x: Self) {
      
      inline def setAnnotate(value: String | Double): Self = StObject.set(x, "annotate", value.asInstanceOf[js.Any])
      
      inline def setAnnotateUndefined: Self = StObject.set(x, "annotate", js.undefined)
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
      
      inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
      
      inline def setDatetime(value: Boolean): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDemo(value: Double): Self = StObject.set(x, "demo", value.asInstanceOf[js.Any])
      
      inline def setDemoUndefined: Self = StObject.set(x, "demo", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExif(value: String): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      inline def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
      
      inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHflip(value: Boolean): Self = StObject.set(x, "hflip", value.asInstanceOf[js.Any])
      
      inline def setHflipUndefined: Self = StObject.set(x, "hflip", js.undefined)
      
      inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setNopreview(value: Boolean): Self = StObject.set(x, "nopreview", value.asInstanceOf[js.Any])
      
      inline def setNopreviewUndefined: Self = StObject.set(x, "nopreview", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      
      inline def setShutter(value: Double): Self = StObject.set(x, "shutter", value.asInstanceOf[js.Any])
      
      inline def setShutterUndefined: Self = StObject.set(x, "shutter", js.undefined)
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      inline def setTimelapse(value: Double): Self = StObject.set(x, "timelapse", value.asInstanceOf[js.Any])
      
      inline def setTimelapseUndefined: Self = StObject.set(x, "timelapse", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setVflip(value: Boolean): Self = StObject.set(x, "vflip", value.asInstanceOf[js.Any])
      
      inline def setVflipUndefined: Self = StObject.set(x, "vflip", js.undefined)
      
      inline def setVstab(value: Boolean): Self = StObject.set(x, "vstab", value.asInstanceOf[js.Any])
      
      inline def setVstabUndefined: Self = StObject.set(x, "vstab", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.piCamera.piCameraStrings.mode
    - typings.piCamera.piCameraStrings.output
    - typings.piCamera.piCameraStrings.width
    - typings.piCamera.piCameraStrings.height
    - typings.piCamera.piCameraStrings.quality
    - typings.piCamera.piCameraStrings.latest
    - typings.piCamera.piCameraStrings.timeout
    - typings.piCamera.piCameraStrings.thumb
    - typings.piCamera.piCameraStrings.demo
    - typings.piCamera.piCameraStrings.encoding
    - typings.piCamera.piCameraStrings.timelapse
    - typings.piCamera.piCameraStrings.framerate
    - typings.piCamera.piCameraStrings.rotation
    - typings.piCamera.piCameraStrings.preview
    - typings.piCamera.piCameraStrings.opacity
    - typings.piCamera.piCameraStrings.annotate
    - typings.piCamera.piCameraStrings.exif
    - typings.piCamera.piCameraStrings.brightness
    - typings.piCamera.piCameraStrings.contrast
    - typings.piCamera.piCameraStrings.shutter
    - typings.piCamera.piCameraStrings.saturation
    - typings.piCamera.piCameraStrings.raw
    - typings.piCamera.piCameraStrings.verbose
    - typings.piCamera.piCameraStrings.fullscreen
    - typings.piCamera.piCameraStrings.nopreview
    - typings.piCamera.piCameraStrings.vstab
    - typings.piCamera.piCameraStrings.hflip
    - typings.piCamera.piCameraStrings.vflip
    - typings.piCamera.piCameraStrings.timestamp
    - typings.piCamera.piCameraStrings.datetime
  */
  trait ConfigKey extends StObject
  
  type ConfigValue = js.UndefOr[String | Double | Boolean | Mode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.piCamera.piCameraStrings.photo
    - typings.piCamera.piCameraStrings.video
  */
  trait Mode extends StObject
  object Mode {
    
    inline def photo: typings.piCamera.piCameraStrings.photo = "photo".asInstanceOf[typings.piCamera.piCameraStrings.photo]
    
    inline def video: typings.piCamera.piCameraStrings.video = "video".asInstanceOf[typings.piCamera.piCameraStrings.video]
  }
  
  @js.native
  trait PiCamera extends StObject {
    
    /* private */ def configToArray(): js.Array[String | ConfigValue] = js.native
    
    def get(prop: ConfigKey): ConfigValue = js.native
    
    def record(): js.Promise[String] = js.native
    
    def set(prop: ConfigKey, value: ConfigValue): ConfigValue = js.native
    
    def snap(): js.Promise[String] = js.native
    
    /** @async */
    def snapDataUrl(): js.Promise[String] = js.native
    def snapDataUrl(maxBuffer: Double): js.Promise[String] = js.native
  }
}
