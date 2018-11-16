package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JsonAtRule extends JsonContainer {
  /**
           * The identifier that immediately follows the @.
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * These are the values that follow the at-rule's name, but precede any {}
           * block. The spec refers to this area as the at-rule's "prelude".
           */
  var params: js.UndefOr[java.lang.String] = js.undefined
}

