package typings.papaparse.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.papaparse.papaparseStrings.greedy
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseConfig[T] extends js.Object {
  
   // default: undefined
  var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ String, String | Unit]] = js.native
  
   // default: undefined
  var chunk: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* parser */ Parser, Unit]] = js.native
  
   // default: [',', '\t', '|', ';', Papa.RECORD_SEP, Papa.UNIT_SEP]
  var chunkSize: js.UndefOr[Double] = js.native
  
   // default: false
  var comments: js.UndefOr[Boolean | String] = js.native
  
   // default: undefined
  var complete: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* file */ js.UndefOr[File], Unit]] = js.native
  
  var delimiter: js.UndefOr[String] = js.native
  
   // default: undefined
  var delimitersToGuess: js.UndefOr[js.Array[GuessableDelimiters]] = js.native
  
   // default: false
  var download: js.UndefOr[Boolean] = js.native
  
   // default: false
  var downloadRequestHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
   // default: false
  var dynamicTyping: js.UndefOr[
    Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
  ] = js.native
  
   // default: 0
  var encoding: js.UndefOr[String] = js.native
  
   // default: undefined
  var error: js.UndefOr[js.Function2[/* error */ ParseError, /* file */ js.UndefOr[File], Unit]] = js.native
  
   // default: '"'
  var escapeChar: js.UndefOr[String] = js.native
  
   // default: false
  var fastMode: js.UndefOr[Boolean] = js.native
  
   // default: '"'
  var header: js.UndefOr[Boolean] = js.native
  
   // default: ","
  var newline: js.UndefOr[String] = js.native
  
   // default: false
  var preview: js.UndefOr[Double] = js.native
  
   // default: "\r\n"
  var quoteChar: js.UndefOr[String] = js.native
  
   // default: undefined
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.native
  
   // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* parser */ Parser, Unit]] = js.native
  
   // default: undefined
  var transform: js.UndefOr[js.Function2[/* value */ String, /* field */ String | Double, _]] = js.native
  
   // default: undefined
  var transformHeader: js.UndefOr[js.Function2[/* header */ String, /* index */ js.UndefOr[Double], String]] = js.native
  
   // default: false
  var trimHeaders: js.UndefOr[Boolean] = js.native
  
   // default: undefined
  var withCredentials: js.UndefOr[Boolean] = js.native
  
   // default: ""
  var worker: js.UndefOr[Boolean] = js.native
}
object ParseConfig {
  
  @scala.inline
  def apply[T](): ParseConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseConfig[T]]
  }
  
  @scala.inline
  implicit class ParseConfigOps[Self <: ParseConfig[_], T] (val x: Self with ParseConfig[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeforeFirstChunk(value: /* chunk */ String => String | Unit): Self = this.set("beforeFirstChunk", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeFirstChunk: Self = this.set("beforeFirstChunk", js.undefined)
    
    @scala.inline
    def setChunk(value: (/* results */ ParseResult[T], /* parser */ Parser) => Unit): Self = this.set("chunk", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChunk: Self = this.set("chunk", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setComments(value: Boolean | String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setComplete(value: (/* results */ ParseResult[T], /* file */ js.UndefOr[File]) => Unit): Self = this.set("complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDelimitersToGuessVarargs(value: GuessableDelimiters*): Self = this.set("delimitersToGuess", js.Array(value :_*))
    
    @scala.inline
    def setDelimitersToGuess(value: js.Array[GuessableDelimiters]): Self = this.set("delimitersToGuess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimitersToGuess: Self = this.set("delimitersToGuess", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDownloadRequestHeaders(value: StringDictionary[String]): Self = this.set("downloadRequestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadRequestHeaders: Self = this.set("downloadRequestHeaders", js.undefined)
    
    @scala.inline
    def setDynamicTypingFunction1(value: /* field */ String | Double => Boolean): Self = this.set("dynamicTyping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDynamicTyping(
      value: Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
    ): Self = this.set("dynamicTyping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicTyping: Self = this.set("dynamicTyping", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setError(value: (/* error */ ParseError, /* file */ js.UndefOr[File]) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setEscapeChar(value: String): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeChar: Self = this.set("escapeChar", js.undefined)
    
    @scala.inline
    def setFastMode(value: Boolean): Self = this.set("fastMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastMode: Self = this.set("fastMode", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    
    @scala.inline
    def setPreview(value: Double): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setQuoteChar(value: String): Self = this.set("quoteChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteChar: Self = this.set("quoteChar", js.undefined)
    
    @scala.inline
    def setSkipEmptyLines(value: Boolean | greedy): Self = this.set("skipEmptyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmptyLines: Self = this.set("skipEmptyLines", js.undefined)
    
    @scala.inline
    def setStep(value: (/* results */ ParseResult[T], /* parser */ Parser) => Unit): Self = this.set("step", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* value */ String, /* field */ String | Double) => _): Self = this.set("transform", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransformHeader(value: (/* header */ String, /* index */ js.UndefOr[Double]) => String): Self = this.set("transformHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransformHeader: Self = this.set("transformHeader", js.undefined)
    
    @scala.inline
    def setTrimHeaders(value: Boolean): Self = this.set("trimHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimHeaders: Self = this.set("trimHeaders", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
    
    @scala.inline
    def setWorker(value: Boolean): Self = this.set("worker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
  }
}
