package typings
package objectDashHashLib.objectDashHashMod.ObjectHashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashTableItemWithKey extends HashTableItem {
  var hash: java.lang.String
}

object HashTableItemWithKey {
  @scala.inline
  def apply(count: scala.Double, hash: java.lang.String, value: js.Any): HashTableItemWithKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[HashTableItemWithKey]
  }
}

