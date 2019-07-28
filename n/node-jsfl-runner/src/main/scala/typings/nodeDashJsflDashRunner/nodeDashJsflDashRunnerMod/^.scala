package typings.nodeDashJsflDashRunner.nodeDashJsflDashRunnerMod

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jsfl-runner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createJSFL(
    jsfl: JSFL,
    fileName: String,
    initParams: js.Array[_],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def deleteJSFL(fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def runJSFL(flashLocation: String, fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

