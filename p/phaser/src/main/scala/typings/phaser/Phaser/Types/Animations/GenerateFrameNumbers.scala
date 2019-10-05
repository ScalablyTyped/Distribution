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
    end: Int | Double = null,
    first: Boolean | integer = null,
    frames: Boolean | js.Array[integer] = null,
    outputArray: js.Array[AnimationFrame] = null,
    start: Int | Double = null
  ): GenerateFrameNumbers = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (outputArray != null) __obj.updateDynamic("outputArray")(outputArray)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateFrameNumbers]
  }
}

