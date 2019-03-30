package typings
package atNivoWaffleLib.atNivoWaffleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaffleBaseProps extends js.Object {
  var columns: scala.Double
  var data: js.Array[js.Object]
  var rows: scala.Double
  var total: scala.Double
}

object WaffleBaseProps {
  @scala.inline
  def apply(columns: scala.Double, data: js.Array[js.Object], rows: scala.Double, total: scala.Double): WaffleBaseProps = {
    val __obj = js.Dynamic.literal(columns = columns, data = data, rows = rows, total = total)
  
    __obj.asInstanceOf[WaffleBaseProps]
  }
}

