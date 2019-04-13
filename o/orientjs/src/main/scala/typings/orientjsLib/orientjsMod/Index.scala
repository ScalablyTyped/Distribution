package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var algorithm: java.lang.String = js.native
  var cached: scala.Boolean = js.native
  var clusters: js.Array[Cluster] = js.native
  var db: Db = js.native
  var name: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def add(idx: js.Array[IndexEntry]): bluebirdLib.bluebirdMod.^[js.Array[Index]] = js.native
  def add(idx: IndexEntry): bluebirdLib.bluebirdMod.^[js.Array[Index]] = js.native
  def cacheData(indices: js.Array[_]): bluebirdLib.bluebirdMod.^[Db] = js.native
  def configure(config: js.Any): scala.Unit = js.native
  def create(config: js.Array[IndexConfig]): bluebirdLib.bluebirdMod.^[Index] = js.native
  def create(config: IndexConfig): bluebirdLib.bluebirdMod.^[Index] = js.native
  def delete(name: java.lang.String): bluebirdLib.bluebirdMod.^[Index] = js.native
  def drop(name: java.lang.String): bluebirdLib.bluebirdMod.^[Db] = js.native
  def get(name: java.lang.String): bluebirdLib.bluebirdMod.^[Index] = js.native
  def get(name: java.lang.String, refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[Index] = js.native
  def list(): bluebirdLib.bluebirdMod.^[js.Array[Index]] = js.native
  def list(refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[js.Array[Index]] = js.native
  def select(): Statement[_] = js.native
  def set(key: java.lang.String, value: java.lang.String): bluebirdLib.bluebirdMod.^[Index] = js.native
  def set(key: java.lang.String, value: RID): bluebirdLib.bluebirdMod.^[Index] = js.native
}

