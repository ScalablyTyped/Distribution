package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nodes extends js.Object {
  var nodes: DataTypes
  var ports: DragEnd
}

object Nodes {
  @scala.inline
  def apply(nodes: DataTypes, ports: DragEnd): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
}

