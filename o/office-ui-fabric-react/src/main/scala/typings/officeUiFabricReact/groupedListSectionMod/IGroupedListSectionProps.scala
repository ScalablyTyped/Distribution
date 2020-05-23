package typings.officeUiFabricReact.groupedListSectionMod

import typings.officeUiFabricReact.anon.Callback
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListStyles
import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListSectionProps extends ClassAttributes[GroupedListSection] {
  /** Whether to render in compact mode */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
  /** Map of callback functions related to drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  /** helper to manage drag/drop across item rows and groups */
  var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
  /** Event names and corresponding callbacks that will be registered to the group and the rendered elements */
  var eventsToRegister: js.UndefOr[js.Array[Callback]] = js.native
  /** Information to pass in to the group footer. */
  var footerProps: js.UndefOr[IGroupFooterProps] = js.native
  /** Grouping item limit. */
  var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, Double]] = js.native
  /** Optional grouping instructions. */
  var group: js.UndefOr[IGroup] = js.native
  /** Optional grouping instructions. */
  var groupIndex: js.UndefOr[Double] = js.native
  /** Optional group nesting level. */
  var groupNestingDepth: js.UndefOr[Double] = js.native
  /** Optional override properties to render groups. */
  var groupProps: js.UndefOr[IGroupRenderProps] = js.native
  /** GroupedList resolved class names */
  var groupedListClassNames: js.UndefOr[IProcessedStyleSet[IGroupedListStyles]] = js.native
  /** Stores parent group's children. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  /** Information to pass in to the group header. */
  var headerProps: js.UndefOr[IGroupHeaderProps] = js.native
  /** List of items to render. */
  var items: js.Array[_] = js.native
  /** Optional list props to pass to list renderer.  */
  var listProps: js.UndefOr[IListProps[_]] = js.native
  /** Override for rendering the group footer. */
  var onRenderGroupFooter: js.UndefOr[IRenderFunction[IGroupFooterProps]] = js.native
  /** Override for rendering the group header. */
  var onRenderGroupHeader: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
  /** Override for rendering the group Show All link. */
  var onRenderGroupShowAll: js.UndefOr[IRenderFunction[IGroupShowAllProps]] = js.native
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
  /** Controls how/if the details list manages selection. */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /** Information to pass in to the group Show All footer. */
  var showAllProps: js.UndefOr[IGroupShowAllProps] = js.native
  /** Optional Viewport, provided by the parent component. */
  var viewport: js.UndefOr[IViewport] = js.native
  /** Rendering callback to render the group items. */
  def onRenderCell(): ReactNode = js.native
  def onRenderCell(nestingDepth: Double): ReactNode = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any): ReactNode = js.native
  def onRenderCell(nestingDepth: Double, item: js.Any, index: Double): ReactNode = js.native
}

