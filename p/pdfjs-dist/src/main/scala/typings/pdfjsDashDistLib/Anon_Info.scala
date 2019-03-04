package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Info extends js.Object {
  var info: pdfjsDashDistLib.pdfjsDashDistMod.PDFInfo
  var metadata: pdfjsDashDistLib.pdfjsDashDistMod.PDFMetadata
}

object Anon_Info {
  @scala.inline
  def apply(
    info: pdfjsDashDistLib.pdfjsDashDistMod.PDFInfo,
    metadata: pdfjsDashDistLib.pdfjsDashDistMod.PDFMetadata
  ): Anon_Info = {
    val __obj = js.Dynamic.literal(info = info, metadata = metadata)
  
    __obj.asInstanceOf[Anon_Info]
  }
}

