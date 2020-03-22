package typings.officeUiFabricReact.groupedListTypesMod

import typings.officeUiFabricReact.AnonCallback
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.officeUiFabricReact.groupedListBaseMod.GroupedListBase
import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListProps extends ClassAttributes[GroupedListBase] {
  /** Optional class name to add to the root element. */
  var className: js.UndefOr[String] = js.native
  /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback to access the IGroupedList interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IGroupedList]] = js.native
  /** Map of callback functions related to drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  /** helper to manage drag/drop across item and groups */
  var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
  /** Event names and corresponding callbacks that will be registered to groups and rendered elements */
  var eventsToRegister: js.UndefOr[js.Array[AnonCallback]] = js.native
  /**
    * Optional function to override default group height calculation used by list virtualization.
    */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.native
  /** Optional override properties to render groups. */
  var groupProps: js.UndefOr[IGroupRenderProps] = js.native
  /** Optional grouping instructions. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  /** List of items to render. */
  var items: js.Array[_] = js.native
  /** Optional properties to pass through to the list components being rendered. */
  var listProps: js.UndefOr[IListProps[_]] = js.native
  /** Optional callback when the group expand state changes between all collapsed and at least one group is expanded. */
  var onGroupExpandStateChanged: js.UndefOr[js.Function1[/* isSomeGroupExpanded */ Boolean, Unit]] = js.native
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
    * smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.native
  /** Optional selection model to track selection state.  */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
  /** Controls how/if the list manages selection. */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles]] = js.native
  /**
    * Theme that is passed in from Higher Order Component
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * boolean to control if pages containing unchanged items should be cached, this is a perf optimization
    * The same property in List.Props
    */
  var usePageCache: js.UndefOr[Boolean] = js.native
  /** Optional Viewport, provided by the parent component. */
  var viewport: js.UndefOr[IViewport] = js.native
  /** Rendering callback to render the group items. */
  def onRenderCell(): ReactNode = js.native
  def onRenderCell(nestingDepth: Double): ReactNode = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any): ReactNode = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any, index: Double): ReactNode = js.native
}

