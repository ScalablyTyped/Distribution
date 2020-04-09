package typings.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PdfOptions extends Options {
  var antialias: js.UndefOr[Boolean] = js.undefined
  var cores: js.UndefOr[Double] = js.undefined
  var save: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object PdfOptions {
  @scala.inline
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    cores: Int | Double = null,
    save: String = null,
    scale: Int | Double = null
  ): PdfOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.asInstanceOf[js.Any])
    if (cores != null) __obj.updateDynamic("cores")(cores.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfOptions]
  }
}

