package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.OnRenderCell
import typings.officeUiFabricReact.listTypesMod.IList
import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.officeUiFabricReact.listTypesMod.IPage
import typings.react.mod.Component
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/List/List", "List")
  @js.native
  class List[T] protected ()
    extends Component[IListProps[T], IListState[T], js.Any]
       with IList {
    def this(props: IListProps[T]) = this()
    
    /* private */ var _allowedRect: js.Any = js.native
    
    /* private */ var _async: js.Any = js.native
    
    /** Build up the pages that should be rendered. */
    /* private */ var _buildPages: js.Any = js.native
    
    /* private */ var _cachedPageHeights: js.Any = js.native
    
    /* private */ var _createPage: js.Any = js.native
    
    /* private */ var _estimatedPageHeight: js.Any = js.native
    
    /* private */ var _events: js.Any = js.native
    
    /* private */ var _focusedIndex: js.Any = js.native
    
    /* private */ var _getDerivedStateFromProps: js.Any = js.native
    
    /* private */ var _getItemCountForPage: js.Any = js.native
    
    /**
      * Get the pixel height of a give page. Will use the props getPageHeight first, and if not provided, fallback to
      * cached height, or estimated page height, or default page height.
      */
    /* private */ var _getPageHeight: js.Any = js.native
    
    /* private */ var _getPageSpecification: js.Any = js.native
    
    /** Generate the style object for the page. */
    /* private */ var _getPageStyle: js.Any = js.native
    
    /* private */ var _getRenderCount: js.Any = js.native
    
    /* private */ var _hasCompletedFirstRender: js.Any = js.native
    
    /**
      * when props.items change or forceUpdate called, throw away cached pages
      */
    /* private */ var _invalidatePageCache: js.Any = js.native
    
    /* private */ var _materializedRect: js.Any = js.native
    
    /**
      * Given a page, measure its dimensions, update cache.
      * @returns True if the height has changed.
      */
    /* private */ var _measurePage: js.Any = js.native
    
    /* private */ var _measureVersion: js.Any = js.native
    
    /**
      * Notify consumers that the rendered pages have changed
      * @param oldPages - The old pages
      * @param newPages - The new pages
      * @param props - The props to use
      */
    /* private */ var _notifyPageChanges: js.Any = js.native
    
    /**
      * This is an async debounced method that will try and increment the windows we render. If we can increment
      * either, we increase the amount we render and re-evaluate.
      */
    /* private */ var _onAsyncIdle: js.Any = js.native
    
    /* private */ var _onAsyncResize: js.Any = js.native
    
    /**
      * Debounced method to asynchronously update the visible region on a scroll event.
      */
    /* private */ var _onAsyncScroll: js.Any = js.native
    
    /** Track the last item index focused so that we ensure we keep it rendered. */
    /* private */ var _onFocus: js.Any = js.native
    
    /** Called when a page has been added to the DOM. */
    /* private */ var _onPageAdded: js.Any = js.native
    
    /** Called when a page has been removed from the DOM. */
    /* private */ var _onPageRemoved: js.Any = js.native
    
    /* private */ var _onRenderPage: js.Any = js.native
    
    /* private */ var _onRenderRoot: js.Any = js.native
    
    /* private */ var _onRenderSurface: js.Any = js.native
    
    /**
      * Called synchronously to reset the required render range to 0 on scrolling. After async scroll has executed,
      * we will call onAsyncIdle which will reset it back to it's correct value.
      */
    /* private */ var _onScroll: js.Any = js.native
    
    /**
      * Function to call when the list is done scrolling.
      * This function is debounced.
      */
    /* private */ var _onScrollingDone: js.Any = js.native
    
    /* private */ var _pageCache: js.Any = js.native
    
    /* private */ var _pageRefs: js.Any = js.native
    
    /* private */ var _renderPage: js.Any = js.native
    
    /* private */ var _requiredRect: js.Any = js.native
    
    /* private */ var _requiredWindowsAhead: js.Any = js.native
    
    /* private */ var _requiredWindowsBehind: js.Any = js.native
    
    /* private */ var _resetRequiredWindows: js.Any = js.native
    
    /* private */ var _root: js.Any = js.native
    
    /* private */ var _scrollElement: js.Any = js.native
    
    /* private */ var _scrollHeight: js.Any = js.native
    
    /* private */ var _scrollTop: js.Any = js.native
    
    /* private */ var _shouldVirtualize: js.Any = js.native
    
    /* private */ var _surface: js.Any = js.native
    
    /* private */ var _surfaceRect: js.Any = js.native
    
    /* private */ var _totalEstimates: js.Any = js.native
    
    /* private */ var _updatePageMeasurements: js.Any = js.native
    
    /* private */ var _updatePages: js.Any = js.native
    
    /** Calculate the visible rect within the list where top: 0 and left: 0 is the top/left of the list. */
    /* private */ var _updateRenderRects: js.Any = js.native
    
    /* private */ var _visibleRect: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MList(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MList(previousProps: IListProps[js.Any], previousState: IListState[T]): Unit = js.native
    
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
    
    val pageRefs: Record[String, js.Any] = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MList(newProps: IListProps[T], newState: IListState[T]): Boolean = js.native
  }
  /* static members */
  object List {
    
    @JSImport("office-ui-fabric-react/lib/components/List/List", "List")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/List/List", "List.defaultProps")
    @js.native
    def defaultProps: OnRenderCell = js.native
    inline def defaultProps_=(x: OnRenderCell): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps[T](nextProps: IListProps[T], previousState: IListState[T]): IListState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IListState[T]]
  }
  
  trait IListState[T] extends StObject {
    
    def getDerivedStateFromProps(nextProps: IListProps[T], previousState: IListState[T]): IListState[T]
    
    var isScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** The last versionstamp for  */
    var measureVersion: js.UndefOr[Double] = js.undefined
    
    var pages: js.UndefOr[js.Array[IPage[T]]] = js.undefined
    
    var pagesVersion: js.UndefOr[js.Object] = js.undefined
  }
  object IListState {
    
    inline def apply[T](getDerivedStateFromProps: (IListProps[T], IListState[T]) => IListState[T]): IListState[T] = {
      val __obj = js.Dynamic.literal(getDerivedStateFromProps = js.Any.fromFunction2(getDerivedStateFromProps))
      __obj.asInstanceOf[IListState[T]]
    }
    
    extension [Self <: IListState[?], T](x: Self & IListState[T]) {
      
      inline def setGetDerivedStateFromProps(value: (IListProps[T], IListState[T]) => IListState[T]): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      inline def setIsScrollingUndefined: Self = StObject.set(x, "isScrolling", js.undefined)
      
      inline def setMeasureVersion(value: Double): Self = StObject.set(x, "measureVersion", value.asInstanceOf[js.Any])
      
      inline def setMeasureVersionUndefined: Self = StObject.set(x, "measureVersion", js.undefined)
      
      inline def setPages(value: js.Array[IPage[T]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: IPage[T]*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      inline def setPagesVersion(value: js.Object): Self = StObject.set(x, "pagesVersion", value.asInstanceOf[js.Any])
      
      inline def setPagesVersionUndefined: Self = StObject.set(x, "pagesVersion", js.undefined)
    }
  }
}
