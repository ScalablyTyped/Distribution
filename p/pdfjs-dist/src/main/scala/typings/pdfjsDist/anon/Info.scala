package typings.pdfjsDist.anon

import typings.pdfjsDist.mod.PDFInfo
import typings.pdfjsDist.mod.PDFMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var info: PDFInfo
  var metadata: PDFMetadata
}

object Info {
  @scala.inline
  def apply(info: PDFInfo, metadata: PDFMetadata): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

