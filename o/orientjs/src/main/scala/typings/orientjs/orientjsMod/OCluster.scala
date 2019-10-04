package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "OCluster")
@js.native
class OCluster () extends js.Object {
  var location: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  def cacheData(clusters: js.Array[OCluster] with js.Array[_]): ODB = js.native
  def count(name: String): js.Promise[Double] = js.native
  def create(name: String): js.Promise[OCluster] with js.Promise[_] = js.native
  def create(name: String, location: String): js.Promise[OCluster] with js.Promise[_] = js.native
  def drop(name: String): js.Promise[ODB] = js.native
  def get(nameOrId: String): js.Promise[OCluster] with js.Promise[_] = js.native
  def get(nameOrId: String, refresh: Boolean): js.Promise[OCluster] with js.Promise[_] = js.native
  def getById(id: String): js.Promise[OCluster] with js.Promise[_] = js.native
  def getById(id: String, refresh: Boolean): js.Promise[OCluster] with js.Promise[_] = js.native
  def getByName(name: String): js.Promise[OCluster] with js.Promise[_] = js.native
  def getByName(name: String, refresh: Boolean): js.Promise[OCluster] with js.Promise[_] = js.native
  def list(): js.Promise[js.Array[_]] = js.native
  def list(refresh: Boolean): js.Promise[js.Array[_]] = js.native
  def range(name: String): js.Promise[_] = js.native
}

