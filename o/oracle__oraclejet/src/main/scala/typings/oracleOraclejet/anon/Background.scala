package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: DragEnter
  var links: DragEnter
  var nodes: DragEnter
  var ports: DragLeave
}

object Background {
  @scala.inline
  def apply(background: DragEnter, links: DragEnter, nodes: DragEnter, ports: DragLeave): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

