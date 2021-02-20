package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDeleteResponseData extends StObject {
  
  var documentation_url: String = js.native
  
  var message: String = js.native
}
object ReposDeleteResponseData {
  
  @scala.inline
  def apply(documentation_url: String, message: String): ReposDeleteResponseData = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteResponseData]
  }
  
  @scala.inline
  implicit class ReposDeleteResponseDataMutableBuilder[Self <: ReposDeleteResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
