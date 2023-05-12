package typings.nodeWebcam

import org.scalablytyped.runtime.StringDictionary
import typings.nodeWebcam.mod.CameraControl
import typings.nodeWebcam.mod.FSWebcam
import typings.nodeWebcam.mod.ImageSnapWebcam
import typings.nodeWebcam.mod.WebcamOptions
import typings.nodeWebcam.mod.WindowsWebcam
import typings.nodeWebcam.nodeWebcamBooleans.`false`
import typings.nodeWebcam.nodeWebcamInts.`1`
import typings.nodeWebcam.nodeWebcamStrings.base64
import typings.nodeWebcam.nodeWebcamStrings.bmp
import typings.nodeWebcam.nodeWebcamStrings.buffer
import typings.nodeWebcam.nodeWebcamStrings.darwin
import typings.nodeWebcam.nodeWebcamStrings.fswebcam
import typings.nodeWebcam.nodeWebcamStrings.jpeg
import typings.nodeWebcam.nodeWebcamStrings.jpg
import typings.nodeWebcam.nodeWebcamStrings.linux
import typings.nodeWebcam.nodeWebcamStrings.list
import typings.nodeWebcam.nodeWebcamStrings.location
import typings.nodeWebcam.nodeWebcamStrings.png
import typings.nodeWebcam.nodeWebcamStrings.range
import typings.nodeWebcam.nodeWebcamStrings.win32
import typings.nodeWebcam.nodeWebcamStrings.win64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bmp extends StObject {
    
    val bmp: typings.nodeWebcam.nodeWebcamStrings.bmp
    
    val jpeg: jpg
    
    val png: typings.nodeWebcam.nodeWebcamStrings.png
  }
  object Bmp {
    
    inline def apply(): Bmp = {
      val __obj = js.Dynamic.literal(bmp = "bmp", jpeg = "jpg", png = "png")
      __obj.asInstanceOf[Bmp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bmp] (val x: Self) extends AnyVal {
      
      inline def setBmp(value: bmp): Self = StObject.set(x, "bmp", value.asInstanceOf[js.Any])
      
      inline def setJpeg(value: jpg): Self = StObject.set(x, "jpeg", value.asInstanceOf[js.Any])
      
      inline def setPng(value: png): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
    }
  }
  
  trait BottomBanner extends StObject {
    
    val bottomBanner: `false`
    
    val greyscale: `false`
    
    val saturation: `false`
    
    val setValues: StringDictionary[String]
    
    val skip: `false`
    
    val subTitle: `false`
    
    val timestamp: `false`
    
    val title: `false`
    
    val topBanner: `false`
  }
  object BottomBanner {
    
    inline def apply(setValues: StringDictionary[String]): BottomBanner = {
      val __obj = js.Dynamic.literal(bottomBanner = false, greyscale = false, saturation = false, setValues = setValues.asInstanceOf[js.Any], skip = false, subTitle = false, timestamp = false, title = false, topBanner = false)
      __obj.asInstanceOf[BottomBanner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BottomBanner] (val x: Self) extends AnyVal {
      
      inline def setBottomBanner(value: `false`): Self = StObject.set(x, "bottomBanner", value.asInstanceOf[js.Any])
      
      inline def setGreyscale(value: `false`): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
      
      inline def setSaturation(value: `false`): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSetValues(value: StringDictionary[String]): Self = StObject.set(x, "setValues", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: `false`): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSubTitle(value: `false`): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: `false`): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTopBanner(value: `false`): Self = StObject.set(x, "topBanner", value.asInstanceOf[js.Any])
    }
  }
  
  trait Darwin extends StObject {
    
    var darwin: ImageSnapWebcam
    
    var fswebcam: FSWebcam
    
    var linux: FSWebcam
    
    var win32: WindowsWebcam
    
    var win64: WindowsWebcam
  }
  object Darwin {
    
    inline def apply(
      darwin: ImageSnapWebcam,
      fswebcam: FSWebcam,
      linux: FSWebcam,
      win32: WindowsWebcam,
      win64: WindowsWebcam
    ): Darwin = {
      val __obj = js.Dynamic.literal(darwin = darwin.asInstanceOf[js.Any], fswebcam = fswebcam.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], win32 = win32.asInstanceOf[js.Any], win64 = win64.asInstanceOf[js.Any])
      __obj.asInstanceOf[Darwin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Darwin] (val x: Self) extends AnyVal {
      
      inline def setDarwin(value: ImageSnapWebcam): Self = StObject.set(x, "darwin", value.asInstanceOf[js.Any])
      
      inline def setFswebcam(value: FSWebcam): Self = StObject.set(x, "fswebcam", value.asInstanceOf[js.Any])
      
      inline def setLinux(value: FSWebcam): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      inline def setWin32(value: WindowsWebcam): Self = StObject.set(x, "win32", value.asInstanceOf[js.Any])
      
      inline def setWin64(value: WindowsWebcam): Self = StObject.set(x, "win64", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay extends StObject {
    
    val delay: `1`
  }
  object Delay {
    
    inline def apply(): Delay = {
      val __obj = js.Dynamic.literal(delay = 1)
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: `1`): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(options: WebcamOptionsplatformdarw): ImageSnapWebcam = js.native
    def apply(options: WebcamOptionsplatformlinu): FSWebcam = js.native
    def apply(options: WebcamOptionsplatformwin3): WindowsWebcam = js.native
    def apply(options: WebcamOptions): ImageSnapWebcam | FSWebcam | WindowsWebcam = js.native
  }
  
  trait Max
    extends StObject
       with CameraControl {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var `type`: range
  }
  object Max {
    
    inline def apply(name: String): Max = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("range")
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name
    extends StObject
       with CameraControl {
    
    var name: String
    
    var opts: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: list
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: js.Array[String]): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setOptsVarargs(value: String*): Self = StObject.set(x, "opts", js.Array(value*))
      
      inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoWebcam extends StObject {
    
    var noWebcam: js.RegExp
  }
  object NoWebcam {
    
    inline def apply(noWebcam: js.RegExp): NoWebcam = {
      val __obj = js.Dynamic.literal(noWebcam = noWebcam.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoWebcam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoWebcam] (val x: Self) extends AnyVal {
      
      inline def setNoWebcam(value: js.RegExp): Self = StObject.set(x, "noWebcam", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output extends StObject {
    
    val output: bmp
  }
  object Output {
    
    inline def apply(): Output = {
      val __obj = js.Dynamic.literal(output = "bmp")
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      inline def setOutput(value: bmp): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<node-webcam.node-webcam.WebcamOptions> */
  trait ReadonlyWebcamOptions extends StObject {
    
    val bottomBanner: js.UndefOr[Boolean] = js.undefined
    
    val callbackReturn: js.UndefOr[location | buffer | base64] = js.undefined
    
    val delay: js.UndefOr[Double] = js.undefined
    
    val device: js.UndefOr[String | `false`] = js.undefined
    
    val frames: js.UndefOr[Double] = js.undefined
    
    val greyscale: js.UndefOr[String | `false`] = js.undefined
    
    val height: js.UndefOr[Double] = js.undefined
    
    val output: js.UndefOr[jpeg | png | bmp] = js.undefined
    
    val quality: js.UndefOr[Double] = js.undefined
    
    val rotation: js.UndefOr[String | `false`] = js.undefined
    
    val saturation: js.UndefOr[String | `false`] = js.undefined
    
    val saveShots: js.UndefOr[Boolean] = js.undefined
    
    val setValues: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val skip: js.UndefOr[Boolean] = js.undefined
    
    val subtitle: js.UndefOr[String | `false`] = js.undefined
    
    val timestamp: js.UndefOr[Double | `false`] = js.undefined
    
    val title: js.UndefOr[String | `false`] = js.undefined
    
    val topBanner: js.UndefOr[Boolean] = js.undefined
    
    val verbose: js.UndefOr[Boolean] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyWebcamOptions {
    
    inline def apply(): ReadonlyWebcamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyWebcamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyWebcamOptions] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined node-webcam.node-webcam.WebcamOptions & {  platform :'darwin'} */
  trait WebcamOptionsplatformdarw extends StObject {
    
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
    
    var platform: darwin
    
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
  object WebcamOptionsplatformdarw {
    
    inline def apply(): WebcamOptionsplatformdarw = {
      val __obj = js.Dynamic.literal(platform = "darwin")
      __obj.asInstanceOf[WebcamOptionsplatformdarw]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebcamOptionsplatformdarw] (val x: Self) extends AnyVal {
      
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
      
      inline def setPlatform(value: darwin): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined node-webcam.node-webcam.WebcamOptions & {  platform :'linux' | 'fswebcam'} */
  trait WebcamOptionsplatformlinu extends StObject {
    
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
    
    var platform: linux | fswebcam
    
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
  object WebcamOptionsplatformlinu {
    
    inline def apply(platform: linux | fswebcam): WebcamOptionsplatformlinu = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebcamOptionsplatformlinu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebcamOptionsplatformlinu] (val x: Self) extends AnyVal {
      
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
      
      inline def setPlatform(value: linux | fswebcam): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined node-webcam.node-webcam.WebcamOptions & {  platform :'win32' | 'win64'} */
  trait WebcamOptionsplatformwin3 extends StObject {
    
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
    
    var platform: win32 | win64
    
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
  object WebcamOptionsplatformwin3 {
    
    inline def apply(platform: win32 | win64): WebcamOptionsplatformwin3 = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebcamOptionsplatformwin3]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebcamOptionsplatformwin3] (val x: Self) extends AnyVal {
      
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
      
      inline def setPlatform(value: win32 | win64): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
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
}
