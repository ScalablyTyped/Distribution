package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "CollectionChangedEventArgs")
@js.native
class CollectionChangedEventArgs[T] protected () extends js.Object {
  def this(action: CollectionChangedAction) = this()
  def this(action: CollectionChangedAction, oldItems: js.Array[T | (T with ObservableObject)]) = this()
  def this(action: CollectionChangedAction, oldItems: js.Array[T | (T with ObservableObject)], newItems: js.Array[T | (T with ObservableObject)]) = this()
  def this(action: CollectionChangedAction, oldItems: js.Array[T | (T with ObservableObject)], newItems: js.Array[T | (T with ObservableObject)], oldStartingIndex: scala.Double) = this()
  def this(action: CollectionChangedAction, oldItems: js.Array[T | (T with ObservableObject)], newItems: js.Array[T | (T with ObservableObject)], oldStartingIndex: scala.Double, newStartingIndex: scala.Double) = this()
  var action: CollectionChangedAction = js.native
  var newItems: js.Array[T | (T with ObservableObject)] = js.native
  var newStartingIndex: scala.Double = js.native
  var oldItems: js.Array[T | (T with ObservableObject)] = js.native
  var oldStartingIndex: scala.Double = js.native
}

