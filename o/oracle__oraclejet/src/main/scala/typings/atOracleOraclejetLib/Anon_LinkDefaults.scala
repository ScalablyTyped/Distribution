package typings
package atOracleOraclejetLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("linkDefaults")(linkDefaults)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("nodeDefaults")(nodeDefaults)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_LinkDefaults]
  }
}

