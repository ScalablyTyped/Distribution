package typings.phosphorDatagrid.textrendererMod.TextRenderer.formatFixed

import typings.phosphorDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer.formatFixed")
@js.native
object ^ extends js.Object {
  /**
    * Create a fixed decimal format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new fixed decimal format function.
    *
    * #### Notes
    * This formatter uses the builtin `Number()` and `toFixed()` to
    * coerce values.
    *
    * The `formatIntlNumber()` formatter is more flexible, but slower.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

