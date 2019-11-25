package typings.phaser.Phaser.Types.Animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationFrame extends js.Object {
  /**
    * [description]
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * [description]
    */
  var frame: String | Double
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: String
  /**
    * [description]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnimationFrame {
  @scala.inline
  def apply(
    frame: String | Double,
    key: String,
    duration: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnimationFrame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFrame]
  }
}

