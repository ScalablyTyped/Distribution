package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFInfo
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var IsAcroFormPresent: scala.Boolean
  var IsXFAPresent: scala.Boolean
  var PDFFormatVersion: java.lang.String
}

object PDFInfo {
  @scala.inline
  def apply(
    IsAcroFormPresent: scala.Boolean,
    IsXFAPresent: scala.Boolean,
    PDFFormatVersion: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): PDFInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsAcroFormPresent")(IsAcroFormPresent)
    __obj.updateDynamic("IsXFAPresent")(IsXFAPresent)
    __obj.updateDynamic("PDFFormatVersion")(PDFFormatVersion)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PDFInfo]
  }
}

