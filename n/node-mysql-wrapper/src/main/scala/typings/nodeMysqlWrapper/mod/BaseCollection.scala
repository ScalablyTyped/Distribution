package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "BaseCollection")
@js.native
open class BaseCollection[T] protected () extends StObject {
  def this(table: Table[T]) = this()
  
  def addItem(items: (T | (T & ObservableObject))*): T | (T & ObservableObject) = js.native
  
  def findItem(itemId: String): T = js.native
  def findItem(itemId: Double): T = js.native
  
  def forgetItem(items: (T | (T & ObservableObject))*): BaseCollection[T] = js.native
  
  def getItem(index: Double): T = js.native
  
  def getItemObservable(index: Double): T & ObservableObject = js.native
  
  def indexOf(item: T): Double = js.native
  def indexOf(item: String): Double = js.native
  def indexOf(item: Double): Double = js.native
  
  var items: js.Array[T | (T & ObservableObject)] = js.native
  
  var length: Double = js.native
  
  //T=result type of Table
  /* private */ var list: js.Array[T | (T & ObservableObject)] = js.native
  
  var listeners: js.Array[js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], Unit]] = js.native
  
  def notifyCollectionChanged(evtArgs: CollectionChangedEventArgs[T]): Unit = js.native
  
  def onCollectionChanged(callback: js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], Unit]): Unit = js.native
  
  def removeItem(items: (T | (T & ObservableObject))*): BaseCollection[T] = js.native
  
  def removeItemById(id: String): BaseCollection[T] = js.native
  def removeItemById(id: Double): BaseCollection[T] = js.native
  
  def reset(): BaseCollection[T] = js.native
}
