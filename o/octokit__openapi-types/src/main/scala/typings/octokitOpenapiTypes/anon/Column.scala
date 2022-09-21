package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * @description The column number where this errors occurs.
    * @example 3
    */
  var column: Double
  
  /**
    * @description The type of error.
    * @example Invalid owner
    */
  var kind: String
  
  /**
    * @description The line number where this errors occurs.
    * @example 7
    */
  var line: Double
  
  /**
    * @description A human-readable description of the error, combining information from multiple fields, laid out for display in a monospaced typeface (for example, a command-line setting).
    * @example Invalid owner on line 7:
    *
    *   * user
    *     ^
    */
  var message: String
  
  /**
    * @description The path of the file where the error occured.
    * @example .github/CODEOWNERS
    */
  var path: String
  
  /**
    * @description The contents of the line where the error occurs.
    * @example * user
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * @description Suggested action to fix the error. This will usually be `null`, but is provided for some common errors.
    * @example The pattern `/` will never match anything, did you mean `*` instead?
    */
  var suggestion: js.UndefOr[String | Null] = js.undefined
}
object Column {
  
  inline def apply(column: Double, kind: String, line: Double, message: String, path: String): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionNull: Self = StObject.set(x, "suggestion", null)
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}
