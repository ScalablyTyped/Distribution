package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxVisibility extends js.Object {
  var checkboxVisibility: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
  var compact: Boolean
  var constrainMode: ConstrainMode
  var isHeaderVisible: Boolean
  var layoutMode: DetailsListLayoutMode
  var selectionMode: SelectionMode
  var useFastIcons: Boolean
}

object CheckboxVisibility {
  @scala.inline
  def apply(
    checkboxVisibility: typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility,
    compact: Boolean,
    constrainMode: ConstrainMode,
    isHeaderVisible: Boolean,
    layoutMode: DetailsListLayoutMode,
    selectionMode: SelectionMode,
    useFastIcons: Boolean
  ): CheckboxVisibility = {
    val __obj = js.Dynamic.literal(checkboxVisibility = checkboxVisibility.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], constrainMode = constrainMode.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxVisibility]
  }
}

