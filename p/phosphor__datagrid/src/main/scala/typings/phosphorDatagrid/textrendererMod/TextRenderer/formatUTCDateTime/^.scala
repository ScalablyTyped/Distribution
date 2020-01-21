package typings.phosphorDatagrid.textrendererMod.TextRenderer.formatUTCDateTime

import typings.phosphorDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer.formatUTCDateTime")
@js.native
object ^ extends js.Object {
  /**
    * Create a UTC datetime format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new UTC datetime format function.
    *
    * #### Notes
    * This formatter uses `Date.toUTCString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

