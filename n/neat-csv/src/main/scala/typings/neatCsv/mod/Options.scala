package typings.neatCsv.mod

import typings.neatCsv.AnonHeader
import typings.neatCsv.AnonHeaderIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A configuration object to be passed to csv-parser. */
trait Options extends js.Object {
  var escape: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var mapHeaders: js.UndefOr[js.Function1[/* args */ AnonHeader, String | Null]] = js.undefined
  var mapValues: js.UndefOr[js.Function1[/* args */ AnonHeaderIndex, _]] = js.undefined
  var maxRowBytes: js.UndefOr[Double] = js.undefined
  var newline: js.UndefOr[String] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var skipLines: js.UndefOr[Double] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    escape: String = null,
    headers: js.Array[String] | Boolean = null,
    mapHeaders: /* args */ AnonHeader => String | Null = null,
    mapValues: /* args */ AnonHeaderIndex => _ = null,
    maxRowBytes: Int | Double = null,
    newline: String = null,
    quote: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    skipLines: Int | Double = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mapHeaders != null) __obj.updateDynamic("mapHeaders")(js.Any.fromFunction1(mapHeaders))
    if (mapValues != null) __obj.updateDynamic("mapValues")(js.Any.fromFunction1(mapValues))
    if (maxRowBytes != null) __obj.updateDynamic("maxRowBytes")(maxRowBytes.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (skipLines != null) __obj.updateDynamic("skipLines")(skipLines.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

