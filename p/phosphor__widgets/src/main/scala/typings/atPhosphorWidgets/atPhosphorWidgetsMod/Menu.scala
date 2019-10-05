package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libMenuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "Menu")
@js.native
class Menu protected ()
  extends typings.atPhosphorWidgets.libMenuMod.Menu {
  /**
    * Construct a new menu.
    *
    * @param options - The options for initializing the menu.
    */
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "Menu")
@js.native
object Menu extends js.Object {
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @js.native
  /**
    * Construct a new renderer.
    */
  class Renderer ()
    extends typings.atPhosphorWidgets.libMenuMod.Menu.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.atPhosphorWidgets.libMenuMod.Menu.Renderer = js.native
}

