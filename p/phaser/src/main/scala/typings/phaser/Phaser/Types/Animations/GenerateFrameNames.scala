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
  var frames: js.UndefOr[Boolean] = js.undefined
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
    end: Int | Double = null,
    frames: js.UndefOr[Boolean] = js.undefined,
    outputArray: js.Array[AnimationFrame] = null,
    prefix: String = null,
    start: Int | Double = null,
    suffix: String = null,
    zeroPad: Int | Double = null
  ): GenerateFrameNames = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(frames)) __obj.updateDynamic("frames")(frames)
    if (outputArray != null) __obj.updateDynamic("outputArray")(outputArray)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (zeroPad != null) __obj.updateDynamic("zeroPad")(zeroPad.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateFrameNames]
  }
}

