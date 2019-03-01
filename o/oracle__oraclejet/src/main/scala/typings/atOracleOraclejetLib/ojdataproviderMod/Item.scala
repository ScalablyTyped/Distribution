package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item[K, D] extends js.Object {
  var data: D
  var metadata: ItemMetadata[K]
}

object Item {
  @scala.inline
  def apply[K, D](data: D, metadata: ItemMetadata[K]): Item[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[Item[K, D]]
  }
}

