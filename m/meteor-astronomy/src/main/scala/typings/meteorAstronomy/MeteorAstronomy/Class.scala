package typings.meteorAstronomy.MeteorAstronomy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.meteor.Mongo.Cursor
import typings.meteor.Mongo.Modifier
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Class[T]
  extends Instantiable0[Model[T]]
     with Instantiable1[/* data */ Partial[T], Model[T]] {
  
  def find(): Cursor[Model[T], Model[T]] = js.native
  def find(selector: js.UndefOr[MongoQuery[T]], options: FindOptions): Cursor[Model[T], Model[T]] = js.native
  def find(selector: MongoQuery[T]): Cursor[Model[T], Model[T]] = js.native
  
  def findOne(): Model[T] = js.native
  def findOne(selector: js.UndefOr[MongoQuery[T]], options: FindOneOptions): Model[T] = js.native
  def findOne(selector: MongoQuery[T]): Model[T] = js.native
  
  def insert(doc: T): String = js.native
  def insert(doc: T, callback: js.Function0[Unit]): String = js.native
  
  def remove(selector: MongoQuery[T]): Double = js.native
  def remove(selector: MongoQuery[T], callback: js.Function0[Unit]): Double = js.native
  
  def update(selector: MongoQuery[T], modifier: Modifier[T]): Double = js.native
  def update(
    selector: MongoQuery[T],
    modifier: Modifier[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Double = js.native
  def update(selector: MongoQuery[T], modifier: Modifier[T], options: UpdateOptions): Double = js.native
  def update(
    selector: MongoQuery[T],
    modifier: Modifier[T],
    options: UpdateOptions,
    callback: js.Function0[Unit]
  ): Double = js.native
  
  def upsert(selector: MongoQuery[T], modifier: Modifier[T]): Double = js.native
  def upsert(
    selector: MongoQuery[T],
    modifier: Modifier[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Double = js.native
  def upsert(selector: MongoQuery[T], modifier: Modifier[T], options: UpsertOptions): Double = js.native
  def upsert(
    selector: MongoQuery[T],
    modifier: Modifier[T],
    options: UpsertOptions,
    callback: js.Function0[Unit]
  ): Double = js.native
}
