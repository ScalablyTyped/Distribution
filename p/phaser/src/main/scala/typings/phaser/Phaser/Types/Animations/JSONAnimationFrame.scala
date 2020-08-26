package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONAnimationFrame extends js.Object {
  /**
    * Additional time (in ms) that this frame should appear for during playback.
    */
  var duration: Double = js.native
  /**
    * The key of the Frame within the Texture that this AnimationFrame uses.
    */
  var frame: String | integer = js.native
  /**
    * The key of the Texture this AnimationFrame uses.
    */
  var key: String = js.native
}

object JSONAnimationFrame {
  @scala.inline
  def apply(duration: Double, frame: String | integer, key: String): JSONAnimationFrame = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONAnimationFrame]
  }
  @scala.inline
  implicit class JSONAnimationFrameOps[Self <: JSONAnimationFrame] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: String | integer): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

