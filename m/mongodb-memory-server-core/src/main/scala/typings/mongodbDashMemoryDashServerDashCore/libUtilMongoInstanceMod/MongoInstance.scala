package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod

import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoInstance extends js.Object {
  var childProcess: ChildProcess | Null = js.native
  var debug: js.Function = js.native
  var isInstancePrimary: Boolean = js.native
  var isInstanceReady: Boolean = js.native
  var killerProcess: ChildProcess | Null = js.native
  var opts: MongodOps = js.native
  var waitForPrimaryResolveFns: js.Array[js.Function] = js.native
  def _launchKiller(parentPid: Double, childPid: Double): ChildProcess = js.native
  def _launchMongod(mongoBin: String): ChildProcess = js.native
  def closeHandler(code: Double): Unit = js.native
  def errorHandler(err: String): Unit = js.native
  def getPid(): js.UndefOr[Double] = js.native
  def instanceFailed(err: js.Any): Unit = js.native
  def instanceReady(): Unit = js.native
  def kill(): js.Promise[MongoInstance] = js.native
  def prepareCommandArgs(): js.Array[String] = js.native
  def run(): js.Promise[MongoInstance] = js.native
  def stderrHandler(message: String): Unit = js.native
  def stderrHandler(message: Buffer): Unit = js.native
  def stdoutHandler(message: String): Unit = js.native
  def stdoutHandler(message: Buffer): Unit = js.native
  def waitPrimaryReady(): js.Promise[Boolean] = js.native
}

