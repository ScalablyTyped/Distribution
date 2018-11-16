package typings
package nodeDashCleanupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-cleanup", JSImport.Namespace)
@js.native
object nodeDashCleanupMod extends js.Object {
  def apply(): scala.Unit = js.native
  def apply(
    cleanupHandler: js.Function2[
      /* exitCode */ scala.Double | scala.Null, 
      /* signal */ java.lang.String | scala.Null, 
      js.UndefOr[scala.Boolean]
    ]
  ): scala.Unit = js.native
  def apply(
    cleanupHandler: js.Function2[
      /* exitCode */ scala.Double | scala.Null, 
      /* signal */ java.lang.String | scala.Null, 
      js.UndefOr[scala.Boolean]
    ],
    stderrMessages: nodeDashCleanupLib.Anon_CtrlC
  ): scala.Unit = js.native
  def uninstall(): scala.Unit = js.native
}

