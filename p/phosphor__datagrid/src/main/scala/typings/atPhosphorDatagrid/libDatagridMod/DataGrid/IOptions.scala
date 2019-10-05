package typings.atPhosphorDatagrid.libDatagridMod.DataGrid

import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer
import typings.atPhosphorDatagrid.libRenderermapMod.RendererMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a data grid.
  */
trait IOptions extends js.Object {
  /**
    * The base size for column headers in the data grid.
    *
    * The default is `20`.
    */
  var baseColumnHeaderSize: js.UndefOr[Double] = js.undefined
  /**
    * The base size for columns in the data grid.
    *
    * The default is `64`.
    */
  var baseColumnSize: js.UndefOr[Double] = js.undefined
  /**
    * The base size for row headers in the data grid.
    *
    * The default is `64`.
    */
  var baseRowHeaderSize: js.UndefOr[Double] = js.undefined
  /**
    * The base size for rows in the data grid.
    *
    * The default is `20`.
    */
  var baseRowSize: js.UndefOr[Double] = js.undefined
  /**
    * The cell renderer map for the data grid.
    *
    * The default is an empty renderer map.
    */
  var cellRenderers: js.UndefOr[RendererMap] = js.undefined
  /**
    * The default cell renderer for the data grid.
    *
    * The default is a new `TextRenderer`.
    */
  var defaultRenderer: js.UndefOr[CellRenderer] = js.undefined
  /**
    * The header visibility for the data grid.
    *
    * The default is `'all'`.
    */
  var headerVisibility: js.UndefOr[HeaderVisibility] = js.undefined
  /**
    * The style for the data grid.
    *
    * The default is `DataGrid.defaultStyle`.
    */
  var style: js.UndefOr[IStyle] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    baseColumnHeaderSize: Int | Double = null,
    baseColumnSize: Int | Double = null,
    baseRowHeaderSize: Int | Double = null,
    baseRowSize: Int | Double = null,
    cellRenderers: RendererMap = null,
    defaultRenderer: CellRenderer = null,
    headerVisibility: HeaderVisibility = null,
    style: IStyle = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (baseColumnHeaderSize != null) __obj.updateDynamic("baseColumnHeaderSize")(baseColumnHeaderSize.asInstanceOf[js.Any])
    if (baseColumnSize != null) __obj.updateDynamic("baseColumnSize")(baseColumnSize.asInstanceOf[js.Any])
    if (baseRowHeaderSize != null) __obj.updateDynamic("baseRowHeaderSize")(baseRowHeaderSize.asInstanceOf[js.Any])
    if (baseRowSize != null) __obj.updateDynamic("baseRowSize")(baseRowSize.asInstanceOf[js.Any])
    if (cellRenderers != null) __obj.updateDynamic("cellRenderers")(cellRenderers)
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(defaultRenderer)
    if (headerVisibility != null) __obj.updateDynamic("headerVisibility")(headerVisibility)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IOptions]
  }
}

