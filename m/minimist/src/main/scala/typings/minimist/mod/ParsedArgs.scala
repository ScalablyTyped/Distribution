package typings.minimist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedArgs
  extends /* arg */ StringDictionary[js.Any] {
  /**
    * If opts['--'] is true, populated with everything after the --
    */
  var `--`: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Contains all the arguments that didn't have an option associated with them
    */
  @JSName("_")
  var _underscore: js.Array[String]
}

object ParsedArgs {
  @scala.inline
  def apply(
    _underscore: js.Array[String],
    `--`: js.Array[String] = null,
    StringDictionary: /* arg */ StringDictionary[js.Any] = null
  ): ParsedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (`--` != null) __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedArgs]
  }
}

