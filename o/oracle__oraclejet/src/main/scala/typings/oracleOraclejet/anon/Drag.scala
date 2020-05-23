package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drag extends js.Object {
  var drag: Groups
  var drop: Legend
}

object Drag {
  @scala.inline
  def apply(drag: Groups, drop: Legend): Drag = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drag]
  }
}

