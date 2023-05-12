package typings.nodeWebcam

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.nodeWebcam.anon.Bmp
import typings.nodeWebcam.anon.BottomBanner
import typings.nodeWebcam.anon.Darwin
import typings.nodeWebcam.anon.Delay
import typings.nodeWebcam.anon.FnCall
import typings.nodeWebcam.anon.NoWebcam
import typings.nodeWebcam.anon.Output
import typings.nodeWebcam.anon.ReadonlyWebcamOptions
import typings.nodeWebcam.anon.WebcamOptionsplatformdarw
import typings.nodeWebcam.anon.WebcamOptionsplatformlinu
import typings.nodeWebcam.anon.WebcamOptionsplatformwin3
import typings.nodeWebcam.nodeWebcamBooleans.`false`
import typings.nodeWebcam.nodeWebcamStrings.base64
import typings.nodeWebcam.nodeWebcamStrings.bmp
import typings.nodeWebcam.nodeWebcamStrings.buffer
import typings.nodeWebcam.nodeWebcamStrings.capture
import typings.nodeWebcam.nodeWebcamStrings.darwin
import typings.nodeWebcam.nodeWebcamStrings.fswebcam
import typings.nodeWebcam.nodeWebcamStrings.imagesnap
import typings.nodeWebcam.nodeWebcamStrings.jpeg
import typings.nodeWebcam.nodeWebcamStrings.linux
import typings.nodeWebcam.nodeWebcamStrings.location
import typings.nodeWebcam.nodeWebcamStrings.png
import typings.nodeWebcam.nodeWebcamStrings.win32
import typings.nodeWebcam.nodeWebcamStrings.win64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-webcam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CameraUtils {
    
    @JSImport("node-webcam", "CameraUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCameras(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCameras")().asInstanceOf[Unit]
    inline def getCameras(callback: js.Function1[/* cams */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCameras")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Linux cameras read /dev dir
      */
    inline def getLinuxCameras(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinuxCameras")().asInstanceOf[Unit]
    inline def getLinuxCameras(callback: js.Function1[/* cams */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinuxCameras")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("node-webcam", "EventDispatcher")
  @js.native
  open class EventDispatcher () extends StObject {
    
    @JSName("apply")
    def apply(obj: Webcam): Webcam & EventDispatcher = js.native
    
    def dispatch(event: WebcamEvent): Unit = js.native
    
    def hasListener(`type`: WebcamEventType, listener: js.Function1[/* event */ WebcamEvent, Unit]): Unit = js.native
    
    def on(`type`: WebcamEventType, listener: js.Function1[/* event */ WebcamEvent, Unit]): Unit = js.native
    
    def removeListener(`type`: WebcamEventType, listener: js.Function1[/* event */ WebcamEvent, Unit]): Unit = js.native
  }
  
  @JSImport("node-webcam", "FSWebcam")
  @js.native
  open class FSWebcam protected () extends Webcam {
    def this(options: WebcamOptions) = this()
    
    val bin: fswebcam = js.native
    
    /**
      * Get control values string
      *
      */
    def getControlSetString(setValues: StringDictionary[String]): String = js.native
    
    /**
      * Get shell statement to get the available camera controls
      *
      */
    def getListControlsSh(): String = js.native
    
    /**
      * Parse output of list camera controls shell command
      * camera controls
      */
    def parseListControls(stdout: String, callback: js.Function1[/* cameraControl */ js.Array[CameraControl], Unit]): Unit = js.native
  }
  /* static members */
  object FSWebcam {
    
    @JSImport("node-webcam", "FSWebcam.Defaults")
    @js.native
    val Defaults: BottomBanner = js.native
    
    @JSImport("node-webcam", "FSWebcam.Validations")
    @js.native
    val Validations: NoWebcam = js.native
  }
  
  @JSImport("node-webcam", "Factory")
  @js.native
  open class Factory () extends StObject {
    
    var Platform: IPlatformType = js.native
    
    def create(options: WebcamOptions): ImageSnapWebcam | FSWebcam | WindowsWebcam = js.native
    def create(options: WebcamOptions, platform: linux | fswebcam): FSWebcam = js.native
    def create(options: WebcamOptions, platform: IPlatformType): ImageSnapWebcam | FSWebcam | WindowsWebcam = js.native
    @JSName("create")
    def create_WindowsWebcam(options: WebcamOptions, platform: win32 | win64): WindowsWebcam = js.native
    @JSName("create")
    def create_darwin(options: WebcamOptions, platform: darwin): ImageSnapWebcam = js.native
  }
  /* static members */
  object Factory {
    
    @JSImport("node-webcam", "Factory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-webcam", "Factory.Types")
    @js.native
    def Types: Darwin = js.native
    inline def Types_=(x: Darwin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Types")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-webcam", "ImageSnapWebcam")
  @js.native
  open class ImageSnapWebcam protected () extends Webcam {
    def this(options: WebcamOptions) = this()
    
    val bin: imagesnap = js.native
  }
  /* static members */
  object ImageSnapWebcam {
    
    @JSImport("node-webcam", "ImageSnapWebcam.Defaults")
    @js.native
    val Defaults: Delay = js.native
  }
  
  object NodeWebcam {
    
    @JSImport("node-webcam", "NodeWebcam")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-webcam", "NodeWebcam.FSWebcam")
    @js.native
    def FSWebcam: typings.nodeWebcam.mod.FSWebcam = js.native
    inline def FSWebcam_=(x: FSWebcam): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FSWebcam")(x.asInstanceOf[js.Any])
    
    @JSImport("node-webcam", "NodeWebcam.Factory")
    @js.native
    def Factory: typings.nodeWebcam.mod.Factory = js.native
    inline def Factory_=(x: Factory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Factory")(x.asInstanceOf[js.Any])
    
    @JSImport("node-webcam", "NodeWebcam.ImageSnapWebcam")
    @js.native
    def ImageSnapWebcam: typings.nodeWebcam.mod.ImageSnapWebcam = js.native
    inline def ImageSnapWebcam_=(x: ImageSnapWebcam): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImageSnapWebcam")(x.asInstanceOf[js.Any])
    
    @JSImport("node-webcam", "NodeWebcam.REVISION")
    @js.native
    def REVISION: Double = js.native
    inline def REVISION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVISION")(x.asInstanceOf[js.Any])
    
    @JSImport("node-webcam", "NodeWebcam.Webcam")
    @js.native
    def Webcam: Factory = js.native
    inline def Webcam_=(x: Factory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Webcam")(x.asInstanceOf[js.Any])
    
    @JSImport("node-webcam", "NodeWebcam.WindowsWebcam")
    @js.native
    def WindowsWebcam: typings.nodeWebcam.mod.WindowsWebcam = js.native
    inline def WindowsWebcam_=(x: WindowsWebcam): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WindowsWebcam")(x.asInstanceOf[js.Any])
    
    /**
      * Quick capture helper
      *
      */
    @JSImport("node-webcam", "NodeWebcam.capture")
    @js.native
    def capture: js.Function3[
        /* location */ String | Null, 
        /* options */ WebcamOptions, 
        /* callback */ js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit], 
        ImageSnapWebcam | FSWebcam | WindowsWebcam
      ] = js.native
    /**
      * Quick capture helper
      *
      */
    inline def capture(
      location: String,
      options: WebcamOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]
    ): ImageSnapWebcam | FSWebcam | WindowsWebcam = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ImageSnapWebcam | FSWebcam | WindowsWebcam]
    inline def capture(
      location: Null,
      options: WebcamOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]
    ): ImageSnapWebcam | FSWebcam | WindowsWebcam = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ImageSnapWebcam | FSWebcam | WindowsWebcam]
    inline def capture_=(
      x: js.Function3[
          /* location */ String | Null, 
          /* options */ WebcamOptions, 
          /* callback */ js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit], 
          ImageSnapWebcam | FSWebcam | WindowsWebcam
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capture")(x.asInstanceOf[js.Any])
    
    /**
      * Main create
      */
    @JSImport("node-webcam", "NodeWebcam.create")
    @js.native
    def create: FnCall = js.native
    /**
      * Main create
      */
    inline def create(options: WebcamOptionsplatformdarw): ImageSnapWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[ImageSnapWebcam]
    /**
      * Main create
      */
    inline def create(options: WebcamOptionsplatformlinu): FSWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[FSWebcam]
    /**
      * Main create
      */
    inline def create(options: WebcamOptionsplatformwin3): WindowsWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[WindowsWebcam]
    /**
      * Main create
      */
    inline def create(options: WebcamOptions): ImageSnapWebcam | FSWebcam | WindowsWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[ImageSnapWebcam | FSWebcam | WindowsWebcam]
    inline def create_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
    /**
      * Camera list helper
      *
      */
    inline def list(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[Unit]
    inline def list(callback: js.Function1[/* cams */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Camera options helper
      */
    @JSImport("node-webcam", "NodeWebcam.listControls")
    @js.native
    def listControls: js.Function2[
        /* device */ String, 
        /* callback */ js.Function1[/* cameraControl */ js.Array[CameraControl], Unit], 
        Unit
      ] = js.native
    /**
      * Camera options helper
      */
    inline def listControls(device: String, callback: js.Function1[/* cameraControl */ js.Array[CameraControl], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listControls")(device.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def listControls_=(
      x: js.Function2[
          /* device */ String, 
          /* callback */ js.Function1[/* cameraControl */ js.Array[CameraControl], Unit], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listControls")(x.asInstanceOf[js.Any])
    
    /**
      * Camera list helper
      *
      */
    @JSImport("node-webcam", "NodeWebcam.list")
    @js.native
    def list_FNodeWebcam: js.Function1[/* callback */ js.UndefOr[js.Function1[/* cams */ js.Array[String], Unit]], Unit] = js.native
    
    inline def list_FNodeWebcam_=(x: js.Function1[/* callback */ js.UndefOr[js.Function1[/* cams */ js.Array[String], Unit]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("list")(x.asInstanceOf[js.Any])
    
    @JSImport("node-webcam", "NodeWebcam.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-webcam", "REVISION")
  @js.native
  val REVISION: Double = js.native
  
  @JSImport("node-webcam", "Shot")
  @js.native
  open class Shot () extends StObject {
    def this(/**
      * Shot location
      *
      *
      *
      */
    location: String) = this()
    def this(
      /**
      * Shot location
      *
      *
      *
      */
    location: String,
      /**
      * Shot data or buffer
      *
      */
    data: Buffer
    ) = this()
    def this(
      /**
      * Shot location
      *
      *
      *
      */
    location: Null,
      /**
      * Shot data or buffer
      *
      */
    data: Buffer
    ) = this()
    
    /**
      * Shot data or buffer
      *
      */
    var data: Buffer | Null = js.native
    
    /**
      * Shot location
      *
      */
    var location: String | Null = js.native
  }
  
  @JSImport("node-webcam", "Utils")
  @js.native
  open class Utils () extends StObject {
    
    /** Node-webcam escape string */
    def escape(cmd: String): String = js.native
    
    /** Highly used as an inheritance */
    def setDefaults(`object`: WebcamOptions, defaults: WebcamOptions): WebcamOptions = js.native
  }
  
  /* note: abstract class */ @JSImport("node-webcam", "Webcam")
  @js.native
  open class Webcam protected () extends StObject {
    def this(options: WebcamOptions) = this()
    
    /**
      * Capture shot
      *
      */
    def capture(
      location: String,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]
    ): Unit = js.native
    def capture(
      location: Null,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]
    ): Unit = js.native
    
    /**
      * Clear shot and camera memory data
      *
      */
    def clear(): Unit = js.native
    
    /**
      * Create a shot overider
      *
      */
    def createShot(): Shot = js.native
    def createShot(location: String): Shot = js.native
    def createShot(location: String, data: Buffer): Shot = js.native
    def createShot(location: Null, data: Buffer): Shot = js.native
    
    /**
      * Generate cli command string
      */
    def generateSh(): String = js.native
    def generateSh(location: String): String = js.native
    
    /**
      * Get shot base64 as image
      * if passed Number will return a base 64 in the callback
      *
      *
      */
    def getBase64(shot: Double, callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]): Unit = js.native
    def getBase64(shot: Shot, callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]): Unit = js.native
    
    def getBase64FromBuffer(shotBuffer: String): String = js.native
    def getBase64FromBuffer(shotBuffer: Buffer): String = js.native
    
    /**
      * Get last shot taken image data
      *
      */
    def getLastShot(): Shot = js.native
    
    /**
      * Get last shot taken base 64 string
      *
      */
    def getLastShot64(callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]): Unit = js.native
    
    /**
      * Get last shot buffer taken image data
      *
      */
    def getLastShotBuffer(callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]): Unit = js.native
    
    /**
      * Get shot instances from cache index
      *
      */
    def getShot(index: Double, callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]): Unit = js.native
    
    /**
      * Get shot buffer from location
      * 0 indexed
      */
    def getShotBuffer(shot: Double, callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]): Unit = js.native
    def getShotBuffer(shot: Shot, callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]): Unit = js.native
    
    /**
      * Get last shot taken image data
      *
      */
    def handleCallbackReturnType(callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit], shot: Shot): Unit = js.native
    
    /**
      * Has camera
      *
      */
    def hasCamera(callback: js.Function1[/* length */ Double, Unit]): Unit = js.native
    
    /**
      * List available cameras
      *
      */
    def list(): Unit = js.native
    def list(callback: js.Function1[/* cams */ js.Array[String], Unit]): Unit = js.native
    
    /**
      * List available camera controls
      * camera controls
      *
      * testing purposes)
      */
    def listControls(callback: js.Function1[/* cams */ js.Array[Any] | js.Error, Unit], stdoutOverride: String): Unit = js.native
    
    /**
      * Main opts from construction
      */
    var opts: WebcamOptions = js.native
    
    def runCaptureValidations(data: String): js.Error | Null = js.native
    
    /**
      * Array of Shot objects
      */
    var shots: js.Array[Shot] = js.native
  }
  /* static members */
  object Webcam {
    
    @JSImport("node-webcam", "Webcam.Defaults")
    @js.native
    val Defaults: ReadonlyWebcamOptions = js.native
    
    @JSImport("node-webcam", "Webcam.OutputTypes")
    @js.native
    val OutputTypes: Bmp = js.native
  }
  
  @JSImport("node-webcam", "WindowsWebcam")
  @js.native
  open class WindowsWebcam protected () extends Webcam {
    def this(options: WebcamOptions) = this()
    
    val bin: String = js.native
  }
  /* static members */
  object WindowsWebcam {
    
    @JSImport("node-webcam", "WindowsWebcam.Defaults")
    @js.native
    val Defaults: Output = js.native
  }
  
  inline def capture(
    location: String,
    options: WebcamOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]
  ): ImageSnapWebcam | FSWebcam | WindowsWebcam = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ImageSnapWebcam | FSWebcam | WindowsWebcam]
  inline def capture(
    location: Null,
    options: WebcamOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Buffer, Unit]
  ): ImageSnapWebcam | FSWebcam | WindowsWebcam = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ImageSnapWebcam | FSWebcam | WindowsWebcam]
  
  inline def create(options: WebcamOptionsplatformdarw): ImageSnapWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[ImageSnapWebcam]
  inline def create(options: WebcamOptionsplatformlinu): FSWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[FSWebcam]
  inline def create(options: WebcamOptionsplatformwin3): WindowsWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[WindowsWebcam]
  inline def create(options: WebcamOptions): ImageSnapWebcam | FSWebcam | WindowsWebcam = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[ImageSnapWebcam | FSWebcam | WindowsWebcam]
  
  inline def list(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[Unit]
  inline def list(callback: js.Function1[/* cams */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def listControls(device: String, callback: js.Function1[/* cameraControl */ js.Array[CameraControl], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listControls")(device.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node-webcam", "version")
  @js.native
  val version: String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeWebcam.anon.Max
    - typings.nodeWebcam.anon.Name
  */
  trait CameraControl extends StObject
  object CameraControl {
    
    inline def Max(name: String): typings.nodeWebcam.anon.Max = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("range")
      __obj.asInstanceOf[typings.nodeWebcam.anon.Max]
    }
    
    inline def Name(name: String): typings.nodeWebcam.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[typings.nodeWebcam.anon.Name]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeWebcam.nodeWebcamStrings.linux
    - typings.nodeWebcam.nodeWebcamStrings.darwin
    - typings.nodeWebcam.nodeWebcamStrings.fswebcam
    - typings.nodeWebcam.nodeWebcamStrings.win32
    - typings.nodeWebcam.nodeWebcamStrings.win64
    - java.lang.String
  */
  type IPlatformType = _IPlatformType | String
  
  trait WebcamEvent
    extends StObject
       with /* attr */ StringDictionary[Any] {
    
    var `type`: WebcamEventType
  }
  object WebcamEvent {
    
    inline def apply(`type`: WebcamEventType): WebcamEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebcamEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebcamEvent] (val x: Self) extends AnyVal {
      
      inline def setType(value: WebcamEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type WebcamEventType = capture | String
  
  trait WebcamOptions extends StObject {
    
    var bottomBanner: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [location, buffer, base64]
      * Webcam.CallbackReturnTypes
      */
    var callbackReturn: js.UndefOr[location | buffer | base64] = js.undefined
    
    /**
      * Delay in seconds to take shot
      * if the platform supports miliseconds
      * use a float (0.1)
      * Currently only on windows
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    var device: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Number of frames to capture
      * More the frames, longer it takes to capture
      * Use higher framerate for quality. Ex: 60
      */
    var frames: js.UndefOr[Double] = js.undefined
    
    var greyscale: js.UndefOr[String | `false`] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * [jpeg, png, bmp] support varies
      * Webcam.OutputTypes
      */
    var output: js.UndefOr[jpeg | png | bmp] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var rotation: js.UndefOr[String | `false`] = js.undefined
    
    var saturation: js.UndefOr[String | `false`] = js.undefined
    
    /* Save shots in memory */
    var saveShots: js.UndefOr[Boolean] = js.undefined
    
    var setValues: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String | `false`] = js.undefined
    
    var timestamp: js.UndefOr[Double | `false`] = js.undefined
    
    var title: js.UndefOr[String | `false`] = js.undefined
    
    var topBanner: js.UndefOr[Boolean] = js.undefined
    
    // Logging
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object WebcamOptions {
    
    inline def apply(): WebcamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebcamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebcamOptions] (val x: Self) extends AnyVal {
      
      inline def setBottomBanner(value: Boolean): Self = StObject.set(x, "bottomBanner", value.asInstanceOf[js.Any])
      
      inline def setBottomBannerUndefined: Self = StObject.set(x, "bottomBanner", js.undefined)
      
      inline def setCallbackReturn(value: location | buffer | base64): Self = StObject.set(x, "callbackReturn", value.asInstanceOf[js.Any])
      
      inline def setCallbackReturnUndefined: Self = StObject.set(x, "callbackReturn", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDevice(value: String | `false`): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      inline def setGreyscale(value: String | `false`): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
      
      inline def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOutput(value: jpeg | png | bmp): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRotation(value: String | `false`): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSaturation(value: String | `false`): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      
      inline def setSaveShots(value: Boolean): Self = StObject.set(x, "saveShots", value.asInstanceOf[js.Any])
      
      inline def setSaveShotsUndefined: Self = StObject.set(x, "saveShots", js.undefined)
      
      inline def setSetValues(value: StringDictionary[String]): Self = StObject.set(x, "setValues", value.asInstanceOf[js.Any])
      
      inline def setSetValuesUndefined: Self = StObject.set(x, "setValues", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSubtitle(value: String | `false`): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTimestamp(value: Double | `false`): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTopBanner(value: Boolean): Self = StObject.set(x, "topBanner", value.asInstanceOf[js.Any])
      
      inline def setTopBannerUndefined: Self = StObject.set(x, "topBanner", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait _IPlatformType extends StObject
}
