package typings.meteorDashCollectionDashHooks

import typings.meteorDashTypings.Mongo.Cursor
import typings.meteorDashTypings.Mongo.Modifier
import typings.meteorDashTypings.Mongo.ObjectID
import typings.meteorDashTypings.Mongo.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback[T] extends js.Object {
  def find(): Cursor[T] = js.native
  def find(selector: String): Cursor[T] = js.native
  def find(selector: String, options: Anon_DocFields): Cursor[T] = js.native
  def find(selector: ObjectID): Cursor[T] = js.native
  def find(selector: ObjectID, options: Anon_DocFields): Cursor[T] = js.native
  def find(selector: Selector): Cursor[T] = js.native
  def find(selector: Selector, options: Anon_DocFields): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: String): T = js.native
  def findOne(selector: String, options: Anon_DocFieldsReactive): T = js.native
  def findOne(selector: ObjectID): T = js.native
  def findOne(selector: ObjectID, options: Anon_DocFieldsReactive): T = js.native
  def findOne(selector: Selector): T = js.native
  def findOne(selector: Selector, options: Anon_DocFieldsReactive): T = js.native
  def insert(doc: T): String = js.native
  def insert(doc: T, callback: js.Function0[Unit]): String = js.native
  def remove(selector: String): Double = js.native
  def remove(selector: String, callback: js.Function0[Unit]): Double = js.native
  def remove(selector: ObjectID): Double = js.native
  def remove(selector: ObjectID, callback: js.Function0[Unit]): Double = js.native
  def remove(selector: Selector): Double = js.native
  def remove(selector: Selector, callback: js.Function0[Unit]): Double = js.native
  def update(selector: String, modifier: Modifier): Double = js.native
  def update(selector: String, modifier: Modifier, options: Anon_Multi): Double = js.native
  def update(selector: String, modifier: Modifier, options: Anon_Multi, callback: js.Function0[Unit]): Double = js.native
  def update(selector: ObjectID, modifier: Modifier): Double = js.native
  def update(selector: ObjectID, modifier: Modifier, options: Anon_Multi): Double = js.native
  def update(selector: ObjectID, modifier: Modifier, options: Anon_Multi, callback: js.Function0[Unit]): Double = js.native
  def update(selector: Selector, modifier: Modifier): Double = js.native
  def update(selector: Selector, modifier: Modifier, options: Anon_Multi): Double = js.native
  def update(selector: Selector, modifier: Modifier, options: Anon_Multi, callback: js.Function0[Unit]): Double = js.native
  def upsert(selector: String, modifier: Modifier): Anon_InsertedId = js.native
  def upsert(selector: String, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
  def upsert(selector: String, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function0[Unit]): Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier): Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function0[Unit]): Anon_InsertedId = js.native
  def upsert(selector: Selector, modifier: Modifier): Anon_InsertedId = js.native
  def upsert(selector: Selector, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
  def upsert(selector: Selector, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function0[Unit]): Anon_InsertedId = js.native
}

