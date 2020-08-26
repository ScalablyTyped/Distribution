package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFInfo
  extends /* key */ StringDictionary[js.Any] {
  var IsAcroFormPresent: Boolean = js.native
  var IsXFAPresent: Boolean = js.native
  var PDFFormatVersion: String = js.native
}

object PDFInfo {
  @scala.inline
  def apply(IsAcroFormPresent: Boolean, IsXFAPresent: Boolean, PDFFormatVersion: String): PDFInfo = {
    val __obj = js.Dynamic.literal(IsAcroFormPresent = IsAcroFormPresent.asInstanceOf[js.Any], IsXFAPresent = IsXFAPresent.asInstanceOf[js.Any], PDFFormatVersion = PDFFormatVersion.asInstanceOf[js.Any])
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
    def setIsAcroFormPresent(value: Boolean): Self = this.set("IsAcroFormPresent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsXFAPresent(value: Boolean): Self = this.set("IsXFAPresent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPDFFormatVersion(value: String): Self = this.set("PDFFormatVersion", value.asInstanceOf[js.Any])
  }
  
}

