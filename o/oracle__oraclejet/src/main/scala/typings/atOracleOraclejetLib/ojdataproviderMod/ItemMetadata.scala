package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemMetadata[K] extends js.Object {
  var key: K
}

object ItemMetadata {
  @scala.inline
  def apply[K](key: K): ItemMetadata[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemMetadata[K]]
  }
}

