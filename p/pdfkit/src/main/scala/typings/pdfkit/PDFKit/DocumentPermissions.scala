package typings.pdfkit.PDFKit

import typings.pdfkit.pdfkitStrings.highResolution
import typings.pdfkit.pdfkitStrings.lowResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentPermissions extends js.Object {
  var annotating: js.UndefOr[Boolean] = js.native
  var contentAccessibility: js.UndefOr[Boolean] = js.native
  var copying: js.UndefOr[Boolean] = js.native
  var documentAssembly: js.UndefOr[Boolean] = js.native
  var fillingForms: js.UndefOr[Boolean] = js.native
  var modifying: js.UndefOr[Boolean] = js.native
  var printing: js.UndefOr[lowResolution | highResolution] = js.native
}

object DocumentPermissions {
  @scala.inline
  def apply(): DocumentPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPermissions]
  }
  @scala.inline
  implicit class DocumentPermissionsOps[Self <: DocumentPermissions] (val x: Self) extends AnyVal {
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
    def setAnnotating(value: Boolean): Self = this.set("annotating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotating: Self = this.set("annotating", js.undefined)
    @scala.inline
    def setContentAccessibility(value: Boolean): Self = this.set("contentAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentAccessibility: Self = this.set("contentAccessibility", js.undefined)
    @scala.inline
    def setCopying(value: Boolean): Self = this.set("copying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopying: Self = this.set("copying", js.undefined)
    @scala.inline
    def setDocumentAssembly(value: Boolean): Self = this.set("documentAssembly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentAssembly: Self = this.set("documentAssembly", js.undefined)
    @scala.inline
    def setFillingForms(value: Boolean): Self = this.set("fillingForms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillingForms: Self = this.set("fillingForms", js.undefined)
    @scala.inline
    def setModifying(value: Boolean): Self = this.set("modifying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifying: Self = this.set("modifying", js.undefined)
    @scala.inline
    def setPrinting(value: lowResolution | highResolution): Self = this.set("printing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrinting: Self = this.set("printing", js.undefined)
  }
  
}

