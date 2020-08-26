package typings.officeUiFabricReact.shimmerApplicationExampleMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerApplicationExampleState extends js.Object {
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  var isDataLoaded: js.UndefOr[Boolean] = js.native
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ] = js.native
}

object IShimmerApplicationExampleState {
  @scala.inline
  def apply(
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ]
  ): IShimmerApplicationExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerApplicationExampleState]
  }
  @scala.inline
  implicit class IShimmerApplicationExampleStateOps[Self <: IShimmerApplicationExampleState] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setIsDataLoaded(value: Boolean): Self = this.set("isDataLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDataLoaded: Self = this.set("isDataLoaded", js.undefined)
  }
  
}

