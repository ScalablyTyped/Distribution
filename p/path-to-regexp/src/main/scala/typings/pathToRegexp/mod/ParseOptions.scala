package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * Set the default delimiter for repeat parameters. (default: `'/'`)
    */
  var delimiter: js.UndefOr[String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(delimiter: String = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

