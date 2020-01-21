package typings.nodeMysqlWrapper.Mongo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.nodeMysqlWrapper.AnonDoc
import typings.nodeMysqlWrapper.AnonFields
import typings.nodeMysqlWrapper.AnonFieldsReactive
import typings.nodeMysqlWrapper.AnonInsertedId
import typings.nodeMysqlWrapper.AnonMulti
import typings.nodeMysqlWrapper.AnonMultiBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T] extends js.Object {
  def _ensureIndex(indexName: String): Unit = js.native
  def _ensureIndex(indexName: String, options: StringDictionary[js.Any]): Unit = js.native
  def allow(options: AnonDoc[T]): Boolean = js.native
  def deny(options: AnonDoc[T]): Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: js.Any): Cursor[T] = js.native
  def find(selector: js.Any, options: AnonFields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: AnonFieldsReactive): T = js.native
  def insert(doc: T): String = js.native
  def insert(doc: T, callback: js.Function): String = js.native
  def rawCollection(): js.Any = js.native
  def rawDatabase(): js.Any = js.native
  def remove(selector: js.Any): Unit = js.native
  def remove(selector: js.Any, callback: js.Function): Unit = js.native
  def update(selector: js.Any, modifier: js.Any): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: AnonMulti): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: AnonMulti, callback: js.Function): Double = js.native
  def upsert(selector: js.Any, modifier: js.Any): AnonInsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: AnonMultiBoolean): AnonInsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: AnonMultiBoolean, callback: js.Function): AnonInsertedId = js.native
}

@JSGlobal("Mongo.Collection")
@js.native
object Collection extends TopLevel[CollectionStatic]

