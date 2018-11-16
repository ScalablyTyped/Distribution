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

