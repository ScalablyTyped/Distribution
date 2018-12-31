package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a comment between declarations or statements (rule and at-rules).
  * Comments inside selectors, at-rule parameters, or declaration values will
  * be stored in the Node#raws properties.
  */
@js.native
trait Comment extends Node {
  /**
    * The comment's text.
    */
  var text: java.lang.String = js.native
}

