package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkDefaults extends js.Object {
  var linkDefaults: LabelLayoutPath
  var links: CoordinateSpace
  var nodeDefaults: `4`
  var nodes: LabelLayout
  var viewport: H
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
}

