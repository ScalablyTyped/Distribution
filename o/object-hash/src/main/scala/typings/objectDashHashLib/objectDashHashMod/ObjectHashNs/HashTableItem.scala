package typings
package objectDashHashLib.objectDashHashMod.ObjectHashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashTableItem extends js.Object {
  var count: scala.Double
  var value: js.Any
}

object HashTableItem {
  @scala.inline
  def apply(count: scala.Double, value: js.Any): HashTableItem = {
    val __obj = js.Dynamic.literal(count = count, value = value)
  
    __obj.asInstanceOf[HashTableItem]
  }
}

