package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "ObservableCollection")
@js.native
class ObservableCollection[T] protected () extends StObject {
  def this(table: Table[T]) = this()
  def this(table: Table[T], fetchAllFromDatabase: Boolean) = this()
  def this(table: Table[T], fetchAllFromDatabase: Boolean, callbackWhenReady: js.Function) = this()
  def this(table: Table[T], fetchAllFromDatabase: Unit, callbackWhenReady: js.Function) = this()
  
  /* private */ var _items: js.Array[T & ObservableObject] = js.native
  
  def delete(criteriaOrID: String): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  /**
    * same thing as .remove();
    */
  def delete(criteriaOrID: js.Any): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: js.Any, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: Double): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  
  def find(): typings.bluebird.mod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: js.Any): typings.bluebird.mod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: js.Any, callback: js.Function1[/* _results */ js.Array[T], js.Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: Unit, callback: js.Function1[/* _results */ js.Array[T], js.Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
  
  def findAll(): typings.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: Unit, callback: js.Function1[/* _results */ js.Array[T], js.Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules): typings.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules, callback: js.Function1[/* _results */ js.Array[T], js.Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
  
  def findById(id: String): typings.bluebird.mod.^[T] = js.native
  def findById(id: String, callback: js.Function1[/* result */ T, js.Any]): typings.bluebird.mod.^[T] = js.native
  def findById(id: Double): typings.bluebird.mod.^[T] = js.native
  def findById(id: Double, callback: js.Function1[/* result */ T, js.Any]): typings.bluebird.mod.^[T] = js.native
  
  def findOne(criteriaRawJsObject: js.Any): typings.bluebird.mod.^[T] = js.native
  def findOne(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ T, js.Any]): typings.bluebird.mod.^[T] = js.native
  
  /**
    * .insert() and .update() do the same thing:  .save();
    */
  def insert(criteriaRawJsObject: js.Any): typings.bluebird.mod.^[T | js.Any] = js.native
  def insert(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, js.Any]): typings.bluebird.mod.^[T | js.Any] = js.native
  
  var items: js.Array[T & ObservableObject] = js.native
  
  //auti i klasi 9a xrisimopoieite ws Collection me kapoies paralages mesa sto index.ts.
  var local: BaseCollection[T] = js.native
  
  def onCollectionChanged(callback: js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], Unit]): Unit = js.native
  
  def remove(criteriaOrID: String): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: js.Any): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: js.Any, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  
  def save(criteriaRawJsObject: js.Any): typings.bluebird.mod.^[T | js.Any] = js.native
  def save(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, js.Any]): typings.bluebird.mod.^[T | js.Any] = js.native
  
  def startListeningToDatabase(): Unit = js.native
  
  def update(criteriaRawJsObject: js.Any): typings.bluebird.mod.^[T | js.Any] = js.native
  def update(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, js.Any]): typings.bluebird.mod.^[T | js.Any] = js.native
}
