package typings.pdfkit.PDFKit.Mixins

import typings.pdfkit.pdfkitStrings.bottom
import typings.pdfkit.pdfkitStrings.center
import typings.pdfkit.pdfkitStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOption extends js.Object {
  var align: js.UndefOr[center | right] = js.undefined
  var cover: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  /** Two elements array specifying dimensions(w,h)  */
  var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var goTo: js.UndefOr[AnnotationOption] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var link: js.UndefOr[AnnotationOption] = js.undefined
  /** Scale percentage */
  var scale: js.UndefOr[Double] = js.undefined
  var valign: js.UndefOr[center | bottom] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ImageOption {
  @scala.inline
  def apply(
    align: center | right = null,
    cover: js.Tuple2[Double, Double] = null,
    destination: String = null,
    fit: js.Tuple2[Double, Double] = null,
    goTo: AnnotationOption = null,
    height: Int | Double = null,
    link: AnnotationOption = null,
    scale: Int | Double = null,
    valign: center | bottom = null,
    width: Int | Double = null
  ): ImageOption = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (goTo != null) __obj.updateDynamic("goTo")(goTo.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOption]
  }
}

