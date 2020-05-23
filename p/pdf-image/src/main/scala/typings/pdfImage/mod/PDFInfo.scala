package typings.pdfImage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFInfo extends /* key */ StringDictionary[String] {
  var CreationDate: String
  var Creator: String
  var Encrypted: String
  var `File size`: String
  var Form: String
  var JavaScript: String
  var Optimized: String
  var `PDF version`: String
  var `Page rot`: String
  var `Page size`: String
  var Pages: String
  var Producer: String
  var Suspects: String
  var Tagged: String
  var UserProperties: String
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
    UserProperties: String,
    StringDictionary: /* name */ StringDictionary[String] = null
  ): PDFInfo = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encrypted = Encrypted.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], JavaScript = JavaScript.asInstanceOf[js.Any], Optimized = Optimized.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Producer = Producer.asInstanceOf[js.Any], Suspects = Suspects.asInstanceOf[js.Any], Tagged = Tagged.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("File size")((`File size`).asInstanceOf[js.Any])
    __obj.updateDynamic("PDF version")((`PDF version`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page rot")((`Page rot`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page size")((`Page size`).asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PDFInfo]
  }
}

