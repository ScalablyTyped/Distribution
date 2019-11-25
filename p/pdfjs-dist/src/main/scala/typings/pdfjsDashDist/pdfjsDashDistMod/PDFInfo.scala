package typings.pdfjsDashDist.pdfjsDashDistMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFInfo
  extends /* key */ StringDictionary[js.Any] {
  var IsAcroFormPresent: Boolean
  var IsXFAPresent: Boolean
  var PDFFormatVersion: String
}

object PDFInfo {
  @scala.inline
  def apply(
    IsAcroFormPresent: Boolean,
    IsXFAPresent: Boolean,
    PDFFormatVersion: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): PDFInfo = {
    val __obj = js.Dynamic.literal(IsAcroFormPresent = IsAcroFormPresent.asInstanceOf[js.Any], IsXFAPresent = IsXFAPresent.asInstanceOf[js.Any], PDFFormatVersion = PDFFormatVersion.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PDFInfo]
  }
}

