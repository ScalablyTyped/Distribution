package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "CollectionChangedEventArgs")
@js.native
class CollectionChangedEventArgs[T] protected () extends js.Object {
  def this(action: CollectionChangedAction) = this()
  def this(action: CollectionChangedAction, oldItems: js.Array[T | (T with ObservableObject)]) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T with ObservableObject)],
    newItems: js.Array[T | (T with ObservableObject)]
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T with ObservableObject)],
    newItems: js.Array[T | (T with ObservableObject)],
    oldStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T with ObservableObject)],
    newItems: js.Array[T | (T with ObservableObject)],
    oldStartingIndex: Double,
    newStartingIndex: Double
  ) = this()
  var action: CollectionChangedAction = js.native
  var newItems: js.Array[T | (T with ObservableObject)] = js.native
  var newStartingIndex: Double = js.native
  var oldItems: js.Array[T | (T with ObservableObject)] = js.native
  var oldStartingIndex: Double = js.native
}

