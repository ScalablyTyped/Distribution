package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: AnonDragEnter
  var links: AnonDragEnter
  var nodes: AnonDragEnter
  var ports: AnonDragLeave
}

object AnonBackground {
  @scala.inline
  def apply(background: AnonDragEnter, links: AnonDragEnter, nodes: AnonDragEnter, ports: AnonDragLeave): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackground]
  }
}

