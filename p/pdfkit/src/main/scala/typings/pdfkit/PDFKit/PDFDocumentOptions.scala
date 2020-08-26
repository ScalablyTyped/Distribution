package typings.pdfkit.PDFKit

import typings.pdfkit.anon.Bottom
import typings.pdfkit.pdfkitStrings.`1Dot3`
import typings.pdfkit.pdfkitStrings.`1Dot4`
import typings.pdfkit.pdfkitStrings.`1Dot5`
import typings.pdfkit.pdfkitStrings.`1Dot6`
import typings.pdfkit.pdfkitStrings.`1Dot7`
import typings.pdfkit.pdfkitStrings.`1Dot7ext3`
import typings.pdfkit.pdfkitStrings.landscape
import typings.pdfkit.pdfkitStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDocumentOptions extends js.Object {
  var autoFirstPage: js.UndefOr[Boolean] = js.native
  var bufferPages: js.UndefOr[Boolean] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var info: js.UndefOr[DocumentInfo] = js.native
  var layout: js.UndefOr[portrait | landscape] = js.native
  var margin: js.UndefOr[Double] = js.native
  var margins: js.UndefOr[Bottom] = js.native
  var ownerPassword: js.UndefOr[String] = js.native
  var pdfVersion: js.UndefOr[`1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`] = js.native
  var permissions: js.UndefOr[DocumentPermissions] = js.native
  var size: js.UndefOr[js.Array[Double] | String] = js.native
  var userPassword: js.UndefOr[String] = js.native
}

object PDFDocumentOptions {
  @scala.inline
  def apply(): PDFDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFDocumentOptions]
  }
  @scala.inline
  implicit class PDFDocumentOptionsOps[Self <: PDFDocumentOptions] (val x: Self) extends AnyVal {
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
    def setAutoFirstPage(value: Boolean): Self = this.set("autoFirstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFirstPage: Self = this.set("autoFirstPage", js.undefined)
    @scala.inline
    def setBufferPages(value: Boolean): Self = this.set("bufferPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferPages: Self = this.set("bufferPages", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setInfo(value: DocumentInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setLayout(value: portrait | landscape): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMargins(value: Bottom): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    @scala.inline
    def setOwnerPassword(value: String): Self = this.set("ownerPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerPassword: Self = this.set("ownerPassword", js.undefined)
    @scala.inline
    def setPdfVersion(value: `1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`): Self = this.set("pdfVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdfVersion: Self = this.set("pdfVersion", js.undefined)
    @scala.inline
    def setPermissions(value: DocumentPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    @scala.inline
    def setSize(value: js.Array[Double] | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUserPassword(value: String): Self = this.set("userPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPassword: Self = this.set("userPassword", js.undefined)
  }
  
}

