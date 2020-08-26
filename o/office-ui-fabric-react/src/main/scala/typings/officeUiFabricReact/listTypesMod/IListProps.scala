package typings.officeUiFabricReact.listTypesMod

import typings.officeUiFabricReact.listListMod.List
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListProps[T] extends HTMLAttributes[List[T] | HTMLDivElement] {
  /**
    * Optional callback to access the IList interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IList]] = js.native
  /**
    * Method called by the list to get how many items to render per page from specified index.
    * In general, use `getPageSpecification` instead.
    */
  var getItemCountForPage: js.UndefOr[
    js.Function2[/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle], Double]
  ] = js.native
  /** Optional callback to get the item key, to be used on render. */
  var getKey: js.UndefOr[js.Function2[/* item */ T, /* index */ js.UndefOr[Double], String]] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * Method called by the list to derive the page style object. For spacer pages, the list will derive
    * the height and passed in heights will be ignored.
    */
  var getPageStyle: js.UndefOr[js.Function1[/* page */ IPage[T], _]] = js.native
  /**
    * Whether to disable scroll state updates. This causes the isScrolling arg in onRenderCell to always be undefined.
    * This is a performance optimization to let List skip a render cycle by not updating its scrolling state.
    */
  var ignoreScrollingState: js.UndefOr[Boolean] = js.native
  /** Items to render. */
  var items: js.UndefOr[js.Array[T]] = js.native
  /** Optional callback for monitoring when a page is added. */
  var onPageAdded: js.UndefOr[js.Function1[/* page */ IPage[T], Unit]] = js.native
  /** Optional callback for monitoring when a page is removed. */
  var onPageRemoved: js.UndefOr[js.Function1[/* page */ IPage[T], Unit]] = js.native
  /**
    * Optional callback invoked when List rendering completed.
    * This can be on initial mount or on re-render due to scrolling.
    * This method will be called as a result of changes in List pages (added or removed),
    * and after ALL the changes complete.
    * To track individual page Add / Remove use onPageAdded / onPageRemoved instead.
    * @param pages - The current array of pages in the List.
    */
  var onPagesUpdated: js.UndefOr[js.Function1[/* pages */ js.Array[IPage[T]], Unit]] = js.native
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
  ] = js.native
  /**
    * Called when the List will render a page.
    * Override this to control how cells are rendered within a page.
    */
  var onRenderPage: js.UndefOr[IRenderFunction[IPageProps[T]]] = js.native
  /**
    * Render override for the element at the root of the `List`.
    * Use this to apply some final attributes or structure to the content
    * each time the list is updated with new active pages or items.
    */
  var onRenderRoot: js.UndefOr[IRenderFunction[IListOnRenderRootProps[T]]] = js.native
  /**
    * Render override for the element representing the surface of the `List`.
    * Use this to alter the structure of the rendered content if necessary on each update.
    */
  var onRenderSurface: js.UndefOr[IRenderFunction[IListOnRenderSurfaceProps[T]]] = js.native
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
    * smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[T], Boolean]] = js.native
  /** Number of items to render. Defaults to items.length. */
  var renderCount: js.UndefOr[Double] = js.native
  /**
    * In addition to the visible window, how many windowHeights should we render ahead.
    * @defaultvalue 2
    */
  var renderedWindowsAhead: js.UndefOr[Double] = js.native
  /**
    * In addition to the visible window, how many windowHeights should we render behind.
    * @defaultvalue 2
    */
  var renderedWindowsBehind: js.UndefOr[Double] = js.native
  /** Index in items array to start rendering from. Defaults to 0. */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * Boolean value to enable render page caching. This is an experimental performance optimization
    * that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[Boolean] = js.native
  /**
    * An object which can be passed in as a fresh instance to 'force update' the list.
    */
  var version: js.UndefOr[js.Object] = js.native
}

object IListProps {
  @scala.inline
  def apply[T](): IListProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListProps[T]]
  }
  @scala.inline
  implicit class IListPropsOps[Self <: IListProps[_], T] (val x: Self with IListProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IList | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IList]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setGetItemCountForPage(value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => Double): Self = this.set("getItemCountForPage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItemCountForPage: Self = this.set("getItemCountForPage", js.undefined)
    @scala.inline
    def setGetKey(value: (/* item */ T, /* index */ js.UndefOr[Double]) => String): Self = this.set("getKey", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
    @scala.inline
    def setGetPageHeight(
      value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle], /* itemCount */ js.UndefOr[Double]) => Double
    ): Self = this.set("getPageHeight", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetPageHeight: Self = this.set("getPageHeight", js.undefined)
    @scala.inline
    def setGetPageSpecification(
      value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => IPageSpecification
    ): Self = this.set("getPageSpecification", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetPageSpecification: Self = this.set("getPageSpecification", js.undefined)
    @scala.inline
    def setGetPageStyle(value: /* page */ IPage[T] => _): Self = this.set("getPageStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPageStyle: Self = this.set("getPageStyle", js.undefined)
    @scala.inline
    def setIgnoreScrollingState(value: Boolean): Self = this.set("ignoreScrollingState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreScrollingState: Self = this.set("ignoreScrollingState", js.undefined)
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOnPageAdded(value: /* page */ IPage[T] => Unit): Self = this.set("onPageAdded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageAdded: Self = this.set("onPageAdded", js.undefined)
    @scala.inline
    def setOnPageRemoved(value: /* page */ IPage[T] => Unit): Self = this.set("onPageRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageRemoved: Self = this.set("onPageRemoved", js.undefined)
    @scala.inline
    def setOnPagesUpdated(value: /* pages */ js.Array[IPage[T]] => Unit): Self = this.set("onPagesUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPagesUpdated: Self = this.set("onPagesUpdated", js.undefined)
    @scala.inline
    def setOnRenderCell(
      value: (/* item */ js.UndefOr[T], /* index */ js.UndefOr[Double], /* isScrolling */ js.UndefOr[Boolean]) => ReactNode
    ): Self = this.set("onRenderCell", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnRenderCell: Self = this.set("onRenderCell", js.undefined)
    @scala.inline
    def setOnRenderPage(
      value: (/* props */ js.UndefOr[IPageProps[T]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPageProps[T]], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderPage: Self = this.set("onRenderPage", js.undefined)
    @scala.inline
    def setOnRenderRoot(
      value: (/* props */ js.UndefOr[IListOnRenderRootProps[T]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IListOnRenderRootProps[T]], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderRoot", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderRoot: Self = this.set("onRenderRoot", js.undefined)
    @scala.inline
    def setOnRenderSurface(
      value: (/* props */ js.UndefOr[IListOnRenderSurfaceProps[T]], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IListOnRenderSurfaceProps[T]], Element | Null]
        ]) => Element | Null
    ): Self = this.set("onRenderSurface", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderSurface: Self = this.set("onRenderSurface", js.undefined)
    @scala.inline
    def setOnShouldVirtualize(value: /* props */ IListProps[T] => Boolean): Self = this.set("onShouldVirtualize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShouldVirtualize: Self = this.set("onShouldVirtualize", js.undefined)
    @scala.inline
    def setRenderCount(value: Double): Self = this.set("renderCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderCount: Self = this.set("renderCount", js.undefined)
    @scala.inline
    def setRenderedWindowsAhead(value: Double): Self = this.set("renderedWindowsAhead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedWindowsAhead: Self = this.set("renderedWindowsAhead", js.undefined)
    @scala.inline
    def setRenderedWindowsBehind(value: Double): Self = this.set("renderedWindowsBehind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedWindowsBehind: Self = this.set("renderedWindowsBehind", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setUsePageCache(value: Boolean): Self = this.set("usePageCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePageCache: Self = this.set("usePageCache", js.undefined)
    @scala.inline
    def setVersion(value: js.Object): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

