package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LinkDefaults extends js.Object {
  var linkDefaults: Anon_ContextLabelLayoutLink
  var links: Anon_CoordinateSpace
  var nodeDefaults: Anon_ContextLabelLayout
  var nodes: Anon_IdLabelLayout
  var viewport: Anon_H
}

object Anon_LinkDefaults {
  @scala.inline
  def apply(
    linkDefaults: Anon_ContextLabelLayoutLink,
    links: Anon_CoordinateSpace,
    nodeDefaults: Anon_ContextLabelLayout,
    nodes: Anon_IdLabelLayout,
    viewport: Anon_H
  ): Anon_LinkDefaults = {
    val __obj = js.Dynamic.literal(linkDefaults = linkDefaults, links = links, nodeDefaults = nodeDefaults, nodes = nodes, viewport = viewport)
  
    __obj.asInstanceOf[Anon_LinkDefaults]
  }
}

