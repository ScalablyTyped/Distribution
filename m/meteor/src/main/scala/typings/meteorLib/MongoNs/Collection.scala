package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T] extends js.Object {
  def _dropIndex(keys: java.lang.String): scala.Unit = js.native
  def _dropIndex(keys: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]): scala.Unit = js.native
  def _ensureIndex(keys: java.lang.String): scala.Unit = js.native
  def _ensureIndex(keys: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def _ensureIndex(keys: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]): scala.Unit = js.native
  def _ensureIndex(
    keys: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String],
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def allow(options: meteorLib.Anon_Doc[T]): scala.Boolean = js.native
  def deny(options: meteorLib.Anon_Doc[T]): scala.Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: java.lang.String): Cursor[T] = js.native
  def find(selector: java.lang.String, options: meteorLib.Anon_Fields): Cursor[T] = js.native
  def find(selector: ObjectID): Cursor[T] = js.native
  def find(selector: ObjectID, options: meteorLib.Anon_Fields): Cursor[T] = js.native
  def find(selector: Selector[T]): Cursor[T] = js.native
  def find(selector: Selector[T], options: meteorLib.Anon_Fields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: java.lang.String): T = js.native
  def findOne(selector: java.lang.String, options: meteorLib.Anon_FieldsReactive): T = js.native
  def findOne(selector: ObjectID): T = js.native
  def findOne(selector: ObjectID, options: meteorLib.Anon_FieldsReactive): T = js.native
  def findOne(selector: Selector[T]): T = js.native
  def findOne(selector: Selector[T], options: meteorLib.Anon_FieldsReactive): T = js.native
  def insert(doc: T): java.lang.String = js.native
  def insert(doc: T, callback: js.Function): java.lang.String = js.native
  def rawCollection(): js.Any = js.native
  def rawDatabase(): js.Any = js.native
  def remove(selector: java.lang.String): scala.Double = js.native
  def remove(selector: java.lang.String, callback: js.Function): scala.Double = js.native
  def remove(selector: ObjectID): scala.Double = js.native
  def remove(selector: ObjectID, callback: js.Function): scala.Double = js.native
  def remove(selector: Selector[T]): scala.Double = js.native
  def remove(selector: Selector[T], callback: js.Function): scala.Double = js.native
  def update(selector: java.lang.String, modifier: Modifier[T]): scala.Double = js.native
  def update(selector: java.lang.String, modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
  def update(
    selector: java.lang.String,
    modifier: Modifier[T],
    options: meteorLib.Anon_Multi,
    callback: js.Function
  ): scala.Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T]): scala.Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_Multi, callback: js.Function): scala.Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T]): scala.Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_Multi, callback: js.Function): scala.Double = js.native
  def upsert(selector: java.lang.String, modifier: Modifier[T]): meteorLib.Anon_InsertedId = js.native
  def upsert(selector: java.lang.String, modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_InsertedId = js.native
  def upsert(
    selector: java.lang.String,
    modifier: Modifier[T],
    options: meteorLib.Anon_MultiBoolean,
    callback: js.Function
  ): meteorLib.Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T]): meteorLib.Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_InsertedId = js.native
  def upsert(
    selector: ObjectID,
    modifier: Modifier[T],
    options: meteorLib.Anon_MultiBoolean,
    callback: js.Function
  ): meteorLib.Anon_InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T]): meteorLib.Anon_InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_InsertedId = js.native
  def upsert(
    selector: Selector[T],
    modifier: Modifier[T],
    options: meteorLib.Anon_MultiBoolean,
    callback: js.Function
  ): meteorLib.Anon_InsertedId = js.native
}

