package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Cluster")
@js.native
class Cluster () extends js.Object {
  var location: js.UndefOr[java.lang.String] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  def cacheData(clusters: js.Array[Cluster] with js.Array[_]): Db = js.native
  def count(name: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Double] = js.native
  def create(name: java.lang.String): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def create(name: java.lang.String, location: java.lang.String): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def drop(name: java.lang.String): bluebirdLib.bluebirdMod.^[Db] = js.native
  def get(nameOrId: java.lang.String): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def get(nameOrId: java.lang.String, refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def getById(id: java.lang.String): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def getById(id: java.lang.String, refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def getByName(name: java.lang.String): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def getByName(name: java.lang.String, refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[Cluster] with bluebirdLib.bluebirdMod.^[_] = js.native
  def list(): bluebirdLib.bluebirdMod.^[js.Array[_]] = js.native
  def list(refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[js.Array[_]] = js.native
  def range(name: java.lang.String): bluebirdLib.bluebirdMod.^[_] = js.native
}

