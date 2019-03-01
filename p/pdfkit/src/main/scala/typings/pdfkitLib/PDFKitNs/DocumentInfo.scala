package typings
package pdfkitLib.PDFKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentInfo extends js.Object {
  var Author: js.UndefOr[java.lang.String] = js.undefined
  var CreationDate: js.UndefOr[stdLib.Date] = js.undefined
  var Creator: js.UndefOr[java.lang.String] = js.undefined
  var Keywords: js.UndefOr[java.lang.String] = js.undefined
  var ModDate: js.UndefOr[stdLib.Date] = js.undefined
  var Producer: js.UndefOr[java.lang.String] = js.undefined
  var Title: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentInfo {
  @scala.inline
  def apply(
    Author: java.lang.String = null,
    CreationDate: stdLib.Date = null,
    Creator: java.lang.String = null,
    Keywords: java.lang.String = null,
    ModDate: stdLib.Date = null,
    Producer: java.lang.String = null,
    Title: java.lang.String = null
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

