package typings.phaser.PhaserNs.DeviceNs

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
  var h264Video: Boolean
  /**
    * Can this device play hls video files?
    */
  var hlsVideo: Boolean
  /**
    * Can this device play h264 mp4 video files?
    */
  var mp4Video: Boolean
  /**
    * Can this device play ogg video files?
    */
  var oggVideo: Boolean
  /**
    * Can this device play vp9 video files?
    */
  var vp9Video: Boolean
  /**
    * Can this device play webm video files?
    */
  var webmVideo: Boolean
}

object Video {
  @scala.inline
  def apply(
    h264Video: Boolean,
    hlsVideo: Boolean,
    mp4Video: Boolean,
    oggVideo: Boolean,
    vp9Video: Boolean,
    webmVideo: Boolean
  ): Video = {
    val __obj = js.Dynamic.literal(h264Video = h264Video, hlsVideo = hlsVideo, mp4Video = mp4Video, oggVideo = oggVideo, vp9Video = vp9Video, webmVideo = webmVideo)
  
    __obj.asInstanceOf[Video]
  }
}

