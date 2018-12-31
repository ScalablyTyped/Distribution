package typings
package officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsListListMod.List | reactLib.HTMLDivElement
    ] {
  /**
    * Optional callback to access the IList interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IList]] = js.undefined
  /**
    * Method called by the list to get how many items to render per page from specified index.
    * In general, use `getPageSpecification` instead.
    */
  var getItemCountForPage: js.UndefOr[
    js.Function2[
      /* itemIndex */ js.UndefOr[scala.Double], 
      /* visibleRect */ js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle], 
      scala.Double
    ]
  ] = js.undefined
  /** Optional callback to get the item key, to be used on render. */
  var getKey: js.UndefOr[
    js.Function2[/* item */ js.Any, /* index */ js.UndefOr[scala.Double], java.lang.String]
  ] = js.undefined
  /**
    * Method called by the list to get the pixel height for a given page. By default, we measure the first
    * page's height and default all other pages to that height when calculating the surface space. It is
    * ideal to be able to adequately predict page heights in order to keep the surface space from jumping
    * in pixels, which has been seen to cause browser performance issues.
    * In general, use `getPageSpecification` instead.
    */
  var getPageHeight: js.UndefOr[
    js.Function2[
      /* itemIndex */ js.UndefOr[scala.Double], 
      /* visibleRect */ js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle], 
      scala.Double
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
      /* itemIndex */ js.UndefOr[scala.Double], 
      /* visibleRect */ js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle], 
      IPageSpecification
    ]
  ] = js.undefined
  /**
    * Method called by the list to derive the page style object. For spacer pages, the list will derive
    * the height and passed in heights will be ignored.
    */
  var getPageStyle: js.UndefOr[js.Function1[/* page */ IPage, _]] = js.undefined
  /** Items to render. */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** Optional callback for monitoring when a page is added. */
  var onPageAdded: js.UndefOr[js.Function1[/* page */ IPage, scala.Unit]] = js.undefined
  /** Optional callback for monitoring when a page is removed. */
  var onPageRemoved: js.UndefOr[js.Function1[/* page */ IPage, scala.Unit]] = js.undefined
  /**
    * Optional callback invoked when List rendering completed.
    * This can be on initial mount or on re-render due to scrolling.
    * This method will be called as a result of changes in List pages (added or removed),
    * and after ALL the changes complete.
    * To track individual page Add / Remove use onPageAdded / onPageRemoved instead.
    * @param pages - The current array of pages in the List.
    */
  var onPagesUpdated: js.UndefOr[js.Function1[/* pages */ js.Array[IPage], scala.Unit]] = js.undefined
  /**
    * Method to call when trying to render an item.
    * @param item - The the data associated with the cell that is being rendered.
    * @param index - The index of the cell being rendered.
    * @param isScrolling - True if the list is being scrolled. May be useful for rendering a placeholder if your cells are complex.
    */
  var onRenderCell: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* isScrolling */ js.UndefOr[scala.Boolean], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
    * Called when the List will render a page.
    * Override this to control how cells are rendered within a page.
    */
  var onRenderPage: js.UndefOr[
    js.Function2[
      /* pageProps */ IPageProps, 
      /* defaultRender */ js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPageProps]], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps, scala.Boolean]] = js.undefined
  /** Number of items to render. Defaults to items.length. */
  var renderCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * In addition to the visible window, how many windowHeights should we render ahead.
    * @defaultvalue 2
    */
  var renderedWindowsAhead: js.UndefOr[scala.Double] = js.undefined
  /**
    * In addition to the visible window, how many windowHeights should we render behind.
    * @defaultvalue 2
    */
  var renderedWindowsBehind: js.UndefOr[scala.Double] = js.undefined
  /** Index in items array to start rendering from. Defaults to 0. */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Boolean value to enable render page caching. This is an experimental performance optimization
    * that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[scala.Boolean] = js.undefined
}

