package typings.phaser.Phaser.Types.Animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationFrame extends js.Object {
  /**
    * The duration, in ms, of this frame of the animation.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The key, or index number, of the frame within the animation.
    */
  var frame: String | Double
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: String
  /**
    * Should the parent Game Object be visible during this frame of the animation?
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnimationFrame {
  @scala.inline
  def apply(
    frame: String | Double,
    key: String,
    duration: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnimationFrame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFrame]
  }
}

