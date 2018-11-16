package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "BaseCollection")
@js.native
class BaseCollection[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  var items: js.Array[T | (T with ObservableObject)] = js.native
  var length: scala.Double = js.native
  //T=result type of Table
  var list: js.Array[T | (T with ObservableObject)] = js.native
  var listeners: js.Array[js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], scala.Unit]] = js.native
  def addItem(items: (T | (T with ObservableObject))*): T | (T with ObservableObject) = js.native
  def findItem(itemId: java.lang.String): T = js.native
  def findItem(itemId: scala.Double): T = js.native
  def forgetItem(items: (T | (T with ObservableObject))*): BaseCollection[T] = js.native
  def getItem(index: scala.Double): T = js.native
  def getItemObservable(index: scala.Double): T with ObservableObject = js.native
  def indexOf(item: T): scala.Double = js.native
  def indexOf(item: java.lang.String): scala.Double = js.native
  def indexOf(item: scala.Double): scala.Double = js.native
  def notifyCollectionChanged(evtArgs: CollectionChangedEventArgs[T]): scala.Unit = js.native
  def onCollectionChanged(callback: js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], scala.Unit]): scala.Unit = js.native
  def removeItem(items: (T | (T with ObservableObject))*): BaseCollection[T] = js.native
  def removeItemById(id: java.lang.String): BaseCollection[T] = js.native
  def removeItemById(id: scala.Double): BaseCollection[T] = js.native
  def reset(): BaseCollection[T] = js.native
}

