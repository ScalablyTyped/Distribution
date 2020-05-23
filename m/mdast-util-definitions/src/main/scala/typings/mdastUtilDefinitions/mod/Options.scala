package typings.mdastUtilDefinitions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Turn on (`true`) to use CommonMark precedence: ignore definitions found later for duplicate definitions. The default behavior is to prefer the last found definition.
    *
    * @default false
    */
  var commonmark: Boolean
}

object Options {
  @scala.inline
  def apply(commonmark: Boolean): Options = {
    val __obj = js.Dynamic.literal(commonmark = commonmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

