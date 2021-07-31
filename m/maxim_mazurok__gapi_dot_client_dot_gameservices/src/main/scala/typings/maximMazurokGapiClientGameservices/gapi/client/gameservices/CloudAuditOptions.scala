package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudAuditOptions extends StObject {
  
  /** Information used by the Cloud Audit Logging pipeline. */
  var authorizationLoggingOptions: js.UndefOr[AuthorizationLoggingOptions] = js.undefined
  
  /** The log_name to populate in the Cloud Audit Record. */
  var logName: js.UndefOr[String] = js.undefined
}
object CloudAuditOptions {
  
  @scala.inline
  def apply(): CloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudAuditOptions]
  }
  
  @scala.inline
  implicit class CloudAuditOptionsMutableBuilder[Self <: CloudAuditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationLoggingOptions(value: AuthorizationLoggingOptions): Self = StObject.set(x, "authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationLoggingOptionsUndefined: Self = StObject.set(x, "authorizationLoggingOptions", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
  }
}
