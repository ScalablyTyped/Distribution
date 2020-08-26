package typings.pdfkit.PDFKit

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentInfo extends js.Object {
  var Author: js.UndefOr[String] = js.native
  var CreationDate: js.UndefOr[Date] = js.native
  var Creator: js.UndefOr[String] = js.native
  var Keywords: js.UndefOr[String] = js.native
  var ModDate: js.UndefOr[Date] = js.native
  var Producer: js.UndefOr[String] = js.native
  var Title: js.UndefOr[String] = js.native
}

object DocumentInfo {
  @scala.inline
  def apply(): DocumentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInfo]
  }
  @scala.inline
  implicit class DocumentInfoOps[Self <: DocumentInfo] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("Author", js.undefined)
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setCreator(value: String): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("Creator", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("Keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("Keywords", js.undefined)
    @scala.inline
    def setModDate(value: Date): Self = this.set("ModDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModDate: Self = this.set("ModDate", js.undefined)
    @scala.inline
    def setProducer(value: String): Self = this.set("Producer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducer: Self = this.set("Producer", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
  
}

