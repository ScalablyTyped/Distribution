package typings
package officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotBaseMod.GroupedListBase
    ] {
  /** Optional class name to add to the root element. */
  var className: js.UndefOr[java.lang.String] = js.native
  /**
       * Optional callback to access the IGroupedList interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IGroupedList]] = js.native
  /** Map of callback functions related to drag and drop functionality. */
  var dragDropEvents: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropEvents
  ] = js.native
  /** helper to manage drag/drop across item and groups */
  var dragDropHelper: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropHelper
  ] = js.native
  /** Event names and corresponding callbacks that will be registered to groups and rendered elements */
  var eventsToRegister: js.UndefOr[js.Array[officeDashUiDashFabricDashReactLib.Anon_EventNameCallback]] = js.native
  /**
       * Optional function which will be called to estimate the height (in pixels) of the given group.
       *
       * By default, scrolling through a large virtualized GroupedList will often "jump" due to the order
       * in which heights are calculated. For more details, see https://github.com/OfficeDev/office-ui-fabric-react/issues/5094
       *
       * Pass this prop to ensure the list uses the computed height rather than cached DOM measurements,
       * avoiding the scroll jumping issue.
       */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ scala.Double, scala.Double]] = js.native
  /** Optional override properties to render groups. */
  var groupProps: js.UndefOr[IGroupRenderProps] = js.native
  /** Optional grouping instructions. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  /** List of items to render. */
  var items: js.Array[_] = js.native
  /** Optional properties to pass through to the list components being rendered. */
  var listProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps] = js.native
  /** Optional callback when the group expand state changes between all collapsed and at least one group is expanded. */
  var onGroupExpandStateChanged: js.UndefOr[js.Function1[/* isSomeGroupExpanded */ scala.Boolean, scala.Unit]] = js.native
  /**
       * Optional callback to determine whether the list should be rendered in full, or virtualized.
       * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
       * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for smaller lists.
       * The default implementation will virtualize when this callback is not provided.
       */
  var onShouldVirtualize: js.UndefOr[
    js.Function1[
      /* props */ officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IListProps, 
      scala.Boolean
    ]
  ] = js.native
  /** Optional selection model to track selection state.  */
  var selection: js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.ISelection] = js.native
  /** Controls how/if the list manages selection. */
  var selectionMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  ] = js.native
  /**
       * Style function to be passed in to override the themed or default styles
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles]
  ] = js.native
  /**
       * Theme that is passed in from Higher Order Component
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.native
  /**
       * boolean to control if pages containing unchanged items should be cached, this is a perf optimization
       * The same property in List.Props
       */
  var usePageCache: js.UndefOr[scala.Boolean] = js.native
  /** Optional Viewport, provided by the parent component. */
  var viewport: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithViewportMod.IViewport
  ] = js.native
  /** Rendering callback to render the group items. */
  def onRenderCell(): reactLib.reactMod.ReactNs.ReactNode = js.native
  /** Rendering callback to render the group items. */
  def onRenderCell(nestingDepth: scala.Double): reactLib.reactMod.ReactNs.ReactNode = js.native
  /** Rendering callback to render the group items. */
  def onRenderCell(nestingDepth: scala.Double, item: js.Any): reactLib.reactMod.ReactNs.ReactNode = js.native
  /** Rendering callback to render the group items. */
  def onRenderCell(nestingDepth: scala.Double, item: js.Any, index: scala.Double): reactLib.reactMod.ReactNs.ReactNode = js.native
}

