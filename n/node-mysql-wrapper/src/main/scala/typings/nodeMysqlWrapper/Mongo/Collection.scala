package typings.nodeMysqlWrapper.Mongo

import org.scalablytyped.runtime.StringDictionary
import typings.nodeMysqlWrapper.anon.Fetch
import typings.nodeMysqlWrapper.anon.Fields
import typings.nodeMysqlWrapper.anon.InsertedId
import typings.nodeMysqlWrapper.anon.Multi
import typings.nodeMysqlWrapper.anon.Reactive
import typings.nodeMysqlWrapper.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[T] extends js.Object {
  
  def _ensureIndex(indexName: String): Unit = js.native
  def _ensureIndex(indexName: String, options: StringDictionary[js.Any]): Unit = js.native
  
  def allow(options: Fetch[T]): Boolean = js.native
  
  def deny(options: Fetch[T]): Boolean = js.native
  
  def find(): Cursor[T] = js.native
  def find(selector: js.UndefOr[scala.Nothing], options: Fields): Cursor[T] = js.native
  def find(selector: js.Any): Cursor[T] = js.native
  def find(selector: js.Any, options: Fields): Cursor[T] = js.native
  
  def findOne(): T = js.native
  def findOne(selector: js.UndefOr[scala.Nothing], options: Reactive): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: Reactive): T = js.native
  
  def insert(doc: T): String = js.native
  def insert(doc: T, callback: js.Function): String = js.native
  
  def rawCollection(): js.Any = js.native
  
  def rawDatabase(): js.Any = js.native
  
  def remove(selector: js.Any): Unit = js.native
  def remove(selector: js.Any, callback: js.Function): Unit = js.native
  
  def update(selector: js.Any, modifier: js.Any): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: js.UndefOr[scala.Nothing], callback: js.Function): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: Multi): Double = js.native
  def update(selector: js.Any, modifier: js.Any, options: Multi, callback: js.Function): Double = js.native
  
  def upsert(selector: js.Any, modifier: js.Any): InsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: js.UndefOr[scala.Nothing], callback: js.Function): InsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: `0`): InsertedId = js.native
  def upsert(selector: js.Any, modifier: js.Any, options: `0`, callback: js.Function): InsertedId = js.native
}
