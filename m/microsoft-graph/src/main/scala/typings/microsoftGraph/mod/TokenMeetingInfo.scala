package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenMeetingInfo extends MeetingInfo {
  
  // The token used to join the call.
  var token: js.UndefOr[String] = js.native
}
object TokenMeetingInfo {
  
  @scala.inline
  def apply(): TokenMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenMeetingInfo]
  }
  
  @scala.inline
  implicit class TokenMeetingInfoMutableBuilder[Self <: TokenMeetingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
