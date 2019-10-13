package typings.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the video support of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.video` from within any Scene.
  * 
  * In Phaser 3.20 the properties were renamed to drop the 'Video' suffix.
  */
trait Video extends js.Object {
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
  @scala.inline
  def apply(h264: Boolean, hls: Boolean, mp4: Boolean, ogg: Boolean, vp9: Boolean, webm: Boolean): Video = {
    val __obj = js.Dynamic.literal(h264 = h264, hls = hls, mp4 = mp4, ogg = ogg, vp9 = vp9, webm = webm)
  
    __obj.asInstanceOf[Video]
  }
}

