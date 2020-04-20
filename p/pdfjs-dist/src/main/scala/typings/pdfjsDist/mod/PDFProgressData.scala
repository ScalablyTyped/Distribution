package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFProgressData extends js.Object {
  var loaded: Double
  var total: Double
}

object PDFProgressData {
  @scala.inline
  def apply(loaded: Double, total: Double): PDFProgressData = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFProgressData]
  }
}

