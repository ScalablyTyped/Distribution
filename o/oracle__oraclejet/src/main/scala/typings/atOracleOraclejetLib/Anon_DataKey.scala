package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataKey[K, D] extends js.Object {
  var data: D
  var key: K
}

object Anon_DataKey {
  @scala.inline
  def apply[K, D](data: D, key: K): Anon_DataKey[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataKey[K, D]]
  }
}

