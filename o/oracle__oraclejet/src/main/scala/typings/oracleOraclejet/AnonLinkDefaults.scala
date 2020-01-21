package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinkDefaults extends js.Object {
  var linkDefaults: AnonContextLabelLayoutLink
  var links: AnonCoordinateSpace
  var nodeDefaults: AnonContextLabelLayout
  var nodes: AnonIdLabelLayout
  var viewport: AnonH
}

object AnonLinkDefaults {
  @scala.inline
  def apply(
    linkDefaults: AnonContextLabelLayoutLink,
    links: AnonCoordinateSpace,
    nodeDefaults: AnonContextLabelLayout,
    nodes: AnonIdLabelLayout,
    viewport: AnonH
  ): AnonLinkDefaults = {
    val __obj = js.Dynamic.literal(linkDefaults = linkDefaults.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLinkDefaults]
  }
}

