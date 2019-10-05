package typings.nwDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", JSImport.Namespace)
@js.native
object nwDotGuiMod extends js.Object {
  @js.native
  class Menu ()
    extends typings.nwDotJs.nw.Menu
  
  @js.native
  class MenuItem ()
    extends typings.nwDotJs.nw.MenuItem
  
  @js.native
  class Shortcut ()
    extends typings.nwDotJs.nw.Shortcut
  
  @js.native
  class Tray ()
    extends typings.nwDotJs.nw.Tray
  
  var App: typings.nwDotJs.nw.App = js.native
  var Clipboard: typings.nwDotJs.nw.Clipboard = js.native
  var Screen: typings.nwDotJs.nw.Screen = js.native
  var Shell: typings.nwDotJs.nw.Shell = js.native
  var Window: typings.nwDotJs.nw.Window = js.native
}

