package typings.mongodbMemoryServerCore.mongoInstanceMod

import typings.mongodbMemoryServerCore.typesMod.DebugFn
import typings.mongodbMemoryServerCore.typesMod.EmptyVoidCallback
import typings.mongodbMemoryServerCore.typesMod.ErrorVoidCallback
import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoInstance extends js.Object {
  var childProcess: ChildProcess | Null = js.native
  @JSName("debug")
  var debug_Original: DebugFn = js.native
  @JSName("instanceFailed")
  var instanceFailed_Original: ErrorVoidCallback = js.native
  @JSName("instanceReady")
  var instanceReady_Original: EmptyVoidCallback = js.native
  var isInstancePrimary: Boolean = js.native
  var isInstanceReady: Boolean = js.native
  var killerProcess: ChildProcess | Null = js.native
  var opts: MongodOps = js.native
  var waitForPrimaryResolveFns: js.Array[js.Function] = js.native
  /**
    * Spawn an child to kill the parent and the mongod instance if both are Dead
    * @param parentPid Parent to kill
    * @param childPid Mongod process to kill
    */
  def _launchKiller(parentPid: Double, childPid: Double): ChildProcess = js.native
  /**
    * Actually launch mongod
    * @param mongoBin The binary to run
    */
  def _launchMongod(mongoBin: String): ChildProcess = js.native
  /**
    * Write the CLOSE event to the debug function
    * @param code The Exit code
    */
  def closeHandler(code: Double): Unit = js.native
  def debug(args: js.Any*): js.Any = js.native
  def errorHandler(err: String): Unit = js.native
  /**
    * Get the PID of the mongod instance
    */
  def getPid(): js.UndefOr[Double] = js.native
  def instanceFailed(err: js.Any): Unit = js.native
  def instanceReady(): Unit = js.native
  def kill(): js.Promise[MongoInstance] = js.native
  /**
    * Create an array of arguments for the mongod instance
    */
  def prepareCommandArgs(): js.Array[String] = js.native
  /**
    * Create the mongod process
    */
  def run(): js.Promise[this.type] = js.native
  /**
    * Write STDERR to debug function
    * @param message The STDERR line to write
    */
  def stderrHandler(message: String): Unit = js.native
  def stderrHandler(message: Buffer): Unit = js.native
  /**
    * Write STDOUT to debug function AND instanceReady/instanceFailed if inputs match
    * @param message The STDOUT line to write/parse
    */
  def stdoutHandler(message: String): Unit = js.native
  def stdoutHandler(message: Buffer): Unit = js.native
  /**
    * Wait until the Primary mongod is running
    */
  def waitPrimaryReady(): js.Promise[Boolean] = js.native
}

