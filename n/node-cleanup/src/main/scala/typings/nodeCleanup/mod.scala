package typings.nodeCleanup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-cleanup", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): Unit = js.native
  def apply(
    cleanupHandler: js.Function2[/* exitCode */ Double | Null, /* signal */ String | Null, js.UndefOr[Boolean | Unit]]
  ): Unit = js.native
  def apply(
    cleanupHandler: js.Function2[/* exitCode */ Double | Null, /* signal */ String | Null, js.UndefOr[Boolean | Unit]],
    stderrMessages: AnonCtrlC
  ): Unit = js.native
  def uninstall(): Unit = js.native
}

