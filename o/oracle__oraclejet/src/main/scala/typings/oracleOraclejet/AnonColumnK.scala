package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnK[K] extends js.Object {
  var column: K
}

object AnonColumnK {
  @scala.inline
  def apply[K](column: K): AnonColumnK[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnK[K]]
  }
}

