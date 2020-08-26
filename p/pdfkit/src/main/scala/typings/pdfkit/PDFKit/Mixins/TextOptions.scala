package typings.pdfkit.PDFKit.Mixins

import typings.pdfkit.pdfkitStrings.`svg-central`
import typings.pdfkit.pdfkitStrings.`svg-middle`
import typings.pdfkit.pdfkitStrings.alphabetic
import typings.pdfkit.pdfkitStrings.bottom
import typings.pdfkit.pdfkitStrings.center
import typings.pdfkit.pdfkitStrings.hanging
import typings.pdfkit.pdfkitStrings.ideographic
import typings.pdfkit.pdfkitStrings.justify
import typings.pdfkit.pdfkitStrings.left
import typings.pdfkit.pdfkitStrings.mathematical
import typings.pdfkit.pdfkitStrings.middle
import typings.pdfkit.pdfkitStrings.right
import typings.pdfkit.pdfkitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  /** the alignment of the text (center, justify, left, right) */
  //TODO check this
  var align: js.UndefOr[center | justify | left | right | String] = js.native
  /** the vertical alignment of the text with respect to its insertion point */
  var baseline: js.UndefOr[
    Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
  ] = js.native
  /** the amount of space between each character in the text */
  var characterSpacing: js.UndefOr[Double] = js.native
  /** the amount of space between each column (1/4 inch by default) */
  var columnGap: js.UndefOr[Double] = js.native
  /**  the number of columns to flow the text into */
  var columns: js.UndefOr[Double] = js.native
  /** whether the text segment will be followed immediately by another segment. Useful for changing styling in the middle of a paragraph. */
  var continued: js.UndefOr[Boolean] = js.native
  /** The character to display at the end of the text when it is too long. Set to true to use the default character. */
  var ellipsis: js.UndefOr[Boolean | String] = js.native
  /** an array of OpenType feature tags to apply. If not provided, a set of defaults is used. */
  var features: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
  /** whether to fill the text (true by default) */
  var fill: js.UndefOr[Boolean] = js.native
  /**  The maximum height that text should be clipped to */
  var height: js.UndefOr[Double] = js.native
  /** The amount in PDF points (72 per inch) to indent each paragraph of text */
  var indent: js.UndefOr[Double] = js.native
  /**  Set to false to disable line wrapping all together */
  var lineBreak: js.UndefOr[Boolean] = js.native
  /** the amount of space between each line of text */
  var lineGap: js.UndefOr[Double] = js.native
  /** A URL to link this text to (shortcut to create an annotation) */
  var link: js.UndefOr[String] = js.native
  /** whether to slant the text (angle in degrees or true) */
  var oblique: js.UndefOr[Boolean | Double] = js.native
  /** the amount of space between each paragraph of text */
  var paragraphGap: js.UndefOr[Double] = js.native
  /** whether to strike out the text */
  var strike: js.UndefOr[Boolean] = js.native
  /**  whether to stroke the text */
  var stroke: js.UndefOr[Boolean] = js.native
  /** whether to underline the text */
  var underline: js.UndefOr[Boolean] = js.native
  /** The width that text should be wrapped to (by default, the page width minus the left and right margin) */
  var width: js.UndefOr[Double] = js.native
  /** the amount of space between each word in the text */
  var wordSpacing: js.UndefOr[Double] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: center | justify | left | right | String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBaseline(
      value: Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
    ): Self = this.set("baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    @scala.inline
    def setCharacterSpacing(value: Double): Self = this.set("characterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterSpacing: Self = this.set("characterSpacing", js.undefined)
    @scala.inline
    def setColumnGap(value: Double): Self = this.set("columnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGap: Self = this.set("columnGap", js.undefined)
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContinued(value: Boolean): Self = this.set("continued", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinued: Self = this.set("continued", js.undefined)
    @scala.inline
    def setEllipsis(value: Boolean | String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: OpenTypeFeatures*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[OpenTypeFeatures]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setLineBreak(value: Boolean): Self = this.set("lineBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    @scala.inline
    def setLineGap(value: Double): Self = this.set("lineGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineGap: Self = this.set("lineGap", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setOblique(value: Boolean | Double): Self = this.set("oblique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOblique: Self = this.set("oblique", js.undefined)
    @scala.inline
    def setParagraphGap(value: Double): Self = this.set("paragraphGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphGap: Self = this.set("paragraphGap", js.undefined)
    @scala.inline
    def setStrike(value: Boolean): Self = this.set("strike", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrike: Self = this.set("strike", js.undefined)
    @scala.inline
    def setStroke(value: Boolean): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWordSpacing(value: Double): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
  }
  
}

