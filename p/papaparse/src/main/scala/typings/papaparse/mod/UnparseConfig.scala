package typings.papaparse.mod

import typings.papaparse.papaparseStrings.greedy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnparseConfig extends StObject {
  
  /**
    * If `data` is an array of objects this option can be used to manually specify the keys (columns) you expect in the objects.
    * If not set the keys of the first objects are used as column.
    * @default undefined
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The delimiting character. Multi-character delimiters are supported. It must not be found in `Papa.BAD_DELIMITERS`.
    * @default ','
    */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /**
    * The character used to escape `quoteChar` inside field values.
    * @default '"'
    */
  var escapeChar: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, field values that begin with `=`, `+`, `-`, or `@`,
    * will be prepended with a ` to defend against [injection attacks](https://www.contextis.com/en/blog/comma-separated-vulnerabilities),
    * because Excel and LibreOffice will automatically parse such cells as formulae.
    * @default false
    */
  var escapeFormulae: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  /**
    * If `false`, will omit the header row.
    * If `data` is an array of arrays this option is ignored.
    * If `data` is an array of objects the keys of the first object are the header row.
    * If `data` is an object with the `keys` fields and `data` the `fields` are the header row.
    * @default true
    */
  var header: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The character used to determine newline sequence.
    * @default '\r\n'
    */
  var newline: js.UndefOr[String] = js.undefined
  
  /**
    * The character used to quote fields.
    * @default '"'
    */
  var quoteChar: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, forces all fields to be enclosed in quotes.
    * If an array of `true`/`false` values, specifies which fields should be force-quoted (first boolean is for the first column, second boolean for the second column, ...).
    * A function that returns a boolean values can be used to determine the quotes value of a cell.
    * This function accepts the cell value and column index as parameters.
    * Note that this option is ignored for `undefined`, `null` and `date-object` values.
    * The option `escapeFormulae` also takes precedence over this.
    *
    * @default false
    */
  var quotes: js.UndefOr[
    Boolean | js.Array[Boolean] | (js.Function2[/* value */ Any, /* columnIndex */ Double, Boolean])
  ] = js.undefined
  
  /**
    * If `true`, lines that are completely empty (those which evaluate to an empty string) will be skipped.
    * If set to `'greedy'`, lines that don't have any content (those which have only whitespace after parsing) will also be skipped.
    * @default false
    */
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.undefined
}
object UnparseConfig {
  
  inline def apply(): UnparseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnparseConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnparseConfig] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setEscapeChar(value: String): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
    
    inline def setEscapeFormulae(value: Boolean | js.RegExp): Self = StObject.set(x, "escapeFormulae", value.asInstanceOf[js.Any])
    
    inline def setEscapeFormulaeUndefined: Self = StObject.set(x, "escapeFormulae", js.undefined)
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
    
    inline def setQuoteChar(value: String): Self = StObject.set(x, "quoteChar", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharUndefined: Self = StObject.set(x, "quoteChar", js.undefined)
    
    inline def setQuotes(
      value: Boolean | js.Array[Boolean] | (js.Function2[/* value */ Any, /* columnIndex */ Double, Boolean])
    ): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    inline def setQuotesFunction2(value: (/* value */ Any, /* columnIndex */ Double) => Boolean): Self = StObject.set(x, "quotes", js.Any.fromFunction2(value))
    
    inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
    
    inline def setQuotesVarargs(value: Boolean*): Self = StObject.set(x, "quotes", js.Array(value*))
    
    inline def setSkipEmptyLines(value: Boolean | greedy): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
  }
}
