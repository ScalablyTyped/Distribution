package typings.mergeImg.mod

import typings.mergeImg.mergeImgStrings.center
import typings.mergeImg.mergeImgStrings.end
import typings.mergeImg.mergeImgStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Aligning of given images. If the images are not all the same size, images will be sorted to largest image
    * @default 'start'
    */
  var align: js.UndefOr[start | center | end] = js.native
  /**
    * Default background color represented by RGBA hex value.
    * @default 0x00000000
    */
  var color: js.UndefOr[Double] = js.native
  /**
    * Direction of the merged image. If this value is true, the images will be merged vertically (column).
    * Otherwise, the images will be merged horizontally (row)
    * @default false
    */
  var direction: js.UndefOr[Boolean] = js.native
  /**
    * Margin of the result image.
    * If `number` or `string` is passed, it will be considered as standard
    * css shorthand properties (e.g. '40 40 0 10')
    */
  var margin: js.UndefOr[Double | String | MarginOptions] = js.native
  /**
    * Offset in pixels between each image
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.native
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
    def setAlign(value: start | center | end): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDirection(value: Boolean): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setMargin(value: Double | String | MarginOptions): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

