package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility
import typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollapseAllVisibility extends js.Object {
  var collapseAllVisibility: CollapseAllVisibility
  var selectAllVisibility: SelectAllVisibility
  var useFastIcons: Boolean
}

object AnonCollapseAllVisibility {
  @scala.inline
  def apply(
    collapseAllVisibility: CollapseAllVisibility,
    selectAllVisibility: SelectAllVisibility,
    useFastIcons: Boolean
  ): AnonCollapseAllVisibility = {
    val __obj = js.Dynamic.literal(collapseAllVisibility = collapseAllVisibility.asInstanceOf[js.Any], selectAllVisibility = selectAllVisibility.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollapseAllVisibility]
  }
}

