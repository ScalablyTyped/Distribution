package typings.atPhosphorDatagrid.libDatagridMod

import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`column-header`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`row-header`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.column
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.down
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.left
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.right
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.row
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.up
import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer
import typings.atPhosphorDatagrid.libDatagridMod.DataGridNs.HeaderVisibility
import typings.atPhosphorDatagrid.libDatagridMod.DataGridNs.IOptions
import typings.atPhosphorDatagrid.libDatagridMod.DataGridNs.IStyle
import typings.atPhosphorDatagrid.libDatamodelMod.DataModel
import typings.atPhosphorDatagrid.libRenderermapMod.RendererMap
import typings.atPhosphorMessaging.atPhosphorMessagingMod.IMessageHandler
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.WidgetNs.ResizeMessage
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/datagrid", "DataGrid")
@js.native
/**
  * Construct a new data grid.
  *
  * @param options - The options for initializing the data grid.
  */
class DataGrid () extends Widget {
  def this(options: IOptions) = this()
  /**
    * Blit content into the on-screen canvas.
    *
    * The rect should be expressed in viewport coordinates.
    *
    * This automatically accounts for the dpi ratio.
    */
  var _blit: js.Any = js.native
  var _buffer: js.Any = js.native
  var _bufferGC: js.Any = js.native
  var _canvas: js.Any = js.native
  var _canvasGC: js.Any = js.native
  var _cellRenderers: js.Any = js.native
  var _columnHeaderSections: js.Any = js.native
  var _columnSections: js.Any = js.native
  var _defaultRenderer: js.Any = js.native
  var _dpiRatio: js.Any = js.native
  /**
    * Draw the grid content for the given dirty rect.
    *
    * This method dispatches to the relevant `_draw*` methods.
    */
  var _draw: js.Any = js.native
  /**
    * Draw the background for the given paint region.
    */
  var _drawBackground: js.Any = js.native
  /**
    * Draw the body region which intersects the dirty rect.
    */
  var _drawBodyRegion: js.Any = js.native
  /**
    * Draw the cells for the given paint region.
    */
  var _drawCells: js.Any = js.native
  /**
    * Draw the column background for the given paint region.
    */
  var _drawColumnBackground: js.Any = js.native
  /**
    * Draw the column header region which intersects the dirty rect.
    */
  var _drawColumnHeaderRegion: js.Any = js.native
  /**
    * Draw the corner header region which intersects the dirty rect.
    */
  var _drawCornerHeaderRegion: js.Any = js.native
  /**
    * Draw the horizontal grid lines for the given paint region.
    */
  var _drawHorizontalGridLines: js.Any = js.native
  /**
    * Draw the row background for the given paint region.
    */
  var _drawRowBackground: js.Any = js.native
  /**
    * Draw the row header region which intersects the dirty rect.
    */
  var _drawRowHeaderRegion: js.Any = js.native
  /**
    * Draw the vertical grid lines for the given paint region.
    */
  var _drawVerticalGridLines: js.Any = js.native
  /**
    * Draw the void region for the dirty rect.
    */
  var _drawVoidRegion: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the data grid.
    */
  var _evtKeyDown: js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the data grid.
    */
  var _evtMouseDown: js.Any = js.native
  /**
    * Handle the `mousemove` event for the data grid.
    */
  var _evtMouseMove: js.Any = js.native
  /**
    * Handle the `mouseup` event for the data grid.
    */
  var _evtMouseUp: js.Any = js.native
  /**
    * Handle the `'wheel'` event for the data grid.
    */
  var _evtWheel: js.Any = js.native
  /**
    * Get the section list for the specified grid area.
    */
  var _getSectionList: js.Any = js.native
  var _hScrollBar: js.Any = js.native
  var _hScrollBarMinHeight: js.Any = js.native
  var _headerVisibility: js.Any = js.native
  /**
    * Hit test the grid headers for a resize handle.
    */
  var _hitTestResizeHandles: js.Any = js.native
  var _inPaint: js.Any = js.native
  var _model: js.Any = js.native
  /**
    * Handle cells changing in the data model.
    */
  var _onCellsChanged: js.Any = js.native
  /**
    * A signal handler for the data model `changed` signal.
    */
  var _onModelChanged: js.Any = js.native
  /**
    * Handle a full data model reset.
    */
  var _onModelReset: js.Any = js.native
  /**
    * Handle the `pageRequested` signal from a scroll bar.
    */
  var _onPageRequested: js.Any = js.native
  /**
    * A signal handler for the renderer map `changed` signal.
    */
  var _onRenderersChanged: js.Any = js.native
  /**
    * Handle sections changing in the data model.
    */
  var _onSectionsChanged: js.Any = js.native
  /**
    * Handle sections moving in the data model.
    */
  var _onSectionsMoved: js.Any = js.native
  /**
    * Handle the `stepRequested` signal from a scroll bar.
    */
  var _onStepRequested: js.Any = js.native
  /**
    * Handle the `thumbMoved` signal from a scroll bar.
    */
  var _onThumbMoved: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'paint-request'` message.
    */
  var _onViewportPaintRequest: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'resize'` message.
    */
  var _onViewportResize: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'scroll-request'` message.
    */
  var _onViewportScrollRequest: js.Any = js.native
  /**
    * A message hook invoked on a `'section-resize-request'` message.
    */
  var _onViewportSectionResizeRequest: js.Any = js.native
  /**
    * Paint the grid content for the given dirty rect.
    *
    * The rect should be expressed in viewport coordinates.
    *
    * This is the primary paint entry point. The individual `_draw*`
    * methods should not be invoked directly. This method dispatches
    * to the drawing methods in the correct order.
    */
  var _paint: js.Any = js.native
  var _paintPending: js.Any = js.native
  var _pressData: js.Any = js.native
  /**
    * Process a message sent to the viewport
    */
  var _processViewportMessage: js.Any = js.native
  /**
    * Refresh the internal dpi ratio.
    *
    * This will update the canvas size and schedule a repaint if needed.
    */
  var _refreshDPI: js.Any = js.native
  /**
    * Release the mouse grab for the data grid.
    */
  var _releaseMouse: js.Any = js.native
  /**
    * Ensure the canvas is at least the specified size.
    *
    * This method will retain the valid canvas content.
    */
  var _resizeCanvasIfNeeded: js.Any = js.native
  /**
    * Resize a section in the given section list.
    *
    * #### Notes
    * This will update the scroll bars and repaint as needed.
    */
  var _resizeSection: js.Any = js.native
  var _rowHeaderSections: js.Any = js.native
  var _rowSections: js.Any = js.native
  var _scrollCorner: js.Any = js.native
  var _scrollX: js.Any = js.native
  var _scrollY: js.Any = js.native
  /**
    * Set the base size for the given section list.
    *
    * #### Notes
    * This will update the scroll bars and repaint as needed.
    */
  var _setBaseSize: js.Any = js.native
  var _style: js.Any = js.native
  /**
    * Sync the scroll bars and scroll state with the viewport.
    *
    * #### Notes
    * If the visibility of either scroll bar changes, a synchronous
    * fit-request will be dispatched to the data grid to immediately
    * resize the viewport.
    */
  var _syncScrollState: js.Any = js.native
  /**
    * Sync the viewport to the given scroll position.
    *
    * #### Notes
    * This schedules a full repaint and syncs the scroll state.
    */
  var _syncViewport: js.Any = js.native
  var _vScrollBar: js.Any = js.native
  var _vScrollBarMinWidth: js.Any = js.native
  var _viewport: js.Any = js.native
  var _viewportHeight: js.Any = js.native
  var _viewportWidth: js.Any = js.native
  /**
    * Get the base size of the column headers.
    *
    * #### Notes
    * This is the size of column headers which have not been resized.
    */
  /**
    * Set the base size of the column headers.
    *
    * #### Notes
    * This is the size of column headers which have not been resized.
    */
  var baseColumnHeaderSize: Double = js.native
  /**
    * Get the base size of the body columns.
    *
    * #### Notes
    * This is the size of columns which have not been resized.
    */
  /**
    * Set the base size of the body columns.
    *
    * #### Notes
    * This is the size of columns which have not been resized.
    */
  var baseColumnSize: Double = js.native
  /**
    * Get the base size of the row headers.
    *
    * #### Notes
    * This is the size of row headers which have not been resized.
    */
  /**
    * Set the base size of the row headers.
    *
    * #### Notes
    * This is the size of row headers which have not been resized.
    */
  var baseRowHeaderSize: Double = js.native
  /**
    * Get the base size of the body rows.
    *
    * #### Notes
    * This is the size of rows which have not been resized.
    */
  /**
    * Set the base size of the body rows.
    *
    * #### Notes
    * This is the size of rows which have not been resized.
    */
  var baseRowSize: Double = js.native
  /**
    * The virtual height of the grid body.
    *
    * #### Notes
    * This value does not include the height of the column headers.
    */
  val bodyHeight: Double = js.native
  /**
    * The virtual width of the grid body.
    *
    * #### Notes
    * This value does not include the width of the row headers.
    */
  val bodyWidth: Double = js.native
  /**
    * Get the cell renderer map for the data grid.
    */
  /**
    * Set the cell renderer map for the data grid.
    */
  var cellRenderers: RendererMap = js.native
  /**
    * Get the default cell renderer for the data grid.
    */
  /**
    * Set the default cell renderer for the data grid.
    */
  var defaultRenderer: CellRenderer = js.native
  /**
    * The virtual height of the column headers.
    *
    * #### Notes
    * This will be `0` if the column headers are hidden.
    */
  val headerHeight: Double = js.native
  /**
    * Get the header visibility for the data grid.
    */
  /**
    * Set the header visibility for the data grid.
    */
  var headerVisibility: HeaderVisibility = js.native
  /**
    * The virtual width of the row headers.
    *
    * #### Notes
    * This will be `0` if the row headers are hidden.
    */
  val headerWidth: Double = js.native
  /**
    * The maximum scroll X position for the current grid dimensions.
    *
    * #### Notes
    * This value is `1px` less than the theoretical maximum to allow the
    * the right-most grid line to be clipped when the vertical scroll bar
    * is visible.
    */
  val maxScrollX: Double = js.native
  /**
    * The maximum scroll Y position for the current grid dimensions.
    *
    * #### Notes
    * This value is `1px` less than the theoretical maximum to allow the
    * the bottom-most grid line to be clipped when the horizontal scroll
    * bar is visible.
    */
  val maxScrollY: Double = js.native
  /**
    * Get the data model for the data grid.
    */
  /**
    * Set the data model for the data grid.
    */
  var model: DataModel | Null = js.native
  /**
    * The height of the visible portion of the body cells.
    *
    * #### Notes
    * This value does not include the height of the column headers.
    */
  val pageHeight: Double = js.native
  /**
    * The width of the visible portion of the body cells.
    *
    * #### Notes
    * This value does not include the width of the row headers.
    */
  val pageWidth: Double = js.native
  /**
    * The scroll X offset of the viewport.
    */
  val scrollX: Double = js.native
  /**
    * The scroll Y offset of the viewport.
    */
  val scrollY: Double = js.native
  /**
    * Get the style for the data grid.
    */
  /**
    * Set the style for the data grid.
    */
  var style: IStyle = js.native
  /**
    * The total virtual height of the grid.
    *
    * #### Notes
    * If the grid widget is sized larger than this height, a vertical
    * scroll bar will not be shown.
    */
  val totalHeight: Double = js.native
  /**
    * The total virtual width of the grid.
    *
    * #### Notes
    * If the grid widget is sized larger than this width, a horizontal
    * scroll bar will not be shown.
    */
  val totalWidth: Double = js.native
  /**
    * The height of the visible portion of the data grid.
    *
    * #### Notes
    * This value does not include the height of the scroll bar.
    */
  val viewportHeight: Double = js.native
  /**
    * The width of the visible portion of the data grid.
    *
    * #### Notes
    * This value does not include the width of the scroll bar.
    */
  val viewportWidth: Double = js.native
  /**
    * Handle the DOM events for the data grid.
    *
    * @param event - The DOM event sent to the data grid.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the data grid's DOM node. It
    * should not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  /**
    * Intercept a message sent to a message handler.
    *
    * @param handler - The target handler of the message.
    *
    * @param msg - The message to be sent to the handler.
    *
    * @returns `true` if the message should continue to be processed
    *   as normal, or `false` if processing should cease immediately.
    */
  def messageHook(handler: IMessageHandler, msg: Message): Boolean = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    */
  /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  /**
    * Schedule a repaint of the data grid.
    *
    * @param x - The viewport X coordinate of the dirty rect.
    *
    * @param y - The viewport Y coordinate of the dirty rect.
    *
    * @param w - The width of the dirty rect.
    *
    * @param h - The height of the dirty rect.
    *
    * #### Notes
    * This method is called automatically when changing the state of the
    * data grid. However, it may be called manually to repaint the grid
    * whenever external program state change necessitates an update.
    *
    * Multiple synchronous requests are collapsed into a single repaint.
    *
    * The no-argument form of this method will repaint the entire grid.
    */
  def repaint(): Unit = js.native
  def repaint(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  @JSName("resetSections")
  def resetSections_column(area: column): Unit = js.native
  @JSName("resetSections")
  def resetSections_columnheader(area: `column-header`): Unit = js.native
  /**
    * Reset sections in the data grid to their base size.
    *
    * @param area - The grid area for the sections of interest.
    */
  @JSName("resetSections")
  def resetSections_row(area: row): Unit = js.native
  @JSName("resetSections")
  def resetSections_rowheader(area: `row-header`): Unit = js.native
  @JSName("resizeSection")
  def resizeSection_column(area: column, index: Double, size: Double): Unit = js.native
  @JSName("resizeSection")
  def resizeSection_columnheader(area: `column-header`, index: Double, size: Double): Unit = js.native
  /**
    * Resize a section in the data grid.
    *
    * @param area - The grid area for the section of interest.
    *
    * @param index - The index of the section of interest.
    *
    * @param size - The new size for the section.
    *
    * #### Notes
    * This is a no-op if `index` is invalid.
    */
  @JSName("resizeSection")
  def resizeSection_row(area: row, index: Double, size: Double): Unit = js.native
  @JSName("resizeSection")
  def resizeSection_rowheader(area: `row-header`, index: Double, size: Double): Unit = js.native
  /**
    * Scroll the viewport by the specified delta.
    *
    * @param dx - The scroll X delta, in pixels.
    *
    * @param dy - The scroll Y delta, in pixels.
    */
  def scrollBy(dx: Double, dy: Double): Unit = js.native
  @JSName("scrollByPage")
  def scrollByPage_down(dir: down): Unit = js.native
  @JSName("scrollByPage")
  def scrollByPage_left(dir: left): Unit = js.native
  @JSName("scrollByPage")
  def scrollByPage_right(dir: right): Unit = js.native
  /**
    * Scroll the viewport by one page.
    *
    * @param - The desired direction of the scroll.
    */
  @JSName("scrollByPage")
  def scrollByPage_up(dir: up): Unit = js.native
  @JSName("scrollByStep")
  def scrollByStep_down(dir: down): Unit = js.native
  @JSName("scrollByStep")
  def scrollByStep_left(dir: left): Unit = js.native
  @JSName("scrollByStep")
  def scrollByStep_right(dir: right): Unit = js.native
  /**
    * Scroll the viewport by one cell-aligned step.
    *
    * @param - The desired direction of the scroll.
    */
  @JSName("scrollByStep")
  def scrollByStep_up(dir: up): Unit = js.native
  /**
    * Scroll to the specified offset position.
    *
    * @param x - The scroll X offset, in pixels.
    *
    * @param y - The scroll Y offset, in pixels.
    *
    * #### Notes
    * The scroll position will be clamped to the allowable range.
    *
    * Fractional values will be rounded to the nearest integer.
    */
  def scrollTo(x: Double, y: Double): Unit = js.native
  @JSName("sectionSize")
  def sectionSize_column(area: column, index: Double): Double = js.native
  @JSName("sectionSize")
  def sectionSize_columnheader(area: `column-header`, index: Double): Double = js.native
  /**
    * Get the size of a section in the data grid.
    *
    * @param area - The grid area for the section of interest.
    *
    * @param index - The index of the section of interest.
    *
    * @return The size of the section, or `-1` if `index` is invalid.
    */
  @JSName("sectionSize")
  def sectionSize_row(area: row, index: Double): Double = js.native
  @JSName("sectionSize")
  def sectionSize_rowheader(area: `row-header`, index: Double): Double = js.native
}

