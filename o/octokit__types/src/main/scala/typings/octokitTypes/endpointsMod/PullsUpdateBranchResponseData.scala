package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsUpdateBranchResponseData extends StObject {
  
  var message: String = js.native
  
  var url: String = js.native
}
object PullsUpdateBranchResponseData {
  
  @scala.inline
  def apply(message: String, url: String): PullsUpdateBranchResponseData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateBranchResponseData]
  }
  
  @scala.inline
  implicit class PullsUpdateBranchResponseDataMutableBuilder[Self <: PullsUpdateBranchResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
