package typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod

import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.DebugFn
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryServer extends js.Object {
  @JSName("debug")
  var debug_Original: DebugFn = js.native
  var instanceInfoSync: MongoInstanceDataT | Null = js.native
  var opts: MongoMemoryServerOptsT = js.native
  var runningInstance: js.Promise[MongoInstanceDataT] | Null = js.native
  def _getUriBase(host: String, port: Double, dbName: String): String = js.native
  def _startUpInstance(): js.Promise[MongoInstanceDataT] = js.native
  def debug(args: js.Any*): js.Any = js.native
  def ensureInstance(): js.Promise[MongoInstanceDataT] = js.native
  def getConnectionString(): js.Promise[String] = js.native
  def getConnectionString(otherDbName: String): js.Promise[String] = js.native
  def getConnectionString(otherDbName: Boolean): js.Promise[String] = js.native
  def getDbName(): js.Promise[String] = js.native
  def getDbPath(): js.Promise[String] = js.native
  def getInstanceInfo(): MongoInstanceDataT | `false` = js.native
  def getPort(): js.Promise[Double] = js.native
  def getUri(): js.Promise[String] = js.native
  def getUri(otherDbName: String): js.Promise[String] = js.native
  def getUri(otherDbName: Boolean): js.Promise[String] = js.native
  def start(): js.Promise[Boolean] = js.native
  def stop(): js.Promise[Boolean] = js.native
}

