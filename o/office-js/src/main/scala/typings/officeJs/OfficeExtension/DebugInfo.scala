package typings.officeJs.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about an error.
  */
trait DebugInfo extends StObject {
  
  /** Error code string, such as "InvalidArgument". */
  var code: String
  
  /** The object type and property or method name (or similar information), if available. */
  var errorLocation: js.UndefOr[String] = js.undefined
  
  /**
    * All statements in the batch request (including any potentially-sensitive information that was specified in the request), if available.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var fullStatements: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Inner error, if applicable. */
  var innerError: js.UndefOr[DebugInfo | String] = js.undefined
  
  /** The error message passed through from the host Office application. */
  var message: String
  
  /**
    * The statement that caused the error, if available.
    *
    * This statement will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var statement: js.UndefOr[String] = js.undefined
  
  /**
    * The statements that closely precede and follow the statement that caused the error, if available.
    *
    * These statements will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var surroundingStatements: js.UndefOr[js.Array[String]] = js.undefined
}
object DebugInfo {
  
  inline def apply(code: String, message: String): DebugInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
  
  extension [Self <: DebugInfo](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrorLocation(value: String): Self = StObject.set(x, "errorLocation", value.asInstanceOf[js.Any])
    
    inline def setErrorLocationUndefined: Self = StObject.set(x, "errorLocation", js.undefined)
    
    inline def setFullStatements(value: js.Array[String]): Self = StObject.set(x, "fullStatements", value.asInstanceOf[js.Any])
    
    inline def setFullStatementsUndefined: Self = StObject.set(x, "fullStatements", js.undefined)
    
    inline def setFullStatementsVarargs(value: String*): Self = StObject.set(x, "fullStatements", js.Array(value*))
    
    inline def setInnerError(value: DebugInfo | String): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatement(value: String): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
    
    inline def setSurroundingStatements(value: js.Array[String]): Self = StObject.set(x, "surroundingStatements", value.asInstanceOf[js.Any])
    
    inline def setSurroundingStatementsUndefined: Self = StObject.set(x, "surroundingStatements", js.undefined)
    
    inline def setSurroundingStatementsVarargs(value: String*): Self = StObject.set(x, "surroundingStatements", js.Array(value*))
  }
}
