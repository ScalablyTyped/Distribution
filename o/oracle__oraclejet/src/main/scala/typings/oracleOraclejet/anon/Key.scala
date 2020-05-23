package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key[K, D] extends js.Object {
  var data: D
  var key: K
}

object Key {
  @scala.inline
  def apply[K, D](data: D, key: K): Key[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[K, D]]
  }
}

