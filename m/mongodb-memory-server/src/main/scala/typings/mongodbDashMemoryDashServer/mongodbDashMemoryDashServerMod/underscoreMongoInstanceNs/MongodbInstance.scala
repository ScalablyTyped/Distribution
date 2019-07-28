package typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoInstanceNs

import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongodbInstance extends js.Object {
  var childProcess: ChildProcess = js.native
  var killerProcess: ChildProcess = js.native
  var opts: MongodOps = js.native
  def _launchKiller(parentPid: Double, childPid: Double): ChildProcess = js.native
  def _launchMongod(mongoBin: String): ChildProcess = js.native
  def closeHandler(code: Double): Unit = js.native
  def debug(args: js.Any*): js.Any = js.native
  def errorHandler(err: String): Unit = js.native
  def getPid(): js.UndefOr[Double] = js.native
  def instanceFailed(args: js.Any*): js.Any = js.native
  def instanceReady(args: js.Any*): js.Any = js.native
  def kill(): js.Promise[MongodbInstance] = js.native
  def prepareCommandArgs(): js.Array[String] = js.native
  def run(): js.Promise[MongodbInstance] = js.native
  def stderrHandler(message: String): Unit = js.native
  def stderrHandler(message: Buffer): Unit = js.native
  def stdoutHandler(message: String): Unit = js.native
  def stdoutHandler(message: Buffer): Unit = js.native
}

