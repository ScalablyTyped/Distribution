package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionTokenOption extends StObject {
  
  var sessionToken: js.UndefOr[String] = js.native
}
object SessionTokenOption {
  
  @scala.inline
  def apply(): SessionTokenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTokenOption]
  }
  
  @scala.inline
  implicit class SessionTokenOptionMutableBuilder[Self <: SessionTokenOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
