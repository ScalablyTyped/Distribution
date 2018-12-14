package typings
package meteorDashTypingsLib.MongoNs

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
  def allow(options: meteorDashTypingsLib.Anon_Insert[T]): scala.Boolean = js.native
  def deny(options: meteorDashTypingsLib.Anon_Insert[T]): scala.Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: java.lang.String): Cursor[T] = js.native
  def find(selector: java.lang.String, options: meteorDashTypingsLib.Anon_Reactive): Cursor[T] = js.native
  def find(selector: ObjectID): Cursor[T] = js.native
  def find(selector: ObjectID, options: meteorDashTypingsLib.Anon_Reactive): Cursor[T] = js.native
  def find(selector: Selector): Cursor[T] = js.native
  def find(selector: Selector, options: meteorDashTypingsLib.Anon_Reactive): Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: java.lang.String): T = js.native
  def findOne(selector: java.lang.String, options: meteorDashTypingsLib.Anon_ReactiveSkip): T = js.native
  def findOne(selector: ObjectID): T = js.native
  def findOne(selector: ObjectID, options: meteorDashTypingsLib.Anon_ReactiveSkip): T = js.native
  def findOne(selector: Selector): T = js.native
  def findOne(selector: Selector, options: meteorDashTypingsLib.Anon_ReactiveSkip): T = js.native
  def insert(doc: T): java.lang.String = js.native
  def insert(doc: T, callback: js.Function): java.lang.String = js.native
  def rawCollection(): js.Any = js.native
  def rawDatabase(): js.Any = js.native
  def remove(selector: java.lang.String): scala.Double = js.native
  def remove(selector: java.lang.String, callback: js.Function): scala.Double = js.native
  def remove(selector: ObjectID): scala.Double = js.native
  def remove(selector: ObjectID, callback: js.Function): scala.Double = js.native
  def remove(selector: Selector): scala.Double = js.native
  def remove(selector: Selector, callback: js.Function): scala.Double = js.native
  def update(selector: java.lang.String, modifier: Modifier): scala.Double = js.native
  def update(selector: java.lang.String, modifier: Modifier, options: meteorDashTypingsLib.Anon_Multi): scala.Double = js.native
  def update(
    selector: java.lang.String,
    modifier: Modifier,
    options: meteorDashTypingsLib.Anon_Multi,
    callback: js.Function
  ): scala.Double = js.native
  def update(selector: ObjectID, modifier: Modifier): scala.Double = js.native
  def update(selector: ObjectID, modifier: Modifier, options: meteorDashTypingsLib.Anon_Multi): scala.Double = js.native
  def update(
    selector: ObjectID,
    modifier: Modifier,
    options: meteorDashTypingsLib.Anon_Multi,
    callback: js.Function
  ): scala.Double = js.native
  def update(selector: Selector, modifier: Modifier): scala.Double = js.native
  def update(selector: Selector, modifier: Modifier, options: meteorDashTypingsLib.Anon_Multi): scala.Double = js.native
  def update(
    selector: Selector,
    modifier: Modifier,
    options: meteorDashTypingsLib.Anon_Multi,
    callback: js.Function
  ): scala.Double = js.native
  def upsert(selector: java.lang.String, modifier: Modifier): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(selector: java.lang.String, modifier: Modifier, options: meteorDashTypingsLib.Anon_MultiBoolean): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(
    selector: java.lang.String,
    modifier: Modifier,
    options: meteorDashTypingsLib.Anon_MultiBoolean,
    callback: js.Function
  ): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(selector: ObjectID, modifier: Modifier): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(selector: ObjectID, modifier: Modifier, options: meteorDashTypingsLib.Anon_MultiBoolean): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(
    selector: ObjectID,
    modifier: Modifier,
    options: meteorDashTypingsLib.Anon_MultiBoolean,
    callback: js.Function
  ): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(selector: Selector, modifier: Modifier): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(selector: Selector, modifier: Modifier, options: meteorDashTypingsLib.Anon_MultiBoolean): meteorDashTypingsLib.Anon_NumberAffected = js.native
  def upsert(
    selector: Selector,
    modifier: Modifier,
    options: meteorDashTypingsLib.Anon_MultiBoolean,
    callback: js.Function
  ): meteorDashTypingsLib.Anon_NumberAffected = js.native
}

