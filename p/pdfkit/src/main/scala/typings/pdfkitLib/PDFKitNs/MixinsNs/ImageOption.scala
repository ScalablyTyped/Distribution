package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOption extends js.Object {
  var align: js.UndefOr[pdfkitLib.pdfkitLibStrings.center | pdfkitLib.pdfkitLibStrings.right] = js.undefined
  var cover: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /** Two elements array specifying dimensions(w,h)  */
  var fit: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var goTo: js.UndefOr[AnnotationOption] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var link: js.UndefOr[AnnotationOption] = js.undefined
  /** Scale percentage */
  var scale: js.UndefOr[scala.Double] = js.undefined
  var valign: js.UndefOr[pdfkitLib.pdfkitLibStrings.center | pdfkitLib.pdfkitLibStrings.bottom] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageOption {
  @scala.inline
  def apply(
    align: pdfkitLib.pdfkitLibStrings.center | pdfkitLib.pdfkitLibStrings.right = null,
    cover: js.Tuple2[scala.Double, scala.Double] = null,
    destination: java.lang.String = null,
    fit: js.Tuple2[scala.Double, scala.Double] = null,
    goTo: AnnotationOption = null,
    height: scala.Int | scala.Double = null,
    link: AnnotationOption = null,
    scale: scala.Int | scala.Double = null,
    valign: pdfkitLib.pdfkitLibStrings.center | pdfkitLib.pdfkitLibStrings.bottom = null,
    width: scala.Int | scala.Double = null
  ): ImageOption = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (fit != null) __obj.updateDynamic("fit")(fit)
    if (goTo != null) __obj.updateDynamic("goTo")(goTo)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOption]
  }
}

