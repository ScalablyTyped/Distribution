package typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.formatPrecision

import typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer.formatPrecision")
@js.native
object ^ extends js.Object {
  /**
    * Create a significant figure format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new significant figure format function.
    *
    * #### Notes
    * This formatter uses the builtin `Number()` and `toPrecision()`
    * to coerce values.
    *
    * The `formatIntlNumber()` formatter is more flexible, but slower.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

