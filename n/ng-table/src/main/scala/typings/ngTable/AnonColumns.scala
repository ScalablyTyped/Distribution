package typings.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
  var columns: String
  var tableParams: String
}

object AnonColumns {
  @scala.inline
  def apply(columns: String, tableParams: String): AnonColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], tableParams = tableParams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumns]
  }
}

