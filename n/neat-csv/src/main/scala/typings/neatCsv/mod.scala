package typings.neatCsv

import org.scalablytyped.runtime.StringDictionary
import typings.neatCsv.anon.Header
import typings.neatCsv.anon.Index
import typings.node.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: Input): js.Promise[js.Array[Row]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Row]]]
  @scala.inline
  def apply(input: Input, options: Options): js.Promise[js.Array[Row]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Row]]]
  
  @JSImport("neat-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** The CSV data to parse. */
  type Input = String | Buffer | Readable
  
  /** A configuration object to be passed to csv-parser. */
  trait Options extends StObject {
    
    var escape: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var mapHeaders: js.UndefOr[js.Function1[/* args */ Header, String | Null]] = js.undefined
    
    var mapValues: js.UndefOr[js.Function1[/* args */ Index, js.Any]] = js.undefined
    
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
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[String] | Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMapHeaders(value: /* args */ Header => String | Null): Self = StObject.set(x, "mapHeaders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapHeadersUndefined: Self = StObject.set(x, "mapHeaders", js.undefined)
      
      @scala.inline
      def setMapValues(value: /* args */ Index => js.Any): Self = StObject.set(x, "mapValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapValuesUndefined: Self = StObject.set(x, "mapValues", js.undefined)
      
      @scala.inline
      def setMaxRowBytes(value: Double): Self = StObject.set(x, "maxRowBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRowBytesUndefined: Self = StObject.set(x, "maxRowBytes", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSkipLines(value: Double): Self = StObject.set(x, "skipLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLinesUndefined: Self = StObject.set(x, "skipLines", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /** A representation of one row of the input CSV. */
  type Row = StringDictionary[String]
}
