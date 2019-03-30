package typings
package atNivoSankeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Array[atNivoSankeyLib.atNivoSankeyMod.SankeyDataLink]
  var nodes: js.Array[atNivoSankeyLib.atNivoSankeyMod.SankeyDataNode]
}

object Anon_Links {
  @scala.inline
  def apply(
    links: js.Array[atNivoSankeyLib.atNivoSankeyMod.SankeyDataLink],
    nodes: js.Array[atNivoSankeyLib.atNivoSankeyMod.SankeyDataNode]
  ): Anon_Links = {
    val __obj = js.Dynamic.literal(links = links, nodes = nodes)
  
    __obj.asInstanceOf[Anon_Links]
  }
}

