package typings.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pdfFillForm.mod.PdfOptions
  - typings.pdfFillForm.mod.ImgPdfOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def PdfOptions(
    antialias: js.UndefOr[Boolean] = js.undefined,
    cores: js.UndefOr[Double] = js.undefined,
    save: String = null,
    scale: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cores)) __obj.updateDynamic("cores")(cores.get.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def ImgPdfOptions(
    antialias: js.UndefOr[Boolean] = js.undefined,
    cores: js.UndefOr[Double] = js.undefined,
    endPage: js.UndefOr[Double] = js.undefined,
    save: String = null,
    scale: js.UndefOr[Double] = js.undefined,
    startPage: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cores)) __obj.updateDynamic("cores")(cores.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endPage)) __obj.updateDynamic("endPage")(endPage.get.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startPage)) __obj.updateDynamic("startPage")(startPage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

