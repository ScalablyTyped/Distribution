package typings.officeUiFabricReact

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsSelectedOnFocus extends js.Object {
  var isSelectedOnFocus: Boolean
  var selectionMode: SelectionMode
}

object AnonIsSelectedOnFocus {
  @scala.inline
  def apply(isSelectedOnFocus: Boolean, selectionMode: SelectionMode): AnonIsSelectedOnFocus = {
    val __obj = js.Dynamic.literal(isSelectedOnFocus = isSelectedOnFocus.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsSelectedOnFocus]
  }
}

