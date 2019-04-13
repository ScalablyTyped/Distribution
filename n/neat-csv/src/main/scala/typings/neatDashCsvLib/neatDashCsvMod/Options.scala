package typings
package neatDashCsvLib.neatDashCsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A configuration object to be passed to csv-parser. */
trait Options extends js.Object {
  var escape: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var mapHeaders: js.UndefOr[
    js.Function1[/* args */ neatDashCsvLib.Anon_Header, java.lang.String | scala.Null]
  ] = js.undefined
  var mapValues: js.UndefOr[js.Function1[/* args */ neatDashCsvLib.Anon_HeaderIndex, _]] = js.undefined
  var maxRowBytes: js.UndefOr[scala.Double] = js.undefined
  var newline: js.UndefOr[java.lang.String] = js.undefined
  var quote: js.UndefOr[java.lang.String] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var skipLines: js.UndefOr[scala.Double] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    escape: java.lang.String = null,
    headers: js.Array[java.lang.String] | scala.Boolean = null,
    mapHeaders: /* args */ neatDashCsvLib.Anon_Header => java.lang.String | scala.Null = null,
    mapValues: /* args */ neatDashCsvLib.Anon_HeaderIndex => _ = null,
    maxRowBytes: scala.Int | scala.Double = null,
    newline: java.lang.String = null,
    quote: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    skipLines: scala.Int | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mapHeaders != null) __obj.updateDynamic("mapHeaders")(js.Any.fromFunction1(mapHeaders))
    if (mapValues != null) __obj.updateDynamic("mapValues")(js.Any.fromFunction1(mapValues))
    if (maxRowBytes != null) __obj.updateDynamic("maxRowBytes")(maxRowBytes.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (skipLines != null) __obj.updateDynamic("skipLines")(skipLines.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Options]
  }
}

