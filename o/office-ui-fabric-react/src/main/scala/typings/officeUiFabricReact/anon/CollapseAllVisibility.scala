package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseAllVisibility extends js.Object {
  var collapseAllVisibility: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
  var selectAllVisibility: SelectAllVisibility
  var useFastIcons: Boolean
}

object CollapseAllVisibility {
  @scala.inline
  def apply(
    collapseAllVisibility: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility,
    selectAllVisibility: SelectAllVisibility,
    useFastIcons: Boolean
  ): CollapseAllVisibility = {
    val __obj = js.Dynamic.literal(collapseAllVisibility = collapseAllVisibility.asInstanceOf[js.Any], selectAllVisibility = selectAllVisibility.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseAllVisibility]
  }
}

