package typings.officeUiFabricReact.detailsListAdvancedExampleMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListAdvancedExampleState extends js.Object {
  var announcedMessage: js.UndefOr[String] = js.undefined
  var canResizeColumns: js.UndefOr[Boolean] = js.undefined
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  var columns: js.Array[IColumn]
  var constrainMode: js.UndefOr[ConstrainMode] = js.undefined
  var contextualMenuProps: js.UndefOr[IContextualMenuProps] = js.undefined
  var groupItemLimit: js.UndefOr[Double] = js.undefined
  var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
  var isHeaderVisible: js.UndefOr[Boolean] = js.undefined
  var isLazyLoaded: js.UndefOr[Boolean] = js.undefined
  var isSortedDescending: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ]
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.undefined
  var selectionCount: Double
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  var sortedColumnKey: js.UndefOr[String] = js.undefined
}

object IDetailsListAdvancedExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    selectionCount: Double,
    announcedMessage: String = null,
    canResizeColumns: js.UndefOr[Boolean] = js.undefined,
    checkboxVisibility: CheckboxVisibility = null,
    constrainMode: ConstrainMode = null,
    contextualMenuProps: IContextualMenuProps = null,
    groupItemLimit: Int | Double = null,
    groups: js.Array[IGroup] = null,
    isHeaderVisible: js.UndefOr[Boolean] = js.undefined,
    isLazyLoaded: js.UndefOr[Boolean] = js.undefined,
    isSortedDescending: js.UndefOr[Boolean] = js.undefined,
    layoutMode: DetailsListLayoutMode = null,
    selectionMode: SelectionMode = null,
    sortedColumnKey: String = null
  ): IDetailsListAdvancedExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionCount = selectionCount.asInstanceOf[js.Any])
    if (announcedMessage != null) __obj.updateDynamic("announcedMessage")(announcedMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(canResizeColumns)) __obj.updateDynamic("canResizeColumns")(canResizeColumns.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (constrainMode != null) __obj.updateDynamic("constrainMode")(constrainMode.asInstanceOf[js.Any])
    if (contextualMenuProps != null) __obj.updateDynamic("contextualMenuProps")(contextualMenuProps.asInstanceOf[js.Any])
    if (groupItemLimit != null) __obj.updateDynamic("groupItemLimit")(groupItemLimit.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeaderVisible)) __obj.updateDynamic("isHeaderVisible")(isHeaderVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isLazyLoaded)) __obj.updateDynamic("isLazyLoaded")(isLazyLoaded.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortedDescending)) __obj.updateDynamic("isSortedDescending")(isSortedDescending.asInstanceOf[js.Any])
    if (layoutMode != null) __obj.updateDynamic("layoutMode")(layoutMode.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sortedColumnKey != null) __obj.updateDynamic("sortedColumnKey")(sortedColumnKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListAdvancedExampleState]
  }
}

