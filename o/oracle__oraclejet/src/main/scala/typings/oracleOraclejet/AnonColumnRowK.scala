package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnRowK[K] extends js.Object {
  var column: K
  var row: K
}

object AnonColumnRowK {
  @scala.inline
  def apply[K](column: K, row: K): AnonColumnRowK[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnRowK[K]]
  }
}

