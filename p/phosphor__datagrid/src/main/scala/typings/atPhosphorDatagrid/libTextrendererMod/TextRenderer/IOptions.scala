package typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer

import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer.ConfigOption
import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer.ICellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a text renderer.
  */
trait IOptions extends js.Object {
  /**
    * The background color for the cells.
    *
    * The default is `''`.
    */
  var backgroundColor: js.UndefOr[ConfigOption[String]] = js.undefined
  /**
    * The font for drawing the cell text.
    *
    * The default is `'12px sans-serif'`.
    */
  var font: js.UndefOr[ConfigOption[String]] = js.undefined
  /**
    * The format function for the renderer.
    *
    * The default is `TextRenderer.formatGeneric()`.
    */
  var format: js.UndefOr[FormatFunc] = js.undefined
  /**
    * The horizontal alignment for the cell text.
    *
    * The default is `'left'`.
    */
  var horizontalAlignment: js.UndefOr[ConfigOption[HorizontalAlignment]] = js.undefined
  /**
    * The color for the drawing the cell text.
    *
    * The default `'#000000'`.
    */
  var textColor: js.UndefOr[ConfigOption[String]] = js.undefined
  /**
    * The vertical alignment for the cell text.
    *
    * The default is `'center'`.
    */
  var verticalAlignment: js.UndefOr[ConfigOption[VerticalAlignment]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    backgroundColor: ConfigOption[String] = null,
    font: ConfigOption[String] = null,
    format: /* config */ ICellConfig => String = null,
    horizontalAlignment: ConfigOption[HorizontalAlignment] = null,
    textColor: ConfigOption[String] = null,
    verticalAlignment: ConfigOption[VerticalAlignment] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

