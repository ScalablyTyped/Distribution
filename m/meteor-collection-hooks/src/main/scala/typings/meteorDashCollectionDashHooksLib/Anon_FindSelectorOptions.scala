package typings
package meteorDashCollectionDashHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FindSelectorOptions[T] extends js.Object {
  def find(): meteorDashTypingsLib.MongoNs.Cursor[T] = js.native
  def find(selector: java.lang.String): meteorDashTypingsLib.MongoNs.Cursor[T] = js.native
  def find(selector: java.lang.String, options: Anon_ReactiveSkipFields): meteorDashTypingsLib.MongoNs.Cursor[T] = js.native
  def find(selector: meteorDashTypingsLib.MongoNs.ObjectID): meteorDashTypingsLib.MongoNs.Cursor[T] = js.native
  def find(selector: meteorDashTypingsLib.MongoNs.ObjectID, options: Anon_ReactiveSkipFields): meteorDashTypingsLib.MongoNs.Cursor[T] = js.native
  def find(selector: meteorDashTypingsLib.MongoNs.Selector): meteorDashTypingsLib.MongoNs.Cursor[T] = js.native
  def find(selector: meteorDashTypingsLib.MongoNs.Selector, options: Anon_ReactiveSkipFields): meteorDashTypingsLib.MongoNs.Cursor[T] = js.native
  def findOne(): T = js.native
  def findOne(selector: java.lang.String): T = js.native
  def findOne(selector: java.lang.String, options: Anon_ReactiveSkipFieldsSort): T = js.native
  def findOne(selector: meteorDashTypingsLib.MongoNs.ObjectID): T = js.native
  def findOne(selector: meteorDashTypingsLib.MongoNs.ObjectID, options: Anon_ReactiveSkipFieldsSort): T = js.native
  def findOne(selector: meteorDashTypingsLib.MongoNs.Selector): T = js.native
  def findOne(selector: meteorDashTypingsLib.MongoNs.Selector, options: Anon_ReactiveSkipFieldsSort): T = js.native
  def insert(doc: T): java.lang.String = js.native
  def insert(doc: T, callback: js.Function0[scala.Unit]): java.lang.String = js.native
  def remove(selector: java.lang.String): scala.Double = js.native
  def remove(selector: java.lang.String, callback: js.Function0[scala.Unit]): scala.Double = js.native
  def remove(selector: meteorDashTypingsLib.MongoNs.ObjectID): scala.Double = js.native
  def remove(selector: meteorDashTypingsLib.MongoNs.ObjectID, callback: js.Function0[scala.Unit]): scala.Double = js.native
  def remove(selector: meteorDashTypingsLib.MongoNs.Selector): scala.Double = js.native
  def remove(selector: meteorDashTypingsLib.MongoNs.Selector, callback: js.Function0[scala.Unit]): scala.Double = js.native
  def update(selector: java.lang.String, modifier: meteorDashTypingsLib.MongoNs.Modifier): scala.Double = js.native
  def update(selector: java.lang.String, modifier: meteorDashTypingsLib.MongoNs.Modifier, options: Anon_Multi): scala.Double = js.native
  def update(
    selector: java.lang.String,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_Multi,
    callback: js.Function0[scala.Unit]
  ): scala.Double = js.native
  def update(selector: meteorDashTypingsLib.MongoNs.ObjectID, modifier: meteorDashTypingsLib.MongoNs.Modifier): scala.Double = js.native
  def update(
    selector: meteorDashTypingsLib.MongoNs.ObjectID,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_Multi
  ): scala.Double = js.native
  def update(
    selector: meteorDashTypingsLib.MongoNs.ObjectID,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_Multi,
    callback: js.Function0[scala.Unit]
  ): scala.Double = js.native
  def update(selector: meteorDashTypingsLib.MongoNs.Selector, modifier: meteorDashTypingsLib.MongoNs.Modifier): scala.Double = js.native
  def update(
    selector: meteorDashTypingsLib.MongoNs.Selector,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_Multi
  ): scala.Double = js.native
  def update(
    selector: meteorDashTypingsLib.MongoNs.Selector,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_Multi,
    callback: js.Function0[scala.Unit]
  ): scala.Double = js.native
  def upsert(selector: java.lang.String, modifier: meteorDashTypingsLib.MongoNs.Modifier): Anon_NumberAffected = js.native
  def upsert(
    selector: java.lang.String,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_MultiBoolean
  ): Anon_NumberAffected = js.native
  def upsert(
    selector: java.lang.String,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_MultiBoolean,
    callback: js.Function0[scala.Unit]
  ): Anon_NumberAffected = js.native
  def upsert(selector: meteorDashTypingsLib.MongoNs.ObjectID, modifier: meteorDashTypingsLib.MongoNs.Modifier): Anon_NumberAffected = js.native
  def upsert(
    selector: meteorDashTypingsLib.MongoNs.ObjectID,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_MultiBoolean
  ): Anon_NumberAffected = js.native
  def upsert(
    selector: meteorDashTypingsLib.MongoNs.ObjectID,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_MultiBoolean,
    callback: js.Function0[scala.Unit]
  ): Anon_NumberAffected = js.native
  def upsert(selector: meteorDashTypingsLib.MongoNs.Selector, modifier: meteorDashTypingsLib.MongoNs.Modifier): Anon_NumberAffected = js.native
  def upsert(
    selector: meteorDashTypingsLib.MongoNs.Selector,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_MultiBoolean
  ): Anon_NumberAffected = js.native
  def upsert(
    selector: meteorDashTypingsLib.MongoNs.Selector,
    modifier: meteorDashTypingsLib.MongoNs.Modifier,
    options: Anon_MultiBoolean,
    callback: js.Function0[scala.Unit]
  ): Anon_NumberAffected = js.native
}

