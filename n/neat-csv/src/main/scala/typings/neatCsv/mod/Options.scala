package typings.neatCsv.mod

import typings.neatCsv.anon.Header
import typings.neatCsv.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A configuration object to be passed to csv-parser. */
trait Options extends js.Object {
  var escape: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var mapHeaders: js.UndefOr[js.Function1[/* args */ Header, String | Null]] = js.undefined
  var mapValues: js.UndefOr[js.Function1[/* args */ Index, _]] = js.undefined
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
    mapHeaders: /* args */ Header => String | Null = null,
    mapValues: /* args */ Index => _ = null,
    maxRowBytes: js.UndefOr[Double] = js.undefined,
    newline: String = null,
    quote: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    skipLines: js.UndefOr[Double] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mapHeaders != null) __obj.updateDynamic("mapHeaders")(js.Any.fromFunction1(mapHeaders))
    if (mapValues != null) __obj.updateDynamic("mapValues")(js.Any.fromFunction1(mapValues))
    if (!js.isUndefined(maxRowBytes)) __obj.updateDynamic("maxRowBytes")(maxRowBytes.get.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLines)) __obj.updateDynamic("skipLines")(skipLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

