package typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod._MongoMemoryServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryServer extends js.Object {
  var isRunning: Boolean = js.native
  var opts: MongoMemoryServerOptsT = js.native
  var runningInstance: js.UndefOr[js.Promise[MongoInstanceDataT]] = js.native
  def _startUpInstance(): js.Promise[MongoInstanceDataT] = js.native
  def debug(args: js.Any*): js.Any = js.native
  def getConnectionString(): js.Promise[String] = js.native
  def getConnectionString(otherDbName: String): js.Promise[String] = js.native
  def getConnectionString(otherDbName: Boolean): js.Promise[String] = js.native
  def getDbName(): js.Promise[String] = js.native
  def getDbPath(): js.Promise[String] = js.native
  def getInstanceData(): js.Promise[MongoInstanceDataT] = js.native
  def getPort(): js.Promise[Double] = js.native
  def getUri(): js.Promise[String] = js.native
  def getUri(otherDbName: String): js.Promise[String] = js.native
  def getUri(otherDbName: Boolean): js.Promise[String] = js.native
  def start(): js.Promise[Boolean] = js.native
  def stop(): js.Promise[Boolean] = js.native
}

