package typings.atNivoSankey

import typings.atNivoSankey.atNivoSankeyMod.SankeyDataLink
import typings.atNivoSankey.atNivoSankeyMod.SankeyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Array[SankeyDataLink]
  var nodes: js.Array[SankeyDataNode]
}

object Anon_Links {
  @scala.inline
  def apply(links: js.Array[SankeyDataLink], nodes: js.Array[SankeyDataNode]): Anon_Links = {
    val __obj = js.Dynamic.literal(links = links, nodes = nodes)
  
    __obj.asInstanceOf[Anon_Links]
  }
}

