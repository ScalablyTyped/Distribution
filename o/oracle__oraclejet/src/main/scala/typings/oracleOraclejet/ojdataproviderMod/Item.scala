package typings.oracleOraclejet.ojdataproviderMod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Item[K, D]]
  }
}

