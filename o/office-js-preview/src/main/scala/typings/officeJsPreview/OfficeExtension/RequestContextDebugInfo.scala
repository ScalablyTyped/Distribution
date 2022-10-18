package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains debug information about the request context. */
trait RequestContextDebugInfo extends StObject {
  
  /**
    * The statements to be executed in the Office application.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var pendingStatements: js.Array[String]
}
object RequestContextDebugInfo {
  
  inline def apply(pendingStatements: js.Array[String]): RequestContextDebugInfo = {
    val __obj = js.Dynamic.literal(pendingStatements = pendingStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestContextDebugInfo]
  }
  
  extension [Self <: RequestContextDebugInfo](x: Self) {
    
    inline def setPendingStatements(value: js.Array[String]): Self = StObject.set(x, "pendingStatements", value.asInstanceOf[js.Any])
    
    inline def setPendingStatementsVarargs(value: String*): Self = StObject.set(x, "pendingStatements", js.Array(value*))
  }
}
