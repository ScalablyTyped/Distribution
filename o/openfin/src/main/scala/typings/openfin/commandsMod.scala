package typings.openfin

import typings.openfin.GoldenLayout.Tab
import typings.openfin.anon.Command
import typings.openfin.openfinLayoutMod.default
import typings.openfin.shapesMod.Hotkey
import typings.openfin.shapesMod.ShortcutOverride
import typings.openfin.shapesPlatformMod.PlatformOptions
import typings.openfin.utilsMod.ViewComponent
import typings.openfin.viewMod.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("openfin/_v2/api/platform/commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def detachView(tab: Tab, context: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachView")(tab.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def handleViewCommand(e: InputEvent, bv: ViewComponent, context: default): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleViewCommand")(e.asInstanceOf[js.Any], bv.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def handleWindowCommand(e: InputEvent, context: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleWindowCommand")(e.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mergeDefaultCommands(providedCommands: js.Array[ShortcutOverride]): js.Array[Command] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDefaultCommands")(providedCommands.asInstanceOf[js.Any]).asInstanceOf[js.Array[Command]]
  
  @scala.inline
  def setUpKeyboardCommands(hotkeys: js.Array[Hotkey], appOptions: PlatformOptions): js.Array[Hotkey] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpKeyboardCommands")(hotkeys.asInstanceOf[js.Any], appOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Hotkey]]
}
