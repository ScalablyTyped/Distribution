package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpOptions extends js.Object {
  /**
    * Sets the final character for non-ending optimistic matches. (default: `/`)
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * When `true` the regexp will match to the end of the string. (default: `true`)
    */
  var end: js.UndefOr[Boolean] = js.undefined
  /**
    * List of characters that can also be "end" characters.
    */
  var endsWith: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true` the regexp will match from the beginning of the string. (default: `true`)
    */
  var start: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true` the regexp allows an optional trailing delimiter to match. (default: `false`)
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * List of characters to consider delimiters when parsing. (default: `undefined`, any character)
    */
  var whitelist: js.UndefOr[String | js.Array[String]] = js.undefined
}

object RegExpOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    end: js.UndefOr[Boolean] = js.undefined,
    endsWith: String | js.Array[String] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    start: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    whitelist: String | js.Array[String] = null
  ): RegExpOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (endsWith != null) __obj.updateDynamic("endsWith")(endsWith.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpOptions]
  }
}

