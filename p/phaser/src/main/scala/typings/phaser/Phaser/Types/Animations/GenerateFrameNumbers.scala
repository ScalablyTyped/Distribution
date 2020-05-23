package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateFrameNumbers extends js.Object {
  /**
    * The ending frame of the animation.
    */
  var end: js.UndefOr[integer] = js.undefined
  /**
    * A frame to put at the beginning of the animation, before `start` or `outputArray` or `frames`.
    */
  var first: js.UndefOr[Boolean | integer] = js.undefined
  /**
    * A custom sequence of frames.
    */
  var frames: js.UndefOr[Boolean | js.Array[integer]] = js.undefined
  /**
    * An array to concatenate the output onto.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.undefined
  /**
    * The starting frame of the animation.
    */
  var start: js.UndefOr[integer] = js.undefined
}

object GenerateFrameNumbers {
  @scala.inline
  def apply(
    end: js.UndefOr[integer] = js.undefined,
    first: Boolean | integer = null,
    frames: Boolean | js.Array[integer] = null,
    outputArray: js.Array[AnimationFrame] = null,
    start: js.UndefOr[integer] = js.undefined
  ): GenerateFrameNumbers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (outputArray != null) __obj.updateDynamic("outputArray")(outputArray.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateFrameNumbers]
  }
}

