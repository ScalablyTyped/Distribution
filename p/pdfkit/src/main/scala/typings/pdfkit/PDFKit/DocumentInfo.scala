package typings.pdfkit.PDFKit

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentInfo extends js.Object {
  var Author: js.UndefOr[String] = js.undefined
  var CreationDate: js.UndefOr[Date] = js.undefined
  var Creator: js.UndefOr[String] = js.undefined
  var Keywords: js.UndefOr[String] = js.undefined
  var ModDate: js.UndefOr[Date] = js.undefined
  var Producer: js.UndefOr[String] = js.undefined
  var Title: js.UndefOr[String] = js.undefined
}

object DocumentInfo {
  @scala.inline
  def apply(
    Author: String = null,
    CreationDate: Date = null,
    Creator: String = null,
    Keywords: String = null,
    ModDate: Date = null,
    Producer: String = null,
    Title: String = null
  ): DocumentInfo = {
    val __obj = js.Dynamic.literal()
    if (Author != null) __obj.updateDynamic("Author")(Author)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Creator != null) __obj.updateDynamic("Creator")(Creator)
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords)
    if (ModDate != null) __obj.updateDynamic("ModDate")(ModDate)
    if (Producer != null) __obj.updateDynamic("Producer")(Producer)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[DocumentInfo]
  }
}

