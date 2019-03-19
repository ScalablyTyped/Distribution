package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleNewProps extends ContainerNewProps {
  @JSName("raws")
  var raws_RuleNewProps: js.UndefOr[RuleRaws] = js.undefined
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array containing the rule's individual selectors. Groups of selectors
    * are split at commas.
    */
  var selectors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RuleNewProps {
  @scala.inline
  def apply(
    nodes: js.Array[ChildNode] = null,
    raws: RuleRaws = null,
    selector: java.lang.String = null,
    selectors: js.Array[java.lang.String] = null,
    source: NodeSource = null
  ): RuleNewProps = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[RuleNewProps]
  }
}

