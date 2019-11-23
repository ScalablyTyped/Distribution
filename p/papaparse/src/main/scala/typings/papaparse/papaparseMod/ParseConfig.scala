package typings.papaparse.papaparseMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.papaparse.papaparseStrings.greedy
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseConfig extends js.Object {
   // default: undefined
  var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ String, String | Unit]] = js.undefined
   // default: undefined
  var chunk: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.undefined
   // default: false
  var comments: js.UndefOr[Boolean | String] = js.undefined
   // default: undefined
  var complete: js.UndefOr[js.Function2[/* results */ ParseResult, /* file */ js.UndefOr[File], Unit]] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
   // default: false
  var download: js.UndefOr[Boolean] = js.undefined
   // default: false
  var downloadRequestHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
   // default: false
  var dynamicTyping: js.UndefOr[
    Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
  ] = js.undefined
   // default: 0
  var encoding: js.UndefOr[String] = js.undefined
   // default: undefined
  var error: js.UndefOr[js.Function2[/* error */ ParseError, /* file */ js.UndefOr[File], Unit]] = js.undefined
   // default: '"'
  var escapeChar: js.UndefOr[String] = js.undefined
   // default: false
  var fastMode: js.UndefOr[Boolean] = js.undefined
   // default: '"'
  var header: js.UndefOr[Boolean] = js.undefined
   // default: ","
  var newline: js.UndefOr[String] = js.undefined
   // default: false
  var preview: js.UndefOr[Double] = js.undefined
   // default: "\r\n"
  var quoteChar: js.UndefOr[String] = js.undefined
   // default: undefined
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.undefined
   // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.undefined
   // default: undefined
  var transform: js.UndefOr[js.Function2[/* value */ String, /* field */ String | Double, _]] = js.undefined
   // default: undefined
  var transformHeader: js.UndefOr[js.Function1[/* header */ String, String]] = js.undefined
   // default: false
  var trimHeaders: js.UndefOr[Boolean] = js.undefined
   // default: undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
   // default: ""
  var worker: js.UndefOr[Boolean] = js.undefined
}

object ParseConfig {
  @scala.inline
  def apply(
    beforeFirstChunk: /* chunk */ String => String | Unit = null,
    chunk: (/* results */ ParseResult, /* parser */ Parser) => Unit = null,
    comments: Boolean | String = null,
    complete: (/* results */ ParseResult, /* file */ js.UndefOr[File]) => Unit = null,
    delimiter: String = null,
    download: js.UndefOr[Boolean] = js.undefined,
    downloadRequestHeaders: StringDictionary[String] = null,
    dynamicTyping: Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean]) = null,
    encoding: String = null,
    error: (/* error */ ParseError, /* file */ js.UndefOr[File]) => Unit = null,
    escapeChar: String = null,
    fastMode: js.UndefOr[Boolean] = js.undefined,
    header: js.UndefOr[Boolean] = js.undefined,
    newline: String = null,
    preview: Int | Double = null,
    quoteChar: String = null,
    skipEmptyLines: Boolean | greedy = null,
    step: (/* results */ ParseResult, /* parser */ Parser) => Unit = null,
    transform: (/* value */ String, /* field */ String | Double) => _ = null,
    transformHeader: /* header */ String => String = null,
    trimHeaders: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    worker: js.UndefOr[Boolean] = js.undefined
  ): ParseConfig = {
    val __obj = js.Dynamic.literal()
    if (beforeFirstChunk != null) __obj.updateDynamic("beforeFirstChunk")(js.Any.fromFunction1(beforeFirstChunk))
    if (chunk != null) __obj.updateDynamic("chunk")(js.Any.fromFunction2(chunk))
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (downloadRequestHeaders != null) __obj.updateDynamic("downloadRequestHeaders")(downloadRequestHeaders)
    if (dynamicTyping != null) __obj.updateDynamic("dynamicTyping")(dynamicTyping.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar)
    if (!js.isUndefined(fastMode)) __obj.updateDynamic("fastMode")(fastMode)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (quoteChar != null) __obj.updateDynamic("quoteChar")(quoteChar)
    if (skipEmptyLines != null) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction2(step))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (transformHeader != null) __obj.updateDynamic("transformHeader")(js.Any.fromFunction1(transformHeader))
    if (!js.isUndefined(trimHeaders)) __obj.updateDynamic("trimHeaders")(trimHeaders)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[ParseConfig]
  }
}

