package typings
package nodeDashJsflDashRunnerLib.nodeDashJsflDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jsfl-runner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createJSFL(
    jsfl: JSFL,
    fileName: java.lang.String,
    initParams: js.Array[_],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def deleteJSFL(
    fileName: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def runJSFL(
    flashLocation: java.lang.String,
    fileName: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
}

