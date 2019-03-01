package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFProgressData extends js.Object {
  var loaded: scala.Double
  var total: scala.Double
}

object PDFProgressData {
  @scala.inline
  def apply(loaded: scala.Double, total: scala.Double): PDFProgressData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[PDFProgressData]
  }
}

