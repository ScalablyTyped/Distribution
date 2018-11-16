package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoMemoryServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryServer extends js.Object {
  var isRunning: scala.Boolean = js.native
  var opts: MongoMemoryServerOptsT = js.native
  var runningInstance: js.UndefOr[stdLib.Promise[MongoInstanceDataT]] = js.native
  def _startUpInstance(): stdLib.Promise[MongoInstanceDataT] = js.native
  def debug(args: js.Any*): js.Any = js.native
  def getConnectionString(): stdLib.Promise[java.lang.String] = js.native
  def getConnectionString(otherDbName: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def getConnectionString(otherDbName: scala.Boolean): stdLib.Promise[java.lang.String] = js.native
  def getDbName(): stdLib.Promise[java.lang.String] = js.native
  def getDbPath(): stdLib.Promise[java.lang.String] = js.native
  def getInstanceData(): stdLib.Promise[MongoInstanceDataT] = js.native
  def getPort(): stdLib.Promise[scala.Double] = js.native
  def getUri(): stdLib.Promise[java.lang.String] = js.native
  def getUri(otherDbName: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def getUri(otherDbName: scala.Boolean): stdLib.Promise[java.lang.String] = js.native
  def start(): stdLib.Promise[scala.Boolean] = js.native
  def stop(): stdLib.Promise[scala.Boolean] = js.native
}

