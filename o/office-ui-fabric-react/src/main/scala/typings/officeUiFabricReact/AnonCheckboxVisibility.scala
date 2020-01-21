package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typings.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckboxVisibility extends js.Object {
  var checkboxVisibility: CheckboxVisibility
  var compact: Boolean
  var constrainMode: ConstrainMode
  var isHeaderVisible: Boolean
  var layoutMode: DetailsListLayoutMode
  var selectionMode: SelectionMode
  var useFastIcons: Boolean
}

object AnonCheckboxVisibility {
  @scala.inline
  def apply(
    checkboxVisibility: CheckboxVisibility,
    compact: Boolean,
    constrainMode: ConstrainMode,
    isHeaderVisible: Boolean,
    layoutMode: DetailsListLayoutMode,
    selectionMode: SelectionMode,
    useFastIcons: Boolean
  ): AnonCheckboxVisibility = {
    val __obj = js.Dynamic.literal(checkboxVisibility = checkboxVisibility.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], constrainMode = constrainMode.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckboxVisibility]
  }
}

