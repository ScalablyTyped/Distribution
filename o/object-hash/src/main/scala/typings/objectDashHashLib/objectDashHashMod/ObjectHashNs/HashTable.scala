package typings
package objectDashHashLib.objectDashHashMod.ObjectHashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashTable extends js.Object {
  def add(values: js.Any*): HashTable
  def getCount(key: java.lang.String): scala.Double
  def getValue(key: java.lang.String): js.Any
  def hasKey(key: java.lang.String): scala.Boolean
  def remove(values: js.Any*): HashTable
  def reset(): HashTable
  def table(): org.scalablytyped.runtime.StringDictionary[HashTableItem]
  def toArray(): js.Array[HashTableItemWithKey]
}

object HashTable {
  @scala.inline
  def apply(
    add: js.Function1[/* repeated */ js.Any, HashTable],
    getCount: js.Function1[java.lang.String, scala.Double],
    getValue: js.Function1[java.lang.String, js.Any],
    hasKey: js.Function1[java.lang.String, scala.Boolean],
    remove: js.Function1[/* repeated */ js.Any, HashTable],
    reset: js.Function0[HashTable],
    table: js.Function0[org.scalablytyped.runtime.StringDictionary[HashTableItem]],
    toArray: js.Function0[js.Array[HashTableItemWithKey]]
  ): HashTable = {
    val __obj = js.Dynamic.literal(add = add, getCount = getCount, getValue = getValue, hasKey = hasKey, remove = remove, reset = reset, table = table, toArray = toArray)
  
    __obj.asInstanceOf[HashTable]
  }
}

