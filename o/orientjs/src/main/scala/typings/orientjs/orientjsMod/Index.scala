package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var algorithm: String = js.native
  var cached: Boolean = js.native
  var clusters: js.Array[Cluster] = js.native
  var db: Db = js.native
  var name: String = js.native
  var `type`: String = js.native
  def add(idx: js.Array[IndexEntry]): typings.bluebird.bluebirdMod.^[js.Array[Index]] = js.native
  def add(idx: IndexEntry): typings.bluebird.bluebirdMod.^[js.Array[Index]] = js.native
  def cacheData(indices: js.Array[_]): typings.bluebird.bluebirdMod.^[Db] = js.native
  def configure(config: js.Any): Unit = js.native
  def create(config: js.Array[IndexConfig]): typings.bluebird.bluebirdMod.^[Index] = js.native
  def create(config: IndexConfig): typings.bluebird.bluebirdMod.^[Index] = js.native
  def delete(name: String): typings.bluebird.bluebirdMod.^[Index] = js.native
  def drop(name: String): typings.bluebird.bluebirdMod.^[Db] = js.native
  def get(name: String): typings.bluebird.bluebirdMod.^[Index] = js.native
  def get(name: String, refresh: Boolean): typings.bluebird.bluebirdMod.^[Index] = js.native
  def list(): typings.bluebird.bluebirdMod.^[js.Array[Index]] = js.native
  def list(refresh: Boolean): typings.bluebird.bluebirdMod.^[js.Array[Index]] = js.native
  def select(): Statement[_] = js.native
  def set(key: String, value: String): typings.bluebird.bluebirdMod.^[Index] = js.native
  def set(key: String, value: RID): typings.bluebird.bluebirdMod.^[Index] = js.native
}

