package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "ObservableCollection")
@js.native
class ObservableCollection[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  def this(table: Table[T], fetchAllFromDatabase: scala.Boolean) = this()
  def this(table: Table[T], fetchAllFromDatabase: scala.Boolean, callbackWhenReady: js.Function) = this()
  var _items: js.Array[T with ObservableObject] = js.native
  var items: js.Array[T with ObservableObject] = js.native
  //auti i klasi 9a xrisimopoieite ws Collection me kapoies paralages mesa sto index.ts.
  var local: BaseCollection[T] = js.native
  def delete(criteriaOrID: java.lang.String): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def delete(
    criteriaOrID: java.lang.String,
    callback: js.Function1[/* _result */ nodeDashMysqlDashWrapperLib.DeleteAnswer, _]
  ): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  /**
    * same thing as .remove();
    */
  def delete(criteriaOrID: js.Any): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def delete(
    criteriaOrID: js.Any,
    callback: js.Function1[/* _result */ nodeDashMysqlDashWrapperLib.DeleteAnswer, _]
  ): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def delete(criteriaOrID: scala.Double): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def delete(
    criteriaOrID: scala.Double,
    callback: js.Function1[/* _result */ nodeDashMysqlDashWrapperLib.DeleteAnswer, _]
  ): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def find(): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: js.Any): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: js.Any, callback: js.Function1[/* _results */ js.Array[T], _]): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def findAll(): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def findAll(tableRules: nodeDashMysqlDashWrapperLib.RawRules): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def findAll(
    tableRules: nodeDashMysqlDashWrapperLib.RawRules,
    callback: js.Function1[/* _results */ js.Array[T], _]
  ): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def findById(id: java.lang.String): bluebirdLib.bluebirdMod.^[T] = js.native
  def findById(id: java.lang.String, callback: js.Function1[/* result */ T, _]): bluebirdLib.bluebirdMod.^[T] = js.native
  def findById(id: scala.Double): bluebirdLib.bluebirdMod.^[T] = js.native
  def findById(id: scala.Double, callback: js.Function1[/* result */ T, _]): bluebirdLib.bluebirdMod.^[T] = js.native
  def findOne(criteriaRawJsObject: js.Any): bluebirdLib.bluebirdMod.^[T] = js.native
  def findOne(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ T, _]): bluebirdLib.bluebirdMod.^[T] = js.native
  /**
    * .insert() and .update() do the same thing:  .save();
    */
  def insert(criteriaRawJsObject: js.Any): bluebirdLib.bluebirdMod.^[T | _] = js.native
  def insert(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, _]): bluebirdLib.bluebirdMod.^[T | _] = js.native
  def onCollectionChanged(callback: js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], scala.Unit]): scala.Unit = js.native
  def remove(criteriaOrID: java.lang.String): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def remove(
    criteriaOrID: java.lang.String,
    callback: js.Function1[/* _result */ nodeDashMysqlDashWrapperLib.DeleteAnswer, _]
  ): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def remove(criteriaOrID: js.Any): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def remove(
    criteriaOrID: js.Any,
    callback: js.Function1[/* _result */ nodeDashMysqlDashWrapperLib.DeleteAnswer, _]
  ): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def remove(criteriaOrID: scala.Double): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def remove(
    criteriaOrID: scala.Double,
    callback: js.Function1[/* _result */ nodeDashMysqlDashWrapperLib.DeleteAnswer, _]
  ): bluebirdLib.bluebirdMod.^[nodeDashMysqlDashWrapperLib.DeleteAnswer] = js.native
  def save(criteriaRawJsObject: js.Any): bluebirdLib.bluebirdMod.^[T | _] = js.native
  def save(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, _]): bluebirdLib.bluebirdMod.^[T | _] = js.native
  def startListeningToDatabase(): scala.Unit = js.native
  def update(criteriaRawJsObject: js.Any): bluebirdLib.bluebirdMod.^[T | _] = js.native
  def update(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, _]): bluebirdLib.bluebirdMod.^[T | _] = js.native
}

