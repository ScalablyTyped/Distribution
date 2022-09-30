package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactInts.`0`
import typings.officeUiFabricReact.officeUiFabricReactInts.`1`
import typings.officeUiFabricReact.officeUiFabricReactInts.`2`
import typings.officeUiFabricReact.officeUiFabricReactInts.`3`
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listTypesMod {
  
  /* Inlined {  auto :0,   top :1,   bottom :2,   center :3}[keyof {  auto :0,   top :1,   bottom :2,   center :3}] */
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactInts.`0`
    - typings.officeUiFabricReact.officeUiFabricReactInts.`1`
    - typings.officeUiFabricReact.officeUiFabricReactInts.`2`
    - typings.officeUiFabricReact.officeUiFabricReactInts.`3`
  */
  trait ScrollToMode extends StObject
  object ScrollToMode {
    
    @JSImport("office-ui-fabric-react/lib/components/List/List.types", "ScrollToMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Does not make any consideration to where in the viewport the item should align to.
      */
    @JSImport("office-ui-fabric-react/lib/components/List/List.types", "ScrollToMode.auto")
    @js.native
    def auto: `0` = js.native
    inline def auto_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to scroll the list so the bottom of the desired item is aligned with the bottom of the viewport.
      */
    @JSImport("office-ui-fabric-react/lib/components/List/List.types", "ScrollToMode.bottom")
    @js.native
    def bottom: `2` = js.native
    inline def bottom_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to scroll the list so the desired item is in the exact center of the viewport.
      */
    @JSImport("office-ui-fabric-react/lib/components/List/List.types", "ScrollToMode.center")
    @js.native
    def center: `3` = js.native
    inline def center_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to scroll the list so the top of the desired item is aligned with the top of the viewport.
      */
    @JSImport("office-ui-fabric-react/lib/components/List/List.types", "ScrollToMode.top")
    @js.native
    def top: `1` = js.native
    inline def top_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IList extends StObject {
    
    /**
      * Force the component to update.
      */
    def forceUpdate(): Unit = js.native
    
    /**
      * Get the start index of the page that is currently in view
      */
    def getStartItemIndexInView(): Double = js.native
    
    /**
      * Get the current height the list and it's pages.
      */
    var getTotalListHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    /**
      * Scroll to the given index. By default will bring the page the specified item is on into the view. If a callback
      * to measure the height of an individual item is specified, will only scroll to bring the specific item into view.
      *
      * Note: with items of variable height and no passed in `getPageHeight` method, the list might jump after scrolling
      * when windows before/ahead are being rendered, and the estimated height is replaced using actual elements.
      *
      * @param index - Index of item to scroll to
      * @param measureItem - Optional callback to measure the height of an individual item
      * @param scrollToMode - Optional defines the behavior of the scrolling alignment. Defaults to auto.
      *  Note: The scrollToMode requires the measureItem callback is provided to function.
      */
    def scrollToIndex(index: Double): Unit = js.native
    def scrollToIndex(index: Double, measureItem: js.Function1[/* itemIndex */ Double, Double]): Unit = js.native
    def scrollToIndex(
      index: Double,
      measureItem: js.Function1[/* itemIndex */ Double, Double],
      scrollToMode: ScrollToMode
    ): Unit = js.native
    def scrollToIndex(index: Double, measureItem: Unit, scrollToMode: ScrollToMode): Unit = js.native
  }
  
  trait IListOnRenderRootProps[T] extends StObject {
    
    /**
      * Props to apply to the list root element.
      */
    var divProps: HTMLAttributes[HTMLDivElement]
    
    /**
      * The active pages to be rendered into the list.
      * These will have been rendered using `onRenderPage`.
      */
    var pages: js.Array[IPage[T]]
    
    /**
      * The ref to be applied to the list root.
      * The `List` uses this element to track scroll position and sizing.
      */
    var rootRef: Ref[HTMLDivElement]
    
    /**
      * The content to be rendered as the list surface element.
      * This will have been rendered using `onRenderSurface`.
      */
    var surfaceElement: Element | Null
  }
  object IListOnRenderRootProps {
    
    inline def apply[T](divProps: HTMLAttributes[HTMLDivElement], pages: js.Array[IPage[T]]): IListOnRenderRootProps[T] = {
      val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], rootRef = null, surfaceElement = null)
      __obj.asInstanceOf[IListOnRenderRootProps[T]]
    }
    
    extension [Self <: IListOnRenderRootProps[?], T](x: Self & IListOnRenderRootProps[T]) {
      
      inline def setDivProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "divProps", value.asInstanceOf[js.Any])
      
      inline def setPages(value: js.Array[IPage[T]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: IPage[T]*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setRootRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      inline def setRootRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "rootRef", js.Any.fromFunction1(value))
      
      inline def setRootRefNull: Self = StObject.set(x, "rootRef", null)
      
      inline def setSurfaceElement(value: Element): Self = StObject.set(x, "surfaceElement", value.asInstanceOf[js.Any])
      
      inline def setSurfaceElementNull: Self = StObject.set(x, "surfaceElement", null)
    }
  }
  
  trait IListOnRenderSurfaceProps[T] extends StObject {
    
    /**
      * Props to apply to the list surface element.
      */
    var divProps: HTMLAttributes[HTMLDivElement]
    
    /**
      * The content to be rendered representing all active pages.
      */
    var pageElements: js.Array[Element]
    
    /**
      * The active pages to be rendered into the list.
      * These will have been rendered using `onRenderPage`.
      */
    var pages: js.Array[IPage[T]]
    
    /**
      * A ref to be applied to the surface element.
      * The `List` uses this element to track content size and focus.
      */
    var surfaceRef: Ref[HTMLDivElement]
  }
  object IListOnRenderSurfaceProps {
    
    inline def apply[T](
      divProps: HTMLAttributes[HTMLDivElement],
      pageElements: js.Array[Element],
      pages: js.Array[IPage[T]]
    ): IListOnRenderSurfaceProps[T] = {
      val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pageElements = pageElements.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], surfaceRef = null)
      __obj.asInstanceOf[IListOnRenderSurfaceProps[T]]
    }
    
    extension [Self <: IListOnRenderSurfaceProps[?], T](x: Self & IListOnRenderSurfaceProps[T]) {
      
      inline def setDivProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "divProps", value.asInstanceOf[js.Any])
      
      inline def setPageElements(value: js.Array[Element]): Self = StObject.set(x, "pageElements", value.asInstanceOf[js.Any])
      
      inline def setPageElementsVarargs(value: Element*): Self = StObject.set(x, "pageElements", js.Array(value*))
      
      inline def setPages(value: js.Array[IPage[T]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: IPage[T]*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setSurfaceRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "surfaceRef", value.asInstanceOf[js.Any])
      
      inline def setSurfaceRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "surfaceRef", js.Any.fromFunction1(value))
      
      inline def setSurfaceRefNull: Self = StObject.set(x, "surfaceRef", null)
    }
  }
  
  trait IListProps[T]
    extends StObject
       with HTMLAttributes[typings.officeUiFabricReact.listListMod.List[T] | HTMLDivElement] {
    
    /**
      * Optional callback to access the IList interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IList]] = js.undefined
    
    /**
      * Method called by the list to get how many items to render per page from specified index.
      * In general, use `getPageSpecification` instead.
      */
    var getItemCountForPage: js.UndefOr[
        js.Function2[/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle], Double]
      ] = js.undefined
    
    /** Optional callback to get the item key, to be used on render. */
    var getKey: js.UndefOr[js.Function2[/* item */ T, /* index */ js.UndefOr[Double], String]] = js.undefined
    
    /**
      * Method called by the list to get the pixel height for a given page. By default, we measure the first
      * page's height and default all other pages to that height when calculating the surface space. It is
      * ideal to be able to adequately predict page heights in order to keep the surface space from jumping
      * in pixels, which has been seen to cause browser performance issues.
      * In general, use `getPageSpecification` instead.
      */
    var getPageHeight: js.UndefOr[
        js.Function3[
          /* itemIndex */ js.UndefOr[Double], 
          /* visibleRect */ js.UndefOr[IRectangle], 
          /* itemCount */ js.UndefOr[Double], 
          Double
        ]
      ] = js.undefined
    
    /**
      * Called by the list to get the specification for a page.
      * Use this method to provide an allocation of items per page,
      * as well as an estimated rendered height for the page.
      * The list will use this to optimize virtualization.
      */
    var getPageSpecification: js.UndefOr[
        js.Function2[
          /* itemIndex */ js.UndefOr[Double], 
          /* visibleRect */ js.UndefOr[IRectangle], 
          IPageSpecification
        ]
      ] = js.undefined
    
    /**
      * Method called by the list to derive the page style object. For spacer pages, the list will derive
      * the height and passed in heights will be ignored.
      */
    var getPageStyle: js.UndefOr[js.Function1[/* page */ IPage[T], Any]] = js.undefined
    
    /**
      * Whether to disable scroll state updates. This causes the isScrolling arg in onRenderCell to always be undefined.
      * This is a performance optimization to let List skip a render cycle by not updating its scrolling state.
      */
    var ignoreScrollingState: js.UndefOr[Boolean] = js.undefined
    
    /** Items to render. */
    var items: js.UndefOr[js.Array[T]] = js.undefined
    
    /** Optional callback for monitoring when a page is added. */
    var onPageAdded: js.UndefOr[js.Function1[/* page */ IPage[T], Unit]] = js.undefined
    
    /** Optional callback for monitoring when a page is removed. */
    var onPageRemoved: js.UndefOr[js.Function1[/* page */ IPage[T], Unit]] = js.undefined
    
    /**
      * Optional callback invoked when List rendering completed.
      * This can be on initial mount or on re-render due to scrolling.
      * This method will be called as a result of changes in List pages (added or removed),
      * and after ALL the changes complete.
      * To track individual page Add / Remove use onPageAdded / onPageRemoved instead.
      * @param pages - The current array of pages in the List.
      */
    var onPagesUpdated: js.UndefOr[js.Function1[/* pages */ js.Array[IPage[T]], Unit]] = js.undefined
    
    /**
      * Method to call when trying to render an item.
      * @param item - The data associated with the cell that is being rendered.
      * @param index - The index of the cell being rendered.
      * @param isScrolling - True if the list is being scrolled. May be useful for rendering a placeholder if your cells
      * are complex.
      */
    var onRenderCell: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[T], 
          /* index */ js.UndefOr[Double], 
          /* isScrolling */ js.UndefOr[Boolean], 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      * Called when the List will render a page.
      * Override this to control how cells are rendered within a page.
      */
    var onRenderPage: js.UndefOr[IRenderFunction[IPageProps[T]]] = js.undefined
    
    /**
      * Render override for the element at the root of the `List`.
      * Use this to apply some final attributes or structure to the content
      * each time the list is updated with new active pages or items.
      */
    var onRenderRoot: js.UndefOr[IRenderFunction[IListOnRenderRootProps[T]]] = js.undefined
    
    /**
      * Render override for the element representing the surface of the `List`.
      * Use this to alter the structure of the rendered content if necessary on each update.
      */
    var onRenderSurface: js.UndefOr[IRenderFunction[IListOnRenderSurfaceProps[T]]] = js.undefined
    
    /**
      * Optional callback to determine whether the list should be rendered in full, or virtualized.
      * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
      * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
      * smaller lists.
      * The default implementation will virtualize when this callback is not provided.
      */
    var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[T], Boolean]] = js.undefined
    
    /** Number of items to render. Defaults to items.length. */
    var renderCount: js.UndefOr[Double] = js.undefined
    
    /**
      * In addition to the visible window, how many windowHeights should we render ahead.
      * @defaultvalue 2
      */
    var renderedWindowsAhead: js.UndefOr[Double] = js.undefined
    
    /**
      * In addition to the visible window, how many windowHeights should we render behind.
      * @defaultvalue 2
      */
    var renderedWindowsBehind: js.UndefOr[Double] = js.undefined
    
    /**
      * The role to assign to the list root element.
      * Use this to override the default assignment of 'list' to the root and 'listitem' to the cells.
      */
    @JSName("role")
    var role_IListProps: js.UndefOr[String] = js.undefined
    
    /** Index in items array to start rendering from. Defaults to 0. */
    var startIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean value to enable render page caching. This is an experimental performance optimization
      * that is off by default.
      * @defaultvalue false
      */
    var usePageCache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object which can be passed in as a fresh instance to 'force update' the list.
      */
    var version: js.UndefOr[js.Object] = js.undefined
  }
  object IListProps {
    
    inline def apply[T](): IListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IListProps[T]]
    }
    
    extension [Self <: IListProps[?], T](x: Self & IListProps[T]) {
      
      inline def setComponentRef(value: IRefObject[IList]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IList | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setGetItemCountForPage(value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => Double): Self = StObject.set(x, "getItemCountForPage", js.Any.fromFunction2(value))
      
      inline def setGetItemCountForPageUndefined: Self = StObject.set(x, "getItemCountForPage", js.undefined)
      
      inline def setGetKey(value: (/* item */ T, /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
      
      inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
      
      inline def setGetPageHeight(
        value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle], /* itemCount */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "getPageHeight", js.Any.fromFunction3(value))
      
      inline def setGetPageHeightUndefined: Self = StObject.set(x, "getPageHeight", js.undefined)
      
      inline def setGetPageSpecification(
        value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => IPageSpecification
      ): Self = StObject.set(x, "getPageSpecification", js.Any.fromFunction2(value))
      
      inline def setGetPageSpecificationUndefined: Self = StObject.set(x, "getPageSpecification", js.undefined)
      
      inline def setGetPageStyle(value: /* page */ IPage[T] => Any): Self = StObject.set(x, "getPageStyle", js.Any.fromFunction1(value))
      
      inline def setGetPageStyleUndefined: Self = StObject.set(x, "getPageStyle", js.undefined)
      
      inline def setIgnoreScrollingState(value: Boolean): Self = StObject.set(x, "ignoreScrollingState", value.asInstanceOf[js.Any])
      
      inline def setIgnoreScrollingStateUndefined: Self = StObject.set(x, "ignoreScrollingState", js.undefined)
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnPageAdded(value: /* page */ IPage[T] => Unit): Self = StObject.set(x, "onPageAdded", js.Any.fromFunction1(value))
      
      inline def setOnPageAddedUndefined: Self = StObject.set(x, "onPageAdded", js.undefined)
      
      inline def setOnPageRemoved(value: /* page */ IPage[T] => Unit): Self = StObject.set(x, "onPageRemoved", js.Any.fromFunction1(value))
      
      inline def setOnPageRemovedUndefined: Self = StObject.set(x, "onPageRemoved", js.undefined)
      
      inline def setOnPagesUpdated(value: /* pages */ js.Array[IPage[T]] => Unit): Self = StObject.set(x, "onPagesUpdated", js.Any.fromFunction1(value))
      
      inline def setOnPagesUpdatedUndefined: Self = StObject.set(x, "onPagesUpdated", js.undefined)
      
      inline def setOnRenderCell(
        value: (/* item */ js.UndefOr[T], /* index */ js.UndefOr[Double], /* isScrolling */ js.UndefOr[Boolean]) => ReactNode
      ): Self = StObject.set(x, "onRenderCell", js.Any.fromFunction3(value))
      
      inline def setOnRenderCellUndefined: Self = StObject.set(x, "onRenderCell", js.undefined)
      
      inline def setOnRenderPage(
        value: (/* props */ js.UndefOr[IPageProps[T]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPageProps[T]], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderPage", js.Any.fromFunction2(value))
      
      inline def setOnRenderPageUndefined: Self = StObject.set(x, "onRenderPage", js.undefined)
      
      inline def setOnRenderRoot(
        value: (/* props */ js.UndefOr[IListOnRenderRootProps[T]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IListOnRenderRootProps[T]], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderRoot", js.Any.fromFunction2(value))
      
      inline def setOnRenderRootUndefined: Self = StObject.set(x, "onRenderRoot", js.undefined)
      
      inline def setOnRenderSurface(
        value: (/* props */ js.UndefOr[IListOnRenderSurfaceProps[T]], /* defaultRender */ js.UndefOr[
              js.Function1[/* props */ js.UndefOr[IListOnRenderSurfaceProps[T]], Element | Null]
            ]) => Element | Null
      ): Self = StObject.set(x, "onRenderSurface", js.Any.fromFunction2(value))
      
      inline def setOnRenderSurfaceUndefined: Self = StObject.set(x, "onRenderSurface", js.undefined)
      
      inline def setOnShouldVirtualize(value: /* props */ IListProps[T] => Boolean): Self = StObject.set(x, "onShouldVirtualize", js.Any.fromFunction1(value))
      
      inline def setOnShouldVirtualizeUndefined: Self = StObject.set(x, "onShouldVirtualize", js.undefined)
      
      inline def setRenderCount(value: Double): Self = StObject.set(x, "renderCount", value.asInstanceOf[js.Any])
      
      inline def setRenderCountUndefined: Self = StObject.set(x, "renderCount", js.undefined)
      
      inline def setRenderedWindowsAhead(value: Double): Self = StObject.set(x, "renderedWindowsAhead", value.asInstanceOf[js.Any])
      
      inline def setRenderedWindowsAheadUndefined: Self = StObject.set(x, "renderedWindowsAhead", js.undefined)
      
      inline def setRenderedWindowsBehind(value: Double): Self = StObject.set(x, "renderedWindowsBehind", value.asInstanceOf[js.Any])
      
      inline def setRenderedWindowsBehindUndefined: Self = StObject.set(x, "renderedWindowsBehind", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setUsePageCache(value: Boolean): Self = StObject.set(x, "usePageCache", value.asInstanceOf[js.Any])
      
      inline def setUsePageCacheUndefined: Self = StObject.set(x, "usePageCache", js.undefined)
      
      inline def setVersion(value: js.Object): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IPage[T] extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var height: Double
    
    var isSpacer: js.UndefOr[Boolean] = js.undefined
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var itemCount: Double
    
    var items: js.UndefOr[js.Array[T]] = js.undefined
    
    var key: String
    
    var startIndex: Double
    
    var style: CSSProperties
    
    var top: Double
  }
  object IPage {
    
    inline def apply[T](
      height: Double,
      itemCount: Double,
      key: String,
      startIndex: Double,
      style: CSSProperties,
      top: Double
    ): IPage[T] = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPage[T]]
    }
    
    extension [Self <: IPage[?], T](x: Self & IPage[T]) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsSpacer(value: Boolean): Self = StObject.set(x, "isSpacer", value.asInstanceOf[js.Any])
      
      inline def setIsSpacerUndefined: Self = StObject.set(x, "isSpacer", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPageProps[T]
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with ClassAttributes[HTMLDivElement] {
    
    /**
      * The allocation data for the page.
      */
    var page: IPage[T]
    
    /**
      * The role being assigned to the rendered page element by the list.
      */
    @JSName("role")
    var role_IPageProps: js.UndefOr[String] = js.undefined
  }
  object IPageProps {
    
    inline def apply[T](page: IPage[T]): IPageProps[T] = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageProps[T]]
    }
    
    extension [Self <: IPageProps[?], T](x: Self & IPageProps[T]) {
      
      inline def setPage(value: IPage[T]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  trait IPageSpecification extends StObject {
    
    /**
      * Data to pass through to the page when rendering.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * The estimated pixel height of the page.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of items to allocate to the page.
      */
    var itemCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The key to use when creating the page.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object IPageSpecification {
    
    inline def apply(): IPageSpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPageSpecification]
    }
    
    extension [Self <: IPageSpecification](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
