package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod

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
  /**
    * List of characters to consider delimiters when parsing. (default: `undefined`, any character)
    */
  var whitelist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object RegExpOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    end: js.UndefOr[scala.Boolean] = js.undefined,
    endsWith: java.lang.String | js.Array[java.lang.String] = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    whitelist: java.lang.String | js.Array[java.lang.String] = null
  ): RegExpOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (endsWith != null) __obj.updateDynamic("endsWith")(endsWith.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpOptions]
  }
}

