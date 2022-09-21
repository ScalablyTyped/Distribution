package typings.nodeMysqlWrapper.mod

import typings.nodeMysqlWrapper.Mongo.Collection
import typings.nodeMysqlWrapper.anon.Multi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "MeteorTable")
@js.native
open class MeteorTable[T] protected () extends StObject {
  def this(table: Table[T]) = this()
  
  def collection(): Collection[T] = js.native
  def collection(nameOfCollection: String): Collection[T] = js.native
  def collection(nameOfCollection: String, fillWithCriteria: Any): Collection[T] = js.native
  def collection(nameOfCollection: Unit, fillWithCriteria: Any): Collection[T] = js.native
  
  def insert(doc: T): T = js.native
  def insert(doc: T, callback: js.Function1[/* _result */ T, Unit]): T = js.native
  
  def remove(selector: Any): DeleteAnswer = js.native
  def remove(selector: Any, callback: js.Function0[DeleteAnswer]): DeleteAnswer = js.native
  
  var table: Table[T] = js.native
  
  def update(selector: Any, modifier: Any): Double = js.native
  def update(selector: Any, modifier: Any, options: Unit, callback: js.Function1[/* result */ T, Any]): Double = js.native
  def update(selector: Any, modifier: Any, options: Multi): Double = js.native
  def update(selector: Any, modifier: Any, options: Multi, callback: js.Function1[/* result */ T, Any]): Double = js.native
}
