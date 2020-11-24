package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OIndex extends js.Object {
  
  def add(idx: js.Array[OIndexEntry]): js.Promise[js.Array[OIndex]] = js.native
  def add(idx: OIndexEntry): js.Promise[js.Array[OIndex]] = js.native
  
  var algorithm: String = js.native
  
  def cacheData(indices: js.Array[_]): js.Promise[ODB] = js.native
  
  var cached: Boolean = js.native
  
  var clusters: js.Array[OCluster] = js.native
  
  def configure(config: js.Any): Unit = js.native
  
  def create(config: js.Array[IndexConfig]): js.Promise[OIndex] = js.native
  def create(config: IndexConfig): js.Promise[OIndex] = js.native
  
  var db: ODB = js.native
  
  def delete(name: String): js.Promise[OIndex] = js.native
  
  def drop(name: String): js.Promise[ODB] = js.native
  
  def get(name: String): js.Promise[OIndex] = js.native
  def get(name: String, refresh: Boolean): js.Promise[OIndex] = js.native
  
  def list(): js.Promise[js.Array[OIndex]] = js.native
  def list(refresh: Boolean): js.Promise[js.Array[OIndex]] = js.native
  
  var name: String = js.native
  
  def select(): OStatement = js.native
  
  def set(key: String, value: String): js.Promise[OIndex] = js.native
  def set(key: String, value: ORID): js.Promise[OIndex] = js.native
  
  var `type`: String = js.native
}
