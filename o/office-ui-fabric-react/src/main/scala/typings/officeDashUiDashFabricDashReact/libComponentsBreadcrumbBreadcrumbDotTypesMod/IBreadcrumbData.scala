package typings.officeDashUiDashFabricDashReact.libComponentsBreadcrumbBreadcrumbDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbData extends js.Object {
  var props: IBreadcrumbProps
  var renderedItems: js.Array[IBreadcrumbItem]
  var renderedOverflowItems: js.Array[IBreadcrumbItem]
}

object IBreadcrumbData {
  @scala.inline
  def apply(
    props: IBreadcrumbProps,
    renderedItems: js.Array[IBreadcrumbItem],
    renderedOverflowItems: js.Array[IBreadcrumbItem]
  ): IBreadcrumbData = {
    val __obj = js.Dynamic.literal(props = props, renderedItems = renderedItems, renderedOverflowItems = renderedOverflowItems)
  
    __obj.asInstanceOf[IBreadcrumbData]
  }
}

