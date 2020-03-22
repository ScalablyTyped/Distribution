package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Preserve whitespace when true. Default: false;
    */
  var lossless: Boolean
  /**
    * When true and a postcss.Rule is passed, set the result of
    * processing back onto the rule when done. Default: false.
    */
  var updateSelector: Boolean
}

object Options {
  @scala.inline
  def apply(lossless: Boolean, updateSelector: Boolean): Options = {
    val __obj = js.Dynamic.literal(lossless = lossless.asInstanceOf[js.Any], updateSelector = updateSelector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

