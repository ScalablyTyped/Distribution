package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateFrameNames extends js.Object {
  /**
    * If `frames` is not provided, the number of the last frame to return.
    */
  var end: js.UndefOr[integer] = js.undefined
  /**
    * If provided as an array, the range defined by `start` and `end` will be ignored and these frame numbers will be used.
    */
  var frames: js.UndefOr[Boolean | js.Array[integer]] = js.undefined
  /**
    * The array to append the created configuration objects to.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.undefined
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * If `frames` is not provided, the number of the first frame to return.
    */
  var start: js.UndefOr[integer] = js.undefined
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * The minimum expected lengths of each resulting frame's number. Numbers will be left-padded with zeroes until they are this long, then prepended and appended to create the resulting frame name.
    */
  var zeroPad: js.UndefOr[integer] = js.undefined
}

object GenerateFrameNames {
  @scala.inline
  def apply(
    end: js.UndefOr[integer] = js.undefined,
    frames: Boolean | js.Array[integer] = null,
    outputArray: js.Array[AnimationFrame] = null,
    prefix: String = null,
    start: js.UndefOr[integer] = js.undefined,
    suffix: String = null,
    zeroPad: js.UndefOr[integer] = js.undefined
  ): GenerateFrameNames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (outputArray != null) __obj.updateDynamic("outputArray")(outputArray.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroPad)) __obj.updateDynamic("zeroPad")(zeroPad.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateFrameNames]
  }
}

