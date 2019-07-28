package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Cluster")
@js.native
class Cluster () extends js.Object {
  var location: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  def cacheData(clusters: js.Array[Cluster] with js.Array[_]): Db = js.native
  def count(name: String): typings.bluebird.bluebirdMod.^[Double] = js.native
  def create(name: String): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def create(name: String, location: String): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def drop(name: String): typings.bluebird.bluebirdMod.^[Db] = js.native
  def get(nameOrId: String): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def get(nameOrId: String, refresh: Boolean): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def getById(id: String): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def getById(id: String, refresh: Boolean): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def getByName(name: String): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def getByName(name: String, refresh: Boolean): typings.bluebird.bluebirdMod.^[Cluster] with typings.bluebird.bluebirdMod.^[_] = js.native
  def list(): typings.bluebird.bluebirdMod.^[js.Array[_]] = js.native
  def list(refresh: Boolean): typings.bluebird.bluebirdMod.^[js.Array[_]] = js.native
  def range(name: String): typings.bluebird.bluebirdMod.^[_] = js.native
}

