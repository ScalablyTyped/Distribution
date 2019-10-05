package typings.pdfkit.PDFKit

import typings.pdfkit.Anon_Bottom
import typings.pdfkit.pdfkitStrings.landscape
import typings.pdfkit.pdfkitStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFDocumentOptions extends js.Object {
  var autoFirstPage: js.UndefOr[Boolean] = js.undefined
  var bufferPages: js.UndefOr[Boolean] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var info: js.UndefOr[DocumentInfo] = js.undefined
  var layout: js.UndefOr[portrait | landscape] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var margins: js.UndefOr[Anon_Bottom] = js.undefined
  var size: js.UndefOr[js.Array[Double] | String] = js.undefined
}

object PDFDocumentOptions {
  @scala.inline
  def apply(
    autoFirstPage: js.UndefOr[Boolean] = js.undefined,
    bufferPages: js.UndefOr[Boolean] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    info: DocumentInfo = null,
    layout: portrait | landscape = null,
    margin: Int | Double = null,
    margins: Anon_Bottom = null,
    size: js.Array[Double] | String = null
  ): PDFDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFirstPage)) __obj.updateDynamic("autoFirstPage")(autoFirstPage)
    if (!js.isUndefined(bufferPages)) __obj.updateDynamic("bufferPages")(bufferPages)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (info != null) __obj.updateDynamic("info")(info)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFDocumentOptions]
  }
}

