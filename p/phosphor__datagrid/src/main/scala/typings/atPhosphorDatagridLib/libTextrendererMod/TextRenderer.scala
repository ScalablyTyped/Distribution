package typings
package atPhosphorDatagridLib.libTextrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer")
@js.native
/**
  * Construct a new text renderer.
  *
  * @param options - The options for initializing the renderer.
  */
class TextRenderer ()
  extends atPhosphorDatagridLib.libCellrendererMod.CellRenderer {
  def this(options: atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.IOptions) = this()
  /**
    * The CSS color for the cell background.
    */
  val backgroundColor: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[java.lang.String] = js.native
  /**
    * The CSS shorthand font for drawing the text.
    */
  val font: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[java.lang.String] = js.native
  /**
    * The horizontal alignment for the cell text.
    */
  val horizontalAlignment: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.HorizontalAlignment] = js.native
  /**
    * The CSS color for drawing the text.
    */
  val textColor: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[java.lang.String] = js.native
  /**
    * The vertical alignment for the cell text.
    */
  val verticalAlignment: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ConfigOption[atPhosphorDatagridLib.libTextrendererMod.TextRendererNs.VerticalAlignment] = js.native
  /**
    * Draw the background for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawBackground(
    gc: atPhosphorDatagridLib.libGraphicscontextMod.GraphicsContext,
    config: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ICellConfig
  ): scala.Unit = js.native
  /**
    * Draw the text for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawText(
    gc: atPhosphorDatagridLib.libGraphicscontextMod.GraphicsContext,
    config: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ICellConfig
  ): scala.Unit = js.native
  /**
    * The format function for the cell value.
    */
  def format(config: atPhosphorDatagridLib.libCellrendererMod.CellRendererNs.ICellConfig): java.lang.String = js.native
}

