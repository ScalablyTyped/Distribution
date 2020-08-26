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

@js.native
trait IDetailsListAdvancedExampleState extends js.Object {
  var announcedMessage: js.UndefOr[String] = js.native
  var canResizeColumns: js.UndefOr[Boolean] = js.native
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  var columns: js.Array[IColumn] = js.native
  var constrainMode: js.UndefOr[ConstrainMode] = js.native
  var contextualMenuProps: js.UndefOr[IContextualMenuProps] = js.native
  var groupItemLimit: js.UndefOr[Double] = js.native
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  var isHeaderVisible: js.UndefOr[Boolean] = js.native
  var isLazyLoaded: js.UndefOr[Boolean] = js.native
  var isSortedDescending: js.UndefOr[Boolean] = js.native
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ] = js.native
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.native
  var selectionCount: Double = js.native
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  var sortedColumnKey: js.UndefOr[String] = js.native
}

object IDetailsListAdvancedExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    selectionCount: Double
  ): IDetailsListAdvancedExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionCount = selectionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListAdvancedExampleState]
  }
  @scala.inline
  implicit class IDetailsListAdvancedExampleStateOps[Self <: IDetailsListAdvancedExampleState] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionCount(value: Double): Self = this.set("selectionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnouncedMessage(value: String): Self = this.set("announcedMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnouncedMessage: Self = this.set("announcedMessage", js.undefined)
    @scala.inline
    def setCanResizeColumns(value: Boolean): Self = this.set("canResizeColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanResizeColumns: Self = this.set("canResizeColumns", js.undefined)
    @scala.inline
    def setCheckboxVisibility(value: CheckboxVisibility): Self = this.set("checkboxVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxVisibility: Self = this.set("checkboxVisibility", js.undefined)
    @scala.inline
    def setConstrainMode(value: ConstrainMode): Self = this.set("constrainMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainMode: Self = this.set("constrainMode", js.undefined)
    @scala.inline
    def setContextualMenuProps(value: IContextualMenuProps): Self = this.set("contextualMenuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextualMenuProps: Self = this.set("contextualMenuProps", js.undefined)
    @scala.inline
    def setGroupItemLimit(value: Double): Self = this.set("groupItemLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupItemLimit: Self = this.set("groupItemLimit", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: IGroup*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[IGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setIsHeaderVisible(value: Boolean): Self = this.set("isHeaderVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHeaderVisible: Self = this.set("isHeaderVisible", js.undefined)
    @scala.inline
    def setIsLazyLoaded(value: Boolean): Self = this.set("isLazyLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLazyLoaded: Self = this.set("isLazyLoaded", js.undefined)
    @scala.inline
    def setIsSortedDescending(value: Boolean): Self = this.set("isSortedDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSortedDescending: Self = this.set("isSortedDescending", js.undefined)
    @scala.inline
    def setLayoutMode(value: DetailsListLayoutMode): Self = this.set("layoutMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutMode: Self = this.set("layoutMode", js.undefined)
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSortedColumnKey(value: String): Self = this.set("sortedColumnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortedColumnKey: Self = this.set("sortedColumnKey", js.undefined)
  }
  
}

