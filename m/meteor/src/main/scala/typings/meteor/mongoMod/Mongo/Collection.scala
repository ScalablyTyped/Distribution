package typings.meteor.mongoMod.Mongo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.meteor.anon.ArrayFilters
import typings.meteor.anon.Fetch
import typings.meteor.anon.Fields
import typings.meteor.anon.InsertedId
import typings.meteor.anon.Multi
import typings.meteor.anon.Reactive
import typings.mongodb.mod.Db
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
  def allow(options: Fetch[T]): Boolean = js.native
  def deny(options: Fetch[T]): Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: String): Cursor[T] = js.native
  def find(selector: String, options: Fields): Cursor[T] = js.native
  def find(selector: ObjectID): Cursor[T] = js.native
  def find(selector: ObjectID, options: Fields): Cursor[T] = js.native
  def find(selector: Selector[T]): Cursor[T] = js.native
  def find(selector: Selector[T], options: Fields): Cursor[T] = js.native
  def findOne(): js.UndefOr[T] = js.native
  def findOne(selector: String): js.UndefOr[T] = js.native
  def findOne(selector: String, options: Reactive): js.UndefOr[T] = js.native
  def findOne(selector: ObjectID): js.UndefOr[T] = js.native
  def findOne(selector: ObjectID, options: Reactive): js.UndefOr[T] = js.native
  def findOne(selector: Selector[T]): js.UndefOr[T] = js.native
  def findOne(selector: Selector[T], options: Reactive): js.UndefOr[T] = js.native
  def insert(doc: OptionalId[T]): String = js.native
  def insert(doc: OptionalId[T], callback: js.Function): String = js.native
  def rawCollection(): typings.mongodb.mod.Collection[T] = js.native
  def rawDatabase(): Db = js.native
  def remove(selector: String): Double = js.native
  def remove(selector: String, callback: js.Function): Double = js.native
  def remove(selector: ObjectID): Double = js.native
  def remove(selector: ObjectID, callback: js.Function): Double = js.native
  def remove(selector: Selector[T]): Double = js.native
  def remove(selector: Selector[T], callback: js.Function): Double = js.native
  def update(selector: String, modifier: Modifier[T]): Double = js.native
  def update(selector: String, modifier: Modifier[T], options: ArrayFilters): Double = js.native
  def update(selector: String, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T]): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T]): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
  def upsert(selector: String, modifier: Modifier[T]): InsertedId = js.native
  def upsert(selector: String, modifier: Modifier[T], options: Multi): InsertedId = js.native
  def upsert(selector: String, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T]): InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi): InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T]): InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi): InsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
}

@JSImport("meteor/mongo", "Mongo.Collection")
@js.native
object Collection extends TopLevel[CollectionStatic]

