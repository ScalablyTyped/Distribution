package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtRuleNewProps extends ContainerNewProps {
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  @JSName("raws")
  var raws_AtRuleNewProps: js.UndefOr[AtRuleRaws] = js.undefined
}

object AtRuleNewProps {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    nodes: js.Array[ChildNode] = null,
    params: java.lang.String | scala.Double = null,
    raws: AtRuleRaws = null,
    source: NodeSource = null
  ): AtRuleNewProps = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[AtRuleNewProps]
  }
}

