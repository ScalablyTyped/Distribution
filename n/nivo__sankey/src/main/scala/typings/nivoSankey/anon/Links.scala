package typings.nivoSankey.anon

import typings.nivoSankey.mod.SankeyDataLink
import typings.nivoSankey.mod.SankeyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Links extends js.Object {
  var links: js.Array[SankeyDataLink] = js.native
  var nodes: js.Array[SankeyDataNode] = js.native
}

object Links {
  @scala.inline
  def apply(links: js.Array[SankeyDataLink], nodes: js.Array[SankeyDataNode]): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  @scala.inline
  implicit class LinksOps[Self <: Links] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLinksVarargs(value: SankeyDataLink*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[SankeyDataLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: SankeyDataNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[SankeyDataNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

