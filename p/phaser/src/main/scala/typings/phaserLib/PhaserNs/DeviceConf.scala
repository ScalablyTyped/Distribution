package typings
package phaserLib.PhaserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConf extends js.Object {
  /**
    * The Audio Device functions.
    */
  var audio: phaserLib.PhaserNs.DeviceNs.Audio
  /**
    * The Browser Device functions.
    */
  var browser: phaserLib.PhaserNs.DeviceNs.Browser
  /**
    * The Canvas Device functions.
    */
  var canvasFeatures: phaserLib.PhaserNs.DeviceNs.CanvasFeatures
  /**
    * The Features Device functions.
    */
  var features: phaserLib.PhaserNs.DeviceNs.Features
  /**
    * The Fullscreen Device functions.
    */
  var fullscreen: phaserLib.PhaserNs.DeviceNs.Fullscreen
  /**
    * The Input Device functions.
    */
  var input: phaserLib.PhaserNs.DeviceNs.Input
  /**
    * The OS Device functions.
    */
  var os: phaserLib.PhaserNs.DeviceNs.OS
  /**
    * The Video Device functions.
    */
  var video: phaserLib.PhaserNs.DeviceNs.Video
}

object DeviceConf {
  @scala.inline
  def apply(
    audio: phaserLib.PhaserNs.DeviceNs.Audio,
    browser: phaserLib.PhaserNs.DeviceNs.Browser,
    canvasFeatures: phaserLib.PhaserNs.DeviceNs.CanvasFeatures,
    features: phaserLib.PhaserNs.DeviceNs.Features,
    fullscreen: phaserLib.PhaserNs.DeviceNs.Fullscreen,
    input: phaserLib.PhaserNs.DeviceNs.Input,
    os: phaserLib.PhaserNs.DeviceNs.OS,
    video: phaserLib.PhaserNs.DeviceNs.Video
  ): DeviceConf = {
    val __obj = js.Dynamic.literal(audio = audio, browser = browser, canvasFeatures = canvasFeatures, features = features, fullscreen = fullscreen, input = input, os = os, video = video)
  
    __obj.asInstanceOf[DeviceConf]
  }
}

