package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragDrop extends js.Object {
  var drag: js.UndefOr[AnonItemsAnonDragStart] = js.undefined
  var drop: js.UndefOr[AnonItemsAnonDragOver] = js.undefined
  var reorder: Anon12
}

object AnonDragDrop {
  @scala.inline
  def apply(reorder: Anon12, drag: AnonItemsAnonDragStart = null, drop: AnonItemsAnonDragOver = null): AnonDragDrop = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragDrop]
  }
}

