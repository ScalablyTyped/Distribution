package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[K, D] extends js.Object {
  var data: D
  var key: K
}

object AnonKey {
  @scala.inline
  def apply[K, D](data: D, key: K): AnonKey[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey[K, D]]
  }
}

