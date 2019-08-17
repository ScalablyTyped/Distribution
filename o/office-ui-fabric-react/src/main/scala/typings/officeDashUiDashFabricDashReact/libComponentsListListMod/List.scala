package typings.officeDashUiDashFabricDashReact.libComponentsListListMod

import typings.officeDashUiDashFabricDashReact.Anon_ContainsFocus
import typings.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod.IList
import typings.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod.IListProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/List/List", "List")
@js.native
class List[T] protected ()
  extends Component[IListProps[T], IListState[T], js.Any]
     with IList {
  def this(props: IListProps[T]) = this()
  var _allowedRect: js.Any = js.native
  var _async: js.Any = js.native
  /** Build up the pages that should be rendered. */
  var _buildPages: js.Any = js.native
  var _cachedPageHeights: js.Any = js.native
  var _createPage: js.Any = js.native
  var _estimatedPageHeight: js.Any = js.native
  var _events: js.Any = js.native
  var _focusedIndex: js.Any = js.native
  var _getItemCountForPage: js.Any = js.native
  /**
    * Get the pixel height of a give page. Will use the props getPageHeight first, and if not provided, fallback to
    * cached height, or estimated page height, or default page height.
    */
  var _getPageHeight: js.Any = js.native
  var _getPageSpecification: js.Any = js.native
  /** Generate the style object for the page. */
  var _getPageStyle: js.Any = js.native
  var _getRenderCount: js.Any = js.native
  var _hasCompletedFirstRender: js.Any = js.native
  /**
    * when props.items change or forceUpdate called, throw away cached pages
    */
  var _invalidatePageCache: js.Any = js.native
  var _materializedRect: js.Any = js.native
  /**
    * Given a page, measure its dimensions, update cache.
    * @returns True if the height has changed.
    */
  var _measurePage: js.Any = js.native
  var _measureVersion: js.Any = js.native
  /**
    * Notify consumers that the rendered pages have changed
    * @param oldPages - The old pages
    * @param newPages - The new pages
    * @param props - The props to use
    */
  var _notifyPageChanges: js.Any = js.native
  /**
    * This is an async debounced method that will try and increment the windows we render. If we can increment
    * either, we increase the amount we render and re-evaluate.
    */
  var _onAsyncIdle: js.Any = js.native
  var _onAsyncResize: js.Any = js.native
  /**
    * Debounced method to asynchronously update the visible region on a scroll event.
    */
  var _onAsyncScroll: js.Any = js.native
  /** Track the last item index focused so that we ensure we keep it rendered. */
  var _onFocus: js.Any = js.native
  /** Called when a page has been added to the DOM. */
  var _onPageAdded: js.Any = js.native
  /** Called when a page has been removed from the DOM. */
  var _onPageRemoved: js.Any = js.native
  var _onRenderPage: js.Any = js.native
  /**
    * Called synchronously to reset the required render range to 0 on scrolling. After async scroll has executed,
    * we will call onAsyncIdle which will reset it back to it's correct value.
    */
  var _onScroll: js.Any = js.native
  /**
    * Function to call when the list is done scrolling.
    * This function is debounced.
    */
  var _onScrollingDone: js.Any = js.native
  var _pageCache: js.Any = js.native
  var _renderPage: js.Any = js.native
  var _requiredRect: js.Any = js.native
  var _requiredWindowsAhead: js.Any = js.native
  var _requiredWindowsBehind: js.Any = js.native
  var _resetRequiredWindows: js.Any = js.native
  var _root: js.Any = js.native
  var _scrollElement: js.Any = js.native
  var _scrollHeight: js.Any = js.native
  var _scrollTop: js.Any = js.native
  var _shouldVirtualize: js.Any = js.native
  var _surface: js.Any = js.native
  var _surfaceRect: js.Any = js.native
  var _totalEstimates: js.Any = js.native
  var _updatePageMeasurements: js.Any = js.native
  var _updatePages: js.Any = js.native
  /** Calculate the visible rect within the list where top: 0 and left: 0 is the top/left of the list. */
  var _updateRenderRects: js.Any = js.native
  var _visibleRect: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MList(newProps: IListProps[T]): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MList(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MList(): Unit = js.native
  /* InferMemberOverrides */
  override def forceUpdate(): Unit = js.native
  def getStartItemIndexInView(measureItem: js.Function1[/* itemIndex */ Double, Double]): Double = js.native
  /**
    * Get the current height the list and it's pages.
    */
  @JSName("getTotalListHeight")
  def getTotalListHeight_MList(): Double = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MList(newProps: IListProps[T], newState: IListState[T]): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/List/List", "List")
@js.native
object List extends js.Object {
  var defaultProps: Anon_ContainsFocus = js.native
}

