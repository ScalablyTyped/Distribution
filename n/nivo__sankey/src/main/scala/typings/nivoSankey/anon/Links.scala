package typings.nivoSankey.anon

import typings.nivoSankey.mod.SankeyDataLink
import typings.nivoSankey.mod.SankeyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  var links: js.Array[SankeyDataLink]
  var nodes: js.Array[SankeyDataNode]
}

object Links {
  @scala.inline
  def apply(links: js.Array[SankeyDataLink], nodes: js.Array[SankeyDataNode]): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
}

