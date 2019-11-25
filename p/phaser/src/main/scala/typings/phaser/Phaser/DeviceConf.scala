package typings.phaser.Phaser

import typings.phaser.Phaser.Device.Audio
import typings.phaser.Phaser.Device.Browser
import typings.phaser.Phaser.Device.CanvasFeatures
import typings.phaser.Phaser.Device.Features
import typings.phaser.Phaser.Device.Fullscreen
import typings.phaser.Phaser.Device.OS
import typings.phaser.Phaser.Device.Video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConf extends js.Object {
  /**
    * The Audio Device functions.
    */
  var audio: Audio
  /**
    * The Browser Device functions.
    */
  var browser: Browser
  /**
    * The Canvas Device functions.
    */
  var canvasFeatures: CanvasFeatures
  /**
    * The Features Device functions.
    */
  var features: Features
  /**
    * The Fullscreen Device functions.
    */
  var fullscreen: Fullscreen
  /**
    * The Input Device functions.
    */
  var input: typings.phaser.Phaser.Device.Input
  /**
    * The OS Device functions.
    */
  var os: OS
  /**
    * The Video Device functions.
    */
  var video: Video
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
}

