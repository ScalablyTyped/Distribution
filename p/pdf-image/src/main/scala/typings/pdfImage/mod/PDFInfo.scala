package typings.pdfImage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFInfo extends /* key */ StringDictionary[String] {
  var CreationDate: String = js.native
  var Creator: String = js.native
  var Encrypted: String = js.native
  var `File size`: String = js.native
  var Form: String = js.native
  var JavaScript: String = js.native
  var Optimized: String = js.native
  var `PDF version`: String = js.native
  var `Page rot`: String = js.native
  var `Page size`: String = js.native
  var Pages: String = js.native
  var Producer: String = js.native
  var Suspects: String = js.native
  var Tagged: String = js.native
  var UserProperties: String = js.native
}

object PDFInfo {
  @scala.inline
  def apply(
    CreationDate: String,
    Creator: String,
    Encrypted: String,
    `File size`: String,
    Form: String,
    JavaScript: String,
    Optimized: String,
    `PDF version`: String,
    `Page rot`: String,
    `Page size`: String,
    Pages: String,
    Producer: String,
    Suspects: String,
    Tagged: String,
    UserProperties: String
  ): PDFInfo = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encrypted = Encrypted.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], JavaScript = JavaScript.asInstanceOf[js.Any], Optimized = Optimized.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Producer = Producer.asInstanceOf[js.Any], Suspects = Suspects.asInstanceOf[js.Any], Tagged = Tagged.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("File size")((`File size`).asInstanceOf[js.Any])
    __obj.updateDynamic("PDF version")((`PDF version`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page rot")((`Page rot`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page size")((`Page size`).asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFInfo]
  }
  @scala.inline
  implicit class PDFInfoOps[Self <: PDFInfo] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: String): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncrypted(value: String): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFile size`(value: String): Self = this.set("File size", value.asInstanceOf[js.Any])
    @scala.inline
    def setForm(value: String): Self = this.set("Form", value.asInstanceOf[js.Any])
    @scala.inline
    def setJavaScript(value: String): Self = this.set("JavaScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimized(value: String): Self = this.set("Optimized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPDF version`(value: String): Self = this.set("PDF version", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage rot`(value: String): Self = this.set("Page rot", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage size`(value: String): Self = this.set("Page size", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: String): Self = this.set("Pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setProducer(value: String): Self = this.set("Producer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuspects(value: String): Self = this.set("Suspects", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagged(value: String): Self = this.set("Tagged", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserProperties(value: String): Self = this.set("UserProperties", value.asInstanceOf[js.Any])
  }
  
}

