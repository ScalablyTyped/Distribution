package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseMeta extends StObject {
  
  /** Whether process was aborted */
  var aborted: Boolean
  
  var cursor: Double
  
  /** Delimiter used */
  var delimiter: String
  
  /** Array of field names */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Line break sequence used */
  var linebreak: String
  
  /** Whether preview consumed all input */
  var truncated: Boolean
}
object ParseMeta {
  
  inline def apply(aborted: Boolean, cursor: Double, delimiter: String, linebreak: String, truncated: Boolean): ParseMeta = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], linebreak = linebreak.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseMeta]
  }
  
  extension [Self <: ParseMeta](x: Self) {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setLinebreak(value: String): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
  }
}
