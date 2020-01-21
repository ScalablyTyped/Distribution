package typings.nwJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", JSImport.Namespace)
@js.native
object nwGuiAugmentingMod extends js.Object {
  @js.native
  class Menu ()
    extends typings.nwJs.mod._Global_.nw.Menu
  
  @js.native
  class MenuItem ()
    extends typings.nwJs.mod._Global_.nw.MenuItem
  
  @js.native
  class Shortcut ()
    extends typings.nwJs.mod._Global_.nw.Shortcut
  
  @js.native
  class Tray ()
    extends typings.nwJs.mod._Global_.nw.Tray
  
  var App: typings.nwJs.mod._Global_.nw.App = js.native
  var Clipboard: typings.nwJs.mod._Global_.nw.Clipboard = js.native
  var Screen: typings.nwJs.mod._Global_.nw.Screen = js.native
  var Shell: typings.nwJs.mod._Global_.nw.Shell = js.native
  var Window: typings.nwJs.mod._Global_.nw.Window = js.native
}

