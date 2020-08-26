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
@js.native
trait Video extends js.Object {
  /**
    * Can this device play h264 mp4 video files?
    */
  var h264: Boolean = js.native
  /**
    * Can this device play hls video files?
    */
  var hls: Boolean = js.native
  /**
    * Can this device play h264 mp4 video files?
    */
  var mp4: Boolean = js.native
  /**
    * Can this device play ogg video files?
    */
  var ogg: Boolean = js.native
  /**
    * Can this device play vp9 video files?
    */
  var vp9: Boolean = js.native
  /**
    * Can this device play webm video files?
    */
  var webm: Boolean = js.native
}

object Video {
  @scala.inline
  def apply(h264: Boolean, hls: Boolean, mp4: Boolean, ogg: Boolean, vp9: Boolean, webm: Boolean): Video = {
    val __obj = js.Dynamic.literal(h264 = h264.asInstanceOf[js.Any], hls = hls.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], vp9 = vp9.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
  @scala.inline
  implicit class VideoOps[Self <: Video] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setH264(value: Boolean): Self = this.set("h264", value.asInstanceOf[js.Any])
    @scala.inline
    def setHls(value: Boolean): Self = this.set("hls", value.asInstanceOf[js.Any])
    @scala.inline
    def setMp4(value: Boolean): Self = this.set("mp4", value.asInstanceOf[js.Any])
    @scala.inline
    def setOgg(value: Boolean): Self = this.set("ogg", value.asInstanceOf[js.Any])
    @scala.inline
    def setVp9(value: Boolean): Self = this.set("vp9", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebm(value: Boolean): Self = this.set("webm", value.asInstanceOf[js.Any])
  }
  
}

