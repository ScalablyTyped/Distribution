package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoMemoryServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryServer extends js.Object {
  var isRunning: scala.Boolean = js.native
  var opts: MongoMemoryServerOptsT = js.native
  var runningInstance: js.UndefOr[js.Promise[MongoInstanceDataT]] = js.native
  def _startUpInstance(): js.Promise[MongoInstanceDataT] = js.native
  def debug(args: js.Any*): js.Any = js.native
  def getConnectionString(): js.Promise[java.lang.String] = js.native
  def getConnectionString(otherDbName: java.lang.String): js.Promise[java.lang.String] = js.native
  def getConnectionString(otherDbName: scala.Boolean): js.Promise[java.lang.String] = js.native
  def getDbName(): js.Promise[java.lang.String] = js.native
  def getDbPath(): js.Promise[java.lang.String] = js.native
  def getInstanceData(): js.Promise[MongoInstanceDataT] = js.native
  def getPort(): js.Promise[scala.Double] = js.native
  def getUri(): js.Promise[java.lang.String] = js.native
  def getUri(otherDbName: java.lang.String): js.Promise[java.lang.String] = js.native
  def getUri(otherDbName: scala.Boolean): js.Promise[java.lang.String] = js.native
  def start(): js.Promise[scala.Boolean] = js.native
  def stop(): js.Promise[scala.Boolean] = js.native
}

