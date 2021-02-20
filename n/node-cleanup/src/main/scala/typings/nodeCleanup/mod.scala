package typings.nodeCleanup

import typings.nodeCleanup.anon.CtrlC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-cleanup", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("node-cleanup", JSImport.Namespace)
  @js.native
  def apply(cleanupHandler: js.UndefOr[scala.Nothing], stderrMessages: CtrlC): Unit = js.native
  @JSImport("node-cleanup", JSImport.Namespace)
  @js.native
  def apply(
    cleanupHandler: js.Function2[/* exitCode */ Double | Null, /* signal */ String | Null, js.UndefOr[Boolean | Unit]]
  ): Unit = js.native
  @JSImport("node-cleanup", JSImport.Namespace)
  @js.native
  def apply(
    cleanupHandler: js.Function2[/* exitCode */ Double | Null, /* signal */ String | Null, js.UndefOr[Boolean | Unit]],
    stderrMessages: CtrlC
  ): Unit = js.native
  
  @JSImport("node-cleanup", "uninstall")
  @js.native
  def uninstall(): Unit = js.native
}
