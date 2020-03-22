package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * Set the default delimiter for repeat parameters. (default: `'/'`)
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * List of characters to automatically consider prefixes when parsing.
    */
  var prefixes: js.UndefOr[String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(delimiter: String = null, prefixes: String = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

