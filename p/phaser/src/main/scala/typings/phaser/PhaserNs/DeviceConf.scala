package typings.phaser.PhaserNs

import typings.phaser.PhaserNs.DeviceNs.Audio
import typings.phaser.PhaserNs.DeviceNs.Browser
import typings.phaser.PhaserNs.DeviceNs.CanvasFeatures
import typings.phaser.PhaserNs.DeviceNs.Features
import typings.phaser.PhaserNs.DeviceNs.Fullscreen
import typings.phaser.PhaserNs.DeviceNs.Input
import typings.phaser.PhaserNs.DeviceNs.OS
import typings.phaser.PhaserNs.DeviceNs.Video
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
  var input: Input
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
    input: Input,
    os: OS,
    video: Video
  ): DeviceConf = {
    val __obj = js.Dynamic.literal(audio = audio, browser = browser, canvasFeatures = canvasFeatures, features = features, fullscreen = fullscreen, input = input, os = os, video = video)
  
    __obj.asInstanceOf[DeviceConf]
  }
}

