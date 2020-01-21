package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowK[K] extends js.Object {
  var row: K
}

object AnonRowK {
  @scala.inline
  def apply[K](row: K): AnonRowK[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRowK[K]]
  }
}

