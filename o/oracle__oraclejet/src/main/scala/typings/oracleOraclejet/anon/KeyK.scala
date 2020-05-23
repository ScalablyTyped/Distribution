package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyK[K] extends js.Object {
  var key: K
}

object KeyK {
  @scala.inline
  def apply[K](key: K): KeyK[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyK[K]]
  }
}

