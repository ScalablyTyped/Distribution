package typings.nodeCleanup

import typings.nodeCleanup.anon.CtrlC
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
    stderrMessages: CtrlC
  ): Unit = js.native
  def uninstall(): Unit = js.native
}

