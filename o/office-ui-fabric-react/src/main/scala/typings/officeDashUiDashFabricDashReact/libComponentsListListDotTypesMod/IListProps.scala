package typings.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsListListMod.List
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListProps[T] extends HTMLAttributes[List[T] | HTMLDivElement] {
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
  var getPageStyle: js.UndefOr[js.Function1[/* page */ IPage[T], _]] = js.undefined
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
    * @param item - The the data associated with the cell that is being rendered.
    * @param index - The index of the cell being rendered.
    * @param isScrolling - True if the list is being scrolled. May be useful for rendering a placeholder if your cells are complex.
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
  var onRenderPage: js.UndefOr[
    js.Function2[
      /* pageProps */ IPageProps[T], 
      /* defaultRender */ js.UndefOr[IRenderFunction[IPageProps[T]]], 
      ReactNode
    ]
  ] = js.undefined
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for smaller lists.
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
  /** Index in items array to start rendering from. Defaults to 0. */
  var startIndex: js.UndefOr[Double] = js.undefined
  /**
    * Boolean value to enable render page caching. This is an experimental performance optimization
    * that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[Boolean] = js.undefined
}

object IListProps {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[List[T] | HTMLDivElement] = null,
    className: String = null,
    componentRef: IRefObject[IList] = null,
    getItemCountForPage: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => Double = null,
    getKey: (/* item */ T, /* index */ js.UndefOr[Double]) => String = null,
    getPageHeight: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle], /* itemCount */ js.UndefOr[Double]) => Double = null,
    getPageSpecification: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => IPageSpecification = null,
    getPageStyle: /* page */ IPage[T] => _ = null,
    items: js.Array[T] = null,
    onPageAdded: /* page */ IPage[T] => Unit = null,
    onPageRemoved: /* page */ IPage[T] => Unit = null,
    onPagesUpdated: /* pages */ js.Array[IPage[T]] => Unit = null,
    onRenderCell: (/* item */ js.UndefOr[T], /* index */ js.UndefOr[Double], /* isScrolling */ js.UndefOr[Boolean]) => ReactNode = null,
    onRenderPage: (/* pageProps */ IPageProps[T], /* defaultRender */ js.UndefOr[IRenderFunction[IPageProps[T]]]) => ReactNode = null,
    onShouldVirtualize: /* props */ IListProps[T] => Boolean = null,
    renderCount: Int | Double = null,
    renderedWindowsAhead: Int | Double = null,
    renderedWindowsBehind: Int | Double = null,
    role: String = null,
    startIndex: Int | Double = null,
    usePageCache: js.UndefOr[Boolean] = js.undefined
  ): IListProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getItemCountForPage != null) __obj.updateDynamic("getItemCountForPage")(js.Any.fromFunction2(getItemCountForPage))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction2(getKey))
    if (getPageHeight != null) __obj.updateDynamic("getPageHeight")(js.Any.fromFunction3(getPageHeight))
    if (getPageSpecification != null) __obj.updateDynamic("getPageSpecification")(js.Any.fromFunction2(getPageSpecification))
    if (getPageStyle != null) __obj.updateDynamic("getPageStyle")(js.Any.fromFunction1(getPageStyle))
    if (items != null) __obj.updateDynamic("items")(items)
    if (onPageAdded != null) __obj.updateDynamic("onPageAdded")(js.Any.fromFunction1(onPageAdded))
    if (onPageRemoved != null) __obj.updateDynamic("onPageRemoved")(js.Any.fromFunction1(onPageRemoved))
    if (onPagesUpdated != null) __obj.updateDynamic("onPagesUpdated")(js.Any.fromFunction1(onPagesUpdated))
    if (onRenderCell != null) __obj.updateDynamic("onRenderCell")(js.Any.fromFunction3(onRenderCell))
    if (onRenderPage != null) __obj.updateDynamic("onRenderPage")(js.Any.fromFunction2(onRenderPage))
    if (onShouldVirtualize != null) __obj.updateDynamic("onShouldVirtualize")(js.Any.fromFunction1(onShouldVirtualize))
    if (renderCount != null) __obj.updateDynamic("renderCount")(renderCount.asInstanceOf[js.Any])
    if (renderedWindowsAhead != null) __obj.updateDynamic("renderedWindowsAhead")(renderedWindowsAhead.asInstanceOf[js.Any])
    if (renderedWindowsBehind != null) __obj.updateDynamic("renderedWindowsBehind")(renderedWindowsBehind.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(usePageCache)) __obj.updateDynamic("usePageCache")(usePageCache)
    __obj.asInstanceOf[IListProps[T]]
  }
}

