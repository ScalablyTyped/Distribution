package typings.officeUiFabricReact.breadcrumbTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbData extends js.Object {
  var props: IBreadcrumbProps = js.native
  var renderedItems: js.Array[IBreadcrumbItem] = js.native
  var renderedOverflowItems: js.Array[IBreadcrumbItem] = js.native
}

object IBreadcrumbData {
  @scala.inline
  def apply(
    props: IBreadcrumbProps,
    renderedItems: js.Array[IBreadcrumbItem],
    renderedOverflowItems: js.Array[IBreadcrumbItem]
  ): IBreadcrumbData = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], renderedItems = renderedItems.asInstanceOf[js.Any], renderedOverflowItems = renderedOverflowItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbData]
  }
  @scala.inline
  implicit class IBreadcrumbDataOps[Self <: IBreadcrumbData] (val x: Self) extends AnyVal {
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
    def setProps(value: IBreadcrumbProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderedItemsVarargs(value: IBreadcrumbItem*): Self = this.set("renderedItems", js.Array(value :_*))
    @scala.inline
    def setRenderedItems(value: js.Array[IBreadcrumbItem]): Self = this.set("renderedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderedOverflowItemsVarargs(value: IBreadcrumbItem*): Self = this.set("renderedOverflowItems", js.Array(value :_*))
    @scala.inline
    def setRenderedOverflowItems(value: js.Array[IBreadcrumbItem]): Self = this.set("renderedOverflowItems", value.asInstanceOf[js.Any])
  }
  
}

