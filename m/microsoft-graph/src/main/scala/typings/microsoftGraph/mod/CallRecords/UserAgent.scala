package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgent extends StObject {
  
  // Identifies the version of application software used by this endpoint.
  var applicationVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User-agent header value reported by this endpoint.
  var headerValue: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserAgent {
  
  @scala.inline
  def apply(): UserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgent]
  }
  
  @scala.inline
  implicit class UserAgentMutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationVersion(value: NullableOption[String]): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionNull: Self = StObject.set(x, "applicationVersion", null)
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    @scala.inline
    def setHeaderValue(value: NullableOption[String]): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValueNull: Self = StObject.set(x, "headerValue", null)
    
    @scala.inline
    def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
  }
}
