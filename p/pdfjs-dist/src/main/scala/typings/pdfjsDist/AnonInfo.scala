package typings.pdfjsDist

import typings.pdfjsDist.mod.PDFInfo
import typings.pdfjsDist.mod.PDFMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfo extends js.Object {
  var info: PDFInfo
  var metadata: PDFMetadata
}

object AnonInfo {
  @scala.inline
  def apply(info: PDFInfo, metadata: PDFMetadata): AnonInfo = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfo]
  }
}

