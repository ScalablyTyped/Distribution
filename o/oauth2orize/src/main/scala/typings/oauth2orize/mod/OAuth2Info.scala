package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2Info extends StObject {
  
  var scope: String = js.native
}
object OAuth2Info {
  
  @scala.inline
  def apply(scope: String): OAuth2Info = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Info]
  }
  
  @scala.inline
  implicit class OAuth2InfoMutableBuilder[Self <: OAuth2Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
