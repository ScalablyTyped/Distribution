package typings.officeUiFabricReact.detailsListCustomColumnsExampleMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListCustomColumnsExampleState extends js.Object {
  var columns: js.Array[IColumn] = js.native
  var sortedItems: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ] = js.native
}

object IDetailsListCustomColumnsExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    sortedItems: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ]
  ): IDetailsListCustomColumnsExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], sortedItems = sortedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListCustomColumnsExampleState]
  }
  @scala.inline
  implicit class IDetailsListCustomColumnsExampleStateOps[Self <: IDetailsListCustomColumnsExampleState] (val x: Self) extends AnyVal {
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
    def setSortedItemsVarargs(value: js.Any*): Self = this.set("sortedItems", js.Array(value :_*))
    @scala.inline
    def setSortedItems(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): Self = this.set("sortedItems", value.asInstanceOf[js.Any])
  }
  
}

