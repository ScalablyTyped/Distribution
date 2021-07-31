package typings.papaparse

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.papaparse.papaparseNumbers.`1`
import typings.papaparse.papaparseStrings.Informationseparatorone
import typings.papaparse.papaparseStrings.Informationseparatortwo
import typings.papaparse.papaparseStrings.greedy
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("papaparse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("papaparse", "BAD_DELIMITERS")
  @js.native
  val BAD_DELIMITERS: js.Array[String] = js.native
  
  @JSImport("papaparse", "DefaultDelimiter")
  @js.native
  def DefaultDelimiter: String = js.native
  @scala.inline
  def DefaultDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDelimiter")(x.asInstanceOf[js.Any])
  
  @JSImport("papaparse", "LocalChunkSize")
  @js.native
  def LocalChunkSize: String = js.native
  @scala.inline
  def LocalChunkSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalChunkSize")(x.asInstanceOf[js.Any])
  
  @JSImport("papaparse", "NODE_STREAM_INPUT")
  @js.native
  val NODE_STREAM_INPUT: /* 1 */ Double = js.native
  
  @JSImport("papaparse", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(config: ParseConfig[js.Any]) = this()
    
    // Sets the abort flag
    def abort(): Unit = js.native
    
    // Gets the cursor position
    def getCharIndex(): Double = js.native
    
    def parse(input: String, baseIndex: Double, ignoreLastRow: Boolean): js.Any = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
  
  @JSImport("papaparse", "RECORD_SEP")
  @js.native
  val RECORD_SEP: /* "\\u001E" */ String = js.native
  
  @JSImport("papaparse", "RemoteChunkSize")
  @js.native
  def RemoteChunkSize: String = js.native
  @scala.inline
  def RemoteChunkSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RemoteChunkSize")(x.asInstanceOf[js.Any])
  
  @JSImport("papaparse", "SCRIPT_PATH")
  @js.native
  def SCRIPT_PATH: String = js.native
  @scala.inline
  def SCRIPT_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_PATH")(x.asInstanceOf[js.Any])
  
  @JSImport("papaparse", "UNIT_SEP")
  @js.native
  val UNIT_SEP: /* "\\u001F" */ String = js.native
  
  @JSImport("papaparse", "WORKERS_SUPPORTED")
  @js.native
  val WORKERS_SUPPORTED: Boolean = js.native
  
  @scala.inline
  def parse(stream: NODE_STREAM_INPUT_TYPE): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  @scala.inline
  def parse(stream: NODE_STREAM_INPUT_TYPE, config: ParseConfig[js.Any]): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def parse[T](input: String): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
  @scala.inline
  def parse[T](input: String, config: ParseConfig[T]): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]
  @scala.inline
  def parse[T](input: ReadableStream): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
  @scala.inline
  def parse[T](input: ReadableStream, config: ParseConfig[T]): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]
  @scala.inline
  def parse[T](input: File): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
  @scala.inline
  def parse[T](input: File, config: ParseConfig[T]): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]
  
  @scala.inline
  def unparse(data: js.Array[js.Array[js.Any] | js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def unparse(data: js.Array[js.Array[js.Any] | js.Object], config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def unparse(data: UnparseObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def unparse(data: UnparseObject, config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.papaparse.papaparseStrings.Comma
    - typings.papaparse.papaparseStrings.Charactertabulation
    - typings.papaparse.papaparseStrings.Verticalline
    - typings.papaparse.papaparseStrings.Semicolon
    - typings.papaparse.mod.RECORD_SEP_TYPE
    - typings.papaparse.mod.UNIT_SEP_TYPE
  */
  type GuessableDelimiters = _GuessableDelimiters | RECORD_SEP_TYPE | UNIT_SEP_TYPE
  
  type NODE_STREAM_INPUT_TYPE = `1`
  
  trait ParseConfig[T] extends StObject {
    
    // default: undefined
    var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ String, String | Unit]] = js.undefined
    
    // default: undefined
    var chunk: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* parser */ Parser, Unit]] = js.undefined
    
    // default: [',', '\t', '|', ';', Papa.RECORD_SEP, Papa.UNIT_SEP]
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    // default: false
    var comments: js.UndefOr[Boolean | String] = js.undefined
    
    // default: undefined
    var complete: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* file */ js.UndefOr[File], Unit]] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    // default: undefined
    var delimitersToGuess: js.UndefOr[js.Array[GuessableDelimiters]] = js.undefined
    
    // default: false
    var download: js.UndefOr[Boolean] = js.undefined
    
    // default: false
    var downloadRequestHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    // default: false
    var dynamicTyping: js.UndefOr[
        Boolean | (StringDictionary[Boolean] & NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
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
    var step: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* parser */ Parser, Unit]] = js.undefined
    
    // default: undefined
    var transform: js.UndefOr[js.Function2[/* value */ String, /* field */ String | Double, js.Any]] = js.undefined
    
    // default: undefined
    var transformHeader: js.UndefOr[js.Function2[/* header */ String, /* index */ js.UndefOr[Double], String]] = js.undefined
    
    // default: false
    var trimHeaders: js.UndefOr[Boolean] = js.undefined
    
    // default: undefined
    var withCredentials: js.UndefOr[Boolean] = js.undefined
    
    // default: ""
    var worker: js.UndefOr[Boolean] = js.undefined
  }
  object ParseConfig {
    
    @scala.inline
    def apply[T](): ParseConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseConfig[T]]
    }
    
    @scala.inline
    implicit class ParseConfigMutableBuilder[Self <: ParseConfig[?], T] (val x: Self & ParseConfig[T]) extends AnyVal {
      
      @scala.inline
      def setBeforeFirstChunk(value: /* chunk */ String => String | Unit): Self = StObject.set(x, "beforeFirstChunk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeFirstChunkUndefined: Self = StObject.set(x, "beforeFirstChunk", js.undefined)
      
      @scala.inline
      def setChunk(value: (/* results */ ParseResult[T], /* parser */ Parser) => Unit): Self = StObject.set(x, "chunk", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean | String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setComplete(value: (/* results */ ParseResult[T], /* file */ js.UndefOr[File]) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDelimitersToGuess(value: js.Array[GuessableDelimiters]): Self = StObject.set(x, "delimitersToGuess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersToGuessUndefined: Self = StObject.set(x, "delimitersToGuess", js.undefined)
      
      @scala.inline
      def setDelimitersToGuessVarargs(value: GuessableDelimiters*): Self = StObject.set(x, "delimitersToGuess", js.Array(value :_*))
      
      @scala.inline
      def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadRequestHeaders(value: StringDictionary[String]): Self = StObject.set(x, "downloadRequestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadRequestHeadersUndefined: Self = StObject.set(x, "downloadRequestHeaders", js.undefined)
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDynamicTyping(
        value: Boolean | (StringDictionary[Boolean] & NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
      ): Self = StObject.set(x, "dynamicTyping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicTypingFunction1(value: /* field */ String | Double => Boolean): Self = StObject.set(x, "dynamicTyping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDynamicTypingUndefined: Self = StObject.set(x, "dynamicTyping", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setError(value: (/* error */ ParseError, /* file */ js.UndefOr[File]) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
      
      @scala.inline
      def setFastMode(value: Boolean): Self = StObject.set(x, "fastMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastModeUndefined: Self = StObject.set(x, "fastMode", js.undefined)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setPreview(value: Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setQuoteChar(value: String): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteCharUndefined: Self = StObject.set(x, "quoteChar", js.undefined)
      
      @scala.inline
      def setSkipEmptyLines(value: Boolean | greedy): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
      
      @scala.inline
      def setStep(value: (/* results */ ParseResult[T], /* parser */ Parser) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTransform(value: (/* value */ String, /* field */ String | Double) => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformHeader(value: (/* header */ String, /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "transformHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformHeaderUndefined: Self = StObject.set(x, "transformHeader", js.undefined)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTrimHeaders(value: Boolean): Self = StObject.set(x, "trimHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimHeadersUndefined: Self = StObject.set(x, "trimHeaders", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
      
      @scala.inline
      def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  trait ParseError extends StObject {
    
    // A generalization of the error
    var code: String
    
    // Standardized error code
    var message: String
    
    // Human-readable details
    var row: Double
    
    var `type`: String
  }
  object ParseError {
    
    @scala.inline
    def apply(code: String, message: String, row: Double, `type`: String): ParseError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    @scala.inline
    implicit class ParseErrorMutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseMeta extends StObject {
    
    // Line break sequence used
    var aborted: Boolean
    
    // Whether preview consumed all input
    var cursor: Double
    
    var delimiter: String
    
    // Whether process was aborted
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    // Delimiter used
    var linebreak: String
    
    // Array of field names
    var truncated: Boolean
  }
  object ParseMeta {
    
    @scala.inline
    def apply(aborted: Boolean, cursor: Double, delimiter: String, linebreak: String, truncated: Boolean): ParseMeta = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], linebreak = linebreak.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseMeta]
    }
    
    @scala.inline
    implicit class ParseMetaMutableBuilder[Self <: ParseMeta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setLinebreak(value: String): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseResult[T] extends StObject {
    
    var data: js.Array[T]
    
    var errors: js.Array[ParseError]
    
    var meta: ParseMeta
  }
  object ParseResult {
    
    @scala.inline
    def apply[T](data: js.Array[T], errors: js.Array[ParseError], meta: ParseMeta): ParseResult[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult[T]]
    }
    
    @scala.inline
    implicit class ParseResultMutableBuilder[Self <: ParseResult[?], T] (val x: Self & ParseResult[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setMeta(value: ParseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type RECORD_SEP_TYPE = Informationseparatortwo
  
  type UNIT_SEP_TYPE = Informationseparatorone
  
  trait UnparseConfig extends StObject {
    
    // default: false
    var columns: js.UndefOr[js.Array[String]] = js.undefined
    
    // default: false
    var delimiter: js.UndefOr[String] = js.undefined
    
    // default: ","
    /**
      * If defined and the download property is true,
      * a POST request will be made instead of a GET request and the passed argument will be set as the body of the request.
      * @default undefined
      */
    var downloadRequestBody: js.UndefOr[Boolean] = js.undefined
    
    // default: '"'
    var escapeChar: js.UndefOr[String] = js.undefined
    
    // default: '"'
    var escapeFormulae: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    // default: true
    var newline: js.UndefOr[String] = js.undefined
    
    // default: false
    var quoteChar: js.UndefOr[String] = js.undefined
    
    var quotes: js.UndefOr[Boolean | js.Array[Boolean] | (js.Function1[/* value */ js.Any, Boolean])] = js.undefined
    
    // default: "\r\n"
    var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.undefined
  }
  object UnparseConfig {
    
    @scala.inline
    def apply(): UnparseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnparseConfig]
    }
    
    @scala.inline
    implicit class UnparseConfigMutableBuilder[Self <: UnparseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDownloadRequestBody(value: Boolean): Self = StObject.set(x, "downloadRequestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadRequestBodyUndefined: Self = StObject.set(x, "downloadRequestBody", js.undefined)
      
      @scala.inline
      def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
      
      @scala.inline
      def setEscapeFormulae(value: Boolean): Self = StObject.set(x, "escapeFormulae", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeFormulaeUndefined: Self = StObject.set(x, "escapeFormulae", js.undefined)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setQuoteChar(value: String): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteCharUndefined: Self = StObject.set(x, "quoteChar", js.undefined)
      
      @scala.inline
      def setQuotes(value: Boolean | js.Array[Boolean] | (js.Function1[/* value */ js.Any, Boolean])): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesFunction1(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "quotes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setQuotesVarargs(value: Boolean*): Self = StObject.set(x, "quotes", js.Array(value :_*))
      
      @scala.inline
      def setSkipEmptyLines(value: Boolean | greedy): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
    }
  }
  
  trait UnparseObject extends StObject {
    
    var data: String | js.Array[js.Any]
    
    var fields: js.Array[js.Any]
  }
  object UnparseObject {
    
    @scala.inline
    def apply(data: String | js.Array[js.Any], fields: js.Array[js.Any]): UnparseObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnparseObject]
    }
    
    @scala.inline
    implicit class UnparseObjectMutableBuilder[Self <: UnparseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String | js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: js.Array[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
  
  trait _GuessableDelimiters extends StObject
}
