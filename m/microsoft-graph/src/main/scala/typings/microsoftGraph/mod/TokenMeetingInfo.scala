package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenMeetingInfo
  extends StObject
     with MeetingInfo {
  
  // The token used to join the call.
  var token: js.UndefOr[String] = js.undefined
}
object TokenMeetingInfo {
  
  inline def apply(): TokenMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenMeetingInfo]
  }
  
  extension [Self <: TokenMeetingInfo](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
