package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongodbInstance extends js.Object {
  var childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  var killerProcess: nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  var opts: MongodOps = js.native
  def _launchKiller(parentPid: scala.Double, childPid: scala.Double): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def _launchMongod(mongoBin: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def closeHandler(code: scala.Double): scala.Unit = js.native
  def debug(args: js.Any*): js.Any = js.native
  def errorHandler(err: java.lang.String): scala.Unit = js.native
  def getPid(): js.UndefOr[scala.Double] = js.native
  def instanceFailed(args: js.Any*): js.Any = js.native
  def instanceReady(args: js.Any*): js.Any = js.native
  def kill(): stdLib.Promise[MongodbInstance] = js.native
  def prepareCommandArgs(): js.Array[java.lang.String] = js.native
  def run(): stdLib.Promise[MongodbInstance] = js.native
  def stderrHandler(message: java.lang.String): scala.Unit = js.native
  def stderrHandler(message: nodeLib.Buffer): scala.Unit = js.native
  def stdoutHandler(message: java.lang.String): scala.Unit = js.native
  def stdoutHandler(message: nodeLib.Buffer): scala.Unit = js.native
}

