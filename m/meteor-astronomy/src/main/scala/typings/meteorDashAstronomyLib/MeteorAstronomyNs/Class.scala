package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class[T]
  extends org.scalablytyped.runtime.Instantiable0[Model[T]]
     with org.scalablytyped.runtime.Instantiable1[/* data */ stdLib.Partial[T], Model[T]] {
  def find(): meteorLib.MongoNs.Cursor[Model[T]] = js.native
  def find(selector: MongoQuery[T]): meteorLib.MongoNs.Cursor[Model[T]] = js.native
  def find(selector: MongoQuery[T], options: FindOptions): meteorLib.MongoNs.Cursor[Model[T]] = js.native
  def findOne(): Model[T] = js.native
  def findOne(selector: MongoQuery[T]): Model[T] = js.native
  def findOne(selector: MongoQuery[T], options: FindOneOptions): Model[T] = js.native
  def insert(doc: T): java.lang.String = js.native
  def insert(doc: T, callback: js.Function0[scala.Unit]): java.lang.String = js.native
  def remove(selector: MongoQuery[T]): scala.Double = js.native
  def remove(selector: MongoQuery[T], callback: js.Function0[scala.Unit]): scala.Double = js.native
  def update(selector: MongoQuery[T], modifier: meteorLib.MongoNs.Modifier[T]): scala.Double = js.native
  def update(selector: MongoQuery[T], modifier: meteorLib.MongoNs.Modifier[T], options: UpdateOptions): scala.Double = js.native
  def update(
    selector: MongoQuery[T],
    modifier: meteorLib.MongoNs.Modifier[T],
    options: UpdateOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Double = js.native
  def upsert(selector: MongoQuery[T], modifier: meteorLib.MongoNs.Modifier[T]): scala.Double = js.native
  def upsert(selector: MongoQuery[T], modifier: meteorLib.MongoNs.Modifier[T], options: UpsertOptions): scala.Double = js.native
  def upsert(
    selector: MongoQuery[T],
    modifier: meteorLib.MongoNs.Modifier[T],
    options: UpsertOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Double = js.native
}

