package typings.officeUiFabricReact.anon

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSelectedOnFocus extends js.Object {
  var isSelectedOnFocus: Boolean
  var selectionMode: SelectionMode
}

object IsSelectedOnFocus {
  @scala.inline
  def apply(isSelectedOnFocus: Boolean, selectionMode: SelectionMode): IsSelectedOnFocus = {
    val __obj = js.Dynamic.literal(isSelectedOnFocus = isSelectedOnFocus.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelectedOnFocus]
  }
}

