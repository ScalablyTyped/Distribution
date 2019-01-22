package typings
package officeDashUiDashFabricDashReactLib.libComponentsListListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/List/List", "List")
@js.native
class List protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps, 
      IListState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IList {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps) = this()
  var _allowedRect: js.Any = js.native
  var _cachedPageHeights: js.Any = js.native
  var _estimatedPageHeight: js.Any = js.native
  var _focusedIndex: js.Any = js.native
  var _hasCompletedFirstRender: js.Any = js.native
  var _materializedRect: js.Any = js.native
  var _measureVersion: js.Any = js.native
  var _onRenderPage: js.Any = js.native
  var _pageCache: js.Any = js.native
  var _pageRefs: js.Any = js.native
  var _requiredRect: js.Any = js.native
  var _requiredWindowsAhead: js.Any = js.native
  var _requiredWindowsBehind: js.Any = js.native
  var _root: js.Any = js.native
  var _scrollElement: js.Any = js.native
  var _scrollHeight: js.Any = js.native
  var _scrollTop: js.Any = js.native
  var _surface: js.Any = js.native
  var _surfaceRect: js.Any = js.native
  var _totalEstimates: js.Any = js.native
  /** Build up the pages that should be rendered. */
  /* private */ def _buildPages(props: js.Any): js.Any = js.native
  /* private */ def _createPage(pageKey: js.Any, items: js.Any): js.Any = js.native
  /* private */ def _createPage(pageKey: js.Any, items: js.Any, startIndex: js.Any): js.Any = js.native
  /* private */ def _createPage(pageKey: js.Any, items: js.Any, startIndex: js.Any, count: js.Any): js.Any = js.native
  /* private */ def _createPage(pageKey: js.Any, items: js.Any, startIndex: js.Any, count: js.Any, style: js.Any): js.Any = js.native
  /* private */ def _createPage(pageKey: js.Any, items: js.Any, startIndex: js.Any, count: js.Any, style: js.Any, data: js.Any): js.Any = js.native
  /* private */ def _createPage(
    pageKey: js.Any,
    items: js.Any,
    startIndex: js.Any,
    count: js.Any,
    style: js.Any,
    data: js.Any,
    isSpacer: js.Any
  ): js.Any = js.native
  /* private */ def _getItemCountForPage(itemIndex: js.Any, visibileRect: js.Any): js.Any = js.native
  /**
    * Get the pixel height of a give page. Will use the props getPageHeight first, and if not provided, fallback to
    * cached height, or estimated page height, or default page height.
    */
  /* private */ def _getPageHeight(itemIndex: js.Any, itemsPerPage: js.Any, visibleRect: js.Any): js.Any = js.native
  /* private */ def _getPageSpecification(itemIndex: js.Any, visibleRect: js.Any): js.Any = js.native
  /** Generate the style object for the page. */
  /* private */ def _getPageStyle(page: js.Any): js.Any = js.native
  /* private */ def _getRenderCount(): js.Any = js.native
  /* private */ def _getRenderCount(props: js.Any): js.Any = js.native
  /**
    * when props.items change or forceUpdate called, throw away cached pages
    */
  /* private */ def _invalidatePageCache(): js.Any = js.native
  /**
    * Given a page, measure its dimensions, update cache.
    * @returns True if the height has changed.
    */
  /* private */ def _measurePage(page: js.Any): js.Any = js.native
  /**
    * Notify consumers that the rendered pages have changed
    * @param oldPages - The old pages
    * @param newPages - The new pages
    * @param props - The props to use
    */
  /* private */ def _notifyPageChanges(oldPages: js.Any, newPages: js.Any): js.Any = js.native
  /* private */ def _notifyPageChanges(oldPages: js.Any, newPages: js.Any, props: js.Any): js.Any = js.native
  /**
    * This is an async debounced method that will try and increment the windows we render. If we can increment
    * either, we increase the amount we render and re-evaluate.
    */
  /* private */ def _onAsyncIdle(): js.Any = js.native
  /* private */ def _onAsyncResize(): js.Any = js.native
  /**
    * Debounced method to asynchronously update the visible region on a scroll event.
    */
  /* private */ def _onAsyncScroll(): js.Any = js.native
  /** Track the last item index focused so that we ensure we keep it rendered. */
  /* private */ def _onFocus(ev: js.Any): js.Any = js.native
  /** Called when a page has been added to the DOM. */
  /* private */ def _onPageAdded(page: js.Any): js.Any = js.native
  /** Called when a page has been removed from the DOM. */
  /* private */ def _onPageRemoved(page: js.Any): js.Any = js.native
  /**
    * Called synchronously to reset the required render range to 0 on scrolling. After async scroll has executed,
    * we will call onAsyncIdle which will reset it back to it's correct value.
    */
  /* private */ def _onScroll(): js.Any = js.native
  /**
    * Function to call when the list is done scrolling.
    * This function is debounced.
    */
  /* private */ def _onScrollingDone(): js.Any = js.native
  /* private */ def _renderPage(page: js.Any): js.Any = js.native
  /* private */ def _resetRequiredWindows(): js.Any = js.native
  /* private */ def _shouldVirtualize(): js.Any = js.native
  /* private */ def _shouldVirtualize(props: js.Any): js.Any = js.native
  /* private */ def _updatePageMeasurements(pages: js.Any): js.Any = js.native
  /* private */ def _updatePages(): js.Any = js.native
  /* private */ def _updatePages(props: js.Any): js.Any = js.native
  /** Calculate the visible rect within the list where top: 0 and left: 0 is the top/left of the list. */
  /* private */ def _updateRenderRects(): js.Any = js.native
  /* private */ def _updateRenderRects(props: js.Any): js.Any = js.native
  /* private */ def _updateRenderRects(props: js.Any, forceUpdate: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MList(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MList(newProps: officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps): scala.Unit = js.native
  /**
    * Force the component to update.
    */
  /* InferMemberOverrides */
  override def forceUpdate(): scala.Unit = js.native
  def getStartItemIndexInView(measureItem: js.Function1[/* itemIndex */ scala.Double, scala.Double]): scala.Double = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MList(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps,
    newState: IListState
  ): scala.Boolean = js.native
}

@JSImport("office-ui-fabric-react/lib/components/List/List", "List")
@js.native
object List extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_ContainsFocus = js.native
}

