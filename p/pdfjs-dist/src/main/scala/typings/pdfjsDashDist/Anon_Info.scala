package typings.pdfjsDashDist

import typings.pdfjsDashDist.pdfjsDashDistMod.PDFInfo
import typings.pdfjsDashDist.pdfjsDashDistMod.PDFMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Info extends js.Object {
  var info: PDFInfo
  var metadata: PDFMetadata
}

object Anon_Info {
  @scala.inline
  def apply(info: PDFInfo, metadata: PDFMetadata): Anon_Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Info]
  }
}

