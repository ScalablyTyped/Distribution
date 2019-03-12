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
    add: /* repeated */ js.Any => HashTable,
    getCount: java.lang.String => scala.Double,
    getValue: java.lang.String => js.Any,
    hasKey: java.lang.String => scala.Boolean,
    remove: /* repeated */ js.Any => HashTable,
    reset: () => HashTable,
    table: () => org.scalablytyped.runtime.StringDictionary[HashTableItem],
    toArray: () => js.Array[HashTableItemWithKey]
  ): HashTable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getCount = js.Any.fromFunction1(getCount), getValue = js.Any.fromFunction1(getValue), hasKey = js.Any.fromFunction1(hasKey), remove = js.Any.fromFunction1(remove), reset = js.Any.fromFunction0(reset), table = js.Any.fromFunction0(table), toArray = js.Any.fromFunction0(toArray))
  
    __obj.asInstanceOf[HashTable]
  }
}

