package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Background extends js.Object {
  var background: DragEnter = js.native
  var links: DragEnter = js.native
  var nodes: DragEnter = js.native
  var ports: DragLeave = js.native
}

object Background {
  @scala.inline
  def apply(background: DragEnter, links: DragEnter, nodes: DragEnter, ports: DragLeave): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
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
    def setBackground(value: DragEnter): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: DragEnter): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: DragEnter): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPorts(value: DragLeave): Self = this.set("ports", value.asInstanceOf[js.Any])
  }
  
}

