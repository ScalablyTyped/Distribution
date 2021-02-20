package typings.phaser.Phaser

import typings.phaser.Phaser.Device.Audio
import typings.phaser.Phaser.Device.Browser
import typings.phaser.Phaser.Device.CanvasFeatures
import typings.phaser.Phaser.Device.Features
import typings.phaser.Phaser.Device.Fullscreen
import typings.phaser.Phaser.Device.OS
import typings.phaser.Phaser.Device.Video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConf extends StObject {
  
  /**
    * The Audio Device functions.
    */
  var audio: Audio = js.native
  
  /**
    * The Browser Device functions.
    */
  var browser: Browser = js.native
  
  /**
    * The Canvas Device functions.
    */
  var canvasFeatures: CanvasFeatures = js.native
  
  /**
    * The Features Device functions.
    */
  var features: Features = js.native
  
  /**
    * The Fullscreen Device functions.
    */
  var fullscreen: Fullscreen = js.native
  
  /**
    * The Input Device functions.
    */
  var input: typings.phaser.Phaser.Device.Input = js.native
  
  /**
    * The OS Device functions.
    */
  var os: OS = js.native
  
  /**
    * The Video Device functions.
    */
  var video: Video = js.native
}
object DeviceConf {
  
  @scala.inline
  def apply(
    audio: Audio,
    browser: Browser,
    canvasFeatures: CanvasFeatures,
    features: Features,
    fullscreen: Fullscreen,
    input: typings.phaser.Phaser.Device.Input,
    os: OS,
    video: Video
  ): DeviceConf = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], canvasFeatures = canvasFeatures.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConf]
  }
  
  @scala.inline
  implicit class DeviceConfMutableBuilder[Self <: DeviceConf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Audio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasFeatures(value: CanvasFeatures): Self = StObject.set(x, "canvasFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreen(value: Fullscreen): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: typings.phaser.Phaser.Device.Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: OS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
