package typings.meteorDashTypings.Mongo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.meteorDashTypings.Anon_Doc
import typings.meteorDashTypings.Anon_Fields
import typings.meteorDashTypings.Anon_FieldsReactive
import typings.meteorDashTypings.Anon_InsertedId
import typings.meteorDashTypings.Anon_Multi
import typings.meteorDashTypings.Anon_MultiBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T] extends js.Object {
  def _dropIndex(keys: String): Unit = js.native
  def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
  def _ensureIndex(keys: String): Unit = js.native
  def _ensureIndex(keys: String, options: StringDictionary[js.Any]): Unit = js.native
  def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
  def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[js.Any]): Unit = js.native
  def allow(options: Anon_Doc[T]): Boolean = js.native
  def deny(options: Anon_Doc[T]): Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: String): Cursor[T] = js.native
  def find(selector: String, options: Anon_Fields): Cursor[T] = js.native
  def find(selector: ObjectID): Cursor[T] = js.native
  def find(selector: ObjectID, options: Anon_Fields): Cursor[T] = js.native
  def find(selector: Selector): Cursor[T] = js.native
  def find(selector: Selector, options: Anon_Fields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: String): T = js.native
  def findOne(selector: String, options: Anon_FieldsReactive): T = js.native
  def findOne(selector: ObjectID): T = js.native
  def findOne(selector: ObjectID, options: Anon_FieldsReactive): T = js.native
  def findOne(selector: Selector): T = js.native
  def findOne(selector: Selector, options: Anon_FieldsReactive): T = js.native
  def insert(doc: T): String = js.native
  def insert(doc: T, callback: js.Function): String = js.native
  def rawCollection(): js.Any = js.native
  def rawDatabase(): js.Any = js.native
  def remove(selector: String): Double = js.native
  def remove(selector: String, callback: js.Function): Double = js.native
  def remove(selector: ObjectID): Double = js.native
  def remove(selector: ObjectID, callback: js.Function): Double = js.native
  def remove(selector: Selector): Double = js.native
  def remove(selector: Selector, callback: js.Function): Double = js.native
  def update(selector: String, modifier: Modifier): Double = js.native
  def update(selector: String, modifier: Modifier, options: Anon_Multi): Double = js.native
  def update(selector: String, modifier: Modifier, options: Anon_Multi, callback: js.Function): Double = js.native
  def update(selector: ObjectID, modifier: Modifier): Double = js.native
  def update(selector: ObjectID, modifier: Modifier, options: Anon_Multi): Double = js.native
  def update(selector: ObjectID, modifier: Modifier, options: Anon_Multi, callback: js.Function): Double = js.native
  def update(selector: Selector, modifier: Modifier): Double = js.native
  def update(selector: Selector, modifier: Modifier, options: Anon_Multi): Double = js.native
  def update(selector: Selector, modifier: Modifier, options: Anon_Multi, callback: js.Function): Double = js.native
  def upsert(selector: String, modifier: Modifier): Anon_InsertedId = js.native
  def upsert(selector: String, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
  def upsert(selector: String, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier): Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
  def upsert(selector: Selector, modifier: Modifier): Anon_InsertedId = js.native
  def upsert(selector: Selector, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
  def upsert(selector: Selector, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
}

@JSGlobal("Mongo.Collection")
@js.native
object Collection extends TopLevel[CollectionStatic]

