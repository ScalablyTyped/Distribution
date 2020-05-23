package typings.openfin

import typings.openfin.anon.Command
import typings.openfin.openfinLayoutMod.LayoutManager
import typings.openfin.platformPlatformMod.PlatformOptions
import typings.openfin.shapesMod.Hotkey
import typings.openfin.shapesMod.ShortcutOverride
import typings.openfin.utilsMod.ViewComponent
import typings.openfin.viewMod.InputEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/commands", JSImport.Namespace)
@js.native
object commandsMod extends js.Object {
  def handleViewCommand(e: InputEvent, bv: ViewComponent, context: LayoutManager): js.Promise[Unit] = js.native
  def handleWindowCommand(e: InputEvent, context: LayoutManager): Unit = js.native
  def mergeDefaultCommands(providedCommands: js.Array[ShortcutOverride]): js.Array[Command] = js.native
  def setUpKeyboardCommands(hotkeys: js.Array[Hotkey], appOptions: PlatformOptions): js.Array[Hotkey] = js.native
}

