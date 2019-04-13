package typings
package minimistLib.minimistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedArgs
  extends /* arg */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * If opts['--'] is true, populated with everything after the --
    */
  var `--`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Contains all the arguments that didn't have an option associated with them
    */
  var `_`: js.Array[java.lang.String]
}

object ParsedArgs {
  @scala.inline
  def apply(
    `_`: js.Array[java.lang.String],
    `--`: js.Array[java.lang.String] = null,
    StringDictionary: /* arg */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ParsedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`)
    if (`--` != null) __obj.updateDynamic("--")(`--`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedArgs]
  }
}

