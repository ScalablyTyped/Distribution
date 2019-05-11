package typings
package phaserLib.PhaserNs.TypesNs.AnimationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateFrameNumbers extends js.Object {
  /**
    * The ending frame of the animation.
    */
  var end: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * A frame to put at the beginning of the animation, before `start` or `outputArray` or `frames`.
    */
  var first: js.UndefOr[scala.Boolean | phaserLib.integer] = js.undefined
  /**
    * A custom sequence of frames.
    */
  var frames: js.UndefOr[scala.Boolean | js.Array[phaserLib.integer]] = js.undefined
  /**
    * An array to concatenate the output onto.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.undefined
  /**
    * The starting frame of the animation.
    */
  var start: js.UndefOr[phaserLib.integer] = js.undefined
}

object GenerateFrameNumbers {
  @scala.inline
  def apply(
    end: js.UndefOr[phaserLib.integer] = js.undefined,
    first: scala.Boolean | phaserLib.integer = null,
    frames: scala.Boolean | js.Array[phaserLib.integer] = null,
    outputArray: js.Array[AnimationFrame] = null,
    start: js.UndefOr[phaserLib.integer] = js.undefined
  ): GenerateFrameNumbers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (outputArray != null) __obj.updateDynamic("outputArray")(outputArray)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[GenerateFrameNumbers]
  }
}

