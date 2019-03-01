package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBlackboxPatternsParameterType extends js.Object {
  /**
    * Array of regexps that will be used to check script url for blackbox state.
    */
  var patterns: js.Array[java.lang.String]
}

object SetBlackboxPatternsParameterType {
  @scala.inline
  def apply(patterns: js.Array[java.lang.String]): SetBlackboxPatternsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("patterns")(patterns)
    __obj.asInstanceOf[SetBlackboxPatternsParameterType]
  }
}

