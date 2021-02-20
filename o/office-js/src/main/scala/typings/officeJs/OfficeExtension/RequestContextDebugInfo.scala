package typings.officeJs.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains debug information about the request context. */
@js.native
trait RequestContextDebugInfo extends StObject {
  
  /**
    * The statements to be executed in the host.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var pendingStatements: js.Array[String] = js.native
}
object RequestContextDebugInfo {
  
  @scala.inline
  def apply(pendingStatements: js.Array[String]): RequestContextDebugInfo = {
    val __obj = js.Dynamic.literal(pendingStatements = pendingStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestContextDebugInfo]
  }
  
  @scala.inline
  implicit class RequestContextDebugInfoMutableBuilder[Self <: RequestContextDebugInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPendingStatements(value: js.Array[String]): Self = StObject.set(x, "pendingStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingStatementsVarargs(value: String*): Self = StObject.set(x, "pendingStatements", js.Array(value :_*))
  }
}
