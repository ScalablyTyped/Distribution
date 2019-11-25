package typings.pdfkit.PDFKit

import typings.pdfkit.pdfkitStrings.highResolution
import typings.pdfkit.pdfkitStrings.lowResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentPermissions extends js.Object {
  var annotating: js.UndefOr[Boolean] = js.undefined
  var contentAccessibility: js.UndefOr[Boolean] = js.undefined
  var copying: js.UndefOr[Boolean] = js.undefined
  var documentAssembly: js.UndefOr[Boolean] = js.undefined
  var fillingForms: js.UndefOr[Boolean] = js.undefined
  var modifying: js.UndefOr[Boolean] = js.undefined
  var printing: js.UndefOr[lowResolution | highResolution] = js.undefined
}

object DocumentPermissions {
  @scala.inline
  def apply(
    annotating: js.UndefOr[Boolean] = js.undefined,
    contentAccessibility: js.UndefOr[Boolean] = js.undefined,
    copying: js.UndefOr[Boolean] = js.undefined,
    documentAssembly: js.UndefOr[Boolean] = js.undefined,
    fillingForms: js.UndefOr[Boolean] = js.undefined,
    modifying: js.UndefOr[Boolean] = js.undefined,
    printing: lowResolution | highResolution = null
  ): DocumentPermissions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotating)) __obj.updateDynamic("annotating")(annotating.asInstanceOf[js.Any])
    if (!js.isUndefined(contentAccessibility)) __obj.updateDynamic("contentAccessibility")(contentAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(copying)) __obj.updateDynamic("copying")(copying.asInstanceOf[js.Any])
    if (!js.isUndefined(documentAssembly)) __obj.updateDynamic("documentAssembly")(documentAssembly.asInstanceOf[js.Any])
    if (!js.isUndefined(fillingForms)) __obj.updateDynamic("fillingForms")(fillingForms.asInstanceOf[js.Any])
    if (!js.isUndefined(modifying)) __obj.updateDynamic("modifying")(modifying.asInstanceOf[js.Any])
    if (printing != null) __obj.updateDynamic("printing")(printing.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPermissions]
  }
}

