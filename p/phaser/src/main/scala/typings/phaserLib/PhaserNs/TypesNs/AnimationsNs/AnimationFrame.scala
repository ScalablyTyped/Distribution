package typings
package phaserLib.PhaserNs.TypesNs.AnimationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationFrame extends js.Object {
  /**
    * [description]
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * [description]
    */
  var frame: java.lang.String | scala.Double
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: java.lang.String
  /**
    * [description]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object AnimationFrame {
  @scala.inline
  def apply(
    frame: java.lang.String | scala.Double,
    key: java.lang.String,
    duration: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): AnimationFrame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], key = key)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AnimationFrame]
  }
}

