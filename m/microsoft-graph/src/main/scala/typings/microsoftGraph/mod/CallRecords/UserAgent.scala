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
  
  inline def apply(): UserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgent]
  }
  
  extension [Self <: UserAgent](x: Self) {
    
    inline def setApplicationVersion(value: NullableOption[String]): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionNull: Self = StObject.set(x, "applicationVersion", null)
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    inline def setHeaderValue(value: NullableOption[String]): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    inline def setHeaderValueNull: Self = StObject.set(x, "headerValue", null)
    
    inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
  }
}
