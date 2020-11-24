package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains debug information about the request context. */
@js.native
trait RequestContextDebugInfo extends js.Object {
  
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
  implicit class RequestContextDebugInfoOps[Self <: RequestContextDebugInfo] (val x: Self) extends AnyVal {
    
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
    def setPendingStatementsVarargs(value: String*): Self = this.set("pendingStatements", js.Array(value :_*))
    
    @scala.inline
    def setPendingStatements(value: js.Array[String]): Self = this.set("pendingStatements", value.asInstanceOf[js.Any])
  }
}
