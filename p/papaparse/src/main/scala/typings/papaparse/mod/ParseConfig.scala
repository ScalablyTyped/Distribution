package typings.papaparse.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.papaparse.papaparseBooleans.`false`
import typings.papaparse.papaparseStrings.Carriagereturn
import typings.papaparse.papaparseStrings.CarriagereturnLinefeed
import typings.papaparse.papaparseStrings.Linefeed
import typings.papaparse.papaparseStrings.greedy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseConfig[T, TInput] extends StObject {
  
  /**
    * A function to execute before parsing the first chunk.
    * Can be used with chunk or step streaming modes.
    * The function receives as an argument the chunk about to be parsed, and it may return a modified chunk to parse.
    * This is useful for stripping header lines (as long as the header fits in a single chunk).
    */
  var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ String, String | Unit]] = js.undefined
  
  /**
    * A string that indicates a comment (for example, "#" or "//").
    * When Papa encounters a line starting with this string, it will skip the line.
    * @default false
    */
  var comments: js.UndefOr[`false` | String] = js.undefined
  
  /**
    * The callback to execute when parsing is complete.
    * It receives the parse results. If parsing a local file, the File is passed in, too.
    * When streaming, parse results are not available in this callback.
    */
  var complete: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* file */ TInput, Unit]] = js.undefined
  
  /**
    * The delimiting character.
    * Leave blank to auto-detect from a list of most common delimiters, or any values passed in through `delimitersToGuess`.
    * It can be a string or a function.
    * If a string, it can be of any length (so multi-character delimiters are supported).
    * If a function, it must accept the input as first parameter and it must return a string which will be used as delimiter.
    * In both cases it cannot be found in `Papa.BAD_DELIMITERS`.
    * @default // auto-detect
    */
  var delimiter: js.UndefOr[String | (js.Function1[/* input */ String, String])] = js.undefined
  
  /**
    * An array of delimiters to guess from if the delimiter option is not set.
    * @default [',', '\t', '|', ';', Papa.RECORD_SEP, Papa.UNIT_SEP]
    */
  var delimitersToGuess: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If `true`, numeric and boolean data will be converted to their type instead of remaining strings.
    * Numeric data must conform to the definition of a decimal literal.
    * Numerical values greater than 2^53 or less than -2^53 will not be converted to numbers to preserve precision.
    * European-formatted numbers must have commas and dots swapped.
    * If also accepts an object or a function.
    * If object it's values should be a boolean to indicate if dynamic typing should be applied for each column number (or header name if using headers).
    * If it's a function, it should return a boolean value for each field number (or name if using headers) which will be passed as first argument.
    * @default false
    */
  var dynamicTyping: js.UndefOr[
    Boolean | (StringDictionary[Boolean] & NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
  ] = js.undefined
  
  /**
    * The character used to escape the quote character within a field.
    * If not set, this option will default to the value of `quoteChar`,
    * meaning that the default escaping of quote character within a quoted field is using the quote character two times.
    * (e.g. `"column with ""quotes"" in text"`)
    * @default '"'
    */
  var escapeChar: js.UndefOr[String] = js.undefined
  
  /**
    * Fast mode speeds up parsing significantly for large inputs.
    * However, it only works when the input has no quoted fields.
    * Fast mode will automatically be enabled if no " characters appear in the input.
    * You can force fast mode either way by setting it to true or false.
    */
  var fastMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the first row of parsed data will be interpreted as field names.
    * An array of field names will be returned in meta, and each row of data will be an object of values keyed by field name instead of a simple array.
    * Rows with a different number of fields from the header row will produce an error.
    * Warning: Duplicate field names will overwrite values in previous fields having the same name.
    * @default false
    */
  var header: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The newline sequence. Leave blank to auto-detect. Must be one of `\r`, `\n`, or `\r\n`.
    * @default // auto-detect
    */
  var newline: js.UndefOr[Carriagereturn | Linefeed | CarriagereturnLinefeed] = js.undefined
  
  /** If > 0, only that many rows will be parsed. */
  var preview: js.UndefOr[Double] = js.undefined
  
  /**
    * The character used to quote fields. The quoting of all fields is not mandatory. Any field which is not quoted will correctly read.
    * @default '"'
    */
  var quoteChar: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, lines that are completely empty (those which evaluate to an empty string) will be skipped.
    * If set to `'greedy'`, lines that don't have any content (those which have only whitespace after parsing) will also be skipped.
    * @default false
    */
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.undefined
  
  /**
    * To stream the input, define a callback function.
    * Streaming is necessary for large files which would otherwise crash the browser.
    * You can call parser.abort() to abort parsing.
    * And, except when using a Web Worker, you can call parser.pause() to pause it, and parser.resume() to resume.
    */
  var step: js.UndefOr[js.Function2[/* results */ ParseStepResult[T], /* parser */ Parser, Unit]] = js.undefined
  
  /**
    * A function to apply on each value.
    * The function receives the value as its first argument and the column number or header name when enabled as its second argument.
    * The return value of the function will replace the value it received.
    * The transform function is applied before `dynamicTyping`.
    */
  var transform: js.UndefOr[js.Function2[/* value */ String, /* field */ String | Double, Any]] = js.undefined
  
  /**
    * A function to apply on each header. Requires header to be true. The function receives the header as its first argument and the index as second.
    */
  var transformHeader: js.UndefOr[js.Function2[/* header */ String, /* index */ Double, String]] = js.undefined
}
object ParseConfig {
  
  inline def apply[T, TInput](): ParseConfig[T, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseConfig[T, TInput]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseConfig[?, ?], T, TInput] (val x: Self & (ParseConfig[T, TInput])) extends AnyVal {
    
    inline def setBeforeFirstChunk(value: /* chunk */ String => String | Unit): Self = StObject.set(x, "beforeFirstChunk", js.Any.fromFunction1(value))
    
    inline def setBeforeFirstChunkUndefined: Self = StObject.set(x, "beforeFirstChunk", js.undefined)
    
    inline def setComments(value: `false` | String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setComplete(value: (/* results */ ParseResult[T], /* file */ TInput) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDelimiter(value: String | (js.Function1[/* input */ String, String])): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterFunction1(value: /* input */ String => String): Self = StObject.set(x, "delimiter", js.Any.fromFunction1(value))
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDelimitersToGuess(value: js.Array[String]): Self = StObject.set(x, "delimitersToGuess", value.asInstanceOf[js.Any])
    
    inline def setDelimitersToGuessUndefined: Self = StObject.set(x, "delimitersToGuess", js.undefined)
    
    inline def setDelimitersToGuessVarargs(value: String*): Self = StObject.set(x, "delimitersToGuess", js.Array(value*))
    
    inline def setDynamicTyping(
      value: Boolean | (StringDictionary[Boolean] & NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
    ): Self = StObject.set(x, "dynamicTyping", value.asInstanceOf[js.Any])
    
    inline def setDynamicTypingFunction1(value: /* field */ String | Double => Boolean): Self = StObject.set(x, "dynamicTyping", js.Any.fromFunction1(value))
    
    inline def setDynamicTypingUndefined: Self = StObject.set(x, "dynamicTyping", js.undefined)
    
    inline def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
    
    inline def setFastMode(value: Boolean): Self = StObject.set(x, "fastMode", value.asInstanceOf[js.Any])
    
    inline def setFastModeUndefined: Self = StObject.set(x, "fastMode", js.undefined)
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setNewline(value: Carriagereturn | Linefeed | CarriagereturnLinefeed): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
    
    inline def setPreview(value: Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setQuoteChar(value: String): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharUndefined: Self = StObject.set(x, "quoteChar", js.undefined)
    
    inline def setSkipEmptyLines(value: Boolean | greedy): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
    
    inline def setStep(value: (/* results */ ParseStepResult[T], /* parser */ Parser) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTransform(value: (/* value */ String, /* field */ String | Double) => Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    inline def setTransformHeader(value: (/* header */ String, /* index */ Double) => String): Self = StObject.set(x, "transformHeader", js.Any.fromFunction2(value))
    
    inline def setTransformHeaderUndefined: Self = StObject.set(x, "transformHeader", js.undefined)
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
