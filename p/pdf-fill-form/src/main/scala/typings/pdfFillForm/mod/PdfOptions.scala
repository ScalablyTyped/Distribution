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
    cores: js.UndefOr[Double] = js.undefined,
    save: String = null,
    scale: js.UndefOr[Double] = js.undefined
  ): PdfOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cores)) __obj.updateDynamic("cores")(cores.get.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfOptions]
  }
}

