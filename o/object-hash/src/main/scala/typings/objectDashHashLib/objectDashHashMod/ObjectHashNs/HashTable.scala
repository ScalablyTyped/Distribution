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

