package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: String
  var tableParams: String
}

object Anon_Columns {
  @scala.inline
  def apply(columns: String, tableParams: String): Anon_Columns = {
    val __obj = js.Dynamic.literal(columns = columns, tableParams = tableParams)
  
    __obj.asInstanceOf[Anon_Columns]
  }
}

