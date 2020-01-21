package typings.mongodbMemoryServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server-core/lib/util/db_util", JSImport.Namespace)
@js.native
object dbUtilMod extends js.Object {
  def default(): String = js.native
  def default(dbName: String): String = js.native
  def generateDbName(): String = js.native
  def generateDbName(dbName: String): String = js.native
  def getHost(uri: String): String = js.native
  def getUriBase(host: String, port: Double, dbName: String): String = js.native
}

