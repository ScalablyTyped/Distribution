package typings.nodeCleanup

import typings.nodeCleanup.anon.CtrlC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  @scala.inline
  def apply(
    cleanupHandler: js.Function2[/* exitCode */ Double | Null, /* signal */ String | Null, js.UndefOr[Boolean | Unit]]
  ): Unit = ^.asInstanceOf[js.Dynamic].apply(cleanupHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(
    cleanupHandler: js.Function2[/* exitCode */ Double | Null, /* signal */ String | Null, js.UndefOr[Boolean | Unit]],
    stderrMessages: CtrlC
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(cleanupHandler.asInstanceOf[js.Any], stderrMessages.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(cleanupHandler: Unit, stderrMessages: CtrlC): Unit = (^.asInstanceOf[js.Dynamic].apply(cleanupHandler.asInstanceOf[js.Any], stderrMessages.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node-cleanup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def uninstall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")().asInstanceOf[Unit]
}
