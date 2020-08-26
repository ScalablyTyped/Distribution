package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkDefaults extends js.Object {
  var linkDefaults: LabelLayoutPath = js.native
  var links: CoordinateSpace = js.native
  var nodeDefaults: `4` = js.native
  var nodes: LabelLayout = js.native
  var viewport: H = js.native
}

object LinkDefaults {
  @scala.inline
  def apply(
    linkDefaults: LabelLayoutPath,
    links: CoordinateSpace,
    nodeDefaults: `4`,
    nodes: LabelLayout,
    viewport: H
  ): LinkDefaults = {
    val __obj = js.Dynamic.literal(linkDefaults = linkDefaults.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDefaults]
  }
  @scala.inline
  implicit class LinkDefaultsOps[Self <: LinkDefaults] (val x: Self) extends AnyVal {
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
    def setLinkDefaults(value: LabelLayoutPath): Self = this.set("linkDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: CoordinateSpace): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeDefaults(value: `4`): Self = this.set("nodeDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: LabelLayout): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewport(value: H): Self = this.set("viewport", value.asInstanceOf[js.Any])
  }
  
}

