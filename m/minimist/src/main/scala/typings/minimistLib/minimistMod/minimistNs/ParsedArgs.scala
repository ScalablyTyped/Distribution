package typings
package minimistLib.minimistMod.minimistNs

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

