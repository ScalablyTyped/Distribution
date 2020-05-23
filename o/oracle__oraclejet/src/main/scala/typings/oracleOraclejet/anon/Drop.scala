package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drop extends js.Object {
  var drag: Nodes
  var drop: Background
}

object Drop {
  @scala.inline
  def apply(drag: Nodes, drop: Background): Drop = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drop]
  }
}

