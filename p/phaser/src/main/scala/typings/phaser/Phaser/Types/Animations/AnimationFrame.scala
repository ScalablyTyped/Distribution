package typings.phaser.Phaser.Types.Animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationFrame extends js.Object {
  /**
    * The duration, in ms, of this frame of the animation.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The key, or index number, of the frame within the animation.
    */
  var frame: String | Double = js.native
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: String = js.native
  /**
    * Should the parent Game Object be visible during this frame of the animation?
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object AnimationFrame {
  @scala.inline
  def apply(frame: String | Double, key: String): AnimationFrame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFrame]
  }
  @scala.inline
  implicit class AnimationFrameOps[Self <: AnimationFrame] (val x: Self) extends AnyVal {
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
    def setFrame(value: String | Double): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

