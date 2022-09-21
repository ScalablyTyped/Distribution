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
  open class List[T] protected ()
    extends Component[IListProps[T], IListState[T], Any]
       with IList {
    def this(props: IListProps[T]) = this()
    
    /* private */ var _allowedRect: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /** Build up the pages that should be rendered. */
    /* private */ var _buildPages: Any = js.native
    
    /* private */ var _cachedPageHeights: Any = js.native
    
    /* private */ var _createPage: Any = js.native
    
    /* private */ var _estimatedPageHeight: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _focusedIndex: Any = js.native
    
    /* private */ var _getDerivedStateFromProps: Any = js.native
    
    /* private */ var _getItemCountForPage: Any = js.native
    
    /**
      * Get the pixel height of a give page. Will use the props getPageHeight first, and if not provided, fallback to
      * cached height, or estimated page height, or default page height.
      */
    /* private */ var _getPageHeight: Any = js.native
    
    /* private */ var _getPageSpecification: Any = js.native
    
    /** Generate the style object for the page. */
    /* private */ var _getPageStyle: Any = js.native
    
    /* private */ var _getRenderCount: Any = js.native
    
    /* private */ var _hasCompletedFirstRender: Any = js.native
    
    /**
      * when props.items change or forceUpdate called, throw away cached pages
      */
    /* private */ var _invalidatePageCache: Any = js.native
    
    /* private */ var _materializedRect: Any = js.native
    
    /**
      * Given a page, measure its dimensions, update cache.
      * @returns True if the height has changed.
      */
    /* private */ var _measurePage: Any = js.native
    
    /* private */ var _measureVersion: Any = js.native
    
    /**
      * Notify consumers that the rendered pages have changed
      * @param oldPages - The old pages
      * @param newPages - The new pages
      * @param props - The props to use
      */
    /* private */ var _notifyPageChanges: Any = js.native
    
    /**
      * This is an async debounced method that will try and increment the windows we render. If we can increment
      * either, we increase the amount we render and re-evaluate.
      */
    /* private */ var _onAsyncIdle: Any = js.native
    
    /* private */ var _onAsyncResize: Any = js.native
    
    /**
      * Debounced method to asynchronously update the visible region on a scroll event.
      */
    /* private */ var _onAsyncScroll: Any = js.native
    
    /** Track the last item index focused so that we ensure we keep it rendered. */
    /* private */ var _onFocus: Any = js.native
    
    /** Called when a page has been added to the DOM. */
    /* private */ var _onPageAdded: Any = js.native
    
    /** Called when a page has been removed from the DOM. */
    /* private */ var _onPageRemoved: Any = js.native
    
    /* private */ var _onRenderPage: Any = js.native
    
    /* private */ var _onRenderRoot: Any = js.native
    
    /* private */ var _onRenderSurface: Any = js.native
    
    /**
      * Called synchronously to reset the required render range to 0 on scrolling. After async scroll has executed,
      * we will call onAsyncIdle which will reset it back to it's correct value.
      */
    /* private */ var _onScroll: Any = js.native
    
    /**
      * Function to call when the list is done scrolling.
      * This function is debounced.
      */
    /* private */ var _onScrollingDone: Any = js.native
    
    /* private */ var _pageCache: Any = js.native
    
    /* private */ var _pageRefs: Any = js.native
    
    /* private */ var _renderPage: Any = js.native
    
    /* private */ var _requiredRect: Any = js.native
    
    /* private */ var _requiredWindowsAhead: Any = js.native
    
    /* private */ var _requiredWindowsBehind: Any = js.native
    
    /* private */ var _resetRequiredWindows: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _scrollElement: Any = js.native
    
    /* private */ var _scrollHeight: Any = js.native
    
    /* private */ var _scrollTop: Any = js.native
    
    /* private */ var _shouldVirtualize: Any = js.native
    
    /* private */ var _surface: Any = js.native
    
    /* private */ var _surfaceRect: Any = js.native
    
    /* private */ var _totalEstimates: Any = js.native
    
    /* private */ var _updatePageMeasurements: Any = js.native
    
    /* private */ var _updatePages: Any = js.native
    
    /** Calculate the visible rect within the list where top: 0 and left: 0 is the top/left of the list. */
    /* private */ var _updateRenderRects: Any = js.native
    
    /* private */ var _visibleRect: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MList(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MList(previousProps: IListProps[Any], previousState: IListState[T]): Unit = js.native
    
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
    
    val pageRefs: Record[String, Any] = js.native
    
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
      
      inline def setPagesVarargs(value: IPage[T]*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setPagesVersion(value: js.Object): Self = StObject.set(x, "pagesVersion", value.asInstanceOf[js.Any])
      
      inline def setPagesVersionUndefined: Self = StObject.set(x, "pagesVersion", js.undefined)
    }
  }
}
