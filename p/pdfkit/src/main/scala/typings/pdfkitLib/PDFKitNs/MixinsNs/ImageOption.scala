package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOption extends js.Object {
  /** Two elements array specifying dimensions(w,h)  */
  var fit: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Scale percentage */
  var scale: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageOption {
  @scala.inline
  def apply(
    fit: js.Array[scala.Double] = null,
    height: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ImageOption = {
    val __obj = js.Dynamic.literal()
    if (fit != null) __obj.updateDynamic("fit")(fit)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOption]
  }
}

