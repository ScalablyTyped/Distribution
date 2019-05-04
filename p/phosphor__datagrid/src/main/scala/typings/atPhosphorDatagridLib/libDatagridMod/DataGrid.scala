package typings
package atPhosphorDatagridLib.libDatagridMod

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
class DataGrid ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  def this(options: atPhosphorDatagridLib.libDatagridMod.DataGridNs.IOptions) = this()
  var _buffer: js.Any = js.native
  var _bufferGC: js.Any = js.native
  var _canvas: js.Any = js.native
  var _canvasGC: js.Any = js.native
  var _cellRenderers: js.Any = js.native
  var _columnHeaderSections: js.Any = js.native
  var _columnSections: js.Any = js.native
  var _defaultRenderer: js.Any = js.native
  var _dpiRatio: js.Any = js.native
  var _hScrollBar: js.Any = js.native
  var _hScrollBarMinHeight: js.Any = js.native
  var _headerVisibility: js.Any = js.native
  var _inPaint: js.Any = js.native
  var _model: js.Any = js.native
  var _paintPending: js.Any = js.native
  var _pressData: js.Any = js.native
  var _rowHeaderSections: js.Any = js.native
  var _rowSections: js.Any = js.native
  var _scrollCorner: js.Any = js.native
  var _scrollX: js.Any = js.native
  var _scrollY: js.Any = js.native
  var _style: js.Any = js.native
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
  var baseColumnHeaderSize: scala.Double = js.native
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
  var baseColumnSize: scala.Double = js.native
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
  var baseRowHeaderSize: scala.Double = js.native
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
  var baseRowSize: scala.Double = js.native
  /**
    * The virtual height of the grid body.
    *
    * #### Notes
    * This value does not include the height of the column headers.
    */
  val bodyHeight: scala.Double = js.native
  /**
    * The virtual width of the grid body.
    *
    * #### Notes
    * This value does not include the width of the row headers.
    */
  val bodyWidth: scala.Double = js.native
  /**
    * Get the cell renderer map for the data grid.
    */
  /**
    * Set the cell renderer map for the data grid.
    */
  var cellRenderers: atPhosphorDatagridLib.libRenderermapMod.RendererMap = js.native
  /**
    * Get the default cell renderer for the data grid.
    */
  /**
    * Set the default cell renderer for the data grid.
    */
  var defaultRenderer: atPhosphorDatagridLib.libCellrendererMod.CellRenderer = js.native
  /**
    * The virtual height of the column headers.
    *
    * #### Notes
    * This will be `0` if the column headers are hidden.
    */
  val headerHeight: scala.Double = js.native
  /**
    * Get the header visibility for the data grid.
    */
  /**
    * Set the header visibility for the data grid.
    */
  var headerVisibility: atPhosphorDatagridLib.libDatagridMod.DataGridNs.HeaderVisibility = js.native
  /**
    * The virtual width of the row headers.
    *
    * #### Notes
    * This will be `0` if the row headers are hidden.
    */
  val headerWidth: scala.Double = js.native
  /**
    * The maximum scroll X position for the current grid dimensions.
    *
    * #### Notes
    * This value is `1px` less than the theoretical maximum to allow the
    * the right-most grid line to be clipped when the vertical scroll bar
    * is visible.
    */
  val maxScrollX: scala.Double = js.native
  /**
    * The maximum scroll Y position for the current grid dimensions.
    *
    * #### Notes
    * This value is `1px` less than the theoretical maximum to allow the
    * the bottom-most grid line to be clipped when the horizontal scroll
    * bar is visible.
    */
  val maxScrollY: scala.Double = js.native
  /**
    * Get the data model for the data grid.
    */
  /**
    * Set the data model for the data grid.
    */
  var model: atPhosphorDatagridLib.libDatamodelMod.DataModel | scala.Null = js.native
  /**
    * The height of the visible portion of the body cells.
    *
    * #### Notes
    * This value does not include the height of the column headers.
    */
  val pageHeight: scala.Double = js.native
  /**
    * The width of the visible portion of the body cells.
    *
    * #### Notes
    * This value does not include the width of the row headers.
    */
  val pageWidth: scala.Double = js.native
  /**
    * The scroll X offset of the viewport.
    */
  val scrollX: scala.Double = js.native
  /**
    * The scroll Y offset of the viewport.
    */
  val scrollY: scala.Double = js.native
  /**
    * Get the style for the data grid.
    */
  /**
    * Set the style for the data grid.
    */
  var style: atPhosphorDatagridLib.libDatagridMod.DataGridNs.IStyle = js.native
  /**
    * The total virtual height of the grid.
    *
    * #### Notes
    * If the grid widget is sized larger than this height, a vertical
    * scroll bar will not be shown.
    */
  val totalHeight: scala.Double = js.native
  /**
    * The total virtual width of the grid.
    *
    * #### Notes
    * If the grid widget is sized larger than this width, a horizontal
    * scroll bar will not be shown.
    */
  val totalWidth: scala.Double = js.native
  /**
    * The height of the visible portion of the data grid.
    *
    * #### Notes
    * This value does not include the height of the scroll bar.
    */
  val viewportHeight: scala.Double = js.native
  /**
    * The width of the visible portion of the data grid.
    *
    * #### Notes
    * This value does not include the width of the scroll bar.
    */
  val viewportWidth: scala.Double = js.native
  /**
    * Blit content into the on-screen canvas.
    *
    * The rect should be expressed in viewport coordinates.
    *
    * This automatically accounts for the dpi ratio.
    */
  /* private */ def _blit(source: js.Any, x: js.Any, y: js.Any, w: js.Any, h: js.Any, dx: js.Any, dy: js.Any): js.Any = js.native
  /**
    * Draw the grid content for the given dirty rect.
    *
    * This method dispatches to the relevant `_draw*` methods.
    */
  /* private */ def _draw(rx: js.Any, ry: js.Any, rw: js.Any, rh: js.Any): js.Any = js.native
  /**
    * Draw the background for the given paint region.
    */
  /* private */ def _drawBackground(rgn: js.Any, color: js.Any): js.Any = js.native
  /**
    * Draw the body region which intersects the dirty rect.
    */
  /* private */ def _drawBodyRegion(rx: js.Any, ry: js.Any, rw: js.Any, rh: js.Any): js.Any = js.native
  /**
    * Draw the cells for the given paint region.
    */
  /* private */ def _drawCells(rgn: js.Any): js.Any = js.native
  /**
    * Draw the column background for the given paint region.
    */
  /* private */ def _drawColumnBackground(rgn: js.Any, colorFn: js.Any): js.Any = js.native
  /**
    * Draw the column header region which intersects the dirty rect.
    */
  /* private */ def _drawColumnHeaderRegion(rx: js.Any, ry: js.Any, rw: js.Any, rh: js.Any): js.Any = js.native
  /**
    * Draw the corner header region which intersects the dirty rect.
    */
  /* private */ def _drawCornerHeaderRegion(rx: js.Any, ry: js.Any, rw: js.Any, rh: js.Any): js.Any = js.native
  /**
    * Draw the horizontal grid lines for the given paint region.
    */
  /* private */ def _drawHorizontalGridLines(rgn: js.Any, color: js.Any): js.Any = js.native
  /**
    * Draw the row background for the given paint region.
    */
  /* private */ def _drawRowBackground(rgn: js.Any, colorFn: js.Any): js.Any = js.native
  /**
    * Draw the row header region which intersects the dirty rect.
    */
  /* private */ def _drawRowHeaderRegion(rx: js.Any, ry: js.Any, rw: js.Any, rh: js.Any): js.Any = js.native
  /**
    * Draw the vertical grid lines for the given paint region.
    */
  /* private */ def _drawVerticalGridLines(rgn: js.Any, color: js.Any): js.Any = js.native
  /**
    * Draw the void region for the dirty rect.
    */
  /* private */ def _drawVoidRegion(rx: js.Any, ry: js.Any, rw: js.Any, rh: js.Any): js.Any = js.native
  /**
    * Handle the `'keydown'` event for the data grid.
    */
  /* private */ def _evtKeyDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the data grid.
    */
  /* private */ def _evtMouseDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `mousemove` event for the data grid.
    */
  /* private */ def _evtMouseMove(event: js.Any): js.Any = js.native
  /**
    * Handle the `mouseup` event for the data grid.
    */
  /* private */ def _evtMouseUp(event: js.Any): js.Any = js.native
  /**
    * Handle the `'wheel'` event for the data grid.
    */
  /* private */ def _evtWheel(event: js.Any): js.Any = js.native
  /**
    * Get the section list for the specified grid area.
    */
  /* private */ def _getSectionList(area: js.Any): js.Any = js.native
  /**
    * Hit test the grid headers for a resize handle.
    */
  /* private */ def _hitTestResizeHandles(clientX: js.Any, clientY: js.Any): js.Any = js.native
  /**
    * Handle cells changing in the data model.
    */
  /* private */ def _onCellsChanged(args: js.Any): js.Any = js.native
  /**
    * A signal handler for the data model `changed` signal.
    */
  /* private */ def _onModelChanged(sender: js.Any, args: js.Any): js.Any = js.native
  /**
    * Handle a full data model reset.
    */
  /* private */ def _onModelReset(args: js.Any): js.Any = js.native
  /**
    * Handle the `pageRequested` signal from a scroll bar.
    */
  /* private */ def _onPageRequested(sender: js.Any, dir: js.Any): js.Any = js.native
  /**
    * A signal handler for the renderer map `changed` signal.
    */
  /* private */ def _onRenderersChanged(): js.Any = js.native
  /**
    * Handle sections changing in the data model.
    */
  /* private */ def _onSectionsChanged(args: js.Any): js.Any = js.native
  /**
    * Handle sections moving in the data model.
    */
  /* private */ def _onSectionsMoved(args: js.Any): js.Any = js.native
  /**
    * Handle the `stepRequested` signal from a scroll bar.
    */
  /* private */ def _onStepRequested(sender: js.Any, dir: js.Any): js.Any = js.native
  /**
    * Handle the `thumbMoved` signal from a scroll bar.
    */
  /* private */ def _onThumbMoved(sender: js.Any): js.Any = js.native
  /**
    * A message hook invoked on a viewport `'paint-request'` message.
    */
  /* private */ def _onViewportPaintRequest(msg: js.Any): js.Any = js.native
  /**
    * A message hook invoked on a viewport `'resize'` message.
    */
  /* private */ def _onViewportResize(msg: js.Any): js.Any = js.native
  /**
    * A message hook invoked on a viewport `'scroll-request'` message.
    */
  /* private */ def _onViewportScrollRequest(msg: js.Any): js.Any = js.native
  /**
    * A message hook invoked on a `'section-resize-request'` message.
    */
  /* private */ def _onViewportSectionResizeRequest(msg: js.Any): js.Any = js.native
  /**
    * Paint the grid content for the given dirty rect.
    *
    * The rect should be expressed in viewport coordinates.
    *
    * This is the primary paint entry point. The individual `_draw*`
    * methods should not be invoked directly. This method dispatches
    * to the drawing methods in the correct order.
    */
  /* private */ def _paint(rx: js.Any, ry: js.Any, rw: js.Any, rh: js.Any): js.Any = js.native
  /**
    * Process a message sent to the viewport
    */
  /* private */ def _processViewportMessage(msg: js.Any): js.Any = js.native
  /**
    * Refresh the internal dpi ratio.
    *
    * This will update the canvas size and schedule a repaint if needed.
    */
  /* private */ def _refreshDPI(): js.Any = js.native
  /**
    * Release the mouse grab for the data grid.
    */
  /* private */ def _releaseMouse(): js.Any = js.native
  /**
    * Ensure the canvas is at least the specified size.
    *
    * This method will retain the valid canvas content.
    */
  /* private */ def _resizeCanvasIfNeeded(width: js.Any, height: js.Any): js.Any = js.native
  /**
    * Resize a section in the given section list.
    *
    * #### Notes
    * This will update the scroll bars and repaint as needed.
    */
  /* private */ def _resizeSection(list: js.Any, index: js.Any, size: js.Any): js.Any = js.native
  /**
    * Set the base size for the given section list.
    *
    * #### Notes
    * This will update the scroll bars and repaint as needed.
    */
  /* private */ def _setBaseSize(list: js.Any, size: js.Any): js.Any = js.native
  /**
    * Sync the scroll bars and scroll state with the viewport.
    *
    * #### Notes
    * If the visibility of either scroll bar changes, a synchronous
    * fit-request will be dispatched to the data grid to immediately
    * resize the viewport.
    */
  /* private */ def _syncScrollState(): js.Any = js.native
  /**
    * Sync the viewport to the given scroll position.
    *
    * #### Notes
    * This schedules a full repaint and syncs the scroll state.
    */
  /* private */ def _syncViewport(): js.Any = js.native
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
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
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
  def messageHook(
    handler: atPhosphorMessagingLib.atPhosphorMessagingMod.IMessageHandler,
    msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message
  ): scala.Boolean = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    */
  /* protected */ def onResize(msg: atPhosphorWidgetsLib.atPhosphorWidgetsMod.WidgetNs.ResizeMessage): scala.Unit = js.native
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
  def repaint(): scala.Unit = js.native
  def repaint(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  @JSName("resetSections")
  def resetSections_column(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.column): scala.Unit = js.native
  @JSName("resetSections")
  def `resetSections_column-header`(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`column-header`): scala.Unit = js.native
  /**
    * Reset sections in the data grid to their base size.
    *
    * @param area - The grid area for the sections of interest.
    */
  @JSName("resetSections")
  def resetSections_row(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.row): scala.Unit = js.native
  @JSName("resetSections")
  def `resetSections_row-header`(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`row-header`): scala.Unit = js.native
  @JSName("resizeSection")
  def resizeSection_column(
    area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.column,
    index: scala.Double,
    size: scala.Double
  ): scala.Unit = js.native
  @JSName("resizeSection")
  def `resizeSection_column-header`(
    area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`column-header`,
    index: scala.Double,
    size: scala.Double
  ): scala.Unit = js.native
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
  def resizeSection_row(
    area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.row,
    index: scala.Double,
    size: scala.Double
  ): scala.Unit = js.native
  @JSName("resizeSection")
  def `resizeSection_row-header`(
    area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`row-header`,
    index: scala.Double,
    size: scala.Double
  ): scala.Unit = js.native
  /**
    * Scroll the viewport by the specified delta.
    *
    * @param dx - The scroll X delta, in pixels.
    *
    * @param dy - The scroll Y delta, in pixels.
    */
  def scrollBy(dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  @JSName("scrollByPage")
  def scrollByPage_down(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.down): scala.Unit = js.native
  @JSName("scrollByPage")
  def scrollByPage_left(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.left): scala.Unit = js.native
  @JSName("scrollByPage")
  def scrollByPage_right(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.right): scala.Unit = js.native
  /**
    * Scroll the viewport by one page.
    *
    * @param - The desired direction of the scroll.
    */
  @JSName("scrollByPage")
  def scrollByPage_up(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.up): scala.Unit = js.native
  @JSName("scrollByStep")
  def scrollByStep_down(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.down): scala.Unit = js.native
  @JSName("scrollByStep")
  def scrollByStep_left(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.left): scala.Unit = js.native
  @JSName("scrollByStep")
  def scrollByStep_right(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.right): scala.Unit = js.native
  /**
    * Scroll the viewport by one cell-aligned step.
    *
    * @param - The desired direction of the scroll.
    */
  @JSName("scrollByStep")
  def scrollByStep_up(dir: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.up): scala.Unit = js.native
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
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  @JSName("sectionSize")
  def sectionSize_column(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.column, index: scala.Double): scala.Double = js.native
  @JSName("sectionSize")
  def `sectionSize_column-header`(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`column-header`, index: scala.Double): scala.Double = js.native
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
  def sectionSize_row(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.row, index: scala.Double): scala.Double = js.native
  @JSName("sectionSize")
  def `sectionSize_row-header`(area: atPhosphorDatagridLib.atPhosphorDatagridLibStrings.`row-header`, index: scala.Double): scala.Double = js.native
}

