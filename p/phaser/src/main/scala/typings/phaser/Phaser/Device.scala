package typings.phaser.Phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Device {
  
  /**
    * Determines the audio playback capabilities of the device running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.audio` from within any Scene.
    */
  trait Audio extends StObject {
    
    /**
      * Can this device play HTML Audio tags?
      */
    var audioData: Boolean
    
    /**
      * Can this device play EC-3 Dolby Digital Plus files?
      */
    var dolby: Boolean
    
    /**
      * Can this device can play m4a files.
      */
    var m4a: Boolean
    
    /**
      * Can this device play mp3 files?
      */
    var mp3: Boolean
    
    /**
      * Can this device play ogg files?
      */
    var ogg: Boolean
    
    /**
      * Can this device play opus files?
      */
    var opus: Boolean
    
    /**
      * Can this device play wav files?
      */
    var wav: Boolean
    
    /**
      * Does this device have the Web Audio API?
      */
    var webAudio: Boolean
    
    /**
      * Can this device play webm files?
      */
    var webm: Boolean
  }
  object Audio {
    
    inline def apply(
      audioData: Boolean,
      dolby: Boolean,
      m4a: Boolean,
      mp3: Boolean,
      ogg: Boolean,
      opus: Boolean,
      wav: Boolean,
      webAudio: Boolean,
      webm: Boolean
    ): Audio = {
      val __obj = js.Dynamic.literal(audioData = audioData.asInstanceOf[js.Any], dolby = dolby.asInstanceOf[js.Any], m4a = m4a.asInstanceOf[js.Any], mp3 = mp3.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], opus = opus.asInstanceOf[js.Any], wav = wav.asInstanceOf[js.Any], webAudio = webAudio.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    extension [Self <: Audio](x: Self) {
      
      inline def setAudioData(value: Boolean): Self = StObject.set(x, "audioData", value.asInstanceOf[js.Any])
      
      inline def setDolby(value: Boolean): Self = StObject.set(x, "dolby", value.asInstanceOf[js.Any])
      
      inline def setM4a(value: Boolean): Self = StObject.set(x, "m4a", value.asInstanceOf[js.Any])
      
      inline def setMp3(value: Boolean): Self = StObject.set(x, "mp3", value.asInstanceOf[js.Any])
      
      inline def setOgg(value: Boolean): Self = StObject.set(x, "ogg", value.asInstanceOf[js.Any])
      
      inline def setOpus(value: Boolean): Self = StObject.set(x, "opus", value.asInstanceOf[js.Any])
      
      inline def setWav(value: Boolean): Self = StObject.set(x, "wav", value.asInstanceOf[js.Any])
      
      inline def setWebAudio(value: Boolean): Self = StObject.set(x, "webAudio", value.asInstanceOf[js.Any])
      
      inline def setWebm(value: Boolean): Self = StObject.set(x, "webm", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Determines the browser type and version running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.browser` from within any Scene.
    */
  trait Browser extends StObject {
    
    /**
      * Set to true if running in Chrome.
      */
    var chrome: Boolean
    
    /**
      * If running in Chrome this will contain the major version number.
      */
    var chromeVersion: Double
    
    /**
      * Set to true if running in Microsoft Edge browser.
      */
    var edge: Boolean
    
    /**
      * Set to true if running in Firefox.
      */
    var firefox: Boolean
    
    /**
      * If running in Firefox this will contain the major version number.
      */
    var firefoxVersion: Double
    
    /**
      * Set to true if running in Internet Explorer 11 or less (not Edge).
      */
    var ie: Boolean
    
    /**
      * If running in Internet Explorer this will contain the major version number. Beyond IE10 you should use Browser.trident and Browser.tridentVersion.
      */
    var ieVersion: Double
    
    /**
      * Set to true if running in Mobile Safari.
      */
    var mobileSafari: Boolean
    
    /**
      * Set to true if running in Opera.
      */
    var opera: Boolean
    
    /**
      * Set to true if running in Safari.
      */
    var safari: Boolean
    
    /**
      * If running in Safari this will contain the major version number.
      */
    var safariVersion: Double
    
    /**
      * Set to true if running in the Silk browser (as used on the Amazon Kindle)
      */
    var silk: Boolean
    
    /**
      * Set to true if running a Trident version of Internet Explorer (IE11+)
      */
    var trident: Boolean
    
    /**
      * If running in Internet Explorer 11 this will contain the major version number. See {@link http://msdn.microsoft.com/en-us/library/ie/ms537503(v=vs.85).aspx}
      */
    var tridentVersion: Double
  }
  object Browser {
    
    inline def apply(
      chrome: Boolean,
      chromeVersion: Double,
      edge: Boolean,
      firefox: Boolean,
      firefoxVersion: Double,
      ie: Boolean,
      ieVersion: Double,
      mobileSafari: Boolean,
      opera: Boolean,
      safari: Boolean,
      safariVersion: Double,
      silk: Boolean,
      trident: Boolean,
      tridentVersion: Double
    ): Browser = {
      val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], chromeVersion = chromeVersion.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], firefoxVersion = firefoxVersion.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ieVersion = ieVersion.asInstanceOf[js.Any], mobileSafari = mobileSafari.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], safariVersion = safariVersion.asInstanceOf[js.Any], silk = silk.asInstanceOf[js.Any], trident = trident.asInstanceOf[js.Any], tridentVersion = tridentVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setChromeVersion(value: Double): Self = StObject.set(x, "chromeVersion", value.asInstanceOf[js.Any])
      
      inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setFirefox(value: Boolean): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def setFirefoxVersion(value: Double): Self = StObject.set(x, "firefoxVersion", value.asInstanceOf[js.Any])
      
      inline def setIe(value: Boolean): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      inline def setIeVersion(value: Double): Self = StObject.set(x, "ieVersion", value.asInstanceOf[js.Any])
      
      inline def setMobileSafari(value: Boolean): Self = StObject.set(x, "mobileSafari", value.asInstanceOf[js.Any])
      
      inline def setOpera(value: Boolean): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
      
      inline def setSafari(value: Boolean): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
      
      inline def setSafariVersion(value: Double): Self = StObject.set(x, "safariVersion", value.asInstanceOf[js.Any])
      
      inline def setSilk(value: Boolean): Self = StObject.set(x, "silk", value.asInstanceOf[js.Any])
      
      inline def setTrident(value: Boolean): Self = StObject.set(x, "trident", value.asInstanceOf[js.Any])
      
      inline def setTridentVersion(value: Double): Self = StObject.set(x, "tridentVersion", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Determines the canvas features of the browser running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.canvasFeatures` from within any Scene.
    */
  trait CanvasFeatures extends StObject {
    
    /**
      * Set to true if the browser supports inversed alpha.
      */
    var supportInverseAlpha: Boolean
    
    /**
      * Set to true if the browser supports new canvas blend modes.
      */
    var supportNewBlendModes: Boolean
  }
  object CanvasFeatures {
    
    inline def apply(supportInverseAlpha: Boolean, supportNewBlendModes: Boolean): CanvasFeatures = {
      val __obj = js.Dynamic.literal(supportInverseAlpha = supportInverseAlpha.asInstanceOf[js.Any], supportNewBlendModes = supportNewBlendModes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasFeatures]
    }
    
    extension [Self <: CanvasFeatures](x: Self) {
      
      inline def setSupportInverseAlpha(value: Boolean): Self = StObject.set(x, "supportInverseAlpha", value.asInstanceOf[js.Any])
      
      inline def setSupportNewBlendModes(value: Boolean): Self = StObject.set(x, "supportNewBlendModes", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Determines the features of the browser running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.features` from within any Scene.
    */
  trait Features extends StObject {
    
    /**
      * Is canvas available?
      */
    var canvas: Boolean
    
    /**
      * True if canvas supports a 'copy' bitblt onto itself when the source and destination regions overlap.
      */
    var canvasBitBltShift: Boolean
    
    /**
      * Is file available?
      */
    var file: Boolean
    
    /**
      * Is fileSystem available?
      */
    var fileSystem: Boolean
    
    /**
      * Does the device support the getUserMedia API?
      */
    var getUserMedia: Boolean
    
    /**
      * Is the device big or little endian? (only detected if the browser supports TypedArrays)
      */
    var littleEndian: Boolean
    
    /**
      * Is localStorage available?
      */
    var localStorage: Boolean
    
    /**
      * Is Pointer Lock available?
      */
    var pointerLock: Boolean
    
    /**
      * Does the device context support 32bit pixel manipulation using array buffer views?
      */
    var support32bit: Boolean
    
    /**
      * Does the device support the Vibration API?
      */
    var vibration: Boolean
    
    /**
      * Is webGL available?
      */
    var webGL: Boolean
    
    /**
      * Is worker available?
      */
    var worker: Boolean
  }
  object Features {
    
    inline def apply(
      canvas: Boolean,
      canvasBitBltShift: Boolean,
      file: Boolean,
      fileSystem: Boolean,
      getUserMedia: Boolean,
      littleEndian: Boolean,
      localStorage: Boolean,
      pointerLock: Boolean,
      support32bit: Boolean,
      vibration: Boolean,
      webGL: Boolean,
      worker: Boolean
    ): Features = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], canvasBitBltShift = canvasBitBltShift.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSystem = fileSystem.asInstanceOf[js.Any], getUserMedia = getUserMedia.asInstanceOf[js.Any], littleEndian = littleEndian.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], pointerLock = pointerLock.asInstanceOf[js.Any], support32bit = support32bit.asInstanceOf[js.Any], vibration = vibration.asInstanceOf[js.Any], webGL = webGL.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[Features]
    }
    
    extension [Self <: Features](x: Self) {
      
      inline def setCanvas(value: Boolean): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasBitBltShift(value: Boolean): Self = StObject.set(x, "canvasBitBltShift", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileSystem(value: Boolean): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setGetUserMedia(value: Boolean): Self = StObject.set(x, "getUserMedia", value.asInstanceOf[js.Any])
      
      inline def setLittleEndian(value: Boolean): Self = StObject.set(x, "littleEndian", value.asInstanceOf[js.Any])
      
      inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setPointerLock(value: Boolean): Self = StObject.set(x, "pointerLock", value.asInstanceOf[js.Any])
      
      inline def setSupport32bit(value: Boolean): Self = StObject.set(x, "support32bit", value.asInstanceOf[js.Any])
      
      inline def setVibration(value: Boolean): Self = StObject.set(x, "vibration", value.asInstanceOf[js.Any])
      
      inline def setWebGL(value: Boolean): Self = StObject.set(x, "webGL", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Determines the full screen support of the browser running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.fullscreen` from within any Scene.
    */
  trait Fullscreen extends StObject {
    
    /**
      * Does the browser support the Full Screen API?
      */
    var available: Boolean
    
    /**
      * If the browser supports the Full Screen API this holds the call you need to use to cancel it.
      */
    var cancel: String
    
    /**
      * Does the browser support access to the Keyboard during Full Screen mode?
      */
    var keyboard: Boolean
    
    /**
      * If the browser supports the Full Screen API this holds the call you need to use to activate it.
      */
    var request: String
  }
  object Fullscreen {
    
    inline def apply(available: Boolean, cancel: String, keyboard: Boolean, request: String): Fullscreen = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fullscreen]
    }
    
    extension [Self <: Fullscreen](x: Self) {
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Determines the input support of the browser running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.input` from within any Scene.
    */
  trait Input extends StObject {
    
    /**
      * Is navigator.getGamepads available?
      */
    var gamepads: Boolean
    
    /**
      * Is mspointer available?
      */
    var mspointer: Boolean
    
    /**
      * Is touch available?
      */
    var touch: Boolean
    
    /**
      * The newest type of Wheel/Scroll event supported: 'wheel', 'mousewheel', 'DOMMouseScroll'
      */
    var wheelType: String
  }
  object Input {
    
    inline def apply(gamepads: Boolean, mspointer: Boolean, touch: Boolean, wheelType: String): typings.phaser.Phaser.Device.Input = {
      val __obj = js.Dynamic.literal(gamepads = gamepads.asInstanceOf[js.Any], mspointer = mspointer.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], wheelType = wheelType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.phaser.Phaser.Device.Input]
    }
    
    extension [Self <: typings.phaser.Phaser.Device.Input](x: Self) {
      
      inline def setGamepads(value: Boolean): Self = StObject.set(x, "gamepads", value.asInstanceOf[js.Any])
      
      inline def setMspointer(value: Boolean): Self = StObject.set(x, "mspointer", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setWheelType(value: String): Self = StObject.set(x, "wheelType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Determines the operating system of the device running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.os` from within any Scene.
    */
  trait OS extends StObject {
    
    /**
      * Is running on android?
      */
    var android: Boolean
    
    /**
      * Is running on chromeOS?
      */
    var chromeOS: Boolean
    
    /**
      * Is the game running under Apache Cordova?
      */
    var cordova: Boolean
    
    /**
      * Is the game running under the Intel Crosswalk XDK?
      */
    var crosswalk: Boolean
    
    /**
      * Is running on a desktop?
      */
    var desktop: Boolean
    
    /**
      * Is the game running under Ejecta?
      */
    var ejecta: Boolean
    
    /**
      * Is the game running under GitHub Electron?
      */
    var electron: Boolean
    
    /**
      * Is running on iOS?
      */
    var iOS: Boolean
    
    /**
      * If running in iOS this will contain the major version number.
      */
    var iOSVersion: Double
    
    /**
      * Is running on iPad?
      */
    var iPad: Boolean
    
    /**
      * Is running on iPhone?
      */
    var iPhone: Boolean
    
    /**
      * Is running on an Amazon Kindle?
      */
    var kindle: Boolean
    
    /**
      * Is running on linux?
      */
    var linux: Boolean
    
    /**
      * Is running on macOS?
      */
    var macOS: Boolean
    
    /**
      * Is the game running under Node.js?
      */
    var node: Boolean
    
    /**
      * Is the game running under Node-Webkit?
      */
    var nodeWebkit: Boolean
    
    /**
      * PixelRatio of the host device?
      */
    var pixelRatio: Double
    
    /**
      * Set to true if running as a WebApp, i.e. within a WebView
      */
    var webApp: Boolean
    
    /**
      * Is running on windows?
      */
    var windows: Boolean
    
    /**
      * Is running on a Windows Phone?
      */
    var windowsPhone: Boolean
  }
  object OS {
    
    inline def apply(
      android: Boolean,
      chromeOS: Boolean,
      cordova: Boolean,
      crosswalk: Boolean,
      desktop: Boolean,
      ejecta: Boolean,
      electron: Boolean,
      iOS: Boolean,
      iOSVersion: Double,
      iPad: Boolean,
      iPhone: Boolean,
      kindle: Boolean,
      linux: Boolean,
      macOS: Boolean,
      node: Boolean,
      nodeWebkit: Boolean,
      pixelRatio: Double,
      webApp: Boolean,
      windows: Boolean,
      windowsPhone: Boolean
    ): OS = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], chromeOS = chromeOS.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], crosswalk = crosswalk.asInstanceOf[js.Any], desktop = desktop.asInstanceOf[js.Any], ejecta = ejecta.asInstanceOf[js.Any], electron = electron.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], iOSVersion = iOSVersion.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], kindle = kindle.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], macOS = macOS.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeWebkit = nodeWebkit.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], webApp = webApp.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any], windowsPhone = windowsPhone.asInstanceOf[js.Any])
      __obj.asInstanceOf[OS]
    }
    
    extension [Self <: OS](x: Self) {
      
      inline def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setChromeOS(value: Boolean): Self = StObject.set(x, "chromeOS", value.asInstanceOf[js.Any])
      
      inline def setCordova(value: Boolean): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
      
      inline def setCrosswalk(value: Boolean): Self = StObject.set(x, "crosswalk", value.asInstanceOf[js.Any])
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setEjecta(value: Boolean): Self = StObject.set(x, "ejecta", value.asInstanceOf[js.Any])
      
      inline def setElectron(value: Boolean): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setIOS(value: Boolean): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
      
      inline def setIOSVersion(value: Double): Self = StObject.set(x, "iOSVersion", value.asInstanceOf[js.Any])
      
      inline def setIPad(value: Boolean): Self = StObject.set(x, "iPad", value.asInstanceOf[js.Any])
      
      inline def setIPhone(value: Boolean): Self = StObject.set(x, "iPhone", value.asInstanceOf[js.Any])
      
      inline def setKindle(value: Boolean): Self = StObject.set(x, "kindle", value.asInstanceOf[js.Any])
      
      inline def setLinux(value: Boolean): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      inline def setMacOS(value: Boolean): Self = StObject.set(x, "macOS", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Boolean): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeWebkit(value: Boolean): Self = StObject.set(x, "nodeWebkit", value.asInstanceOf[js.Any])
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setWebApp(value: Boolean): Self = StObject.set(x, "webApp", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsPhone(value: Boolean): Self = StObject.set(x, "windowsPhone", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Determines the video support of the browser running this Phaser Game instance.
    * These values are read-only and populated during the boot sequence of the game.
    * They are then referenced by internal game systems and are available for you to access
    * via `this.sys.game.device.video` from within any Scene.
    * 
    * In Phaser 3.20 the properties were renamed to drop the 'Video' suffix.
    */
  trait Video extends StObject {
    
    /**
      * Can this device play h264 mp4 video files?
      */
    var h264: Boolean
    
    /**
      * Can this device play hls video files?
      */
    var hls: Boolean
    
    /**
      * Can this device play h264 mp4 video files?
      */
    var mp4: Boolean
    
    /**
      * Can this device play ogg video files?
      */
    var ogg: Boolean
    
    /**
      * Can this device play vp9 video files?
      */
    var vp9: Boolean
    
    /**
      * Can this device play webm video files?
      */
    var webm: Boolean
  }
  object Video {
    
    inline def apply(h264: Boolean, hls: Boolean, mp4: Boolean, ogg: Boolean, vp9: Boolean, webm: Boolean): Video = {
      val __obj = js.Dynamic.literal(h264 = h264.asInstanceOf[js.Any], hls = hls.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], vp9 = vp9.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Video]
    }
    
    extension [Self <: Video](x: Self) {
      
      inline def setH264(value: Boolean): Self = StObject.set(x, "h264", value.asInstanceOf[js.Any])
      
      inline def setHls(value: Boolean): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
      
      inline def setMp4(value: Boolean): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
      
      inline def setOgg(value: Boolean): Self = StObject.set(x, "ogg", value.asInstanceOf[js.Any])
      
      inline def setVp9(value: Boolean): Self = StObject.set(x, "vp9", value.asInstanceOf[js.Any])
      
      inline def setWebm(value: Boolean): Self = StObject.set(x, "webm", value.asInstanceOf[js.Any])
    }
  }
}
