package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var algorithm: String = js.native
  var cached: Boolean = js.native
  var clusters: js.Array[Cluster] = js.native
  var db: ODB = js.native
  var name: String = js.native
  var `type`: String = js.native
  def add(idx: js.Array[IndexEntry]): js.Promise[js.Array[Index]] = js.native
  def add(idx: IndexEntry): js.Promise[js.Array[Index]] = js.native
  def cacheData(indices: js.Array[_]): js.Promise[ODB] = js.native
  def configure(config: js.Any): Unit = js.native
  def create(config: js.Array[IndexConfig]): js.Promise[Index] = js.native
  def create(config: IndexConfig): js.Promise[Index] = js.native
  def delete(name: String): js.Promise[Index] = js.native
  def drop(name: String): js.Promise[ODB] = js.native
  def get(name: String): js.Promise[Index] = js.native
  def get(name: String, refresh: Boolean): js.Promise[Index] = js.native
  def list(): js.Promise[js.Array[Index]] = js.native
  def list(refresh: Boolean): js.Promise[js.Array[Index]] = js.native
  def select(): OStatement = js.native
  def set(key: String, value: String): js.Promise[Index] = js.native
  def set(key: String, value: ORID): js.Promise[Index] = js.native
}

