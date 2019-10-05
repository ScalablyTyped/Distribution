package typings.atPhosphorWidgets.atPhosphorWidgetsMod

import typings.atPhosphorWidgets.libCommandpaletteMod.CommandPalette.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "CommandPalette")
@js.native
class CommandPalette protected ()
  extends typings.atPhosphorWidgets.libCommandpaletteMod.CommandPalette {
  /**
    * Construct a new command palette.
    *
    * @param options - The options for initializing the palette.
    */
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "CommandPalette")
@js.native
object CommandPalette extends js.Object {
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends typings.atPhosphorWidgets.libCommandpaletteMod.CommandPalette.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.atPhosphorWidgets.libCommandpaletteMod.CommandPalette.Renderer = js.native
}

