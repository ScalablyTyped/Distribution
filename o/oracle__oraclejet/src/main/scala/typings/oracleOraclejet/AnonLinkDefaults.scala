package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinkDefaults extends js.Object {
  var linkDefaults: AnonLabelLayoutPath
  var links: AnonCoordinateSpace
  var nodeDefaults: Anon4
  var nodes: AnonLabelLayout
  var viewport: AnonH
}

object AnonLinkDefaults {
  @scala.inline
  def apply(
    linkDefaults: AnonLabelLayoutPath,
    links: AnonCoordinateSpace,
    nodeDefaults: Anon4,
    nodes: AnonLabelLayout,
    viewport: AnonH
  ): AnonLinkDefaults = {
    val __obj = js.Dynamic.literal(linkDefaults = linkDefaults.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLinkDefaults]
  }
}

