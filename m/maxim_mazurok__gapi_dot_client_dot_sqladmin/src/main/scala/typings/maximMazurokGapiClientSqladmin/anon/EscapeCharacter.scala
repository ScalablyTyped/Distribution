package typings.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EscapeCharacter extends StObject {
  
  /** Specifies the character that should appear before a data character that needs to be escaped. */
  var escapeCharacter: js.UndefOr[String] = js.undefined
  
  /** Specifies the character that separates columns within each row (line) of the file. */
  var fieldsTerminatedBy: js.UndefOr[String] = js.undefined
  
  /** This is used to separate lines. If a line does not contain all fields, the rest of the columns are set to their default values. */
  var linesTerminatedBy: js.UndefOr[String] = js.undefined
  
  /** Specifies the quoting character to be used when a data value is quoted. */
  var quoteCharacter: js.UndefOr[String] = js.undefined
  
  /** The select query used to extract the data. */
  var selectQuery: js.UndefOr[String] = js.undefined
}
object EscapeCharacter {
  
  inline def apply(): EscapeCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EscapeCharacter]
  }
  
  extension [Self <: EscapeCharacter](x: Self) {
    
    inline def setEscapeCharacter(value: String): Self = StObject.set(x, "escapeCharacter", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharacterUndefined: Self = StObject.set(x, "escapeCharacter", js.undefined)
    
    inline def setFieldsTerminatedBy(value: String): Self = StObject.set(x, "fieldsTerminatedBy", value.asInstanceOf[js.Any])
    
    inline def setFieldsTerminatedByUndefined: Self = StObject.set(x, "fieldsTerminatedBy", js.undefined)
    
    inline def setLinesTerminatedBy(value: String): Self = StObject.set(x, "linesTerminatedBy", value.asInstanceOf[js.Any])
    
    inline def setLinesTerminatedByUndefined: Self = StObject.set(x, "linesTerminatedBy", js.undefined)
    
    inline def setQuoteCharacter(value: String): Self = StObject.set(x, "quoteCharacter", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharacterUndefined: Self = StObject.set(x, "quoteCharacter", js.undefined)
    
    inline def setSelectQuery(value: String): Self = StObject.set(x, "selectQuery", value.asInstanceOf[js.Any])
    
    inline def setSelectQueryUndefined: Self = StObject.set(x, "selectQuery", js.undefined)
  }
}
