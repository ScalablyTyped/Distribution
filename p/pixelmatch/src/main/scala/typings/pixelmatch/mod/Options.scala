package typings.pixelmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The color of anti-aliased pixels in the diff output.
    * @default [255, 255, 0]
    */
  var aaColor: js.UndefOr[RGBTuple] = js.native
  /**
    * Blending factor of unchanged pixels in the diff output.
    * Ranges from 0 for pure white to 1 for original brightness
    * @default 0.1
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The color of differing pixels in the diff output.
    * @default [255, 0, 0]
    */
  var diffColor: js.UndefOr[RGBTuple] = js.native
  /**
    * An alternative color to use for dark on light differences to differentiate between "added" and "removed" parts.
    * If not provided, all differing pixels use the color specified by `diffColor`.
    * @default null
    */
  var diffColorAlt: js.UndefOr[RGBTuple] = js.native
  /**
    * Draw the diff over a transparent background (a mask), rather than over the original image.
    * Will not draw anti-aliased pixels (if detected)
    * @default false
    */
  var diffMask: js.UndefOr[Boolean] = js.native
  /**
    * If true, disables detecting and ignoring anti-aliased pixels.
    * @default false
    */
  val includeAA: js.UndefOr[Boolean] = js.native
  /**
    * Matching threshold, ranges from 0 to 1. Smaller values make the comparison more sensitive.
    * @default 0.1
    */
  val threshold: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAaColor(value: RGBTuple): Self = this.set("aaColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAaColor: Self = this.set("aaColor", js.undefined)
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setDiffColor(value: RGBTuple): Self = this.set("diffColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiffColor: Self = this.set("diffColor", js.undefined)
    @scala.inline
    def setDiffColorAlt(value: RGBTuple): Self = this.set("diffColorAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiffColorAlt: Self = this.set("diffColorAlt", js.undefined)
    @scala.inline
    def setDiffMask(value: Boolean): Self = this.set("diffMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiffMask: Self = this.set("diffMask", js.undefined)
    @scala.inline
    def setIncludeAA(value: Boolean): Self = this.set("includeAA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAA: Self = this.set("includeAA", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

