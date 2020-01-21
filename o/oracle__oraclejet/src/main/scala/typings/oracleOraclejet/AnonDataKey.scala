package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataKey[K, D] extends js.Object {
  var data: D
  var key: K
}

object AnonDataKey {
  @scala.inline
  def apply[K, D](data: D, key: K): AnonDataKey[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataKey[K, D]]
  }
}

