package typings.postcss.postcssMod

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
  var selector: js.UndefOr[String] = js.undefined
  /**
    * An array containing the rule's individual selectors. Groups of selectors
    * are split at commas.
    */
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
}

object RuleNewProps {
  @scala.inline
  def apply(
    nodes: js.Array[ChildNode] = null,
    raws: RuleRaws = null,
    selector: String = null,
    selectors: js.Array[String] = null,
    source: NodeSource = null
  ): RuleNewProps = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (raws != null) __obj.updateDynamic("raws")(raws.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleNewProps]
  }
}

