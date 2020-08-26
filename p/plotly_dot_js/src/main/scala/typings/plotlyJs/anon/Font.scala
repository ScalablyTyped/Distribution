package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  /**
    * Sets the font of the current value label text.
    */
  var font: PartialFont = js.native
  /**
    * The amount of space, in pixels, between the current value label
    * and the slider.
    */
  var offset: Double = js.native
  /**
    * When currentvalue.visible is true, this sets the prefix of the label.
    */
  var prefix: String = js.native
  /**
    * When currentvalue.visible is true, this sets the suffix of the label.
    */
  var suffix: String = js.native
  /**
    * Shows the currently-selected value above the slider.
    */
  var visible: Boolean = js.native
  /**
    * The alignment of the value readout relative to the length of the slider.
    */
  var xanchor: left | center | right = js.native
}

object Font {
  @scala.inline
  def apply(
    font: PartialFont,
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
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
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setXanchor(value: left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
  }
  
}

