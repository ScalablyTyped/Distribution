package typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.formatGeneric

import typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer.formatGeneric")
@js.native
object ^ extends js.Object {
  /**
    * Create a generic text format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new generic text format function.
    *
    * #### Notes
    * This formatter uses the builtin `String()` to coerce any value
    * to a string.
    */
  def apply(): FormatFunc = js.native
  def apply(options: typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.formatGeneric.IOptions): FormatFunc = js.native
}

