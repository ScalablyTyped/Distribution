package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libTabbarMod.TabBar.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "TabBar")
@js.native
/**
  * Construct a new tab bar.
  *
  * @param options - The options for initializing the tab bar.
  */
class TabBar[T] ()
  extends typings.atPhosphorWidgets.libTabbarMod.TabBar[T] {
  def this(options: IOptions[T]) = this()
}

@JSImport("@phosphor/widgets", "TabBar")
@js.native
object TabBar extends js.Object {
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
    extends typings.atPhosphorWidgets.libTabbarMod.TabBar.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.atPhosphorWidgets.libTabbarMod.TabBar.Renderer = js.native
}

