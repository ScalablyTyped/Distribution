package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragDrop extends js.Object {
  var drag: AnonNodes
  var drop: AnonBackground
}

object AnonDragDrop {
  @scala.inline
  def apply(drag: AnonNodes, drop: AnonBackground): AnonDragDrop = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDragDrop]
  }
}

