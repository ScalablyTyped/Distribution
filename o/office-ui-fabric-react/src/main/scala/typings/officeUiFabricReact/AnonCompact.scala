package typings.officeUiFabricReact

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompact extends js.Object {
  var compact: Boolean
  var isHeaderVisible: Boolean
  var selectionMode: SelectionMode
}

object AnonCompact {
  @scala.inline
  def apply(compact: Boolean, isHeaderVisible: Boolean, selectionMode: SelectionMode): AnonCompact = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompact]
  }
}

