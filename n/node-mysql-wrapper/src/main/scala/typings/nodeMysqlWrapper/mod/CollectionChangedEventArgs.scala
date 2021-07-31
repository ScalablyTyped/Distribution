package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "CollectionChangedEventArgs")
@js.native
class CollectionChangedEventArgs[T] protected () extends StObject {
  def this(action: CollectionChangedAction) = this()
  def this(action: CollectionChangedAction, oldItems: js.Array[T | (T & ObservableObject)]) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T & ObservableObject)],
    newItems: js.Array[T | (T & ObservableObject)]
  ) = this()
  def this(action: CollectionChangedAction, oldItems: Unit, newItems: js.Array[T | (T & ObservableObject)]) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T & ObservableObject)],
    newItems: js.Array[T | (T & ObservableObject)],
    oldStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T & ObservableObject)],
    newItems: Unit,
    oldStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: Unit,
    newItems: js.Array[T | (T & ObservableObject)],
    oldStartingIndex: Double
  ) = this()
  def this(action: CollectionChangedAction, oldItems: Unit, newItems: Unit, oldStartingIndex: Double) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T & ObservableObject)],
    newItems: js.Array[T | (T & ObservableObject)],
    oldStartingIndex: Double,
    newStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T & ObservableObject)],
    newItems: js.Array[T | (T & ObservableObject)],
    oldStartingIndex: Unit,
    newStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T & ObservableObject)],
    newItems: Unit,
    oldStartingIndex: Double,
    newStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: js.Array[T | (T & ObservableObject)],
    newItems: Unit,
    oldStartingIndex: Unit,
    newStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: Unit,
    newItems: js.Array[T | (T & ObservableObject)],
    oldStartingIndex: Double,
    newStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: Unit,
    newItems: js.Array[T | (T & ObservableObject)],
    oldStartingIndex: Unit,
    newStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: Unit,
    newItems: Unit,
    oldStartingIndex: Double,
    newStartingIndex: Double
  ) = this()
  def this(
    action: CollectionChangedAction,
    oldItems: Unit,
    newItems: Unit,
    oldStartingIndex: Unit,
    newStartingIndex: Double
  ) = this()
  
  var action: CollectionChangedAction = js.native
  
  var newItems: js.Array[T | (T & ObservableObject)] = js.native
  
  var newStartingIndex: Double = js.native
  
  var oldItems: js.Array[T | (T & ObservableObject)] = js.native
  
  var oldStartingIndex: Double = js.native
}
