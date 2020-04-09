package typings.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.pdfFillForm.mod.Options because Already inherited */ trait ImgPdfOptions extends PdfOptions {
  var endPage: js.UndefOr[Double] = js.undefined
  var startPage: js.UndefOr[Double] = js.undefined
}

object ImgPdfOptions {
  @scala.inline
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    cores: Int | Double = null,
    endPage: Int | Double = null,
    save: String = null,
    scale: Int | Double = null,
    startPage: Int | Double = null
  ): ImgPdfOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.asInstanceOf[js.Any])
    if (cores != null) __obj.updateDynamic("cores")(cores.asInstanceOf[js.Any])
    if (endPage != null) __obj.updateDynamic("endPage")(endPage.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (startPage != null) __obj.updateDynamic("startPage")(startPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgPdfOptions]
  }
}

