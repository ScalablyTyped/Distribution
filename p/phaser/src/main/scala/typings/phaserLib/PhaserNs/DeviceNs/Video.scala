package typings
package phaserLib.PhaserNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the video support of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.video` from within any Scene.
  */
trait Video extends js.Object {
  /**
    * Can this device play h264 mp4 video files?
    */
  var h264Video: scala.Boolean
  /**
    * Can this device play hls video files?
    */
  var hlsVideo: scala.Boolean
  /**
    * Can this device play h264 mp4 video files?
    */
  var mp4Video: scala.Boolean
  /**
    * Can this device play ogg video files?
    */
  var oggVideo: scala.Boolean
  /**
    * Can this device play vp9 video files?
    */
  var vp9Video: scala.Boolean
  /**
    * Can this device play webm video files?
    */
  var webmVideo: scala.Boolean
}

object Video {
  @scala.inline
  def apply(
    h264Video: scala.Boolean,
    hlsVideo: scala.Boolean,
    mp4Video: scala.Boolean,
    oggVideo: scala.Boolean,
    vp9Video: scala.Boolean,
    webmVideo: scala.Boolean
  ): Video = {
    val __obj = js.Dynamic.literal(h264Video = h264Video, hlsVideo = hlsVideo, mp4Video = mp4Video, oggVideo = oggVideo, vp9Video = vp9Video, webmVideo = webmVideo)
  
    __obj.asInstanceOf[Video]
  }
}

