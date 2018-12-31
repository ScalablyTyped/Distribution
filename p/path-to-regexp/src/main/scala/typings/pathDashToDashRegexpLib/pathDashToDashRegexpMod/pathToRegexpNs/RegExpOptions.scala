package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpOptions extends js.Object {
  /**
    * Sets the final character for non-ending optimistic matches. (default: `/`)
    */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true` the regexp will match to the end of the string. (default: `true`)
    */
  var end: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of characters that can also be "end" characters.
    */
  var endsWith: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true` the regexp will match from the beginning of the string. (default: `true`)
    */
  var start: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true` the regexp allows an optional trailing delimiter to match. (default: `false`)
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

