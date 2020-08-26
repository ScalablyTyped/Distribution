package typings.officeUiFabricReact.detailsListDragDropExampleMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListDragDropExampleState extends js.Object {
  var columns: js.Array[IColumn] = js.native
  var frozenColumnCountFromEnd: String = js.native
  var frozenColumnCountFromStart: String = js.native
  var isColumnReorderEnabled: Boolean = js.native
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ] = js.native
}

object IDetailsListDragDropExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    frozenColumnCountFromEnd: String,
    frozenColumnCountFromStart: String,
    isColumnReorderEnabled: Boolean,
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ]
  ): IDetailsListDragDropExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], frozenColumnCountFromEnd = frozenColumnCountFromEnd.asInstanceOf[js.Any], frozenColumnCountFromStart = frozenColumnCountFromStart.asInstanceOf[js.Any], isColumnReorderEnabled = isColumnReorderEnabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListDragDropExampleState]
  }
  @scala.inline
  implicit class IDetailsListDragDropExampleStateOps[Self <: IDetailsListDragDropExampleState] (val x: Self) extends AnyVal {
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
    def setFrozenColumnCountFromEnd(value: String): Self = this.set("frozenColumnCountFromEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrozenColumnCountFromStart(value: String): Self = this.set("frozenColumnCountFromStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsColumnReorderEnabled(value: Boolean): Self = this.set("isColumnReorderEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

