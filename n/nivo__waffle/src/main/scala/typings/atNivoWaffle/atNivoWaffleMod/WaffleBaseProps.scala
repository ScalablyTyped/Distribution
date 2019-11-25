package typings.atNivoWaffle.atNivoWaffleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaffleBaseProps extends js.Object {
  var columns: Double
  var data: js.Array[js.Object]
  var rows: Double
  var total: Double
}

object WaffleBaseProps {
  @scala.inline
  def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): WaffleBaseProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaffleBaseProps]
  }
}

