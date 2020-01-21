package typings.menubar.mod

import typings.electron.Electron.App_
import typings.menubar.menubarMod.Menubar
import typings.menubar.typesMod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", "Menubar")
@js.native
class Menubar_ protected () extends Menubar {
  def this(app: App_) = this()
  def this(app: App_, options: Partial[Options]) = this()
}

