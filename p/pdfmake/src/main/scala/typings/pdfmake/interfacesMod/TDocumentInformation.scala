package typings.pdfmake.interfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TDocumentInformation extends js.Object {
  /** the name of the author */
  var author: js.UndefOr[String] = js.native
  var creationDate: js.UndefOr[Date] = js.native
  var creator: js.UndefOr[String] = js.native
  /** keywords associated with the document */
  var keywords: js.UndefOr[String] = js.native
  var modDate: js.UndefOr[Date] = js.native
  var producer: js.UndefOr[String] = js.native
  /** the subject of the document */
  var subject: js.UndefOr[String] = js.native
  /** the title of the document */
  var title: js.UndefOr[String] = js.native
  var trapped: js.UndefOr[String] = js.native
}

object TDocumentInformation {
  @scala.inline
  def apply(): TDocumentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TDocumentInformation]
  }
  @scala.inline
  implicit class TDocumentInformationOps[Self <: TDocumentInformation] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setCreator(value: String): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setModDate(value: Date): Self = this.set("modDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModDate: Self = this.set("modDate", js.undefined)
    @scala.inline
    def setProducer(value: String): Self = this.set("producer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducer: Self = this.set("producer", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrapped(value: String): Self = this.set("trapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrapped: Self = this.set("trapped", js.undefined)
  }
  
}

